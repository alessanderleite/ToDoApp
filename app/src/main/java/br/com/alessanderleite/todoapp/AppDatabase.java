package br.com.alessanderleite.todoapp;

import android.arch.persistence.room.Database;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase {
    public abstract TaskDao taskDao();
}
