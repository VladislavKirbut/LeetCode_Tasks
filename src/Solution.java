// Ќайти максимальную последовательность единиц

public class Solution {
    public static void main(String[] args) {
        int [] array = new int[] {1,1,1,1,0,0,0,2,3,4,5,1,1,1,1,1,1,1,1};

        int maxLength = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != 1) {
                if(maxLength < count) {
                    maxLength = count;
                }
                count = 0;
            } else {
                count++;
            }
        }

        if(maxLength < count) {
            maxLength = count;
        }

        System.out.println(maxLength);
    }
}
