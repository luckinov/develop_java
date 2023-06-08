package week10;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.RunElement;

public class MyStack {
    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "stack :" + list.toString();
    }
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);//而当System,out.println()里面为一个对象的引用时，此时会自动调用toString方法讲对象打印出来。
                              //即：System,out.println(obj)与System,out.println(obj.toString)其实是一样的。

    }
}
