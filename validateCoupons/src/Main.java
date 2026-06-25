import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(validateCoupons(
                new String[] {"SAVE20","","PHARMA5","SAVE@20"},
                new String[] {"restaurant","grocery","pharmacy","restaurant"},
                new boolean[] {true,true,true,true}
        ));
        System.out.println(validateCoupons(
                new String[] {"GROCERY15","ELECTRONICS_50","DISCOUNT10"},
                new String[] {"grocery","electronics","invalid"},
                new boolean[] {false,true,true}
        ));
    }

    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> list = new ArrayList<>();
        List<String>[] arr = new List[] {new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};

        for (int i = 0; i < code.length; i++)
            if (isValid(code[i], businessLine[i], isActive[i]))
                arr[getIdx(businessLine[i])].add(code[i]);

        for (int i = 0; i < 4; i++)
            if (!arr[i].isEmpty()) {
                Collections.sort(arr[i]);
                list.addAll(arr[i]);
            }

        return list;
    }

    public static boolean isValid(String code, String businessLine, boolean isActive) {
        if (!isActive) return false;

        if (code.isEmpty()) return false;

        if (
                !businessLine.equals("electronics") &&
                !businessLine.equals("grocery") &&
                !businessLine.equals("pharmacy") &&
                !businessLine.equals("restaurant")
        ) return false;

        char[] chars = code.toCharArray();
        for (char c :chars)
            if ("!\"#$%&'()*+,-./:;<=>?@[\\]^`{|}~ ".indexOf(c) > -1) return false;

        return true;
    }

    public static int getIdx(String businessLine) {
        return switch (businessLine) {
            case "electronics" -> 0;
            case "grocery" -> 1;
            case "pharmacy" -> 2;
            default -> 3;
        };
    }
}