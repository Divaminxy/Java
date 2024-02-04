public class Zoo{
    Animal[] animals; //Animal[25] pour fixer le max (instruction5)//
    String name;
    String city;
    int nbrCages;

    public Zoo() {
        this.animals = new Animal[25]; //sinon erreur pointeur null
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    void displayZoo(){
        System.out.println(name + " " + city+" "+ nbrCages);
        for (int i=0; i<nbrCages; i++){
            System.out.println(animals[i]);
        }
    }

}
