package edu.course.lab02;

import java.util.UUID;

public final class StringID {
    private final String ID;

    public StringID() {
        this.ID = UUID.randomUUID().toString();
    }

//    GETTERS

    public String getID() {
        return ID;
    }
}
