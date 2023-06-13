package co.develhope.introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {

    public static void main(String... arg){

        var cityNames = Arrays.asList("Mombasa", "Nairobi", "Malindi");
        //cityNames.add("Kisumu");//immutable list
        cityNames.set(1, "Tagucigalpa");
        System.out.println(cityNames);

        var kingsOfRom = new ArrayList<String>(List.of("king1", "king2", "king3", "king4", "king5", "king6", "king7"));
        System.out.println(kingsOfRom);

        var kingsOfRomArray = kingsOfRom.toArray();
        System.out.println(kingsOfRomArray[0]);
        kingsOfRomArray[6] = "Lucius Tarquinius Supercar";

        System.out.println(Arrays.toString(kingsOfRomArray));

    }
}
