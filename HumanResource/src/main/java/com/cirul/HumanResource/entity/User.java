package com.cirul.HumanResource.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by andywang on 2018/2/26.
 */
@Entity
@Table(name="c_user")
@Access(AccessType.PROPERTY)
public class User implements Serializable{

    private static final long serialVersionUID = -5085223777260832735L;
    @Column(name = "id")
    private Integer id;
    @Column(name = "loginName")
    private String loginName;
    @Column(name = "password")
    private String password;
    @Column(name = "name")
    private String name;
    @Column(name = "createTime")
    private Long createTime;
    @Column(name = "updateTime")
    private Long updateTime;
    @Column(name = "jwtToken")
    private String jwtToken;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
