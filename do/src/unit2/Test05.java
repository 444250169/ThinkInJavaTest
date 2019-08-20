/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package unit2;

/**
 * @author Zen
 * @version 1.0: Test05.java, v 0.1 2019/08/20 17:16 Zen Exp $
 */
public class Test05 {
    /**
     * 5.修改前一个练习，将DataOnly中的数据在main方法中赋值并打印出来
     * @param args
     */
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 101;
        data.d = 1.02;
        data.b = false;
        System.out.println(data.i+"  " + data.d+"  "+data.b);
    }
}
