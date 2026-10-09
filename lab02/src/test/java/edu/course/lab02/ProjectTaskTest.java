package edu.course.lab02;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTaskTest {
    static ProjectTask projectTask = new ProjectTask("Testing tests", 20);

    @Test
    void rejectInvalidTaskTitle() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("", 5));
    }

    @Test
    void rejectInvalidTaskTime() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("test", -5));
    }

    @Test
    void isStatusCreatedInitially() {
        assertEquals(TaskStatus.CREATED, projectTask.getStatus());
    }

    @Test
    void rejectNullStatus() {
        assertThrows(IllegalArgumentException.class, () -> projectTask.changeStatus(null));
    }

    @Test
    void changeStatus() {
        TaskStatus expectedStatus = TaskStatus.PENDING;
        projectTask.changeStatus(TaskStatus.PENDING);

        assertEquals(expectedStatus, projectTask.getStatus());
    }

    @Test
    void assertFalseForIncompleteTask() {
        projectTask.changeStatus(TaskStatus.IN_PROGRESS);

        assertFalse(projectTask.isComplete());
    }

    @Test
    void assertTrueForCompleteTask() {
        projectTask.changeStatus(TaskStatus.DONE);

        assertTrue(projectTask.isComplete());
    }

    @Test
    void addingValidTime() {
        int expectedHours = projectTask.getEstimatedHours() + 5;
        projectTask.addHours(5);

        assertEquals(expectedHours, projectTask.getEstimatedHours());
    }

    @Test
    void rejectAddingInvalidTime() {
        assertThrows(IllegalArgumentException.class, () -> projectTask.addHours(-1));
    }
}
