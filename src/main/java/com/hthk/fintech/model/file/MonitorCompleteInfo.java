package com.hthk.fintech.model.file;

import com.hthk.fintech.model.net.ftp.FTPSourceFile;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/18 15:46
 */
public class MonitorCompleteInfo {

    private MonitorInfo monitorInfo;

    private FTPSourceFile ftpFile;

    public MonitorCompleteInfo(MonitorInfo monitorInfo, FTPSourceFile ftpFile) {
        this.monitorInfo = monitorInfo;
        this.ftpFile = ftpFile;
    }

    public MonitorInfo getMonitorInfo() {
        return monitorInfo;
    }

    public FTPSourceFile getFtpFile() {
        return ftpFile;
    }
}
