package com.example.androidexample;

import android.app.Person;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentManager implements Parcelable {

    public static ArrayList<Student> students = new ArrayList<>();

    public StudentManager(ArrayList<Student> student) {
        students = student;
    }

    protected StudentManager(Parcel in) {
        students = in.createTypedArrayList(Student.CREATOR);
    }

    public static final Creator<StudentManager> CREATOR = new Creator<StudentManager>() {
        @Override
        public StudentManager createFromParcel(Parcel in) {
            return new StudentManager(in);
        }

        @Override
        public StudentManager[] newArray(int size) {
            return new StudentManager[size];
        }
    };

    public ArrayList<Student> GetStudents() {
        return students;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeTypedList(students);
    }
}