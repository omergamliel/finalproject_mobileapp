package co.yvc.android.finalproject_mobileapp.models;

import java.util.Date;

public class Photo {

    private String activityId;
    private String base64;
    private Date uploadDate;

    public Photo() {}

    public Photo(String activityId, String base64, Date uploadDate) {
        setActivityId(activityId);
        setBase64(base64);
        setUploadDate(uploadDate);
    }

    public Photo(String activityId, String base64) {
        setActivityId(activityId);
        setBase64(base64);
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
