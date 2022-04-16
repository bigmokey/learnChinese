package com.learn.entity;

import java.io.Serializable;

/**
 * (LiteratureDetail)实体类
 *
 * @author Du
 * @since 2022-03-15 19:00:15
 */
public class LiteratureDetail implements Serializable {
    private static final long serialVersionUID = -93969477994562969L;

    private Integer literatureDetailId;

    private String literatureDetailTitle;

    private Integer literatureId;

    private String literatureResource;


    public Integer getLiteratureDetailId() {
        return literatureDetailId;
    }

    public void setLiteratureDetailId(Integer literatureDetailId) {
        this.literatureDetailId = literatureDetailId;
    }

    public String getLiteratureDetailTitle() {
        return literatureDetailTitle;
    }

    public void setLiteratureDetailTitle(String literatureDetailTitle) {
        this.literatureDetailTitle = literatureDetailTitle;
    }

    public Integer getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(Integer literatureId) {
        this.literatureId = literatureId;
    }

    public String getLiteratureResource() {
        return literatureResource;
    }

    public void setLiteratureResource(String literatureResource) {
        this.literatureResource = literatureResource;
    }

}

