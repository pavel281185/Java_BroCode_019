import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> food = new ArrayList<>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(1, "sushi");
        food.remove(2);
        food.clear();

        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}