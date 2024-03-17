package com.example.project1;

import com.example.project1.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabasePersistence implements TaskPersistence{


    public boolean save(Task t) {
        DatabaseReference dbTask = FirebaseDatabase.getInstance().getReference("Task");
        dbTask.child(t.getTaskId()).setValue(t);
        return true;
    }








}
