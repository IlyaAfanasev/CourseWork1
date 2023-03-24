public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBooks = new EmployeeBook();

        employeeBooks.addEmployee("Афанасьев", "Илья", "Валерьевич", 1, 50_000);
        employeeBooks.addEmployee("Иванов", "Вячеслав", "Сергеевич", 1, 45_000);

        employeeBooks.addEmployee("Косяков", "Евгений", "Сергеевич", 2, 47_000);
        employeeBooks.addEmployee("Сидоров", "Артем", "Вячеславович", 2, 52_000);

        employeeBooks.addEmployee("Бабушкин", "Павел", "Ильич", 3, 49_000);
        employeeBooks.addEmployee("Суворов", "Игорь", "Александрович",3, 50_000);

        employeeBooks.addEmployee("Шачиков", "Олег", "Борисович",4, 53_000);
        employeeBooks.addEmployee("Иванов", "Евгений", "Михайлович",4, 56_000);

        employeeBooks.addEmployee("Рочев", "Александр", "Владимирович",5, 44_000);
        employeeBooks.addEmployee("Волков", "Илья", "Романович",5, 48_000);

        System.out.println(employeeBooks);

        employeeBooks.sumSalary();
        System.out.println();

        employeeBooks.minSalary();
        System.out.println();

        employeeBooks.maxSalary();
        System.out.println();

        employeeBooks.averageSalary();
        System.out.println();

        employeeBooks.printEmployeesNames();

        employeeBooks.salaryIndexing(10);
        System.out.println(employeeBooks);

        employeeBooks.minSalaryDepartment(1);
        employeeBooks.maxSalaryDepartment(1);

    }
}