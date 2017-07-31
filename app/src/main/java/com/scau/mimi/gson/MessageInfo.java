package com.scau.mimi.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin on 2017/5/13.
 */

public class MessageInfo {

    @SerializedName("items")
    public List<Message> messageList;

    @SerializedName("_links")
    public Links links;

    public class Links {
        public Self self;
        public Next next;
        public Last last;

        public class Self {
            @SerializedName("href")
            public String selfUrl;
        }

        public class Next {
            @SerializedName("href")
            public String nextUrl;
        }

        public class Last {
            @SerializedName("href")
            public String lastUrl;
        }
    }

    @SerializedName("_meta")
    public Info info;

    public class Info {

        public int pageCount;

        public int currentPage;

        public int perPage;
    }
}

