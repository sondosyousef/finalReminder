package com.example.add;




import androidx.room.PrimaryKey;

import java.util.Date;


public class Reminders {

    @PrimaryKey(autoGenerate = true)

    public int id;

    String message;
    Date remindDate;

    public String getMessage() {
        return message;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public int getId() {
        return id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public void setId(int id) {
        this.id = id;
    }
}
