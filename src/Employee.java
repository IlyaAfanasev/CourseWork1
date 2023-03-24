import java.util.Objects;

public class Employee {

    private String lastName, firstName, middleName;
    private int salary;
    private int department;

    private static int id;

    public Employee(String lastName, String firstName, String middleName, int department, int salary) {
        id++;
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.department = department;
        this.salary = salary;
    }




    public int getId(){
        return  id;
    }
    public static int getEmployeeId(){
        return id;
    }

    public String getLastName() {
        lastName=lastName;
        return lastName;
    }

    public String getFirstName() {
        firstName=firstName;
        return firstName;
    }

    public String getMiddleName() {
        middleName=middleName;
        return middleName;
    }
    public String getName() {
        return lastName+" "+firstName+" "+middleName;
    }

    public int getDepartment() {
        department=department;
        return department;
    }

    public int getSalary() {
        salary=salary;
        return salary;
    }

    public void setDepartment(int department) {
        this.department=department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String EmployeeName(String lastName, String firstName, String middleName) {
        return lastName+" "+firstName+" "+middleName;
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
        return "Ф.И.О.: " + getLastName() + " " + getFirstName() + " " + getMiddleName() + ". Id: " + getId() + ". Отдел: " + getDepartment() + ". Зарплата: " + getSalary();
    }
    public void salaryIndexing(int index){
        this.salary=salary+salary/100*index;
    }
}
