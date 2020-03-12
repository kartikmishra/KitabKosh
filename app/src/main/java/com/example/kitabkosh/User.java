package com.example.kitabkosh;

public class User {
    private String userName;
    private String userId;
    private String profile_picture;
    private String bookNumber;
    private String schoolName;
    private String bookImage;

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public User(String userName, String userId, String profile_picture, String bookNumber, String schoolName,String className,String bookImage) {
        this.userName = userName;
        this.userId = userId;
        this.profile_picture = profile_picture;
        this.bookNumber = bookNumber;
        this.schoolName = schoolName;
        this.bookImage = bookImage;
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private String className;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    public void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }
}
