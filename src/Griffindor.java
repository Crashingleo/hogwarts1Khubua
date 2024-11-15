public class Griffindor extends hogwarts{
    private int nobility; //Благородство
    private int honor; //Честь
    private int bravery;//Храбрость

    public Griffindor(int surgeOfMagic, int transgression, String name, int nobility, int honor, int bravery) {
        super(surgeOfMagic, transgression, name);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    private int calculateSumOfAtributes(){
        return nobility + honor + bravery;
    }

    public String getAbilities(){
        return "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
    public void descriptionOfStudent(){
        System.out.println("У ученика " + this.getName() + " следующие характеристики: ");
        System.out.println(this.getBaseAbilities() + this.getAbilities());
    }

    public void compareGrifindorStudent(Griffindor griffindor){
        if(this.calculateSumOfAtributes() > griffindor.calculateSumOfAtributes()){
            System.out.println(this.getName() + " Сильнее чем " + griffindor.getName());
        } else if(this.calculateSumOfAtributes() < griffindor.calculateSumOfAtributes()){
            System.out.println(this.getName() + "Слабее, чем " + griffindor.getName());
        } else {
            System.out.println("Студенты грифиндора равныx");
        }
    }


    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
