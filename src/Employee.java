import java.util.Objects;

public class Employee {

    private static int idGenerator = 1;

    private final int id;
    private final String fullname;
    private int department;
    private int salary;

    public Employee(String fullname, int department, int salary) {
        id = idGenerator++;
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", department=" + department +
                ", salary=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && salary == employee.salary && Objects.equals(fullname, employee.fullname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullname, department, salary);
    }
}


