package CodeWars;

public class StringReplace {//public class CountingDuplicates {
        public static int duplicateCount(String text) {
            // Write your code here
            int countN;
            int count=0;
            String s=text.toLowerCase();
            char a;
            while(s.length()>0){
                a = s.charAt(0);
                countN=0;
                for(int j=0;j<s.length();j++){
                    if(a==s.charAt(j)) countN++;
                }
                if(countN>1) count++;
                System.out.println(count);
                s = s.replaceAll(a+"","");
                System.out.println(s);

            }
            return count;

        }


    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }
}
