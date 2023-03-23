package org.finalbubble.anonymous;


import java.util.ArrayList;
import java.util.Scanner;

/*
        需求 :
        1 创建用户(User)对象 , 对象数据采用键盘录入而来

        2 用户(User)包含的属性 :
            用户名   (username)
            手机号码 (phoneNumber)
            登录密码 (password)
            确认密码 (confirm)
            电子邮箱 (email)
            性别     (sex)
            出生日期 (birthday)

        3 如果登录密码和确认密码不一致 , 重新输入

        4 把用户(User)对象 ,添加到ArrayList集合中 , 打印集合对象即可
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //创建集合对象
        ArrayList<User> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+i+"个用户的用户名");
            String name = scanner.nextLine();
            System.out.println("请输入第"+i+"个用户的密码");
            String password = scanner.nextLine();
            System.out.println("请输入第"+i+"个用户的确认密码");
            String confirm = scanner.nextLine();
            if(!confirm.equals(password)){
                System.out.println("确认密码有误，请重新录入！");
                i--;
                continue;
            }
            list.add(new User(name,password,confirm));

        }
        System.out.println(list);

    }
}
