package edu.course.lab03;

import edu.course.lab02.ProjectTask;
import edu.course.lab02.TaskStatus;
import edu.course.lab03.priority.TaskPrioritizer;
import edu.course.lab03.priority.policy.EffortPriorityPolicy;
import edu.course.lab03.priority.policy.StatusPriorityPolicy;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class TaskPrioritizerTest {

    @Test
    public void testCalculationEffortPriorityPolicy() {
        TaskPrioritizer tp = new TaskPrioritizer(new EffortPriorityPolicy());

        ProjectTask tv1 = new ProjectTask("123", 123);
        ProjectTask tv2 = new ProjectTask("123", 12);
        ProjectTask tv3 = new ProjectTask("123", 4);
        ProjectTask tv4 = new ProjectTask("123", 22);

        assertEquals(123, tp.calculatePriority(tv1));
        assertEquals(12, tp.calculatePriority(tv2));
        assertEquals(4, tp.calculatePriority(tv3));
        assertEquals(22, tp.calculatePriority(tv4));

    }

    @Test
    public void testCalculationStatusPriorityPolicy() {
        TaskPrioritizer tp = new TaskPrioritizer(new StatusPriorityPolicy());

        ProjectTask tv1 = new ProjectTask("123", 123);
        ProjectTask tv2 = new ProjectTask("123", 12);
        ProjectTask tv3 = new ProjectTask("123", 4);
        ProjectTask tv4 = new ProjectTask("123", 22);

        tv1.changeStatus(TaskStatus.CREATED);
        tv2.changeStatus(TaskStatus.PENDING);
        tv3.changeStatus(TaskStatus.IN_PROGRESS);
        tv4.changeStatus(TaskStatus.DONE);

        assertEquals(0, tp.calculatePriority(tv1));
        assertEquals(Integer.MAX_VALUE - 1, tp.calculatePriority(tv2));
        assertEquals(Integer.MAX_VALUE, tp.calculatePriority(tv3));
        assertEquals(Integer.MAX_VALUE, tp.calculatePriority(tv4));
    }

    @Test
    public void testExceptionThrown() {
        assertThrows(NullPointerException.class, () -> new TaskPrioritizer(null));
    }
}
