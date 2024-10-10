public class Employee {
    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    String getDepartment() {
        return department;
    }
}
