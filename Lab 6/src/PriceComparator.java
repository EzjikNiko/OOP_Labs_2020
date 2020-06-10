import java.util.Comparator;

public class PriceComparator implements Comparator<Object> {

    public int compare(Object object1, Object object2) {
        if (object1 instanceof Stone) {
            return Double.compare(((Stone)object1).getPrice(), ((Stone)object2).getPrice());
        }
        return -2;
    }
}