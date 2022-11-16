public class Zoo {

    public Animal[] animals;

    public Zoo(Animal[] _animals) {
        this.animals = _animals;
    };

    public void printAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
