import java.util.ArrayList;
import java.util.List;

public class CollectionTestMain {
    public static void main(String[] args) {
        String[] colorOne = {"red", "blue", "green", "yellow", "dark", "orange"};
        List<String> listOne = new ArrayList<>();
        for (String color : colorOne)
            listOne.add(color);

        System.out.println("color one ");
        for (int countOne = 0; countOne < listOne.size(); countOne++) {
            System.out.printf("%s ", listOne.get(countOne));
        }
        String[] colorTwo = {"red", "blue", "green"};
        List<String> listTwo = new ArrayList<>();
        for (String color : colorTwo)
            listTwo.add(color);


        System.out.printf("%n%ncolor two%n ");
        for (int countTwo = 0; countTwo < listTwo.size(); countTwo++) {
            System.out.printf("%s ", listTwo.get(countTwo));
        }
        RemoveColors.removeColor(listOne, listTwo);

        System.out.printf("%n%nlist one after calling remove color:%n");
        for (String afterRemove : listOne){
            System.out.printf("%s ",afterRemove);
        }
    }
}
