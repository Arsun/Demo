package com.scau.mimi.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/5/13.
 */

public class Moment implements Serializable {

    private int id;
    private String sender;
    private String content;
    private String momentImgPath;
    private String momentImgUrl;
    private String commentUrl;
    private Date date;
    private int messageId;
    private int commentCount;
    private int likeCount;
    private int hateCount;
    private boolean isFake;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMomentImgPath() {
        return momentImgPath;
    }

    public void setMomentImgPath(String momentImgPath) {
        this.momentImgPath = momentImgPath;
    }

    public String getMomentImgUrl() {
        return momentImgUrl;
    }

    public void setMomentImgUrl(String momentImgUrl) {
        this.momentImgUrl = momentImgUrl;
    }

    public String getCommentUrl() {
        return commentUrl;
    }

    public void setCommentUrl(String commentUrl) {
        this.commentUrl = commentUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getHateCount() {
        return hateCount;
    }

    public void setHateCount(int hateCount) {
        this.hateCount = hateCount;
    }

    public boolean isFake() {
        return isFake;
    }

    public void setFake(boolean fake) {
        isFake = fake;
    }
}
