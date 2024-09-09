public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i != 0;) {
            if (i % 2 ==0){
                i = i/2;
                count++;
            } else if (i % 2 == 1) {
                i --;
                count++;
            }
        }
        System.out.println(count);
    }
}
