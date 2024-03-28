public class Main {
    public static void main(String[] args) {
        int x = 3; //1

        while(x>0) {  //2
            if (x > 2) { //3
                System.out.print("a");
            }

            x = x-1;   // 4
            System.out.print("-");

            if (x == 2){  // 5
                System.out.print("b c");
            }
            if (x == 1){ // 6
                System.out.print("d");
                x = x-1;
           }
        }
    }
}