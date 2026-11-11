
public class arrays {
    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};

        int total = 0;

        for(int i=0; i<marks.length; i++) {
            System.out.println("Marks: " + marks[i]);
            total = total + marks[i];
        }

        double average = (double)total / marks.length;

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
