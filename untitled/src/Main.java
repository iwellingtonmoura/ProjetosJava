public class Main {
    public static void main(String[] args) {

        Champion c1 = new Champion();

        c1.name = "Darius";
        c1.life = 50;
        c1.armor = 1;
        c1.attack = 8;

        Champion c2 =  new Champion();

        c2.name = "Fiora";
        c2.life = 40;
        c2.attack = 10;
        c2.armor = 2;


        c1.takeDamage(c2);


        System.out.println("Darius após tomar dano de Fiora " + c1.life);
    }
}