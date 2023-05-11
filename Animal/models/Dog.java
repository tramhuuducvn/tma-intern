package Animal.models;

import Animal.enums.SexType;

public class Dog extends Animal {

    public Dog(int age, String name, SexType sex) {
        super(age, name, sex);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void speak() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getKind() {
        return "Dog";
    }
}
