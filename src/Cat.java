public class Cat extends Animal{

    public static void printStaticClass(){
        System.out.println("printStaticClass son");
    }
    public void printPublicClass(){
        System.out.println("printPublicClass son");
    }
    private void printPrivateClass(){
        System.out.println("printPrivateClass son");
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.printPublicClass();
        animal.printStaticClass();
        Cat cat = (Cat) animal;
        cat.printPrivateClass();
    }
}
