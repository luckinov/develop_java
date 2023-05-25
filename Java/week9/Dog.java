package week9;

public class Dog extends Animal {
    String breed;

    Dog (String breed,String name){
        super(name);
        this.breed = breed;//品种
    }
    public void makeSound() {
        System.out.println("dog bark");
    }
    public static void main(String[] args) {
        Dog d = new Dog("dog","xxx");
        d.makeSound();
    }
}
