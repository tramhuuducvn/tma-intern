package HRManagement.models;

public class Worker extends Human {
    protected float weekSalary;
    protected int workHoursPerDay;

    public Worker(String firstName, String lastName, float weekSalary, int workHoursPerDay) {
        super(firstName, lastName);
        this.weekSalary = weekSalary;
        this.workHoursPerDay = workHoursPerDay;
    }

    public float calculateMoneyPerHour() {
        return this.weekSalary / (workHoursPerDay * 5);
    }

    public float getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(float weekSalary) {
        this.weekSalary = weekSalary;
    }

    public int getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    public void setWorkHoursPerDay(int workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public String toString() {
        return "Worker: " + firstName + " [weekSalary=" + weekSalary + ", workHoursPerDay=" + workHoursPerDay + "]";
    }

}
