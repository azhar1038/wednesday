package com.example.wednesday.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SongsDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addSongs(songs: Songs)

    @Query("SELECT * FROM songs_table ORDER BY id ASC")
    fun readAllSongs(): LiveData<List<Songs>>
}