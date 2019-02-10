package com.example.languagespeedup.database.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "deck_table")
public class Deck {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String name;

    public Deck(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
}

