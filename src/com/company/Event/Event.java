package com.company.Event;

import com.company.Actor.Actor;
import com.company.Actor.Role;

import java.util.ArrayList;
import java.util.List;

public interface Event {
    void setTitle(String title);
    String getTitle();
    void setTextTask(String textTask);
    String getTextTask();
    int getStatus();
    void setFinish(boolean finish);
    void setStart(boolean start);
    void setStatus(int status);
    void approveEvent(Actor actor);
    void setRoles(List<Role> roles);
    boolean isStart();
    boolean isFinish();
}
