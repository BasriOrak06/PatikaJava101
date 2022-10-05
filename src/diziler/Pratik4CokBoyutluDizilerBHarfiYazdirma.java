package diziler;

public class Pratik4CokBoyutluDizilerBHarfiYazdirma {
    public static void main(String[] args) {
        String[][] stars = new String[7][4];

        for (int i = 0; i < stars.length; i++) {
            for (int k = 0; k < stars[i].length; k++) {
                if (i == 0 || i == 3 || i ==6) {
                    stars[i][k] = " * ";
                } else  if (k == 0 || k == 3) {
                    stars[i][k] = " * ";
                } else {
                    stars[i][k] = "   ";
                }
            }
        }
        for (String[] row : stars) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
