import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        ArrayList<Computer> myArray = new ArrayList<Computer>(3);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter type of Computer: \n1. Desktop\n2. Laptop");

        for(int count = 0 ; count < 1; count++){
            String check = input.nextLine();
            if(check.equalsIgnoreCase("Desktop")){

                myArray.add(new Desktop("Dell","Inspiron 1540","Black","3.2 cortex",8000,"720p"));
            }

            else if(check.equalsIgnoreCase("Laptop")){

                myArray.add(new Laptop("Lenovo", "G50-70", "Black", "Intel core i5",30000,"5 MP","13 inch","3.2 kg"));

            }

            else{
                System.out.println("Invalid ");
            }


        }

        for(int i = 0 ; i<1 ; i++){

             Computer show = new Desktop("hgdfgl","rui","rehg","rheo",6475.23,"eff");
             System.out.println(show);                                   
        }

    }
}
