package siniflar.boks_oyunu;

public class Boxer {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    public Boxer(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }

    }

    int hit(Boxer foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isdodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;

    }

    boolean isdodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }




}
