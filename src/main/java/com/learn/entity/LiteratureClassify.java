package com.learn.entity;

import java.io.Serializable;

/**
 * (LiteratureClassify)实体类
 *
 * @author Du
 * @since 2022-03-15 19:00:17
 */
public class LiteratureClassify implements Serializable {
    private static final long serialVersionUID = -48356440048101081L;

    private Integer literatureClassifyId;

    private String literatureClassifyName;

    private String img;


    public Integer getLiteratureClassifyId() {
        return literatureClassifyId;
    }

    public void setLiteratureClassifyId(Integer literatureClassifyId) {
        this.literatureClassifyId = literatureClassifyId;
    }

    public String getLiteratureClassifyName() {
        return literatureClassifyName;
    }

    public void setLiteratureClassifyName(String literatureClassifyName) {
        this.literatureClassifyName = literatureClassifyName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}

