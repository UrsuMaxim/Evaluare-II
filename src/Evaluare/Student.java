package Evaluare;
import java.util.Objects;

public class Student {
    private String name;
    private float average;

    public Student(String name, float average) {
        this.name = name;
        this.average = average;
    }

    public float getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Evaluare.Student{" +
                "name='" + name + '\'' +
                ", average=" + average +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Float.compare(student.average, average) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, average);
    }

    public boolean equals(Student student) {
        return false;
    }
}

