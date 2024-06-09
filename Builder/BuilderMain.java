public class BuilderMain {

    public static void main(String[] args) {

        Student student = Student.getBuilder().setName("Guna").setAge(10).setGender("Female").build();

        System.out.println(student.getAge());
    }



}
