package siniflar.ogrenci_bilgi_sistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "055455556677", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "5345341212", "FZK");
        Teacher t3 = new Teacher("külyutmaz", "5055552020", "BIO");
        Course mat = new Course("Tarih", "101", "TRH");
        Course sMat = new Course("Tarih", "101", "TRH");
        mat.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        Course sFizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO");
        Course sBiyoloji = new Course("Biyoloji", "101", "BIO");
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", mat, fizik, biyoloji, sMat, sFizik,sBiyoloji);
        s1.addExamNote(100, 60, 50);
        s1.addOralExamNote(70,60,80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "124", "4", mat, fizik, biyoloji, sMat, sFizik,sBiyoloji);
        s2.addExamNote(50, 40, 55);
        s2.addOralExamNote(70,60,80);
        s2.isPass();

        Student s3 = new Student("Damat Ferit", "125", "4", mat, fizik, biyoloji, sMat, sFizik,sBiyoloji);
        s3.addExamNote(45, 48, 70);
        s3.addOralExamNote(46,60,80);
        s3.isPass();
    }
}
