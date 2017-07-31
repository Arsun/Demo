package com.scau.mimi.gson;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by admin on 2017/5/13.
 */

public class CommentInfo implements Serializable {

    public Message message;

    @SerializedName("comments")
    public List<Comment> commentList;

}
