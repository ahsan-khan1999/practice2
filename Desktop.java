public class Desktop extends Computer {

    private String monitorDimension;

    public Desktop(){}

    public Desktop(String companyName , String model , String color , String processorType, double price , String monitorDimension){
        super(companyName , model , color ,processorType, price);
        this.monitorDimension = monitorDimension;
    }

    public String getMonitorDimension() {
        return monitorDimension;
    }

    public String toString(){
        return "Monitor Dimension: "+getMonitorDimension()+super.toString();
		
    }
}
