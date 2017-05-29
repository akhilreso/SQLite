package com.app.first.sqlitedefinescheme;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    AkhilHelper akhilHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //construct the object of AkhilHelper
        akhilHelper=new AkhilHelper(this);
        SQLiteDatabase sqLiteDatabase=akhilHelper.getWritableDatabase();
    }
}
