package Users;

public sealed class Employee permits Manager, Librian {
    private String name;
    private int age;
    private float salary;
}
