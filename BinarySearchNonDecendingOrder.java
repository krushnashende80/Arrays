class BinarySearchNonDecendingOrder {
    public static void main(String[] args) {

        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 2;
        int end = arr.length - 1;
        int start = 0;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

    }
}
