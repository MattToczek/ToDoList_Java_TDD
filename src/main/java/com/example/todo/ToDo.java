package com.example.todo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo {
    @Id
    private long id;
    private String text;
    private boolean completed;

    public ToDo(long id, String text, boolean completed) {

        this.id = id;
        this.text = text;
        this.completed = completed;
    }
}