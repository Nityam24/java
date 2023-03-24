import java.util.Scanner;

class CPU {
    double price;
    class Processor{ // nested class
    double cores;
    String manufacturer;
    
    Processor(String s, double c){
        manufacturer = s;
        cores = c;
    }
    
    double getCache(){
        System.out.println("how many cache do u needed?");
        double d;
        Scanner s = new Scanner(System.in);
        d = s.nextDouble();

        return d;
    }
    void displayProcesorDetail(){
        System.out.println("Cache:"+getCache());
        System.out.println("Manufacturer:"+manufacturer);
        System.out.println("cores:"+cores);
    }
    }
    protected class RAM{ // nested protected class
    // members of protected nested class
    double memory;
    String manufacturer;
    Double clockSpeed;
    double getClockSpeed();
    void displayRAMDetail(){

    }
    }
    }

    class Demo{
        public static void main(String arg[]){

        }
    }
