package com.scau.mimi.gson;

import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by admin on 2017/5/13.
 */

public class Message implements Serializable {

    @SerializedName("messageId")
    public int id;

    @SerializedName("messageContent")
    public String content;

    @Nullable
    @SerializedName("messagePicUrl")
    public String picUrl;

    @SerializedName("messageTime")
    public String time;

    @SerializedName("messageIsFake")
    public int isFake;

    @SerializedName("messageSender")
    public String sender;

    @SerializedName("messageCommentCount")
    public int commentCount;

    @SerializedName("messageApproveCount")
    public int likeCount;

    @SerializedName("messageDisapproveCount")
    public int hateCount;

    @SerializedName("_links")
    public Links links;

    public class Links {

        public Self self;

        public class Self {
            @SerializedName("href")
            public String commentUrl;
        }
    }

}

