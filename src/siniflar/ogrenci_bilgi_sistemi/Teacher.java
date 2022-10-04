package siniflar.ogrenci_bilgi_sistemi;
//name,mpno,branch
public class Teacher {
    String name;
    String mpNo;
    String branch;

    public Teacher(String name, String mpNo, String branch) {
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }
    void print () {
        System.out.println("Adı: " + this.name);
        System.out.println("Telefon: " + this.mpNo);
        System.out.println("Bölümü: " + this.branch);
    }
}
