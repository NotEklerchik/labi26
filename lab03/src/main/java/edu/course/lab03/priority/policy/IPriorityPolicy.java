package edu.course.lab03.priority.policy;

import edu.course.lab02.ProjectTask;

public interface IPriorityPolicy {
    int calculatePriority(ProjectTask task);
}
