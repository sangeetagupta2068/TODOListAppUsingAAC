package com.example.android.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.todolist.database.AppDatabase;
import com.example.android.todolist.database.TaskEntry;

public class AddTaskViewModel extends ViewModel {

    private LiveData<TaskEntry> taskEntryLiveData;

    public LiveData<TaskEntry> getTask(){
        return taskEntryLiveData;
    }

    public AddTaskViewModel(AppDatabase appDatabase, int mTaskId){
        taskEntryLiveData = appDatabase.taskDao().loadTaskById(mTaskId);
    }

}
