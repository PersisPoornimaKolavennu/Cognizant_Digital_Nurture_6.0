public class TaskManagementSystem {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(1, "Design System Architecture", "Pending");
        manager.addTask(2, "Develop Backend", "In Progress");
        manager.addTask(3, "Test Application", "Pending");

        System.out.println("All Tasks:");
        manager.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task task = manager.searchTask(2);
        System.out.println(task != null ? task : "Task not found.");

        System.out.println("\nDeleting Task with ID 1:");
        manager.deleteTask(1);

        System.out.println("\nTasks After Deletion:");
        manager.traverseTasks();
    }
}
