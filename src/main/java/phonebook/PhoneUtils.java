package phonebook;

import java.util.Random;

public class PhoneUtils {
    public static boolean validate (String phoneNumber){
        if(phoneNumber.length() == 11 && phoneNumber.charAt(0) == '+')
            return true;
        else return false;
        }
    public static String generateNumber() {
        Random r = new Random();
        String S = "+";
        for (int i = 0; i < 10; i++)
            S += r.nextInt(10) + "";
        return S;
    }
}
