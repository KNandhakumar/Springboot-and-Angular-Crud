package com.nandhu.todo.model;

import jakarta.persistence.*;

@Table(name = "tasks") // table annotation used for change the mysql database name
@Entity // Entity annotation use for spring boot to database create connection
public class Task {
    @Id // Id annotation use for this is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GeneratedValue annotation is generate unic id auto increment
    private Long id;
    private String description;
    private boolean completed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
