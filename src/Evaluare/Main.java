package Evaluare;
import java.util.*;

public class Main {
    public static void main(String[] args) {
            Set<String> stringSet = new HashSet<>();




        Gradebook gradebook = new Gradebook(Comparator.reverseOrder());
        gradebook.add(new Student("John", 8.5f));
        gradebook.add(new Student("Alice", 9.2f));
        gradebook.add(new Student("Bob", 7.8f));
        gradebook.add(new Student("Eva", 8.5f));
        gradebook.add(new Student("Daniel", 7.8f));

        // Afisăm studenții ordonați după medie
        for (Map.Entry<Float, List<Student>> entry : gradebook.entrySet()) {
            float average = entry.getKey();
            List<Student> students = entry.getValue();
            System.out.println("Medie: " + average);
            for (Student student : students) {
                System.out.println("\t" + student);
            }
        }


        CustomHashSet customHashSet = new CustomHashSet();
        customHashSet.add(5);
        customHashSet.add(10);
        customHashSet.addAll(Set.of(15, 20, 25));

        System.out.println("Total elements added to CustomHashSet: " + customHashSet.getTotalElementsAdded());
    }
}
