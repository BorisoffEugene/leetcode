import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[] {"Shogun","Tapioca Express","Burger King","KFC"}, new String[] {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"})));
        System.out.println(Arrays.toString(findRestaurant(new String[] {"Shogun","Tapioca Express","Burger King","KFC"}, new String[] {"KFC","Shogun","Burger King"})));
        System.out.println(Arrays.toString(findRestaurant(new String[] {"happy","sad","good"}, new String[] {"sad","happy","good"})));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        int sum;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], Integer.MAX_VALUE - i);

        for (int i = 0; i < list2.length; i++)
            if (map.containsKey(list2[i])) {
                sum = Integer.MAX_VALUE - map.get(list2[i]) + i;
                map.put(list2[i], sum);
                min = Math.min(min, sum);
            }

        List<String> res = new ArrayList<>();
        for (Map.Entry elm : map.entrySet())
            if (elm.getValue().equals(min))
                res.add((String)elm.getKey());

        return res.toArray(new String[0]);
    }
}