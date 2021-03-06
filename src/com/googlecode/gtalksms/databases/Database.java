package com.googlecode.gtalksms.databases;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public abstract class Database {
    protected static SQLiteDatabase database;
    protected static SQLiteDatabase databaseRO;

    
    Database(Context ctx) {
        if (database == null) {
            DatabaseOpenHelper helper = new DatabaseOpenHelper(ctx);
            database = helper.getWritableDatabase();
            databaseRO = helper.getReadableDatabase();
        }
    }
    
    
    /*  We don't need these getters atm
     public SQLiteDatabase getDatabase() {
         return database;
     }
     
     public SQLiteDatabase getReadOnlyDatabase() {
         return databaseRO;
     }
     */
    
}
