class Employee {

    String name;
    int salary;
    String address;

    Employee() {
        this.name = "unknown";
        this.salary = 0;
        this.address = "unknown";
    }

    Employee(String name, int salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    Employee(String name, int salary, String address) {
        this(name, salary);
        this.address = address;
    }
}