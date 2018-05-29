package com.Infinity.pojo;

public class RoleParams {

    private String roleName;
    private String note;

    public RoleParams() {
    }

    public RoleParams(String roleName, String note) {
        this.roleName = roleName;
        this.note = note;
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
