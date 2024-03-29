package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",40.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.2);
        makeup.put("Blush",12.2);
        //to get all the keys  we can use KeySet Method  from Map Interface

        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);
        for(String s:allKeys){
            System.out.println(s);
        }
        //delete all the entries from the map for which the size of key is greater than 7

        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);
    }
}
