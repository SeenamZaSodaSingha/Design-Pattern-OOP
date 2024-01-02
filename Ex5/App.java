public class App {
    public static void main(String[] args) {
        Student student1 = new Student.StudentBuilder("John", "MIT")
            .build();
        Student student2 = new Student.StudentBuilder("Me", "KMITL")
            .age(20)
            .build();
        System.out.println(student1);
        System.out.println(student2);
    }
}
