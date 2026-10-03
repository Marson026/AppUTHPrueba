package com.example.apputhprueba.Database;

public class DBConfig {
    //Constantes de la base de datos
    private static final String DATABASE_NAME = "personas.db";
    //Version de la base de datos
    private static final int DATABASE_VERSION = 1;
    //
    private static final String TABLE_PERSONAS = "personas";
    //Columnas de la tabla personas
    private static final String COLUMN_ID = "id";
    //Columnas de la tabla personas
    private static final String COLUMN_NOMBRES = "nombres";
    //Columnas de la tabla personas para nombres
    private static final String COLUMN_APELLIDOS = "apellidos";
    //Columnas de la tabla personas para apellidos
    private static final String COLUMN_DIRECCION = "direccion";
    //Columnas de la tabla personas para direction
    private static final String COLUMN_FECHANAC = "fechaNac";
    //Columnas de la tabla personas para foci de nacimiento
    private static final String COLUMN_TELEFONO = "telefono";
    //Columnas de la tabla personas para notelet
    private static final String COLUMN_CORREO = "correo";
    //Columnas de la tabla personas para core

    //Sentence SQL para crear la tabla personas
    public static final String CREATE_TABLE_PERSONAS = "CREATE TABLE "
            + TABLE_PERSONAS + " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_NOMBRES + " TEXT NOT NULL, "
            + COLUMN_APELLIDOS + " TEXT NOT NULL, "
            + COLUMN_FECHANAC + " TEXT NOT NULL, "
            + COLUMN_DIRECCION + " TEXT, "
            + COLUMN_TELEFONO + " TEXT, "
            + COLUMN_CORREO + " TEXT )";

    //Sentence SQL para eliminar la tabla personas
    public static final String DROP_TABLE_PERSONAS = "DROP TABLE IF EXISTS " + TABLE_PERSONAS;

    //Sentence SQL para reselection la tabla personas
    public static final String SELECT_TABLE_PERSONAS = "SELECT * FROM " + TABLE_PERSONAS;


}
