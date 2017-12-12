package com.system.reqm.entity;

import java.util.Date;

public class User {
    private Integer nUserid;

    private String cLoginname;

    private String cPassword;

    private String cUsername;

    private Date dtLastlogintime;

    public Integer getnUserid() {
        return nUserid;
    }

    public void setnUserid(Integer nUserid) {
        this.nUserid = nUserid;
    }

    public String getcLoginname() {
        return cLoginname;
    }

    public void setcLoginname(String cLoginname) {
        this.cLoginname = cLoginname;
    }

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername;
    }

    public Date getDtLastlogintime() {
        return dtLastlogintime;
    }

    public void setDtLastlogintime(Date dtLastlogintime) {
        this.dtLastlogintime = dtLastlogintime;
    }

    @Override
    public String toString() {
        return "User{" +
                "nUserid=" + nUserid +
                ", cLoginname='" + cLoginname + '\'' +
                ", cPassword='" + cPassword + '\'' +
                ", cUsername='" + cUsername + '\'' +
                ", dtLastlogintime=" + dtLastlogintime +
                '}';
    }
}