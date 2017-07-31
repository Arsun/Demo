package com.scau.mimi.gson;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by admin on 2017/5/13.
 */

public class Comment implements Serializable {
    @SerializedName("commentId")
    public int id;

    @SerializedName("commentSender")
    public String sender;

    @SerializedName("commentContent")
    public String content;

    @SerializedName("commentTime")
    public String time;

    public int messageId;

    @SerializedName("commentApproveCount")
    public int likeCount;

    @SerializedName("commentDisapproveCount")
    public int hateCount;

}
