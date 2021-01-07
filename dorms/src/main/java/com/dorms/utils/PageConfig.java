package com.dorms.utils;

//分页配置
public class PageConfig {

    private Integer page;
    private Integer limit = 2;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
