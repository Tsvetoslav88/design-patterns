public abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int unites) {
        System.out.println(unites * rate);
    }
}
