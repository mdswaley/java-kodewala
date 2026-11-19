package OOPs.Inheritance.SimpleCode;

class Animal {
    /**
     * Makes a sound.
     *
     * @return the sound made by the animal
     */
    String sound(){
        return "Animal sound";
    }
}

class Dog extends Animal{
    /**
     * {@inheritDoc}
     *
     * @return should be same as parent only except covariant return type
     */
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
