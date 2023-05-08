import java.util.Scanner;
public class UseNext {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("enter a byte: ");
            byte byteValue = input.nextByte();
            System.out.println(byteValue);
        }
               
    }
}
