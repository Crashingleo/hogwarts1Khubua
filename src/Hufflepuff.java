public class Hufflepuff extends hogwarts{

    private int hardworking; // Трудолюбивы
    private int loyal; //Верны
    private int honest; //Честны

    public Hufflepuff(int surgeOfMagic, int transgression, String name, int hardworking, int loyal, int honest) {
        super(surgeOfMagic, transgression, name);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    private int calculateSumOfAtributes(){
        return hardworking + loyal + honest;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff){
        if(this.calculateSumOfAtributes() > hufflepuff.calculateSumOfAtributes()){
            System.out.println(this.getName() + " Сильнее, чем " + hufflepuff.getName());
        } else if (this.calculateSumOfAtributes() < hufflepuff.calculateSumOfAtributes()) {
            System.out.println(hufflepuff.getName() +" Сильнее, чем " + this.getName());
        } else System.out.println(this.getName() + " и " + hufflepuff.getName() + " равны по силе");
    }
    public String getAbilities(){
        return "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
    public void descriptionOfStudent(){
        System.out.println("У ученика " + this.getName() + " следующие характеристики: ");
        System.out.println(this.getBaseAbilities());
        System.out.println(this.getAbilities());
    }
}
