package com.example.androidexample;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Student extends User implements Parcelable {
    private String name;
    private int age;
    private String address;


    protected Student(Parcel in) {
        name = in.readString();
        age = in.readInt();
        address = in.readString();
    }

    public Student()
    {
        //null
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public void SetName(String name)
    {
        this.name = name;
    }

    public void SetAge(int age)
    {
        this.age = age;
    }

    public void SetAddress(String address)
    {
        this.address = address;
    }

    public String GetName()
    {
        return this.name;
    }

    public int GetAge()
    {
        return this.age;
    }

    public String GetAddress()
    {
        return this.address;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(address);
    }
}

