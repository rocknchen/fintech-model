package com.hthk.fintech.model.software.app;

/**
 * @Author: Rock CHEN
 * @Date: 2023/11/14 16:40
 */
public class AppVersion {

    private String number;

    private String author;

    public AppVersion(String number) {
        this.number = number;
    }

    public AppVersion(String number, String author) {
        this.number = number;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
