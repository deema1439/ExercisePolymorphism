public class Car implements Vehicle{

    private String model;
    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        if(days==1){
            this.days = days;
            System.out.println("day");
        }else if(days>1){
            this.days = days;
            System.out.println("days");
        }else{
            System.out.println("There is no negative days ??? ");
        }
    }


    public Car() {
    }

    private int days;

    @Override
    public double calculateRentalCost() {
        return days*50;
    }

    @Override
    public void displayDetails() {
        System.out.println(" The Model: "+ model );
        System.out.println(" the Days : "+days);
        System.out.println(" Daily Rental rate: "+50.0+"$");
        System.out.println(" Rental Cost: "+calculateRentalCost()+"$");
    }










}
