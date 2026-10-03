package com.example.apputhprueba.Database;

//importaciones necesarias para la base de datos
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper
{
    //Constructor de la base de datos
    public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
//Metodos de la base de datos crear
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBConfig.CREATE_TABLE_PERSONAS);

    }
//Metodos de la base de datos actualizar
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DBConfig.DROP_TABLE_PERSONAS);
        onCreate(db);

    }
}
