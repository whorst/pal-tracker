package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;


public class TimeEntry {
    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

    public TimeEntry(){

    }

    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours) {
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    public TimeEntry(long projectId, long userId, LocalDate date, int hours) {
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
        return id == timeEntry.id &&
                projectId == timeEntry.projectId &&
                userId == timeEntry.userId &&
                hours == timeEntry.hours &&
                Objects.equals(date, timeEntry.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, projectId, userId, date, hours);
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public long getProjectId() {
        return this.projectId;
    }

    public long getUserId() {
        return this.userId;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public int getHours() {
        return this.hours;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //projectId, userId, LocalDate.parse("2017-01-08"), 8);

//    public void testCreate(){}
//    public void testRead(){}
//    public void setUp(){}
//    public void testRead_NotFound(){}
//    public void testList(){}
//    public void testUpdate(){}
//    public void testUpdate_NotFound(){}
//    public void testDelete(){}

}
