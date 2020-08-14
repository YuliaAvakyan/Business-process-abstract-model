package com.company.Actor;

import com.company.Event.Event;
import com.company.Event.EventImpl;

import java.util.List;

public class ActorImpl implements Actor {
    private int id;
    private String name;
    private List<Role> roles;
    private Event event;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setEvent(Event event){
        this.event = event;
    }

    @Override
    public void setRoles(Role role) {

    }

    @Override
    public List<Role> getRoles() {
        return roles;
    }

}
