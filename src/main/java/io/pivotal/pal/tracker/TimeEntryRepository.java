package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public interface TimeEntryRepository {

    public TimeEntry create(TimeEntry timeEntry);
    public TimeEntry find(Long id);
    public List<TimeEntry> list();
    TimeEntry update(long id, TimeEntry timeEntry);

    void delete(long id);
//    public TimeEntry save(TimeEntry timeEntry);
}
