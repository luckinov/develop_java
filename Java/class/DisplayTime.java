public class DisplayTime {
    public static void main() {
        long totalMili = System.currentTimeMillis();
        long totalSec = totalMili / 1000;
        long currentSec = totalSec % 60;
        long totalMin = totalSec / 60;
        long currentMin = totalMin%60;
        long totalHour = totalMin/60;
        long cH = totalHour % 24;
        long GMTcH = cH + 8;
        System.out.println(GMTcH +":"+currentMin + ":" + currentSec);
        
    }
}
