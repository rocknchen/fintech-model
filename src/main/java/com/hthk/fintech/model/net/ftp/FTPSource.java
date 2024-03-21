package com.hthk.fintech.model.net.ftp;

import com.hthk.fintech.enumration.FTPTypeEnum;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/21 11:33
 */
public class FTPSource {

    private String id;

    private FTPTypeEnum type;

    private String server;

    private Integer port;

    private String user;

    private String pwd;

    public FTPSource() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FTPTypeEnum getType() {
        return type;
    }

    public void setType(FTPTypeEnum type) {
        this.type = type;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
