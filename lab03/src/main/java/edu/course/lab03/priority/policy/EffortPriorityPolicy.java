package edu.course.lab03.priority.policy;

import edu.course.lab03.lab02.ProjectTask;

public class EffortPriorityPolicy implements IPriorityPolicy {

    @Override
    public int calculatePriority(ProjectTask task) {
        return task.getEstimatedHours();
    }
}
