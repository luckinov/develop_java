package week9;

public class Dog extends Animal {
    String breed;

    Dog(String breed, String name) {
        super(name);
        this.breed = breed;// 品种
    }

    public void makeSound() {
        System.out.println("dog bark");
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5 };

        int temp = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < temp)
                temp = arr[i];
            i++;
        }
        System.out.println(temp);
    }
}
