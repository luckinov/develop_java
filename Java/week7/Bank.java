package week7;

public class Bank {
    private String name;
    private int num;
    private double banlance;

     Bank() {
    }

    double getBanlance() {
        return banlance;
    }

    String getName() {
        return name;
    }

    int getNum() {
        return num;
    }

    void setBanlance(double banlance) {
        this.banlance = banlance;
    }

    void setName(String name) {
        this.name = name;
    }
    void setNum(int num) {
        this.num = num;
    }
}
