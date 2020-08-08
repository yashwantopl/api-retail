package com.opl.retail.api.model.bodmas;

import java.io.Serializable;
import java.util.List;

public class BodmasReqRes implements Serializable {

    private Long id;

    private Long level;

    private Integer status;

    private String message;

    private Object data;

    private List dataList;

    public BodmasReqRes()
    {

    }

    public BodmasReqRes(String message, Integer status) {
        super();
        this.status = status;
        this.message = message;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List getDataList() {
        return dataList;
    }

    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "{ \"id\":"+id+",\"level\":"+level+"}";
    }
}
