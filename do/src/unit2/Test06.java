/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package unit2;

/**
 * @author Zen
 * @version 1.0: Test06.java, v 0.1 2019/08/20 17:19 Zen Exp $
 */
public class Test06 {
    /**
     * 6.编写一个程序，让它含有本章所定义的storage（）方法的代码段，并调用之。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Test06().storage("Hello World"));

    }
    int storage(String s){
        return s.length() * 2;
    }
}