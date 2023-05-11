package Animal.models;

import Animal.enums.SexType;

public class Tomcat extends Cat {

    public Tomcat(int age, String name, SexType sex) {
        super(age, name, sex);
        // TODO Auto-generated constructor stub
        this.sex = SexType.MALE;
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
