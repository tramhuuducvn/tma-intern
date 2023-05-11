package Animal.models;

import Animal.enums.SexType;

public class Kitten extends Cat {

    public Kitten(int age, String name, SexType sex) {
        super(age, name, sex);
        // TODO Auto-generated constructor stub
        this.sex = SexType.FEMALE;
    }

    @Override
    public void speak() {
        // TODO Auto-generated method stub

    }

    @Override
    public String getKind() {
        return "Cat";
    }
}
