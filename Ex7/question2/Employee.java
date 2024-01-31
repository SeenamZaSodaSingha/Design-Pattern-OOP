import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    public List<Employee> subordinates = new ArrayList<Employee>();
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String dept) {
        this.position = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // uniform function can be used by both leaf and composite
    private void print(StringBuilder stringBuilder, int depth) {
        stringBuilder.append(String.join("", Collections.nCopies(depth, "\t")))
                .append(depth >= 0 ? "[ " : "")
                // .append((color == null || color.isEmpty()) ? "" : color + " ")
                .append("Name : " + getName() + ", Position : " + getPosition() + ", Salary : " + getSalary())
                .append(depth >= 0 ? " ]" : "")
                .append(System.lineSeparator());
        for (Employee sub : subordinates)
            sub.print(stringBuilder, depth + 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(sb, 0);
        return sb.toString();
    }
}