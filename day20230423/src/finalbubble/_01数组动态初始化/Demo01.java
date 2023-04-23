package finalbubble._01数组动态初始化;


/*
    动态初始化格式：
        数据类型 [] 数组名 = new 数据类型[长度]; //必须是>=0正整数
        int [] arr = new int[3]; //定义一个能够存储 int类型相匹配的数据长度为3的数组
 */
public class Demo01 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        System.out.println(arr); //[I@7ef20235
        /*
            [I@7ef20235
            [: 这个地址是数组的
            I：int类型
            @：分隔符
            7ef20235：数组在内存中16进制地址
         */
    }
}
