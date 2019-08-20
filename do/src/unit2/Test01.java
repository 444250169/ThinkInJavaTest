/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package unit2;

/**
 * @author Zen
 * @version 1.0: Test01.java, v 0.1 2019/08/20 15:45 Zen Exp $
 */
public class Test01 {
    /*
     * 1.创建一个类，它包含一个int域和一个char域，他们都没有被初始化，将他们的值打印出来，以验证Java执行了默认初始化；
     * */

   /* public static void main(String[] args) {
        int i ;
        char j  ;
        *//*System.out.println("int类型的默认值是"+i+"char类型的默认值是"+j);*//*

    }*/

    /**
     * 解答：在以上的实验中，发现现在的idea是代有检测机制的，于是我打算用javac和java这些工具来测试一下
     * 发现错误 18行：编码GBK的不可映射字符 经过一番调试 还是没有解决
     * 那么 咱打个断点看看默认值就好了 oho nerver used
     * 是不是jdk版本不对呢？还是我写的代码不对呢？
     */

    //网上找个参考的代码 看来这里面的测试还是有难度啊
    int i;
    char c;
    public  int getInt(){
        return i;
    }
    public char getChar(){
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Int默认值:"+new Test01().getInt());
        System.out.println("char默认值:"+new Test01().getChar());
    }

    /**
     * 测试结果：
     * "C:\Program Files\Java\jdk1.7.0_80\bin\java.exe" "-javaagent:D:\CoderSoftware\Java\IntelliJ IDEA 2018.2.1\lib\idea_rt.jar=50304:D:\CoderSoftware\Java\IntelliJ IDEA 2018.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.7.0_80\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\jce.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\jfxrt.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\resources.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\rt.jar;E:\CodeFile\ThinkInJavaTest\out\production\do" unit2.Test01
     * Int默认值:0
     * char默认值:
     *
     * Process finished with exit code 0
     *

     */
}