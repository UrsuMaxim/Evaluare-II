package Evaluare;
import java.util.*;

public class Gradebook extends TreeMap<Float, List<Student>> {
    private Comparator<Float> comparator;

    public Gradebook(Comparator<Float> comparator) {
        super(Collections.reverseOrder(comparator));
        this.comparator = comparator;
    }

    public void add(Student student) {
        float roundedAverage = Math.round(student.getAverage());
        if (!containsKey(roundedAverage)) {
            put(roundedAverage, new ArrayList<>());
        }
        get(roundedAverage).add(student);
    }
}
