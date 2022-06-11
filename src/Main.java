public class Main {

    public static void findSecondMax() {
        int[] numbs = {45, 56, 32, 47, 86, 98, 35, 46, 75, 73, 56};
        int max = numbs[0];
        for (int i = 0; i < numbs.length; i++) {
            if (max < numbs[i]) {
                max = numbs[i];
            }
        }
        System.out.println(max);
        int max2 = numbs[0];
        for(int i = 0; i < numbs.length; i++) {
            if(max2 < numbs[i] && max > numbs[i]) {
                max2 = numbs[i];
            }
        }
        System.out.println(max2);
    }

    public static void main(String[] args) {
        findSecondMax();
    }
}