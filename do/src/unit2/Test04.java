/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package unit2;

/**
 * @author Zen
 * @version 1.0: Test04.java, v 0.1 2019/08/20 17:09 Zen Exp $
 */
public class Test04 {
    /**
     * 4.将DataOnly代码段改写成一个程序，然后编译运行。
     */
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        data.i = 1;
        data.d = 1.02;
        data.b = false;
    }
}
class DataOnly{
    int i ;
    double d ;
    boolean b ;
}