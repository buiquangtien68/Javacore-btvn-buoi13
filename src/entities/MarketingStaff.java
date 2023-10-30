package entities;

public class MarketingStaff extends Staff{
    private double sales;
    private double commissionRate;

    public MarketingStaff( String name, double salary, double sales, double commissionRate) {
        super( name, salary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return "MarketingStaff{" +
                "sales=" + sales +
                ", commissionRate=" + commissionRate +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
