class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: $" + salary;
    }
}

public class EmployeeManagement {
    private Employee[] employees;
    private int count;

    public EmployeeManagement(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Employee list is full.");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void deleteEmployee(int employeeId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == employeeId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--count] = null;
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {
        EmployeeManagement em = new EmployeeManagement(5);

        em.addEmployee(new Employee(1, "Alice", "Manager", 75000));
        em.addEmployee(new Employee(2, "Bob", "Developer", 50000));
        em.addEmployee(new Employee(3, "Charlie", "Tester", 40000));

        System.out.println("All Employees:");
        em.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee emp = em.searchEmployee(2);
        System.out.println(emp != null ? emp : "Employee not found.");

        System.out.println("\nDeleting Employee with ID 2:");
        em.deleteEmployee(2);
        em.traverseEmployees();
    }
}
