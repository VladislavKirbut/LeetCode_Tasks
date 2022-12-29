public class FindCountOfEvenNumbers {
    public static void main(String[] args) {
        int [] mass = new int[] {234,54,23,23,4586,23456};

        boolean isEven = true;
        int count = 0;
        for(int item: mass) {
            isEven = true;
            while(item > 0) {
                isEven = !isEven;
                item = item / 10;
            }

            if(isEven) {
                count++;
            }
        }

        System.out.println("Count with even numbers: " + count);
    }
}