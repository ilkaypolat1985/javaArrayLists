import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("Kocaeli");
        cities.add("Manisa");
        cities.add("Afyon");

        cities.remove(2);

        cities.set(1, "Sakarya");

        for(String city : cities){
            System.out.println(city);
        }

        Collections.sort(cities);
        System.out.println(cities.toString());
    }
}
