package Animal.models;

import Animal.enums.SexType;
import Animal.interfaces.ISound;

public abstract class Animal implements ISound {
    protected int age;
    protected String name;
    protected SexType sex;

    public Animal(int age, String name, SexType sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public String getKind() {
        return "Animal";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexType getSex() {
        return sex;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
    }

    @Override
    public void speak() {
        // TODO Auto-generated method stub

    }
}
