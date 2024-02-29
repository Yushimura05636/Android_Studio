package com.example.androidexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_login;

    EditText et_username, et_password;

    String username, password;

    Intent intent;

    Bundle bundle;

    Student student;
    StudentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize student
        student = new Student();

        //initialize button
        btn_login = (Button) findViewById(R.id.btn_login);


        //initialize editext
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);

        btn_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        username = et_username.getText().toString();
        password = et_password.getText().toString();

        student.SetName(username);
        student.SetPassword(password);

        ArrayList<Student> arr_students = new ArrayList<>();

        arr_students.add(student);

        manager = new StudentManager(arr_students);

        Intent intent = new Intent(this, Dashboard.class);

        intent.putExtra("123", manager);

        Toast.makeText(this, "current-username: "+manager.GetStudents().get(0).GetName(), Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }
}