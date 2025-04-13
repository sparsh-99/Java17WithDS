package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ConstructorRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice");

        List<Student> students = new ArrayList<>();

//        for(String name : names) {
//            students.add(new Student(name));
//        }

//        students = names.stream().map(name -> new Student(name)).toList();

        students = names.stream().map(Student::new).toList();

        System.out.println(students);
    }

}
