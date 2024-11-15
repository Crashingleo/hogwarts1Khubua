public class Slytherin extends hogwarts{
    private int determination; //Решительность



    private int ambition; //Амбициозность
    private int thirstOfPower; //Жажда власти
    private int resources; //Находчивость
    private int trick; //Хитрость

    public Slytherin(int surgeOfMagic, int transgression, String name, int determination, int ambition, int thirstOfPower, int resources, int trick) {
        super(surgeOfMagic, transgression, name);
        this.determination = determination;
        this.ambition = ambition;
        this.thirstOfPower = thirstOfPower;
        this.resources = resources;
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getThirstOfPower() {
        return thirstOfPower;
    }

    public int getResources() {
        return resources;
    }

    public int getTrick() {
        return trick;
    }

    private int calculateSumOfAtributes(){
        return trick + resources + thirstOfPower + ambition + determination;
    }

    public void compareSlytherin(Slytherin Slytherin){
        if(this.calculateSumOfAtributes() > Slytherin.calculateSumOfAtributes()){
            System.out.println(this.getName() + " Сильнее, чем " + Slytherin.getName());
        } else if (this.calculateSumOfAtributes() < Slytherin.calculateSumOfAtributes()) {
            System.out.println(Slytherin.getName() +" Сильнее, чем " + this.getName());
        } else System.out.println(this.getName() + " и " + Slytherin.getName() + " равны по силе");
    }
    public String getAbilities(){
        return "determination=" + determination +
                ", ambition=" + ambition +
                ", thirstOfPower=" + thirstOfPower +
                ", resources=" + resources +
                ", trick=" + trick;
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "determination=" + determination +
                ", ambition=" + ambition +
                ", thirstOfPower=" + thirstOfPower +
                ", resources=" + resources +
                ", trick=" + trick +
                '}';
    }
    public void descriptionOfStudent(){
        System.out.println("У ученика " + this.getName() + " следующие характеристики: ");
        System.out.println(this.getBaseAbilities());
        System.out.println(this.getAbilities());
    }
}
