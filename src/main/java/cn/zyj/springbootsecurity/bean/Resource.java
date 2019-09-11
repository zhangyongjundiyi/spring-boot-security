package cn.zyj.springbootsecurity.bean;

import javax.persistence.*;

@Entity
@Table(name = "resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resource_id;
    private String url;
    private String resourcename;

    public Integer getResource_id() {
        return resource_id;
    }

    public void setResource_id(Integer resource_id) {
        this.resource_id = resource_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResourcename() {
        return resourcename;
    }

    public void setResourcename(String resourcename) {
        this.resourcename = resourcename;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resource_id=" + resource_id +
                ", url='" + url + '\'' +
                ", resourcename='" + resourcename + '\'' +
                '}';
    }
}
