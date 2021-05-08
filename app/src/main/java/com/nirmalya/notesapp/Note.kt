package com.nirmalya.notesapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="notes_table")
class Note(@ColumnInfo(name = "text")val text: String) {
    @PrimaryKey(autoGenerate = true)var id = 0
        //autogenerate is used so we dont have to pass
}