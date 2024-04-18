package com.hthk.fintech.model.net.network;

import com.hthk.fintech.model.net.ftp.FTPSourceFile;
import com.hthk.fintech.model.net.ftp.FTPSourceFolder;

import java.util.List;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/21 16:42
 */
public class RemoteSource {

    private List<FTPSourceFolder> ftpFolderList;

    private List<FTPSourceFile> ftpFileList;

    public List<FTPSourceFile> getFtpFileList() {
        return ftpFileList;
    }

    public void setFtpFileList(List<FTPSourceFile> ftpFileList) {
        this.ftpFileList = ftpFileList;
    }

    public List<FTPSourceFolder> getFtpFolderList() {
        return ftpFolderList;
    }

    public void setFtpFolderList(List<FTPSourceFolder> ftpFolderList) {
        this.ftpFolderList = ftpFolderList;
    }
}
