package com.app.first.sqlitedefinescheme;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLDataException;

/**
 * Created by akhilesh yadav on 5/29/2017.
 */

public class AkhilHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME="akhildatabase";
    private static final String TABLE_NAME="AKHILTABLE";
    private static final int DATABASE_VERSON=2;
    private static final String UID="_id";
    private static final String NAME="Name";
    private static final String ADDRESS="Address";
    private   Context context;
    private static final String DROP_TABLE="DROP TABLE "+TABLE_NAME+" IF EXISTS";
    private static final String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+" ("+UID+" INTEGER PRIMARY KEY AUTOINCREMENT ,"+NAME+"  VARCHAR (225));";

    public  AkhilHelper(Context context){
        super(context ,DATABASE_NAME,null,DATABASE_VERSON);
        this.context=context;
        Message.message(context,"Constructor is colled");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creat table AKHILTABLE "_id INTEGER PRIMARY KEY AUTOINCREMENT ,Name  varchar (225);";)
try {
    db.execSQL(CREATE_TABLE);
    Message.message(context, "onCreate is colled");
}catch (SQLException e ){
     Message.message(context,""+e);
}
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {
            db.execSQL(DROP_TABLE);
            onCreate(db);
            Message.message(context, "onUpgrade is colled");
        }catch (SQLException e){

             Message.message(context ,""+e);
        }


    }
}
