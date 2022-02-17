package VariablesInMemory;
import VariablesInMemory.Cat;

public class Dog {
    private String name;
    private int age;
    private static String breed;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String getBreed() {
        return breed;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    void bark(int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Gav!");
        }
    }

    void run(int speed){
        System.out.println("Бегу за кошкой " +
                "со скоростью " + speed + " км/ч");
        bark(3);
    }

    void chaseACat(){
        Cat cat = new Cat();
        run(20);
    }
}
