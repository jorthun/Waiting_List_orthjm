package com.example.justi.waiting_list_orthjm.sqlite.database.model;

public class Note {
    public static final String TABLE_NAME = "waitlist";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOTE = "note";
    public static final String COLUMN_TIMESTAMP = "timestamp";
    public static final String COLUMN_CLASS = "classnum";
    public static final String COLUMN_SEMESTER = "semester";


    private int id;
    private String note;
    private String timestamp;
    private String semester;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NOTE + " TEXT,"
                    + COLUMN_TIMESTAMP + " DATETIME DEFAULT CURRENT_TIMESTAMP,"
                    + COLUMN_SEMESTER + " TEXT"
                    + ")";

    public Note() {
    }

    public Note(int id, String note, String timestamp, String semester) {
        this.id = id;
        this.note = note;
        this.timestamp = timestamp;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

}
