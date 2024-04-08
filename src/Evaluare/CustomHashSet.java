package Evaluare;
import java.util.HashSet;

public class CustomHashSet extends HashSet<Integer> {
    private int totalElementsAdded = 0;

    @Override
    public boolean add(Integer element) {
        boolean added = super.add(element);
        if (added) {
            totalElementsAdded++;
        }
        return added;
    }

    @Override
    public boolean addAll(java.util.Collection<? extends Integer> collection) {
        boolean added = super.addAll(collection);
        if (added) {
            totalElementsAdded += collection.size();
        }
        return added;
    }

    public int getTotalElementsAdded() {
        return totalElementsAdded;
    }
}
