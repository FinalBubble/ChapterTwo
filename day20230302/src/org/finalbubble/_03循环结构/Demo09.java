package day20230302.src.org.finalbubble._03循环结构;

public class Demo09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j +"\t");
            }
            System.out.println();
        }
    }
}
