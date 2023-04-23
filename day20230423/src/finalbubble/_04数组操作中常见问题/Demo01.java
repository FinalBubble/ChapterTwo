package finalbubble._04数组操作中常见问题;

public class Demo01 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        //访问了不存在索引 ArrayIndexOutOfBoundsException
        //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
//        arr[5] = 20;
        arr = null;
//        arr[0] = 10; //NullPointerException

    }
}
