public class Main {
    public static void main(String[] args) {

        int[] arr = {1,4,1,1};
        int[] arr1 = {1,4,1,5,5,6,4,4,6,6,6};
        ArrayCheck arrayCheck = new ArrayCheck ();
        arrayCheck.arrayCheck (arr);
        arrayCheck.arrayCheck (arr1);
        System.out.println (arrayCheck.arrCheck1and4 (arr));
        System.out.println (arrayCheck.arrCheck1and4 (arr1));
    }
}
