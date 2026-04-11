public class SecondMaxSquare {

    public static void main(String[] args) {

        int arr[] = { 1, 0, 4, 0, 6, 8 };

        int temp = arr[0];
        int temp1 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp)
                temp = arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != temp)
                temp1 = arr[j];
        }
        int ans = temp1 * temp1;
        System.out.println(ans);
    }

}
