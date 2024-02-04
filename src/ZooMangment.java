import java.util.Scanner;

class ZooMangment {

    public static void main (String[] args){
        int nbrCage = 20;
        String zooName = "my Zoo";
        // insert data
        Scanner sc = new Scanner(System.in);
        System.out.println("give me zoo name ");
        zooName = sc.nextLine();
        System.out.println("give me number of cages ");

        nbrCage= sc.nextInt();


        System.out.println(zooName + " comporte " + nbrCage+" cages");


        //instruction 5
        Animal lion = new Animal();
        lion.name="Mufasa";
        lion.age=5;
        lion.isMammal= true;
        lion.family= "Felidae";

        Zoo myZoo = new Zoo();
        myZoo.name="Belvedere";
        myZoo.nbrCages=25;
        myZoo.animals[0]=lion;
        //-------------------------------//
        //instruction 7
        Animal monkey = new Animal("Gorilla", "Harambe",17, true);
        //instruction 8
        Zoo Belvedere = new Zoo("Belveder", "Tunis", 3);
        Belvedere.displayZoo();

        //System.out.println(myZoo); erreur
        System.out.println(myZoo.toString());//affichage non correcte
    }


}
