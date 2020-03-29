package Learn.Day216.demo01;

public class DemoDay01 {
    public static void main(String[] args) {

        int[] array=new int[4];
        for (int i = 0; i <array.length ; i++) {
            array[i]=i;
        }
        int max=0;
        for (int j = 0; j <array.length ; j++) {
            if(array[j]>max) {
                max = array[j];
            }
        }
        System.out.println(max);
    }

}
