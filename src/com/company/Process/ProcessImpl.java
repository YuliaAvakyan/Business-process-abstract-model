package com.company.Process;

import com.company.Event.Event;

import java.util.*;

public class ProcessImpl implements Process {

//    private ArrayList<LinkedList<Integer>> event_graph_list;
    private Map<Event, List<Event>> event_graph = new HashMap<>();
    private int id;
    private String name;
    private int status;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public void setStatus(int status) {

    }


    @Override
    public void onStart() {

    }

    @Override
    public void onFinish() {

    }

    @Override
    public void addEvents(Event event) {

    }

}

