package co.yvc.android.finalproject_mobileapp.models;

import java.util.Date;
import java.util.List;

public class User {

    // ====== Register Fields ======
    private String fullName;     // שם מלא
    private String email;        // אימייל
    private String role;         // תפקיד
    private Date birthDate;      // תאריך לידה

    // ====== Optional Fields ======
    private Date startDate;              // התחלת עבודה – רק למדריך
    private String parentId;             // מזהה ההורה – רק לחניך
    private String expertise;            // התמחות – רק למדריך
    private List<String> activityIds;    // פעילויות שהמשתמש רשום אליהן

    // ====== Constructors ======

    public User() {}

    public User(String fullName, String email, String role, Date birthDate, Date startDate,
                String parentId, String expertise, List<String> activityIds) {
        setFullName(fullName);
        setEmail(email);
        setRole(role);
        setBirthDate(birthDate);
        setStartDate(startDate);
        setParentId(parentId);
        setExpertise(expertise);
        setActivityIds(activityIds);
    }

    public User(String fullName, String email, String role) {
        setFullName(fullName);
        setEmail(email);
        setRole(role);
    }

    // ====== Getters & Setters ======

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public List<String> getActivityIds() {
        return activityIds;
    }

    public void setActivityIds(List<String> activityIds) {
        this.activityIds = activityIds;
    }
}