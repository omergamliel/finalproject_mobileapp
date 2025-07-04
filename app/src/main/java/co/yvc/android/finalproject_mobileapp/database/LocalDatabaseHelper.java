package co.yvc.android.finalproject_mobileapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class LocalDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "db";
    private static final int DATABASE_VERSION = 1;

    // ==== TABLE: USERS ====
    public static final String TABLE_USERS = "users";
    public static final String USER_ID = "id";
    public static final String USER_FULL_NAME = "full_name";
    public static final String USER_EMAIL = "email";
    public static final String USER_ROLE = "role";
    public static final String USER_BIRTH_DATE = "birth_date";
    public static final String USER_START_DATE = "start_date";
    public static final String USER_PARENT_ID = "parent_id";
    public static final String USER_EXPERTISE = "expertise";

    // ==== TABLE: ACTIVITIES ====
    public static final String TABLE_ACTIVITIES = "activities";
    public static final String ACTIVITY_ID = "id";
    public static final String ACTIVITY_NAME = "name";
    public static final String ACTIVITY_FIELD = "field";
    public static final String ACTIVITY_DESCRIPTION = "description";
    public static final String ACTIVITY_INSTRUCTOR_ID = "instructor_id";
    public static final String ACTIVITY_MAX_PARTICIPANTS = "max_participants";
    public static final String ACTIVITY_MIN_AGE = "min_age";
    public static final String ACTIVITY_MAX_AGE = "max_age";
    public static final String ACTIVITY_DAYS = "days";
    public static final String ACTIVITY_STATUS = "status";
    public static final String ACTIVITY_RATING = "rating";

    // ==== TABLE: PHOTOS ====
    public static final String TABLE_PHOTOS = "photos";
    public static final String PHOTO_ID = "id";
    public static final String PHOTO_ACTIVITY_ID = "activity_id";
    public static final String PHOTO_BASE64 = "base64";
    public static final String PHOTO_UPLOAD_DATE = "upload_date";

    // ==== TABLE: REVIEWS ====
    public static final String TABLE_REVIEWS = "reviews";
    public static final String REVIEW_ID = "id";
    public static final String REVIEW_ACTIVITY_ID = "activity_id";
    public static final String REVIEW_COMMENT = "comment";
    public static final String REVIEW_REVIEWER_ID = "reviewer_id";
    public static final String REVIEW_SCORE = "score";
    public static final String REVIEW_STUDENT_ID = "student_id";
    public static final String REVIEW_TYPE = "type";

    public LocalDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // USERS
        db.execSQL("CREATE TABLE " + TABLE_USERS + "("
                + USER_ID + " TEXT PRIMARY KEY, "
                + USER_FULL_NAME + " TEXT, "
                + USER_EMAIL + " TEXT, "
                + USER_ROLE + " TEXT, "
                + USER_BIRTH_DATE + " TEXT, "
                + USER_START_DATE + " TEXT, "
                + USER_PARENT_ID + " TEXT, "
                + USER_EXPERTISE + " TEXT)");

        // ACTIVITIES
        db.execSQL("CREATE TABLE " + TABLE_ACTIVITIES + "("
                + ACTIVITY_ID + " TEXT PRIMARY KEY, "
                + ACTIVITY_NAME + " TEXT, "
                + ACTIVITY_FIELD + " TEXT, "
                + ACTIVITY_DESCRIPTION + " TEXT, "
                + ACTIVITY_INSTRUCTOR_ID + " TEXT, "
                + ACTIVITY_MAX_PARTICIPANTS + " INTEGER, "
                + ACTIVITY_MIN_AGE + " INTEGER, "
                + ACTIVITY_MAX_AGE + " INTEGER, "
                + ACTIVITY_DAYS + " TEXT, "
                + ACTIVITY_STATUS + " TEXT, "
                + ACTIVITY_RATING + " REAL)");

        // PHOTOS
        db.execSQL("CREATE TABLE " + TABLE_PHOTOS + "("
                + PHOTO_ID + " TEXT PRIMARY KEY, "
                + PHOTO_ACTIVITY_ID + " TEXT, "
                + PHOTO_BASE64 + " TEXT, "
                + PHOTO_UPLOAD_DATE + " TEXT)");

        // REVIEWS
        db.execSQL("CREATE TABLE " + TABLE_REVIEWS + "("
                + REVIEW_ID + " TEXT PRIMARY KEY, "
                + REVIEW_ACTIVITY_ID + " TEXT, "
                + REVIEW_COMMENT + " TEXT, "
                + REVIEW_REVIEWER_ID + " TEXT, "
                + REVIEW_SCORE + " INTEGER, "
                + REVIEW_STUDENT_ID + " TEXT, "
                + REVIEW_TYPE + " TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ACTIVITIES);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PHOTOS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_REVIEWS);
        onCreate(db);
    }
}