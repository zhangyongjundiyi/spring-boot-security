package cn.zyj.springbootsecurity.service;

import cn.zyj.springbootsecurity.bean.Role;
import cn.zyj.springbootsecurity.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    RoleMapper roleMapper;
    public List<Role> findRolesOfUser(String username){
        List<Role> roleList = roleMapper.findRolesOfUser(username);
        return roleList;
    }
    public List<Role> findRolesOfResource(Integer id){
        List<Role> roleList = roleMapper.findRolesOfResource(id);
        return roleList;
    }
}
