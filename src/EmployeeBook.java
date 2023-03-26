

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String lastName, String firstName, String middleName, int department, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (size >= employees.length) {
                System.out.println("Нельзя добавить контакт, закончилось место");
            } else if (employees[i] == null) {
                Employee newEmployee = new Employee(lastName, firstName, middleName, department, salary);
                employees[i] = newEmployee;
                size++;
                break;
            }
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        for (Employee employee : employees) {

            if (employee != null) {
                System.out.println(employee);
            }
        }
        return "";//Не знаю как еще это сделать

    }

    public void sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Общая сумма затрат на зарплаты в месяц - " + sum + " рублей.");
    }

    public void minSalary() {
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employee = employees[i];
                break;
            }
        }
        Employee employee1;
        for (int i = 0; i < employees.length; i++) {
            employee1 = employees[i];
            if (employee1 != null && employee.getSalary() > employee1.getSalary()) {
                employee = employee1;
            }

        }
        System.out.println("Минимальная зарплата- " + employee.getSalary() + " рублей, у сотрудника - " + employee.getName());
    }


    public void maxSalary() {
        Employee employee = null;
        Employee employee1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employee = employees[i];
                break;
            }
        }
        for (int i = 0; i < employees.length; i++) {
            employee1 = employees[i];
            if (employee1 != null && employee.getSalary() < employee1.getSalary()) {
                employee = employee1;
            }

        }
        System.out.println("Максимальная зарплата- " + employee.getSalary() + " рублей, у сотрудника - " + employee.getName());
    }


    public void averageSalary() {
        int sum = 0;
        for (Employee employee : employees) {

            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Средняя сумма затрат на зарплаты в месяц - " + sum / size + " рублей.");
    }

    public void printNames() {

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }

        }
    }


    public void salaryIndexing(int index) {
        ;
        for (Employee employee : employees) {
            if (employee != null) {

                employee.salaryIndexing(index);
            }
        }

    }

    public void minSalaryDepartment(int department) {

        Employee minSalaryEmployee = null;
        for (Employee firstEmployeeOfDepartment : employees) { //Ищем первого сотрудника отдела
            if (firstEmployeeOfDepartment != null && firstEmployeeOfDepartment.getDepartment() == department) {
                minSalaryEmployee = firstEmployeeOfDepartment;
                break;
            }
        }

        for (Employee employee : employees) {


            if (employee != null && employee.getDepartment() == department) {

                if (minSalaryEmployee.getSalary() > employee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }

        }
        System.out.println("Минимальная зарплата по отделу " + department + " - " + minSalaryEmployee.getSalary() + " рублей, у сотрудника - " + minSalaryEmployee.getName());
    }


    public void maxSalaryDepartment(int department) {
        Employee maxSalaryEmployee = null;
        for (Employee firstEmployeeOfDepartment : employees) {

            if (firstEmployeeOfDepartment != null && firstEmployeeOfDepartment.getDepartment() == department) {
                maxSalaryEmployee = firstEmployeeOfDepartment;
                break;
            }
        }

        for (Employee employee : employees) {

            if (employee != null && employee.getDepartment() == department) {

                if (maxSalaryEmployee.getSalary() < employee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }

        }
        System.out.println("Максимальная зарплата по отделу " + department + " - " + maxSalaryEmployee.getSalary() + " рублей, у сотрудника - " + maxSalaryEmployee.getName());
    }

    public void sumSalaryDepartment(int department) {
        int sum = 0;

        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты по отделу " + department + " - " + sum + " рублей.");
    }

    public void averageSumSalaryDepartment(int department) {
        int sum = 0;
        int sizeDepartment = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
                sizeDepartment++;
            }

        }
        System.out.println("Средняя сумма затрат на зарплаты по отделу " + department + " - " + sum / sizeDepartment + " рублей.");
    }

    public void salaryIndexingDepartment(int index, int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.salaryIndexing(index);
            }
        }

    }

    public void printEmployeeDepartment(int department) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println("Ф.И.О.: " + employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName() + " Id: " + employee.getId() + ". Зарплата: " + employee.getSalary() + " рублей.");
            }
        }
    }

    public void salaryLessThanNumber(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() <= number) {
                System.out.println("Id: " + employee.getId() + ". " + employee.fullName());
            }
        }


    }

    public void salaryMoreThanNumber(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println("Id: " + employee.getId() + ". " + employee.fullName());
            }
        }


    }

    public void deleteFullNameAndId(String lastName, String firstName, String middleName, int id) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getLastName() == lastName && employees[i].getFirstName() == firstName && employees[i].getMiddleName() == middleName && employees[i].getId() == id) {
                employees[i] = null;
                size--;
            }
        }
    }

    public void deleteFullName(String lastName, String firstName, String middleName) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getLastName() == lastName && employees[i].getFirstName() == firstName && employees[i].getMiddleName() == middleName) {
                employees[i] = null;
                size--;
                break;
            }


        }
    }

    public void deleteId(int id) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                size--;
            }
        }
    }

    public void changeSalaryAndDepartment(String lastName, String firstName, String muddleName, int department, double salary) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getLastName() == lastName && employees[i].getFirstName() == firstName && employees[i].getMiddleName() == muddleName) {
                employees[i].setDepartment(department);
                employees[i].setSalary(salary);
            }
        }

    }

    public void printEmployeesOfAllDepartment() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < employees.length; j++) {
                if (employees[j] != null && employees[j].getDepartment() == i) {
                    System.out.println(employees[j]);

                }
            }
        }
    }

}
