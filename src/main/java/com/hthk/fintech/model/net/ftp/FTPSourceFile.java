package com.hthk.fintech.model.net.ftp;

/**
 * @Author: Rock CHEN
 * @Date: 2024/4/18 15:47
 */
public class FTPSourceFile {

    private String id;

    private String sourceId;

    private String file;

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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
