package com.services.fixit;

public class TravelmanticsUser {
    private String userID;
    private String name;
    private boolean isAdmin;
    private String email;

    public TravelmanticsUser() {}

    public TravelmanticsUser(String uid, String uname, boolean uadmin, String uemail) {
        userID = uid;
        name = uname;
        isAdmin = uadmin;
        email = uemail;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
