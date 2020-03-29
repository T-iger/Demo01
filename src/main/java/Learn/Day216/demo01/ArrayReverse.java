package Learn.Day216.demo01;


//数组对应位置倒置

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array ={1,3,5,6,7,89,9,2,1,3};
        int temp;
        for (int left = 0 ,right=array.length-1; left < right; left++,right--) {
            temp=array[left];
            array[left]=array[right];
            array[right]=temp;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+"==");
        }
    }
}
