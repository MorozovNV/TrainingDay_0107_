package Hexlet;

public class Hexlet7 { //prime number

    public static void main(String[] args) {
        double i = 2;
        int count;
        int countN=0;
        int j;

        while(i< 1000/*Double.MAX_VALUE*/){

            count=1;
            j=2;
            while (j<=i/2){
                if( i%j==0) {
                    count+=1;
                };
                j+=1;
            }

            if (count==1) {
                System.out.println(i+"  ¹"+(++countN));
            }

            i+=1;
        }
    }
}
