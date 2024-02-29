package com.example.androidexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Intent intent = getIntent();

        StudentManager studentManager = intent.getParcelableExtra("123");

        ArrayList<Student> student = studentManager.GetStudents();

        TextView dashboard = findViewById(R.id.dashboard);

        for(Student stds : studentManager.GetStudents())
        {
            dashboard.setText("Username: "+stds.GetName());

            break;
        }

        Toast.makeText(this, "Student Size: "+studentManager.GetStudents().size(), Toast.LENGTH_SHORT).show();
    }
}