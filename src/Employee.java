import java.util.Objects;

public class Employee {

    private final String lastName, firstName, middleName;
    private double salary;
    private int department;
    private final int id;
    private static int count;


    public Employee(String lastName, String firstName, String middleName, int department, double salary) {
        count++;
        this.id = count;
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.department = department;
        this.salary = salary;

    }

    public int getId() {

        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getName() {
        return lastName + " " + firstName + " " + middleName;
    }

    public int getDepartment() {

        return department;
    }

    public double getSalary() {

        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String fullName() {
        return lastName + " " + firstName + " " + middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return lastName.equals(employee.lastName) && firstName.equals(employee.firstName) && middleName.equals(employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, middleName);
    }

    @Override
    public String toString() {
        return "Ф.И.О.: " + getLastName() + " " + getFirstName() + " " + getMiddleName() + " Id: " + getId() + ". Отдел: " + getDepartment() + ". Зарплата: " + getSalary() + " рублей.";
    }

    public void salaryIndexing(int index) {
        this.salary = salary + salary / 100 * index;
    }
}
