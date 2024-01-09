import java.util.Collection;
import java.util.Iterator;

public class RemoveColors {

    public static void removeColor(Collection<String> listOne, Collection<String> listTwo) {
        Iterator<String> iterator = listOne.iterator();
        while (iterator.hasNext()) {
            if (listTwo.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
