package com.hthk.fintech.model.net.network;

/**
 * @Author: Rock CHEN
 * @Date: 2024/3/21 13:38
 */
public class SyncInfo {

    private String source;

    private String dest;

    private String backup;

    private Boolean sendEmail;

    private String subject;

    public Boolean getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

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
