package com.Infinity.pojo;

public class RoleParams {

    private String roleName;
    private String note;

    // 15.1.4加入
    private PageParam pageParams = null;

    public RoleParams() {
    }

    public RoleParams(String roleName, String note, PageParam pageParam) {
        this.roleName = roleName;
        this.note = note;
        this.pageParams = pageParam;
    }

    public PageParam getPageParams() {
        return pageParams;
    }

    public void setPageParams(PageParam pageParams) {
        this.pageParams = pageParams;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
