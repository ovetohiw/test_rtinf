import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 1, 5, 4};

        System.out.println(associativeArray(arr));
    }

    private static HashMap<Integer, Integer> associativeArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return map;
    }
}
