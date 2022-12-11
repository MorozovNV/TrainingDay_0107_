import java.util.Scanner;

public class myArray {
    static final int n=10;
    static double[] arr = new double[n];

    public static void inicialArray(){
        for(int i = 0; i < n; i++){
            arr[i] = (int) (Math.random()*10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void outputArray(double[] array, int n){
        for (int i = 0; i < n; i++) {
            System.out.print((int) array[i] + " ");
        }
    }

    public static void arrayMinMaxAvg(){ //array return min max avg

        double max = arr[0];
        double min = arr[0];
        double avg = 0;

        for(int i = 0; i < n; i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
            avg+=arr[i]/n;
        }

        System.out.println("max: " + max + "  min: " + min + "  avg: " + avg);

    }

    public static void arrayBubbleSort(){
        double temp;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i-1; j++){
                if( arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    outputArray(arr,n);
                    System.out.println();
                }
            }
        }
        outputArray(arr,n);
    }

    public static void removeElementttt(double[] nums, double val) {
        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        outputArray(nums, n-offset);
    }

    public static void removeElement(double[] arr, double val){
        int offset = 0;

        for (int i = 0; i < n; i++){
            if (arr[i] == val) {
                offset++;
            } else {
                arr[i-offset]=arr[i];
            }
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean f = true;
        inicialArray();

        while(f) {
            String g = scanner.nextLine();

            switch (g) {
                case "0":
                    inicialArray();
                    break;
                case "1":
                    arrayMinMaxAvg();
                    break;
                case "2":
                    System.out.println("jopa");
                    break;
                case "3":
                    arrayBubbleSort();
                    break;
                case "4":
                    double val = scanner.nextDouble();
                    double[] arr1 = {1,2,3,4,1,2,3,4,1,2};
                    removeElementttt(arr1, val);
                    break;
                case "esc":
                    f = false;
            }

        }
    }
}
