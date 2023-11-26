import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(int employeeId, String phoneNumber, String name, int experience) {
        Employee newEmployee = new Employee(employeeId, phoneNumber, name, experience);
        employees.add(newEmployee);
    }

    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }

    public List<String> findPhoneNumbersByName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null; // Если сотрудник не найден
    }

    public static class Employee {
        private int employeeId;
        private String phoneNumber;
        private String name;
        private int experience;

        public Employee(int employeeId, String phoneNumber, String name, int experience) {
            this.employeeId = employeeId;
            this.phoneNumber = phoneNumber;
            this.name = name;
            this.experience = experience;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getName() {
            return name;
        }

        public int getExperience() {
            return experience;
        }
    }
}