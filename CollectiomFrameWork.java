import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectiomFrameWork {
    public static void main(String[] args) {
        String[] S = { "Banana", "Apple", "PineApple", "Orange" };
        List<String> Vegetables = new ArrayList<>();
        List<String> fruit = new LinkedList<>();
        Vegetables.add("Tomato");
        Vegetables.add("Potato");
        Vegetables.add("Pumkin");
        fruit.addAll(Vegetables);
        System.out.println(fruit);

    }
}
