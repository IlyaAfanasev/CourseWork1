

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String lastName, String firstName, String middleName, int department, int salary) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить контакт, закончилось место");
        }
        Employee newEmployee = new Employee(lastName, firstName, middleName, department, salary);
        employees[size++] = newEmployee;
    }

    @Override
    public String toString() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        return "";//Не знаю как еще это сделать

    }

    public void sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Общая сумма затрат на зарплаты в месяц - " + sum);
    }

    public void minSalary() {
        Employee employee = employees[0];
        Employee employee1;
        for (int i = 0; i < employees.length; i++) {
            employee1 = employees[i];
            if (employee.getSalary() > employee1.getSalary()) {
                employee = employee1;
            }

        }
        System.out.println("Минимальная зарплата- " + employee.getSalary() + ", у сотрудника - " + employee.getName());
    }


    public void maxSalary() {
        Employee employee = employees[0];
        Employee employee1;
        for (int i = 0; i < employees.length; i++) {
            employee1 = employees[i];
            if (employee.getSalary() < employee1.getSalary()) {
                employee = employee1;
            }

        }
        System.out.println("Максимальная зарплата- " + employee.getSalary() + ", у сотрудника - " + employee.getName());
    }


    public void averageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Средняя сумма затрат на зарплаты в месяц - " + sum/size);
    }
    public void printEmployeesNames() {
        Employee employee;
        for (int i = 0; i < employees.length; i++) {
            employee=employees[i];
            System.out.println(employee.getName());
        }
    }
    public void printSalaries(){
        Employee employee;
        for (int i = 0; i <employees.length ; i++) {
            employee=employees[i];
            System.out.println(employee.getSalary());

        }
    }

    public void salaryIndexing(int index){
        Employee employee;
        for (int i = 0; i < employees.length; i++) {
            employee = employees[i];

            employee.salaryIndexing(index);

        }

    }public void minSalaryDepartment(int department) {
        Employee employee0;
        Employee employee2;
        Employee minSalary=null;
        for (int i = 0; i < employees.length; i++) {
            employee0=employees[i];
            if (employee0.getDepartment() == department){
                minSalary = employee0;
                break;
            }
        }

        for (int i = 0; i < employees.length; i++) {
            employee2 = employees[i];

            if(employee2.getDepartment()==department) {

                if (minSalary.getSalary() > employee2.getSalary()) {
                    minSalary = employee2;
                }
            }

        }
        System.out.println("Минимальная зарплата по отделу "+department+" - " + minSalary.getSalary() + ", у сотрудника - " + minSalary.getName());
    }


    public void maxSalaryDepartment(int department) {
        Employee employee0;
        Employee employee2;
        Employee maxSalary=null;
        for (int i = 0; i < employees.length; i++) {
            employee0=employees[i];
            if (employee0.getDepartment() == department){
                 maxSalary = employee0;
                 break;
            }
        }

        for (int i = 0; i < employees.length; i++) {
            employee2 = employees[i];

            if(employee2.getDepartment()==department) {

                if (maxSalary.getSalary() < employee2.getSalary()) {
                    maxSalary = employee2;
                }
            }

        }
        System.out.println("Максимальная зарплата по отделу "+department+" - " + maxSalary.getSalary() + ", у сотрудника - " + maxSalary.getName());
    }


}
