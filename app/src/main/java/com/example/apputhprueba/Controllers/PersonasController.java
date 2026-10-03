package com.example.apputhprueba.Controllers;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.example.apputhprueba.Database.DatabaseHelper;
import com.example.apputhprueba.Models.Personas;


public class PersonasController {

    private final DatabaseHelper databaseHelper;

    public PersonasController(Context context) {
        databaseHelper = new DatabaseHelper(context);
    }

    }

}
