package weeek6;

import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) {
        // 创建一个Book对象
        Book myBook = new Book();

        // 设置书的标题
        myBook.title = "Java Programming";

        // 添加书的作者
        String[] authors = { "John Smith", "Mary Lee" };
        myBook.addAuthors(authors);

        // 获取书的标题和作者，并输出到控制台
        System.out.println("Book Title: " + myBook.getTitle());
        System.out.println("Book Authors: " + Arrays.toString(myBook.getAuthors()));
    }
}
