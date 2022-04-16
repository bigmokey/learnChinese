package com.learn.entity;

import java.io.Serializable;

/**
 * (Poetry)实体类
 *
 * @author Du
 * @since 2022-03-17 15:24:42
 */
public class Poetry implements Serializable {
    private static final long serialVersionUID = -89790944179298968L;

    private Integer poetryId;

    private String poetryTitle;

    private String poetryResource;

    private String poetryImg;

    private String poetryIntroduce;


    public Integer getPoetryId() {
        return poetryId;
    }

    public void setPoetryId(Integer poetryId) {
        this.poetryId = poetryId;
    }

    public String getPoetryTitle() {
        return poetryTitle;
    }

    public void setPoetryTitle(String poetryTitle) {
        this.poetryTitle = poetryTitle;
    }

    public String getPoetryResource() {
        return poetryResource;
    }

    public void setPoetryResource(String poetryResource) {
        this.poetryResource = poetryResource;
    }

    public String getPoetryImg() {
        return poetryImg;
    }

    public void setPoetryImg(String poetryImg) {
        this.poetryImg = poetryImg;
    }

    public String getPoetryIntroduce() {
        return poetryIntroduce;
    }

    public void setPoetryIntroduce(String poetryIntroduce) {
        this.poetryIntroduce = poetryIntroduce;
    }

}

