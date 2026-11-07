package edu.course.lab03.priority.policy;


import edu.course.lab03.lab02.ProjectTask;

public class StatusPriorityPolicy implements IPriorityPolicy {

    @Override
    public int calculatePriority(ProjectTask task) {
        int priority;

        switch (task.getStatus()) {
            case CREATED -> priority = 0;
            case PENDING -> priority = Integer.MAX_VALUE - 1;
            default -> priority = Integer.MAX_VALUE;
        }

        return priority;
    }
}
