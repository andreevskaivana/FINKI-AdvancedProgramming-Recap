package AV1andAV2;

public class StringPrefix {
    //iv e prefiks na stringot ivana

    public static boolean isPrefix(String string1, String string2) {
        if (string1.length() > string2.length())
            return false;
        for (int i = 0; i < string1.length(); i++)
            if (string1.charAt(i) != string2.charAt(i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        boolean rez=isPrefix("iv","ivana");
        boolean rez2=isPrefix("test","apple");
        System.out.println(rez);
        System.out.println(rez2);
    }
}
