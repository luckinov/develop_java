public class Puppy {
    int puppyAge;
    public Puppy(String name){//这个是构造方法，必须和类名一样
        System.out.println("the dog name is "+name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为 : " + puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        new Puppy("tommmy");
    }
    
}
