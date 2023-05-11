package HRManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import HRManagement.models.Human;
import HRManagement.models.Student;
import HRManagement.models.Worker;

public abstract class Main {
    private static List<Human> humans;
    private static List<Student> students;
    private static List<Worker> workers;

    static {
        students = new ArrayList<>();
        students.add(new Student("Duc", "Tram", 8));
        students.add(new Student("Bao", "Dang", 10));
        students.add(new Student("Giang", "Nguyen", 9));
        students.add(new Student("Ly", "Vo", 8));
        students.add(new Student("Ngan", "Phan", 9));
        students.add(new Student("Duy", "Nguyen", 10));
        students.add(new Student("Du", "Le", 9));
        students.add(new Student("Sang", "Nguyen", 7));
        students.add(new Student("Trong", "Le", 6));
        students.add(new Student("Le", "Tran", 7));

        workers = new ArrayList<>();
        workers.add(new Worker("Duc", "Tram", 350, 8));
        workers.add(new Worker("Bao", "Dang", 750, 10));
        workers.add(new Worker("Giang", "Nguyen", 500, 9));
        workers.add(new Worker("Ly", "Vo", 300, 8));
        workers.add(new Worker("Ngan", "Phan", 400, 9));
        workers.add(new Worker("Duy", "Nguyen", 700, 10));
        workers.add(new Worker("Du", "Le", 400, 9));
        workers.add(new Worker("Sang", "Nguyen", 350, 7));
        workers.add(new Worker("Trong", "Le", 1300, 6));
        workers.add(new Worker("Le", "Tran", 300, 7));

    }

    public static void main(String[] args) {
        List<Student> sortedStudents = students.stream().sorted((a, b) -> (int) (a.getGrade() - b.getGrade()))
                .collect(Collectors.toList());
        // sortedStudents.forEach(System.out::println);
        List<Worker> sortedWorkers = workers.stream()
                .sorted((a, b) -> (int) (b.getWorkHoursPerDay() - a.getWorkHoursPerDay()))
                .collect(Collectors.toList());
        // sortedWorkers.forEach(System.out::println);

        humans = new ArrayList<>();
        humans.addAll(sortedStudents);
        humans.addAll(sortedWorkers);

        humans.stream().sorted((a, b) -> a.getFirstName().compareTo(b.getFirstName())).forEach(System.out::println);
    }
}
