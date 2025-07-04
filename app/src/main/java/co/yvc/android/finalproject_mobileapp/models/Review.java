package co.yvc.android.finalproject_mobileapp.models;

public class Review {

    private String activityId;
    private String comment;
    private String reviewerId;
    private String type;

    private Integer score; // רלוונטי רק לביקורת של מדריך
    private String studentId; // רלוונטי רק לביקורת של מדריך

    public Review() {}

    // ביקורת של מדריך על חניך
    public Review(String activityId, String comment, String reviewerId, int score, String studentId) {
        setActivityId(activityId);
        setComment(comment);
        setReviewerId(reviewerId);
        setType("instructor");
        setScore(score);
        setStudentId(studentId);
    }

    // ביקורת של הורה על פעילות
    public Review(String activityId, String comment, String reviewerId) {
        setActivityId(activityId);
        setComment(comment);
        setReviewerId(reviewerId);
        setType("parent");
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(String reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}