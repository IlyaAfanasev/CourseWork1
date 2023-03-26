public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBooks = new EmployeeBook();

        employeeBooks.addEmployee("Афанасьев", "Илья", "Валерьевич", 1, 50_000);
        employeeBooks.addEmployee("Иванов", "Вячеслав", "Сергеевич", 1, 45_000);

        employeeBooks.addEmployee("Косяков", "Евгений", "Сергеевич", 2, 47_000);
        employeeBooks.addEmployee("Сидоров", "Артем", "Вячеславович", 2, 52_000);

        employeeBooks.addEmployee("Бабушкин", "Павел", "Ильич", 3, 49_000);
        employeeBooks.addEmployee("Суворов", "Игорь", "Александрович", 3, 50_000);

        employeeBooks.addEmployee("Шачиков", "Олег", "Борисович", 4, 53_000);
        employeeBooks.addEmployee("Иванов", "Евгений", "Михайлович", 4, 56_000);

        employeeBooks.addEmployee("Рочев", "Александр", "Владимирович", 5, 44_000);
        employeeBooks.addEmployee("Волков", "Илья", "Романович", 5, 48_000);

        System.out.println(employeeBooks);

        employeeBooks.sumSalary();
        System.out.println();

        employeeBooks.minSalary();
        System.out.println();

        employeeBooks.maxSalary();
        System.out.println();

        employeeBooks.averageSalary();
        System.out.println();

        System.out.println("Печатаем сотрудников по именам");
        employeeBooks.printNames();
        System.out.println();

        System.out.println("Индексация зарплат:");
        employeeBooks.salaryIndexing(10);
        System.out.println(employeeBooks);

        employeeBooks.minSalaryDepartment(1);
        employeeBooks.maxSalaryDepartment(1);
        System.out.println();


        employeeBooks.sumSalaryDepartment(2);
        System.out.println();

        employeeBooks.averageSumSalaryDepartment(2);
        System.out.println();

        employeeBooks.printEmployeeDepartment(1);
        System.out.println();

        System.out.println("Индексация зарплат по отделу:");
        employeeBooks.salaryIndexingDepartment(7, 1);
        employeeBooks.printEmployeeDepartment(1);

        System.out.println("Сотрудники отдела");
        employeeBooks.printEmployeeDepartment(2);
        System.out.println();

        System.out.println("Сотрудники с зарплатой меньше числа");
        employeeBooks.salaryLessThanNumber(55000);
        System.out.println();

        System.out.println("Сотрудники с зарплатой больше числа");
        employeeBooks.salaryMoreThanNumber(55000);
        System.out.println();

        employeeBooks.deleteFullNameAndId("Иванов", "Вячеслав", "Сергеевич", 2);
        employeeBooks.deleteFullName("Суворов", "Игорь", "Александрович");
        employeeBooks.deleteId(9);
        System.out.println("Удалили сотрудников.");
        System.out.println(employeeBooks);
        System.out.println(employeeBooks.getSize());

        System.out.println("Добавили сотрудника");
        employeeBooks.addEmployee("Булдаков", "Максим", "Олегович", 4, 63500);
        System.out.println(employeeBooks);

        System.out.println("У нового сотрудника изменили отдел и зарплату");
        employeeBooks.changeSalaryAndDepartment("Булдаков", "Максим", "Олегович", 3, 62000);
        System.out.println(employeeBooks);

        System.out.println("Печатаем сотрудников по отделам.");
        employeeBooks.printEmployeesOfAllDepartment();

    }
}