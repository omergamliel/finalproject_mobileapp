package co.yvc.android.finalproject_mobileapp.models;

import java.util.List;
import java.util.Map;

public class Activity {

    // ====== שדות עיקריים ======
    private String name;             // שם הפעילות
    private String field;            // תחום הפעילות
    private String description;      // תיאור הפעילות
    private int maxParticipants;     // כמות משתתפים מירבית
    private String instructorId;     // מזהה מדריך המשויך לפעילות

    // ====== שדות משניים ======
    private Map<String, Integer> ageRange; // טווח גילאים
    private List<String> days;             // ימים שבהם הפעילות מתקיימת
    private List<String> participants;     // מזהים של משתמשים שנרשמו
    private List<String> photos;           // מזהים של תמונות
    private List<String> reviews;          // מזהים של ביקורות

    private String status;                 // סטטוס הפעילות
    private double rating;                 // דירוג ממוצע

    // ====== Constructors ======

    public Activity() {}

    public Activity(String name, String field, String description, int maxParticipants, String instructorId,
                    Map<String, Integer> ageRange, List<String> days,
                    List<String> participants, List<String> photos, List<String> reviews,
                    String status, double rating) {

        setName(name);
        setField(field);
        setDescription(description);
        setMaxParticipants(maxParticipants);
        setInstructorId(instructorId);
        setAgeRange(ageRange);
        setDays(days);
        setParticipants(participants);
        setPhotos(photos);
        setReviews(reviews);
        setStatus(status);
        setRating(rating);
    }

    public Activity(String name, String field, String description, int maxParticipants,
                    String instructorId, Map<String, Integer> ageRange, List<String> days) {

        setName(name);
        setField(field);
        setDescription(description);
        setMaxParticipants(maxParticipants);
        setInstructorId(instructorId);
        setAgeRange(ageRange);
        setDays(days);
    }

    // ====== Getters & Setters ======

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public Map<String, Integer> getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(Map<String, Integer> ageRange) {
        this.ageRange = ageRange;
    }

    public List<String> getDays() {
        return days;
    }

    public void setDays(List<String> days) {
        this.days = days;
    }

    public List<String> getParticipants() {
        return participants;
    }

    public void setParticipants(List<String> participants) {
        this.participants = participants;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
