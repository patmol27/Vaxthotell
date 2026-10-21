import java.util.ArrayList;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Plants> hotelPlants = new ArrayList<>();

        LiquidType palms = LiquidType.PALM;
        LiquidType cactuses = LiquidType.CACTUS;
        LiquidType carnivorousPlants = LiquidType.CARNIVOROUSPLANT;
        System.out.println(cactuses.getLiquidTypes());

        //Polyforfism. Det skapas nya objekt av olika växter
        // och det skapas instnser av klassen Plant
        Plants palm1 = new Palm("Palm",palms,"Laura",5);
        Plants cactus = new Cactus("Cactus",cactuses,"Igge",0.2);
        Plants carnivorousPlant = new CarnivorousPlant("Carnivorous plant",carnivorousPlants,"Meatloaf",0.7);
        Plants palm2 = new Palm("Palm",palms,"Olof",1);

        Scanner scan = new Scanner(System.in);

        Boolean run = true;
        while (run) {
            start();
            try {
                String choice;
                choice = scan.next();
                if (choice.equalsIgnoreCase(palm1.getName())) {
                    liquidToPalm(palm1, palms);
                    break;

                } else if (choice.equalsIgnoreCase(palm2.getName())) {
                    liquidToPalm(palm2, palms);
                    break;
                } else if (choice.equalsIgnoreCase(cactus.getName())) {
                    liquidToCactus(cactus, cactuses);
                    break;

                } else if (choice.equalsIgnoreCase(carnivorousPlant.getName())) {
                    liquidToCarnivorousPlant(carnivorousPlant, carnivorousPlants);
                    break;

                }else{
                    throw new IllegalArgumentException();
                }

            }catch (IllegalArgumentException e){
                System.out.println("You have to type the name of the plant you want to give liquid");
                scan.nextLine();
            }

        }
        scan.close();


    }
    public static void allPlants(ArrayList plants, Plants plant1,Plants plant2,Plants plant3,
                                Plants plant4){
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);
        System.out.println(plants);

    }

    public static void start(){
        System.out.println("Which plant do you wan to give liquid?");
        System.out.println("Cactus Igge");
        System.out.println("Palm Laura");
        System.out.println("Carnivorous Meat Meatloaf");
        System.out.println("Palm Olof");

    }

    // interface
    // de 3 metoderna nedan anropar samma metod formel(); men får olika svar beroende på plant typ
    public static void liquidToPalm(Plants palm,LiquidType palmer){

        System.out.println(palm.getPlantType());
        System.out.println("You need "+ palm.formula() + " L " + palmer.getLiquidTypes() +" each day");
    }

    public static void liquidToCactus(Plants kaktus, LiquidType kaktusar){
        System.out.println(kaktus.getPlantType());
        System.out.println("You need "+ kaktus.formula() + " cl " + kaktusar.getLiquidTypes() +" each day");

    }

    public static void liquidToCarnivorousPlant(Plants köttÄtandeVäxt,LiquidType köttÄtandeVäxter){
        System.out.println(köttÄtandeVäxt.getPlantType());
        System.out.println("You need "+ köttÄtandeVäxt.formula() + " L " + köttÄtandeVäxter.getLiquidTypes() +" each day");

    }

}
