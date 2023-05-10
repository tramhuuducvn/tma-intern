package MiniExercises.Test;

import java.util.ArrayList;
import java.util.List;

import MiniExercises.models.GSM;

public class GSMTest {
    static private List<GSM> data;

    static {
        data = new ArrayList<>();
        data.add(new GSM("IPhone 8", "Apple"));
        data.add(new GSM("IPhone SE", "Apple"));
        data.add(new GSM("Samsung Galaxy S22", "Samsung"));
        data.add(new GSM("Redmi Note 7", "Xiaomi"));
        data.add(new GSM("Redmi Note 11", "Xiaomi"));
        data.add(new GSM("Oppo Reno 8", "Oppo"));
    }

    public void printData() {
        data.forEach(System.out::println);
    }

    public static void main(String[] args) {
    }
}