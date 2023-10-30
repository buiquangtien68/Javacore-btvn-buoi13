package entities;

public class Manager extends Staff{
    private double reponsibilitySalary;

    public Manager( String name, double salary, double reponsibilitySalary) {
        super(name, salary);
        this.reponsibilitySalary = reponsibilitySalary;
    }

    public double getReponsibilitySalary() {
        return reponsibilitySalary;
    }

    public void setReponsibilitySalary(double reponsibilitySalary) {
        this.reponsibilitySalary = reponsibilitySalary;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "reponsibilitySalary=" + reponsibilitySalary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
