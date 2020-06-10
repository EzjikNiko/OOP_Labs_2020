
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Arrays;

public class MySet extends HashSet<CanBePutIntoNecklace> {

    private static int INITIAL_CAPACITY = 15;
    private CanBePutIntoNecklace[] arrayElements = new CanBePutIntoNecklace[INITIAL_CAPACITY];
    private int size = 0;

    public MySet() {
    }

    public MySet(CanBePutIntoNecklace necklaceMember) {
        arrayElements[size] = necklaceMember;
        size += 1;
    }

    public MySet(Collection<CanBePutIntoNecklace> necklaceElementsCollection) {
        for (CanBePutIntoNecklace necklaceMember : necklaceElementsCollection) {
            arrayElements[size] = necklaceMember;
            size += 1;
        }
    }

    public boolean add(CanBePutIntoNecklace necklaceMember) {
        if (size > 15) {
            arrayElements = Arrays.copyOf(arrayElements, INITIAL_CAPACITY + (int) (INITIAL_CAPACITY * 0.3));
        }
        arrayElements[size] = necklaceMember;
        size += 1;
        return true;
    }

    public boolean addAll(Collection<? extends CanBePutIntoNecklace> necklaceElementsCollection) {
        arrayElements = new CanBePutIntoNecklace[INITIAL_CAPACITY];
        size = 0;
        if (necklaceElementsCollection.size() > 15) {
            arrayElements = Arrays.copyOf(arrayElements, INITIAL_CAPACITY + (int) (INITIAL_CAPACITY * 0.3));
        }
        for (CanBePutIntoNecklace necklaceMember : necklaceElementsCollection) {
            arrayElements[size] = necklaceMember;
            size += 1;
        }
        return true;
    }

    public boolean addAll(int firstIndex, Collection<? extends CanBePutIntoNecklace> necklaceElementsCollection) {
        size = firstIndex;
        if (necklaceElementsCollection.size() > 15) {
            arrayElements = Arrays.copyOf(arrayElements, INITIAL_CAPACITY + (int) (INITIAL_CAPACITY * 0.3));
        }
        for (CanBePutIntoNecklace necklaceMember : necklaceElementsCollection) {
            arrayElements[size] = necklaceMember;
            size += 1;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        Iterator<CanBePutIntoNecklace> iterator = iterator();
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    public Iterator<CanBePutIntoNecklace> iterator() {
        return new Iterator<CanBePutIntoNecklace>() {
            private int index = 0;
            public boolean hasNext() {
                return index < size;
            }

            public CanBePutIntoNecklace next() {
                return arrayElements[index++];
            }
        };
    }

    public Object[] toArray() {
        return Arrays.copyOf(arrayElements, size);
    }

    public <T> T[] toArray(T[] a) {
        return null;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    public void clear() {

    }

    public CanBePutIntoNecklace get(int i) {
        return null;
    }

    public CanBePutIntoNecklace set(int i, CanBePutIntoNecklace necklace) {
        return null;
    }

    public void add(int i, CanBePutIntoNecklace necklace) {

    }

    public CanBePutIntoNecklace remove(int i) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator<CanBePutIntoNecklace> listIterator() {
        return null;
    }

    public ListIterator<CanBePutIntoNecklace> listIterator(int i) {
        return null;
    }

    public HashSet<CanBePutIntoNecklace> subList(int i, int i1) {
        return null;
    }
}