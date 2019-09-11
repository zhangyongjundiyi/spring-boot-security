package cn.zyj.springbootsecurity.mapper;

import cn.zyj.springbootsecurity.bean.Resource;
import cn.zyj.springbootsecurity.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResourceMapper extends JpaRepository<Resource,Integer> {
    @Query("select * from resource where url= ?1")
    Resource getResourceByUrl(String url);
    @Query("select * from role where role_id=(select role_id from role_resource where resource_id=?1)")
    List<Role> getRoles(Integer resource_id);

}
