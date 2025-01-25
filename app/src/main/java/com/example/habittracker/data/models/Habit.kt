package com.example.habittracker.data.models

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "habit_table")
data class HabitModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val habitTitle: String?,
    val habitDescription: String?,
    val habitStartTime: String?,
    val imageId: Int
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(habitTitle)
        parcel.writeString(habitDescription)
        parcel.writeString(habitStartTime)
        parcel.writeInt(imageId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<HabitModel> {
        override fun createFromParcel(parcel: Parcel): HabitModel {
            return HabitModel(parcel)
        }

        override fun newArray(size: Int): Array<HabitModel?> {
            return arrayOfNulls(size)
        }
    }
}