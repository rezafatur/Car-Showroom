import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Jeep{
    private String car_name_jeep;
    
    public Jeep(String car_name_jeep){
        this.car_name_jeep = car_name_jeep;
    }
    
    public String getCar_name(){
        return car_name_jeep;
    }
    
    public String toString(){
        return car_name_jeep;
    }
}

class SUV{
    private String car_name_suv;
    
    public SUV(String car_name_suv){
        this.car_name_suv = car_name_suv;
    }
    
    public String getCar_name(){
        return car_name_suv;
    }
    
    public String toString(){
        return car_name_suv;
    }
}

class Sedan{
    private String car_name_sedan;
    
    public Sedan(String car_name_sedan){
        this.car_name_sedan = car_name_sedan;
    }
    
    public String getCar_name(){
        return car_name_sedan;
    }
    
    public String toString(){
        return car_name_sedan;
    }
}

public class QuizOOP{
    public static void main(String[] args){
        List<Jeep>buy_jeep = new ArrayList<Jeep>();
        List<SUV>buy_suv = new ArrayList<SUV>();
        List<Sedan>buy_sedan = new ArrayList<Sedan>();
        Scanner input_int = new Scanner(System.in);
        Scanner input_string = new Scanner(System.in);
        int pilihan;
        int jeep = 0, suv = 0, sedan = 0;
        
        do{
            System.out.println("====================");
            System.out.println("|     SHOWROOM     |");
            System.out.println("====================\n");
            System.out.println("======= MENU =======");
            System.out.println("| 1. Buy           |");
            System.out.println("| 2. Show          |");
            System.out.println("| 3. Exit          |");
            System.out.println("====================");
            System.out.print("Input : ");
            pilihan = input_int.nextInt();
            
            System.out.print("\n");
            switch(pilihan){
                case 1: // Buy
                    System.out.println("======= BUY =======");
                    System.out.println("1. Jeep");
                    System.out.println("2. SUV");
                    System.out.println("3. Sedan");
                    System.out.print("Input : ");
                    int car_pick = input_int.nextInt();
                    System.out.print("Car's name : ");
                    String car_name = input_string.nextLine();
                    
                    if(car_pick == 1){
                        jeep++;
                        buy_jeep.add(new Jeep(car_name));
                    }
                    else if(car_pick == 2){
                        suv++;
                        buy_suv.add(new SUV(car_name));
                    }
                    else if(car_pick == 3){
                        sedan++;
                            buy_sedan.add(new Sedan(car_name));
                    }
                    break;
                case 2: // Show
                    System.out.println("===== LIST CAR =====\n");
                    System.out.println("======= Jeep =======");
                    if(jeep == 0){
                        System.out.println("EMPTY");
                    }
                    else{
                        for(int i = 0; i < jeep; i++){
                            System.out.println(buy_jeep.get(i).getCar_name());
                        }
                    }
                    System.out.println("\n======= SUV  =======");
                    if(suv == 0){
                        System.out.println("EMPTY");
                    }
                    else{
                        for(int i = 0; i < suv; i++){
                            System.out.println(buy_suv.get(i).getCar_name());
                        }
                    }
                    
                    System.out.println("\n======= Sedan ======");
                    if(sedan == 0){
                        System.out.println("EMPTY");
                    }
                    else{
                        for(int i = 0; i < sedan; i++){
                            System.out.println(buy_sedan.get(i).getCar_name());
                        }
                    }
                    break;
            }
            System.out.print("\n");
        }while(pilihan != 3);
    }    
}
