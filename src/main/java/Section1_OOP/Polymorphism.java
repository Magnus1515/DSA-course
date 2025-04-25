package Section1_OOP;

/*
    Polymorphism Example
*/

class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }

}

class Dog extends Animal {
    void makeSound(){
        System.out.println("Woof woof! ");
    }
}

class Cat extends Animal {
    void makeSound(){
        System.out.println("Miau miau!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}
