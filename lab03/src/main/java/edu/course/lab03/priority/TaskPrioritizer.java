package edu.course.lab03.priority;

import edu.course.lab03.lab02.ProjectTask;
import edu.course.lab03.priority.policy.IPriorityPolicy;


public class TaskPrioritizer {
    IPriorityPolicy policy;

    public TaskPrioritizer(IPriorityPolicy policy) {
        if  (policy == null) throw new NullPointerException("Policy is null");
        this.policy = policy;
    }

    public int calculatePriority(ProjectTask task) {
        return policy.calculatePriority(task);
    }

}
