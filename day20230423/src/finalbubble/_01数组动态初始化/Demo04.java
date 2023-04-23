package finalbubble._01数组动态初始化;


/*
    动态初始化数组的赋值:
        格式：
            数组名[索引] = 值;

 */

public class Demo04 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        // 数组名[索引] = 值;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        //使用for循环遍历数组 取值
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
