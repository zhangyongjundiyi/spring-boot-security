package cn.zyj.springbootsecurity.bean;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer role_id;
    private String rolename;
    private String role_name_zh;

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRole_name_zh() {
        return role_name_zh;
    }

    public void setRole_name_zh(String role_name_zh) {
        this.role_name_zh = role_name_zh;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", rolename='" + rolename + '\'' +
                ", role_name_zh='" + role_name_zh + '\'' +
                '}';
    }
}
