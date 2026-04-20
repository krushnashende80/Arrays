public class ArrayMinimumNum {
    public static void main(String[] args) {

        int[] arr = { 40, 39, 10, 330, 90 };    
        int temp = arr[0];        

        for (int i = 1; i < arr.length; i++) {    
            if (arr[i] < temp) {
                temp = arr[i]; // max
            }
            // System.out.println(temp);
        }
        System.out.println(temp);
    }
}
