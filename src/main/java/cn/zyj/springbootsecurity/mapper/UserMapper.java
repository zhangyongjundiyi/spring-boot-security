package cn.zyj.springbootsecurity.mapper;

import cn.zyj.springbootsecurity.bean.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserMapper extends JpaRepository<Users,Integer> {
    @Query(value = "select u.* from users u where u.username = ?1", nativeQuery = true)
    Users findByUsername(String username);
}
