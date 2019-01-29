package br.com.alessanderleite.todoapp;

import android.arch.persistence.room.Room;
import android.content.Context;

import static android.arch.persistence.room.Room.databaseBuilder;

public class DatabaseClient {

    private Context mContext;
    private static DatabaseClient mInstance;

    //our app database object
    private AppDatabase appDatabase;

    private DatabaseClient(Context mContext) {
        this.mContext = mContext;

        //creating the app database with Room database builder]
        //MyToDos is the name of the database
        appDatabase = databaseBuilder(mContext, AppDatabase.class, "MyToDos").build();
    }

    public static synchronized DatabaseClient getInstance(Context mContext) {
        if (mInstance == null) {
            mInstance = new DatabaseClient(mContext);
        }
        return mInstance;
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }
}
