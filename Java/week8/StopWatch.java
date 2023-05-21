package week8;

import java.util.GregorianCalendar;

public class StopWatch {
    private long startTime, endTime;
    GregorianCalendar calendar = new GregorianCalendar();

    public void setStartTime() {
        startTime = System.currentTimeMillis();

    }

    public long getStartTime() {
        return startTime;
    }

    public void setEndTime() {
        endTime = System.currentTimeMillis();
    }
    public long getEndTime() {
        return endTime;
    }
    
    public long getTimeDifference() {//别在定义里计算放到method里算
        return endTime - startTime;
    }
    
}
