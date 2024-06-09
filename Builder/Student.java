public class Student {

    String name;
    String batch;
    int age;
    String gender;
    String universityName;
    double psp;
    int graduationYear;
    String email;
    int rollno;


    private Student(BuilderHelper builderHelper) {
        this.name = builderHelper.getName();
        this.batch = builderHelper.getBatch();
        this.age = builderHelper.getAge();
        this.gender = builderHelper.getGender();
        this.universityName = builderHelper.getUniversityName();
        this.psp = builderHelper.getPsp();
        this.graduationYear = builderHelper.getGraduationYear();
        this.email = builderHelper.getEmail();
        this.rollno = builderHelper.getRollno();
        if (age > 100) {
            throw new RuntimeException();
        }
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getUniversityName() {
        return universityName;
    }

    public double getPsp() {
        return psp;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String getEmail() {
        return email;
    }

    public int getRollno() {
        return rollno;
    }

    public static BuilderHelper getBuilder() {
        return new BuilderHelper();
    }

    public static class BuilderHelper {

        private String name;
        private String batch;
        private int age;
        private String gender;
        private String universityName;
        private double psp;
        private int graduationYear;
        private String email;
        private int rollno;


        public String getName() {
            return name;
        }

        public BuilderHelper setName(String name) {
            this.name = name;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public BuilderHelper setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getAge() {
            return age;
        }

        public BuilderHelper setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public BuilderHelper setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public BuilderHelper setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public BuilderHelper setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public int getGraduationYear() {
            return graduationYear;
        }

        public BuilderHelper setGraduationYear(int graduationYear) {
            this.graduationYear = graduationYear;
            return this;
        }

        public String getEmail() {
            return email;
        }

        public BuilderHelper setEmail(String email) {
            this.email = email;
            return this;
        }

        public int getRollno() {
            return rollno;
        }

        public BuilderHelper setRollno(int rollno) {
            this.rollno = rollno;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }


}
