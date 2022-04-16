package com.learn.entity;

import java.io.Serializable;

/**
 * (Literature)实体类
 *
 * @author makejava
 * @since 2022-03-15 15:08:26
 */
public class Literature implements Serializable {
    private static final long serialVersionUID = -35560143574164776L;
    
    private Integer literatureId;
    
    private String literatureName;
    
    private Integer literatureClassifyId;


    public Integer getLiteratureId() {
        return literatureId;
    }

    public void setLiteratureId(Integer literatureId) {
        this.literatureId = literatureId;
    }

    public String getLiteratureName() {
        return literatureName;
    }

    public void setLiteratureName(String literatureName) {
        this.literatureName = literatureName;
    }

    public Integer getLiteratureClassifyId() {
        return literatureClassifyId;
    }

    public void setLiteratureClassifyId(Integer literatureClassifyId) {
        this.literatureClassifyId = literatureClassifyId;
    }

}

