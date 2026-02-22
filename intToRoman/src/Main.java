public class Main {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        int ten = 1;
        int val;
        StringBuilder sb = new StringBuilder();
        
        while (num > 0) {
            val = (num % 10) * ten;
            sb.append(valToRoman(val));
            ten *= 10;
            num /= 10;
        }

        sb.reverse();
        return sb.toString();
    }
    
    public static String valToRoman(int val) {
        return switch (val) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "VI";
            case 5 -> "V";
            case 6 -> "IV";
            case 7 -> "IIV";
            case 8 -> "IIIV";
            case 9 -> "XI";
            case 10 -> "X";
            case 20 -> "XX";
            case 30 -> "XXX";
            case 40 -> "LX";
            case 50 -> "L";
            case 60 -> "XL";
            case 70 -> "XXL";
            case 80 -> "XXXL";
            case 90 -> "CX";
            case 100 -> "C";
            case 200 -> "CC";
            case 300 -> "CCC";
            case 400 -> "DC";
            case 500 -> "D";
            case 600 -> "CD";
            case 700 -> "CCD";
            case 800 -> "CCCD";
            case 900 -> "MC";
            case 1000 -> "M";
            case 2000 -> "MM";
            case 3000 -> "MMM";
            default -> "";
        };
    }
}