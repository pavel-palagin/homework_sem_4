package seminar_4.task;

import java.util.Deque;
import java.util.List;

public interface TaskServiceInterface {
    void addTask(Task task);
    void deleteTask(Task task);
    Task getTaskOfId(int id);
    List<Task> getOnePriorityTasks(Priority priority);
    Deque<Task> getAllTasks();


}
