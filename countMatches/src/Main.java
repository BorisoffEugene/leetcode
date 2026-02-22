import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };

        int res = 0;

        for(List<String>item : items) {
            if (item.get(idx).equals(ruleValue)) res++;
        }

        return res;
    }
}