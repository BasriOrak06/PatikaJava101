package siniflar.boks_oyunu;

public class Match {
    Boxer f1;
    Boxer f2;
    int minWeight;
    int maxWeight;

    public Match(Boxer f1, Boxer f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isStart()) {
            if (isCheck()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("=========YENİ ROUND=========");
                    this.f2.health = f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }

                    this.f1.health = f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }
            } else {
                System.out.println("Sporcuların sikletleri uymuyor");
            }
        } else {
            if (isCheck()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("=========YENİ ROUND=========");
                    this.f1.health = f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }

                    this.f2.health = f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }

                    System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                    System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
                }
            } else {
                System.out.println("Sporcuların sikletleri uymuyor");
            }
        }


    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " Kazandı!");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(f1.name + " Kazandı!");
        }
        return false;
    }

    boolean isStart() {
        int randNum = (int) (Math.random() * 2);
        System.out.println(randNum);
        if (randNum == 0) {
            System.out.println(f1.name + " maça başaldı");
            return true;
        } else {
            System.out.println(f2.name + " maça başladı");
            return false;
        }

    }
}
