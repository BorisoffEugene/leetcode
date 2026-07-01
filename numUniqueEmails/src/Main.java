import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
        System.out.println(numUniqueEmails(new String[] {"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
    }

    public static int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();

        for (String email : emails)
            set.add(normEmail(email));

        return set.size();
    }

    public static String normEmail(String email) {
        int p1 = email.indexOf('@');
        int p2 = email.indexOf('+');
        if (p2 > p1 || p2 == -1) p2 = p1;

        String s = email.substring(0, p2);
        s = s.replace(".", "");
        return s + email.substring(p1);
    }
}