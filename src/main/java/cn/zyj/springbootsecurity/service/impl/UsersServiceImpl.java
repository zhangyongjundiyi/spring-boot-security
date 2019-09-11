package cn.zyj.springbootsecurity.service.impl;

import cn.zyj.springbootsecurity.bean.Users;
import cn.zyj.springbootsecurity.mapper.UserMapper;
import cn.zyj.springbootsecurity.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service("userService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users user= userMapper.findByUsername(s);
        if (user!=null){
            //创建角色集合对象
            Collection<GrantedAuthority> authorities = new ArrayList<>();
            //创建临时角色对象
            SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_USER");
            //对象添加到集合中去
            authorities.add(grantedAuthority);
            UserDetails user1 = new User(user.getUsername(),user.getPassword(), authorities);
            //注入userDetailsService的实现类
            return user1;
        }
        return  null;
    }
}
