abstract public class hogwarts {

    private final int surgeOfMagic; //Мощность колдовства
    private final int transgression; //Трансгрессия
    private final String name;

    public hogwarts(int surgeOfMagic, int transgression, String name) {
        this.surgeOfMagic = surgeOfMagic;
        this.transgression = transgression;
        this.name = name;
    }

    public int getSurgeOfMagic() {
        return surgeOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }



    public String getName(){
        return name;
    }

    private int calculateOfBaseAbility(){
        return surgeOfMagic +transgression;
    }

    public void compareOfBaseAbility(hogwarts hogwarts1){
        if(this.calculateOfBaseAbility() > hogwarts1.calculateOfBaseAbility()){
            System.out.println(this.getName() + " сильнее чем " + hogwarts1.getName());
        } else if(this.calculateOfBaseAbility() < hogwarts1.calculateOfBaseAbility()){
            System.out.println(this.getName() + " слабее чем " + hogwarts1.getName());
        } else System.out.println(" Они равны");
    }

    public String getBaseAbilities(){
        return "Трансгрессия " + transgression + ", сила магии " + surgeOfMagic;
    }




}
