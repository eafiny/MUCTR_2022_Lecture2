package VariablesInMemory;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5);
        Dog dog2 = new Dog("Rex", 5);

        System.out.println(dog==dog2);

        dog.chaseACat();

//      ...
    }
}
