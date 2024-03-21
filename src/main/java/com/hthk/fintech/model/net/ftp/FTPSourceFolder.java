package com.hthk.fintech.model.net.ftp;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/21 11:32
 * Both for FTP & SFTP
 */
public class FTPSourceFolder {

    private String id;

    private String sourceId;

    private String folder;

    public FTPSourceFolder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
}
