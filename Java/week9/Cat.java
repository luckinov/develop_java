package week9;

public class Cat extends Animal{
    String color;

    Cat (String color,String name){
        super(name);
        this.color = color;//品种
    }

    public void makeSound() {
        System.out.println("the cat meow");
    }
    public static void main(String[] args) {
        Cat c = new Cat("black", "xxx");
        c.makeSound();
        Dog d = new Dog("dog", "xxx");
        d.makeSound();
    }
}
