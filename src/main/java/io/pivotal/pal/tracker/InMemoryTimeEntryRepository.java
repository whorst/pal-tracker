package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

@Repository
public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    long timeEntryId = 1L;
    long projectId = 123L;
    long userId = 456L;

    ArrayList <TimeEntry> teal = new ArrayList<>();

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        timeEntry.setId(timeEntryId);
        timeEntryId = timeEntryId+1L;
        teal.add(timeEntry);
        return timeEntry;
    }

    @Override
    public TimeEntry find(Long id) {
        if(teal.isEmpty())
            return null;
        return isTimeEntryInTeal(id);
//        if(isTimeEntryInTeal(id)){
//            return new TimeEntry(timeEntryId, projectId, userId, LocalDate.parse("2017-01-08"), 8);
//        }else{
//            return null;
//        }
    }

    public TimeEntry isTimeEntryInTeal(long id){
        for(TimeEntry te : teal){
            if(te.getId() == id){
                return te;
            }
        }
        return null;
    }

    @Override
    public ArrayList<TimeEntry> list() {
        return teal;
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
//        timeEntry.setId(id);
//        teal.add(timeEntry);
        for(TimeEntry teo : teal){
            if(teo.getId() == id){
                teo.setDate(timeEntry.getDate());
                teo.setHours(timeEntry.getHours());
                teo.setProjectId(timeEntry.getProjectId());
                teo.setUserId(timeEntry.getUserId());
                return teo;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Iterator<TimeEntry> iterator = teal.iterator();
        while(iterator.hasNext()){
            TimeEntry curr = iterator.next();
            if(curr.getId() == id){
                iterator.remove();
            }
        }


        //for(TimeEntry teo : teal){
          //  if(teo.getId() == id){
            //    teal.remove(teo);
            //}
        //}
    }

//    @Override
//    public TimeEntry save(TimeEntry timeEntry) {
//        return null;
//    }
//    public TimeEntry create(TimeEntry timeEntry) {
//        long newLong = 1L;
//        timeEntry.setId(newLong);
//        return timeEntry;
//    }
//
//    public TimeEntry find(Long id) {
//        return new TimeEntry();
//    }
}
