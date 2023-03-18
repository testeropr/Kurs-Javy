package lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student It = new ItStudent();
        sayHello("John", It);

        Student med = new Student() {
            @Override
            public void SayHello(String name) {
                System.out.println("I will be a doctor");
                System.out.println("My name is" + name);
            }
        };
        sayHello("Kate",med);

        //(parametr)-> System.out.println("I am not a student, My name is" + name);
        Student notStudent = (name) -> System.out.println("I am not a student, My name is" + name);
        sayHello("Tom", notStudent);



    }

    public static void sayHello (String name, Student student){
        student.SayHello(name);

    }
}
