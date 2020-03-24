import java.time.LocalTime;

public class Running {
    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }


    public static void main(String[] args) {
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        LocalTime start = LocalTime.now();
        a = selectionSort(a);
        LocalTime end = LocalTime.now();
        System.out.println("thoi gian thuc hien la: "+stopWatch.getElapsedTime(start,end));



}
}
