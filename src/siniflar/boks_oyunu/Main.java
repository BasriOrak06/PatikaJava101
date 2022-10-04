package siniflar.boks_oyunu;

public class Main {
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer("Jashua", 16, 105, 100, 40);
        Boxer boxer2 = new Boxer("Fury", 22, 85, 85, 60);

        Match match = new Match(boxer1,boxer2,85,115);
        match.run();

    }
}
