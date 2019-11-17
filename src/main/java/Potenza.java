public class Potenza{

    public static void squares(int x, int y){
        for (int i=x; i<=y; i++) {
            int s=i*i;

            System.out.println("> " + i +" - " +s);
        }
    }

    public static void main(String[] args){
squares(11,16);
    }
}