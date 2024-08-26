package main;

import java.util.ArrayList;
import java.util.List;

public class TaskList<T extends Task> {
    private List<T> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(T task) {
        tasks.add(task);
    }

    public List<T> getTasks() {
        return tasks;
    }
}
