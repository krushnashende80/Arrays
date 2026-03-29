public class Merge2Arrays {
    public static void main(String[] args) {
   
        int[] fst = { 1, 2, 3, 4, 5 };         
        int[] sec = { 6, 7, 8, 9, 10 };
        int[] third = new int[fst.length + sec.length];    

        for (int i = 0; i < fst.length; i++) {  
            third[i] = fst[i];
        }
        int n = 0;
        int k = third.length / 2;
        int n1 = sec.length;
        while (n < n1) {
            third[k] = sec[n];
            n++;
            k++;
        }

        for (int print : third) {
            System.out.print(print + " ");
        }
    }
}
