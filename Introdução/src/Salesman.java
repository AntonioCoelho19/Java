
public final class Salesman extends Employee{

    private double percentPerSale;
    private double soldAmount;

    public Salesman(String code, String name, String adress, int age, double salary, double percentPerSale, double soldAmount) {
        super(code, name, adress, age, salary);
        this.percentPerSale = percentPerSale;
        this.soldAmount = soldAmount;
    }

    public Salesman(){}

    @Override
    public String getCode(){
        // return "SL" + super.getCode(); com code como private
        return "SL" + this.code; /*code como protected */
    }

    public double getPercentPerSale() {
        return percentPerSale;
    }

    public void setPercentPerSale(double percentPerSale) {
        this.percentPerSale = percentPerSale;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
    
     @Override
    public double getFullSalary() {
        return this.salary + (soldAmount * percentPerSale) / 100;
    }
}
