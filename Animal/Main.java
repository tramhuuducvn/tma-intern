package Animal;

import java.util.ArrayList;
import java.util.List;

import Animal.enums.SexType;
import Animal.models.Animal;
import Animal.models.Cat;
import Animal.models.Dog;
import Animal.models.Frog;
import Animal.models.Kitten;
import Animal.models.Tomcat;

public class Main {
    private static List<Animal> animals;

    static {
        animals = new ArrayList<>();

        animals.add(new Cat(3, "Tom", SexType.MALE));
        animals.add(new Tomcat(4, "Thomas", SexType.MALE));
        animals.add(new Kitten(2, "Jenney", SexType.FEMALE));
        animals.add(new Dog(5, "Bully", SexType.MALE));
        animals.add(new Dog(4, "Pibull", SexType.MALE));
        animals.add(new Dog(3, "Rottweiler", SexType.FEMALE));
        animals.add(new Frog(6, "Forst", SexType.MALE));

    }

    private static float avgAgeOfKind(String kind) {
        int sum = 0;
        int count = 0;
        for (Animal animal : animals) {
            if (animal.getKind().equals(kind)) {
                sum += animal.getAge();
                count++;
            }
        }
        return (float) sum / count;
    }

    public static void main(String[] args) {
        System.out.println(avgAgeOfKind("Cat"));
        System.out.println(avgAgeOfKind("Dog"));
        System.out.println(avgAgeOfKind("Frog"));
    }
}
