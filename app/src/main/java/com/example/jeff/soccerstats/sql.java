package com.example.jeff.soccerstats;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ProgrammingKnowledge on 4/3/2015.
 */
public class sql extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Stats.db";
    public static final String TABLE_NAME = "stats_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "GOALS";
    public static final String COL_4 = "ASSISTS";
    public static final String COL_5 = "YC";
    public static final String COL_6 = "RC";
    public static final String COL_7 = "APPEARANCES";

    public sql(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME +"(ID INTEGER, NAME TEXT NOT NULL, GOALS TEXT NOT NULL, ASSISTS TEXT NOT NULL, YC TEXT NOT NULL, RC TEXT NOT NULL, APPEARANCES TEXT NOT NULL);");
        System.out.println("on Create done for db--------------------");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(int id, String name,String goals,String assists,String yc, String rc, String appearances) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,goals);
        contentValues.put(COL_4,assists);
        contentValues.put(COL_5,yc);
        contentValues.put(COL_6,rc);
        contentValues.put(COL_7,appearances);
        long result = db.insertOrThrow(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);

        return res;
    }

    public boolean updateData(String id,String name,String goals,String assists,String yc, String rc, String appearances) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1,id);
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,goals);
        contentValues.put(COL_4,assists);
        contentValues.put(COL_5,yc);
        contentValues.put(COL_6,rc);
        contentValues.put(COL_7,appearances);
        db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });
        return true;
    }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?",new String[] {id});
    }

    public void deleteAll(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from "+ TABLE_NAME);
    }

    public String getStat(int i, String stat){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select " + stat + " from "+TABLE_NAME + " where rowid = " + i,null);
        res.moveToNext();
        return res.getString(0);
    }


}