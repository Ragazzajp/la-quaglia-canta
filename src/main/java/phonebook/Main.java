package phonebook;

public class Main {
    public static void main(String[] args){
        System.out.println(PhoneUtils.validate("+1515567780"));
        System.out.println(PhoneUtils.validate(PhoneUtils.generateNumber()));
        System.out.println(PhoneUtils.validate("65489723459"));
        System.out.println(PhoneUtils.generateNumber());
        System.out.println(PhoneUtils.generateNumber().length());
    }
}
