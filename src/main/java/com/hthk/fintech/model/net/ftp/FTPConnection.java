package com.hthk.fintech.model.net.ftp;

import com.hthk.fintech.enumration.FTPTypeEnum;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.Session;
import org.apache.commons.net.ftp.FTPClient;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/21 17:23
 * For both ftp & sftp
 */
public class FTPConnection {

    private String id;

    private FTPTypeEnum type;

    private FTPClient ftpClient;

    private Session session;

    private ChannelSftp chSftp;

    public ChannelSftp getChSftp() {
        return chSftp;
    }

    public void setChSftp(ChannelSftp chSftp) {
        this.chSftp = chSftp;
    }

    public FTPConnection() {
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public FTPConnection(FTPTypeEnum type) {
        this.type = type;
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

    public FTPClient getFtpClient() {
        return ftpClient;
    }

    public void setFtpClient(FTPClient ftpClient) {
        this.ftpClient = ftpClient;
    }
}
