package VariablesInMemory;

public class PrimitiveVSReferenceArgs {
    public static void main(String[] args) {
//        primitiveArgs();
        referenceArgs();
    }

    private static void referenceArgs() {
        Dog myDog = new Dog("Rex");
        System.out.println(renameDog(myDog).getName());
        System.out.println(myDog.getName());
    }

    private static Dog renameDog(Dog dog) {
        dog.setName("Druzhok");
        return dog;
    }

//    private static void primitiveArgs() {
//        int x = 10;
//        System.out.println(doubleX(x));
//        System.out.println(x);
//    }
//
//    private static int doubleX(int x) {
//        x *= 2;
//        return x;
//    }
}
