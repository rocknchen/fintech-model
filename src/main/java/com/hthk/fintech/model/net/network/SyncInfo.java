package com.hthk.fintech.model.net.network;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/21 13:38
 */
public class SyncInfo {

    private String source;

    private String dest;

    private String backup;

    public boolean isBackup() {
        return backup != null;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
