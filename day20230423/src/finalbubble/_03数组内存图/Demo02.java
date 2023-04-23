package finalbubble._03数组内存图;


/*
    单个数组指向自己的堆内存，无论如何修改数据，最后取值的时候，取得是修改后的最新值
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
