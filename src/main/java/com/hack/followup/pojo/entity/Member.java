package com.hack.followup.pojo.entity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author 会飞的野鸡
 * @version 1.0.0
 * @class Member
 * @date 19:22
 * @description TODO
 */
@Table(name = "member")
public class Member {
    private int id;
    private String tel;
    private String mail;
    private String password;
    @Column(name = "is_editor")
    private int isEditor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsEditor() {
        return isEditor;
    }

    public void setIsEditor(int isEditor) {
        this.isEditor = isEditor;
    }
}
