/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package unit2;

/**
 * @author Zen
 * @version 1.0: Test02.java, v 0.1 2019/08/20 16:17 Zen Exp $
 */
public class Test02 {
    /**
     *2.参照本章的HelloDate.java这个例子，创建一个“Hello World”程序，该程序只要输出这句话即可
     * 你所编写的类只需要一个main方法,记住一定要是static的形式
     * 用javac编译 再用java进行运行
     * 目的：了解如何再jdk的环境下运行
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    /**
     * 状况：第一题的时候出现的错误：编码GBK的不可映射字符又一次出现，而这次我们要试着去解决这个问题了。
     * idea 编译时，报“编码GBK的不可映射字符”
     * 1) 修改系统编码格式：file--setting--file encoding :全部修改为GBK、path下面添加自己的项目
     * 2) 单个文件修改编码格式：点击右下角（显示编码格式，如果没有，就随意右键，选择“file encoding）；
     * 然后出现弹出框，有两个按钮“reload”，“convert”；
     * Reload 表示使用新编码重新加载，新编码不会保存到文件中；
     * Convert 表示使用新编码进行转换，新编码会保存到文件中；
     * 含有中文的代码文件，Convert之后可能会使中文变成乱码，所以在转换成请做好备份，不然可能出现转换过程变成乱码，无法还原。
     *  ————————————————
     * 版权声明：本文为CSDN博主「生活因我绚丽」的原创文章，遵循CC 4.0 by-sa版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/heart_mine/article/details/79411534
     */

    /**
     * E:\CodeFile\ThinkInJavaTest\do\src\unit2>java Test02
     * 错误: 找不到或无法加载主类 Test02
     *
     * 这里通过搜索，发现是需要在src下按照unit.Test02这种方式进行执行的。
     * E:\CodeFile\ThinkInJavaTest\do\src>java unit2.Test02
     * Hello World
     *
     * E:\CodeFile\ThinkInJavaTest\do\src>
     *
     */
}