package com.learn.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Works)实体类
 *
 * @author Du
 * @since 2022-04-03 13:31:30
 */
public class Works implements Serializable {
    private static final long serialVersionUID = 670488244663229126L;

    private Long id;

    private Long uid;

    private Date writetime;

    private Integer collection;

    private Integer howlike;

    private String type;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Date getWritetime() {
        return writetime;
    }

    public void setWritetime(Date writetime) {
        this.writetime = writetime;
    }

    public Integer getCollection() {
        return collection;
    }

    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    public Integer getHowlike() {
        return howlike;
    }

    public void setHowlike(Integer howlike) {
        this.howlike = howlike;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

