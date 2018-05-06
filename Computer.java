public class Computer {
    private String companyName;
    private String model;
    private String color;
    private String processorType;
    private double price;

    public Computer(){}

    public Computer(String companyName, String model, String color, String processorType, double price) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
        this.processorType = processorType;
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getProcessorType() {
        return processorType;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Company: "+getCompanyName()+"\nModel: "+getModel()+"\nColor: "+getColor()+"\nProcessor Type: "+getProcessorType()+"\nPrice: "+getPrice();
    }

}
