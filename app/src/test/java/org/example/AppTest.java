package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddTask() {
        App app = new App();

        app.addTask("Learn Java");

        assertEquals(1, app.getTaskCount());
    }

    @Test
    void testMultipleTasks() {
        App app = new App();

        app.addTask("Learn Gradle");
        app.addTask("Learn Docker");

        assertEquals(2, app.getTaskCount());
    }

    @Test
    void testEmptyTaskList() {
        App app = new App();

        assertEquals(0, app.getTaskCount());
    }
}
