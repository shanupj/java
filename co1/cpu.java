public class cpu{
    int price;
     class processor{
        int cores;
        String producer;
        processor(int noC, String manu){
            cores=noC;
            producer=manu;
        }
        void display(){
        System.out.println("\nProcessor info");
        System.out.println("No. of Cores = "+cores);
        System.out.println("Manufacturer = "+producer+"\n");
    }
    }
    static class ram{
        int mem;
        String manuf;
        ram(int memory,String producer ){
            mem=memory;
            manuf=producer;
        }
        void display(){
        System.out.println("\nRAM info");
        System.out.println("Memory = "+mem+" GB");
        System.out.println("Manufacturer = "+manuf+"\n");
    }}
    public static void main(String[] args) {
    System.out.println("Name: SHANU P J\nRegisterNo: SJC22MCA-2050\nCourse Code: 20MCA132\n Date: 24/03/2023");
         cpu.ram obj1= new cpu.ram(8,"Intel");
         cpu obj2 = new cpu();
         cpu.processor obj3 = obj2.new processor(8,"Samsung");
         obj1.display();
         obj3.display();

    }
}
