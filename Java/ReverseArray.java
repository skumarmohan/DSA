package Java;
import java.util.*;
public class ReverseArray{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        Collections.reverse(list);
        System.out.println(list);

        int[] arr = {10, 20, 30, 40, 50, 60};
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
/*
Input

6
10 20 30 40 50 60

Output

60 50 40 30 20 10

*/