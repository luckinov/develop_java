import java.util.*;

public class CalendarPrinter {

    public static void main(String[] args) {

        // 创建 Scanner 对象以从用户处获取输入
        Scanner scanner = new Scanner(System.in);

        // 获取输入的年份和月份
        System.out.print("请输入年份：");
        int year = scanner.nextInt();
        System.out.print("请输入月份：");
        int month = scanner.nextInt();

        // 获取该月的第一天的日期对象
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        // 打印日历表头
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        // 获取该月的天数
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // 获取该月第一天是星期几
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // 打印该月第一天前面的空格
        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("\t");
        }

        // 循环打印该月的日期
        for (int i = 1; i <= daysInMonth; i++) {
            System.out.print(i + "\t");

            // 如果是该周的最后一天，换行
            if ((firstDayOfWeek + i - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
