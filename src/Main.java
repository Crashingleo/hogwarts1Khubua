public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor(80,50,"Harry Potter", 50,100,100);
        Griffindor hermione = new Griffindor(100,100,"hermione Greyndjer", 100, 100, 100);
        Griffindor ron = new Griffindor(40, 40, "Rone Uizli", 70,70,70);
        Slytherin drako = new Slytherin(60,60,"Drako Malfoy", 60,60,60,60,60);
        Slytherin grekhem = new Slytherin(35,40,"Grekhem Montegy", 40,40,40,40,40);
        Slytherin gregory = new Slytherin(40,40, "Gregory Goyl", 50,50,55,60,38);
        Hufflepuff zaharia = new Hufflepuff(30,70,"Zaharia Smitt", 70,30,10);
        Hufflepuff sedrick = new Hufflepuff(70,70,"Sedrick Diggory", 70,70,70);
        Hufflepuff jastin = new Hufflepuff(50,40,"Jastin Fin-Fletch", 42,31,82);
        Ravenclaw chjou = new Ravenclaw(50,40,"Chjou Chang", 80,70,20,30);
        Ravenclaw padma = new Ravenclaw(60,30,"Padma Patil", 60,55,46,74);
        Ravenclaw markus = new Ravenclaw(50,45,"Markus Belbi", 50,44,55,66);
        harry.descriptionOfStudent();
    }
}