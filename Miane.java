public class Miane {
    public static void main(String[] args) {
        int arr[] = {12,43,23,98,13,45,67,90};
        int temp;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i:arr)
            System.out.println(i);

        System.out.println("Miane is:" + arr[8/2]);

    }
}
