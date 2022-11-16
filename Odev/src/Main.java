public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Horse", AnimalTypes.MAMMAL);
        Animal animal2 = new Animal("Eagle", AnimalTypes.BIRD);
        Animal animal3 = new Animal("Snake", AnimalTypes.REPTILE);
        Animal animal4 = new Animal("Anchovy", AnimalTypes.FISH);
        Animal[] animals = { animal1, animal2, animal3, animal4 };

        Zoo myZoo = new Zoo(animals);
        myZoo.printAnimals();
    }
}
