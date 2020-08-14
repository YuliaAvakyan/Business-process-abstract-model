package com.company.Process;

import com.company.Event.Event;

public interface Process {
    void onStart();
    void onFinish();
    void addEvents(Event event);
    int getId();
    String getName();
    int getStatus();
    void setStatus(int status);
}
