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
     * 1.����һ���࣬������һ��int���һ��char�����Ƕ�û�б���ʼ���������ǵ�ֵ��ӡ����������֤Javaִ����Ĭ�ϳ�ʼ����
     * */

   /* public static void main(String[] args) {
        int i ;
        char j  ;
        *//*System.out.println("int���͵�Ĭ��ֵ��"+i+"char���͵�Ĭ��ֵ��"+j);*//*

    }*/

    /**
     * ��������ϵ�ʵ���У��������ڵ�idea�Ǵ��м����Ƶģ������Ҵ�����javac��java��Щ����������һ��
     * ���ִ��� 18�У�����GBK�Ĳ���ӳ���ַ� ����һ������ ����û�н��
     * ��ô �۴���ϵ㿴��Ĭ��ֵ�ͺ��� oho nerver used
     * �ǲ���jdk�汾�����أ�������д�Ĵ��벻���أ�
     */

    //�����Ҹ��ο��Ĵ��� ����������Ĳ��Ի������ѶȰ�
    int i;
    char c;
    public  int getInt(){
        return i;
    }
    public char getChar(){
        return c;
    }
    public static void main(String[] args) {
        System.out.println("IntĬ��ֵ:"+new Test01().getInt());
        System.out.println("charĬ��ֵ:"+new Test01().getChar());
    }

    /**
     * ���Խ����
     * "C:\Program Files\Java\jdk1.7.0_80\bin\java.exe" "-javaagent:D:\CoderSoftware\Java\IntelliJ IDEA 2018.2.1\lib\idea_rt.jar=50304:D:\CoderSoftware\Java\IntelliJ IDEA 2018.2.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.7.0_80\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\jce.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\jfxrt.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\resources.jar;C:\Program Files\Java\jdk1.7.0_80\jre\lib\rt.jar;E:\CodeFile\ThinkInJavaTest\out\production\do" unit2.Test01
     * IntĬ��ֵ:0
     * charĬ��ֵ:
     *
     * Process finished with exit code 0
     *

     */
}