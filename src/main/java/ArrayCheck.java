import java.util.Arrays;

public class ArrayCheck {

    public String arrayCheck(int[] arr) throws RuntimeException {

        int count = 0;
        String str = Arrays.toString (arr);
        if (str.indexOf (String.valueOf (4)) != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    count = i;
                }
            }
        } else {
            throw new RuntimeException ("Массив должен содержать четверки");
        }
        count = count + 1;
        int arrLength = arr.length - count;
        int[] arrCopy = new int[arrLength];
        System.arraycopy (arr, count, arrCopy, 0, arr.length - count);
        System.out.println (Arrays.toString (arrCopy));
        return Arrays.toString (arrCopy);
    }

    public boolean arrCheck1and4 (int[] arr){
        boolean checking1 = false;
        boolean checking4 = false;
        String str = Arrays.toString (arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1 ) checking1 = true;
            else if (arr[i] == 4 ) checking4 = true;
            else  return false;
        }
        return (checking1 && checking4);
    }
}
