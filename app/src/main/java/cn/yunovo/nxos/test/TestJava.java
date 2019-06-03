package cn.yunovo.nxos.test;

import java.util.Calendar;

public class TestJava {

    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int mounth = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("year = "+year + ", mounth = "+mounth+" , day = "+day);
    }
}
