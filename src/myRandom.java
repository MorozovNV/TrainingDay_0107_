public class myRandom {
    public static void main(String[] args) {

        int[] arrVal = {1,2,3};
        int[] arrWei = {1,3,10};
        RandomFromArray random = new RandomFromArray(arrVal, arrWei);

        int a=0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for ( int i=0; i<10; i++) {
            a = random.getRandom();
            if (a == 1) {
                count1++;
            } else if(a == 2) {
                count2++;
            } else count3++;
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("count1 = " + count1 +" count2 = " + count2 + " count3 = " + count3);

         count1 = 0;
         count2 = 0;
        count3 = 0;
        for ( int i=0; i<20; i++) {
            a = random.getRandom();
            if (a == 1) {
                count1++;
            } else if(a == 2) {
                count2++;
            } else count3++;
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("count1 = " + count1 +" count2 = " + count2 + " count3 = " + count3);

        count1 = 0;
        count2 = 0;
        count3 = 0;

        for ( int i=0; i<30; i++) {
            a = random.getRandom();
            if (a == 1) {
                count1++;
            } else if(a == 2) {
                count2++;
            } else count3++;
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("count1 = " + count1 +" count2 = " + count2 + " count3 = " + count3);
    }

}

class RandomFromArray {
    private int[] values; // �������� {1,2,3}
    private int[] weights; // ���� {1,3,10}
    private int[] ranges; // ����� ������� ��������
    private int sum; //����� ����� ���� ��������

    public RandomFromArray(int[] values, int[] weights){
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];

        //����� ���� ���� ��������
        sum=0;
        for (int weight : weights) {
            sum += weight;
        }

        // ��������� ranges ������ ���������
        int lastSum = 0; // ��� �����, ������ ��� ����� ������� ������������� ������
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
    }
    public int getRandom() {
        int random = (int) (Math.random() * (sum - 1)); // -1 ������ ��� �� ����

        int ourRangeIndex = 0;
        for (int i = 0; i < ranges.length; i++){
            if (ranges[i] > random){
                break;
            }
            ourRangeIndex = i;
        }
    return values[ourRangeIndex];

    }

}