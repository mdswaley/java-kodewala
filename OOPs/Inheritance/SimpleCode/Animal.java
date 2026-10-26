package OOPs.Inheritance.SimpleCode;

class Animal {
    String sound(){
        return "Animal sound";
    }
}

class Dog extends Animal{
    @Override
    String sound(){
        return "Dog sound";
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal.sound());
    }
}
