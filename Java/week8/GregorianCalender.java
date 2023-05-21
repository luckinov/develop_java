package week8;

import java.util.*;

class GregorianCalender {
    
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        long milliseconds = 1234567898765L;
        calendar.setTimeInMillis(milliseconds);
        int year = calendar.get(Calendar.YEAR); // 获取年份
        int month = calendar.get(Calendar.MONTH) + 1; // 获取月份（记得+1）
        int day = calendar.get(Calendar.DAY_OF_MONTH); // 获取日期
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 获取小时
        int minute = calendar.get(Calendar.MINUTE); // 获取分钟
        int second = calendar.get(Calendar.SECOND); // 获取秒钟
        
        System.out.printf("%d/%d/%d  %d:%d:%d", year, month, day, hour, minute, second);
        
        

    }
   

}