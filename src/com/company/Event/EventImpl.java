package com.company.Event;

import com.company.Actor.Actor;
import com.company.Actor.Role;

import java.util.ArrayList;
import java.util.List;

public class EventImpl implements Event {
     private Actor actor;

     private String title;
     private String textTask;
     private boolean start;
     private boolean finish;
     private int status;

    @Override
    public void approveEvent(Actor actor) {
        this.actor = actor;
        actor.setEvent(this);
    }

    @Override
    public void setRoles(List<Role> roles) {

    }


    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTextTask() {
        return textTask;
    }

    public void setTextTask(String textTask) {
        this.textTask = textTask;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


}
