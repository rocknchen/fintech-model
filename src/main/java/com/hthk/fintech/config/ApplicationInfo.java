package com.hthk.fintech.config;

import com.hthk.fintech.model.file.MonitorInfo;
import com.hthk.fintech.model.net.ftp.FTPSource;
import com.hthk.fintech.model.net.network.EmailInfo;
import com.hthk.fintech.model.net.network.RemoteSource;
import com.hthk.fintech.model.net.network.SyncInfo;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/21 16:17
 */
public class ApplicationInfo {

    private List<FTPSource> ftpSourceList;

    private RemoteSource remoteSource;

    private List<SyncInfo> ftpSyncList;

    private List<EmailInfo> emailList;

    private List<MonitorInfo> monitorInfoList;

    public List<EmailInfo> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<EmailInfo> emailList) {
        this.emailList = emailList;
    }

    public List<FTPSource> getFtpSourceList() {
        return ftpSourceList;
    }

    public void setFtpSourceList(List<FTPSource> ftpSourceList) {
        this.ftpSourceList = ftpSourceList;
    }

    public List<SyncInfo> getFtpSyncList() {
        return ftpSyncList;
    }

    public void setFtpSyncList(List<SyncInfo> ftpSyncList) {
        this.ftpSyncList = ftpSyncList;
    }

    public RemoteSource getRemoteSource() {
        return remoteSource;
    }

    public void setRemoteSource(RemoteSource remoteSource) {
        this.remoteSource = remoteSource;
    }

    public List<MonitorInfo> getMonitorInfoList() {
        return monitorInfoList;
    }

    public void setMonitorInfoList(List<MonitorInfo> monitorInfoList) {
        this.monitorInfoList = monitorInfoList;
    }
}
