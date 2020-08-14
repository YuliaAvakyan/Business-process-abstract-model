package com.company.Actor;

import com.company.Event.Event;

import java.util.List;

public interface Actor {
    void setRoles(Role role);
    List<Role> getRoles();
    void setEvent(Event event);
    int getId();
    String getName();
}
