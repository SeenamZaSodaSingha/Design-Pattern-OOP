class Student {
    private String name;
    private int age;
    private String university;

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.university = builder.university;
    }

    public static class StudentBuilder {
        private String name;
        private int age = -1;
        private String university;

        public StudentBuilder(String name, String university) {
            this.name = name;
            this.university = university;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder university(String university) {
            this.university = university;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: " + name + "\n");
        if (age != -1) {
            sb.append("Age: " + age + "\n");
        }
        if (this.university != null) {
            sb.append("University: " + university + "\n");
        }
        sb.append("-------------------------------\n");
        return sb.toString();
    }

}