package com.learn.entity.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BrowseWorks implements Serializable {
    private static final long serialVersionUID = 204721234687739814L;

    private Long id;
    /**
     * 用户昵称
     */
    private String username;

    private String avatarurl;

    private Integer userstatus;

    private Long uid;

    private Date writetime;

    private Integer collection;

    private Integer howlike;

    private String type;

    private String content;

}
