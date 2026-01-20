public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Max and Min\n");
        int[] numArr = ArrayUtility.inputArray();
        int Min = min(numArr);
        int Max = max(numArr);
        System.out.println("Max of the array is " + Max);
        System.out.println("Min of the array is " + Min);

    }


    public static int min(int[]numArr){
        int min = Integer.MAX_VALUE;
        int i = 0;  
        while(i<numArr.length){
            if(min>numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;
    }


    public static int max(int[]numArr){
        if(numArr.length==0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        while(i<numArr.length){
            if(max<numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
}
