
package org.example;

import java.util.ArrayList;
import java.util.List;
import com.google.common.base.Joiner;

public class App {

    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public void showTasks() {
        System.out.println("\n===== CODEALPHA TASK MANAGER =====");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        System.out.println("=================================");
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public String getTaskSummary() {
        return Joiner.on(", ").join(tasks);
    }

    public static void main(String[] args) {

        App app = new App();

        app.addTask("Learn Java");
        app.addTask("Understand Gradle");
        app.addTask("Build Java Application");
        app.addTask("Learn DevOps CI/CD");

        app.showTasks();

        System.out.println("Total Tasks: " + app.getTaskCount());

        System.out.println("Task Summary: " + app.getTaskSummary());
    }
}

