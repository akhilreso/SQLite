package com.app.first.sqlitedefinescheme;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by akhilesh yadav on 5/29/2017.
 */

public class Message {
    public static void message(Context context , String message){

        Toast.makeText(context ,message,Toast.LENGTH_LONG).show();
    }
}
