public class Ravenclaw extends hogwarts{
    private int smart; //умны
    private int wise; //Мудры
    private int witty; //Остроумны
    private int creative; //Креативны

    public Ravenclaw(int surgeOfMagic, int transgression, String name, int smart, int wise, int witty, int creative) {
        super(surgeOfMagic, transgression, name);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    private int calculateSumOfAtributes(){
        return smart + wise + witty + creative;
    }
    public void compareRavenclaw(Ravenclaw Ravenclaw){
        if(this.calculateSumOfAtributes() > Ravenclaw.calculateSumOfAtributes()){
            System.out.println(this.getName() + " Сильнее, чем " + Ravenclaw.getName());
        } else if (this.calculateSumOfAtributes() < Ravenclaw.calculateSumOfAtributes()) {
            System.out.println(Ravenclaw.getName() +" Сильнее, чем " + this.getName());
        } else System.out.println(this.getName() + " и " + Ravenclaw.getName() + " равны по силе");
    }
    public String getAbilities(){
        return "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative;
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                '}';
    }
    public void descriptionOfStudent(){
        System.out.println("У ученика " + this.getName() + " следующие характеристики: ");
        System.out.println(this.getBaseAbilities());
        System.out.println(this.getAbilities());
    }
}
