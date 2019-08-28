public class InPocket {

    public static int inPocket(int income) {
        int incomeAfterInsurance= income-300;
        int tax;

        if (incomeAfterInsurance<1000) {
            tax = incomeAfterInsurance*9/100;
        }
        else tax= incomeAfterInsurance*21/100;
        return incomeAfterInsurance-tax;
    }

    public static void main(String[] args){
        System.out.println(inPocket(5000));
    }
}