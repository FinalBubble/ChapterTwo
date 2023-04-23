package finalbubble._01数组动态初始化;

/*
    动态初始化数组取值:
        格式：数组数据类型 变量名 = 数组名[索引];
    索引：
        索引就是数中每个初始化空间的编号，索引从0开始 到数组长度减一 ，索引是连续的，每次递增一
    动态初始化数组有默认：
        byte short int long 类型的数组有默认值 0
        float double 类型的数组有默认值 0.0
        char 类型的数组有默认值 '\u0000'
        boolean 类型的数组有默认值 false
    引用数据类型数据有默认值:
        null
 */

public class Demo02 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        System.out.println(arr); //[I@119d7047
        //数组索引 就是 0 1 2
        //格式：数组数据类型 变量名 = 数组名[索引];
        int a = arr[0];
        System.out.println(a);
        int b = arr[1];
        System.out.println(b);
        int c = arr[2];
        System.out.println(c);
        System.out.println("--------");

        byte[] brr = new byte[3];
        System.out.println(brr[0]);
        System.out.println(brr[1]);
        System.out.println(brr[2]);
        System.out.println("--------");

        short[] crr = new short[3];
        System.out.println(crr[0]);
        System.out.println(crr[1]);
        System.out.println(crr[2]);
        System.out.println("--------");

        long[] drr = new long[3];
        System.out.println(drr[0]);
        System.out.println(drr[1]);
        System.out.println(drr[2]);
        System.out.println("--------");

        float[] err = new float[3];
        System.out.println(err[0]);
        System.out.println(err[1]);
        System.out.println(err[2]);
        System.out.println("--------");

        double[] frr = new double[3];
        System.out.println(frr[0]);
        System.out.println(frr[1]);
        System.out.println(frr[2]);
        System.out.println("--------");

        char[] grr = new char[3];
        System.out.println(grr[0]);
        System.out.println(grr[1]);
        System.out.println(grr[2]);
        System.out.println("--------");

        boolean[] hrr = new boolean[3];
        System.out.println(hrr[0]);
        System.out.println(hrr[1]);
        System.out.println(hrr[2]);
        System.out.println("--------");

        String[] srr = new String[3];
        System.out.println(srr[0]);
        System.out.println(srr[1]);
        System.out.println(srr[2]);
    }
}
