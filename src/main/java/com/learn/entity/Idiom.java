package com.learn.entity;

import java.io.Serializable;

/**
 * (Idiom)实体类
 *
 * @author Du
 * @since 2022-03-17 15:24:22
 */
public class Idiom implements Serializable {
    private static final long serialVersionUID = 935296111688770287L;

    private Integer idiomId;

    private String idiomTitle;

    private String idiomResource;

    private String idiomImg;

    private String idiomIntroduce;


    public Integer getIdiomId() {
        return idiomId;
    }

    public void setIdiomId(Integer idiomId) {
        this.idiomId = idiomId;
    }

    public String getIdiomTitle() {
        return idiomTitle;
    }

    public void setIdiomTitle(String idiomTitle) {
        this.idiomTitle = idiomTitle;
    }

    public String getIdiomResource() {
        return idiomResource;
    }

    public void setIdiomResource(String idiomResource) {
        this.idiomResource = idiomResource;
    }

    public String getIdiomImg() {
        return idiomImg;
    }

    public void setIdiomImg(String idiomImg) {
        this.idiomImg = idiomImg;
    }

    public String getIdiomIntroduce() {
        return idiomIntroduce;
    }

    public void setIdiomIntroduce(String idiomIntroduce) {
        this.idiomIntroduce = idiomIntroduce;
    }

}

