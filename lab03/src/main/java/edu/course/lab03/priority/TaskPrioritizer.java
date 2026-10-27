package edu.course.lab03.priority;

import edu.course.lab02.ProjectTask;
import edu.course.lab02.StringID;
import edu.course.lab03.priority.policy.IPriorityPolicy;

import java.util.ArrayList;
import java.util.LinkedList;

public class TaskPrioritizer {
    IPriorityPolicy policy;

    private TaskPrioritizer(IPriorityPolicy policy) {
        if  (policy == null) throw new NullPointerException("Policy is null");
        this.policy = policy;
    }

    //TODO: Возможно эта хрень не заработает
    public LinkedList<ProjectTask> sort(LinkedList<ProjectTask> projectTasks) {
        if (projectTasks.isEmpty()) throw new IllegalArgumentException("projectTasks is empty or null");

        LinkedList<ProjectTask> ret = new LinkedList<>();

        for (ProjectTask val : projectTasks) {
            ret.add(policy.calculatePriority(val), val);
        }

        return ret;
    }
}
