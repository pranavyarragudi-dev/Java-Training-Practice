
public class array_max_min {
    public static void main(String[] args) {

        int[] numbers = {45,12,78,34,9,56};

        int max=numbers[0];
        int min=numbers[0];

        for(int i=1; i<numbers.length; i++) {

            if(numbers[i]>max) {
                max=numbers[i];
            }

            if(numbers[i]<min) {
                min=numbers[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
