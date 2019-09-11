package cn.zyj.springbootsecurity.service;

import cn.zyj.springbootsecurity.bean.Resource;
import cn.zyj.springbootsecurity.bean.Role;
import cn.zyj.springbootsecurity.mapper.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    ResourceMapper resourceMapper;
    public Resource getResourceByUrl(String url){
        Resource resource = resourceMapper.getResourceByUrl(url);
        return resource;
    }
    public List<Role> getRoles(Integer resource_id){
        List<Role> roleList = resourceMapper.getRoles(resource_id);
        return roleList;
    }
}
