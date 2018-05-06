public class Laptop extends Computer {

    private String camera;
    private String size;
    private String weight;

    public Laptop(){}

    public Laptop(String companyName, String model , String color, String processor , double price, String camera, String size, String weight){
        super(companyName , model , color , processor , price);
        this.camera = camera;
        this.size = size;
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public String getWeight() {
        return weight;
    }

    public String getCamera() {

        return camera;
    }

    public String Display(){
        super.toString();
        return "Camera: "+getCamera()+"\nSize: "+getSize()+"\nWeight: "+getWeight();
    }
}
