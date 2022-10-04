package siniflar.ogrenci_bilgi_sistemi;

//name,stuNo,classes,course1,course2,course3,avarage,isPass
public class Student {
    String name;
    String stuNo;
    String classes;
    Course mat, fizik, biyoloji, sMat, sFizik, sBiyoloji;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course mat, Course fizik, Course biyoloji, Course sMat, Course sFizik, Course sBiyoloji) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.biyoloji = biyoloji;
        this.sMat = sMat;
        this.sFizik = sFizik;
        this.sBiyoloji = sBiyoloji;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addExamNote(int examNote1, int examNote2, int examNote3) {
        if (examNote1 >= 0 && examNote1 <= 100) {
            this.mat.examNote = examNote1;
        }
        if (examNote2 >= 0 && examNote2 <= 100) {
            this.fizik.examNote = examNote2;
        }
        if (examNote3 >= 0 && examNote3 <= 100) {
            this.biyoloji.examNote = examNote3;
        }
    }

    void addOralExamNote(int oralExamNote1, int oralExamNote2, int oralExamNote3) {
        if (oralExamNote1 >= 0 && oralExamNote1 <= 100) {
            this.mat.oralExamNote = oralExamNote1;
        }
        if (oralExamNote2 >= 0 && oralExamNote2 <= 100) {
            this.fizik.oralExamNote = oralExamNote2;
        }
        if (oralExamNote3 >= 0 && oralExamNote3 <= 100) {
            this.biyoloji.oralExamNote = oralExamNote3;
        }
    }

    void calcAverageNote() {
        this.avarage = ((this.mat.examNote * 0.80 + this.mat.oralExamNote * 0.20)
                      + (this.fizik.examNote * 0.80 + this.fizik.oralExamNote * 0.20)
                      + (this.biyoloji.examNote *0.80 + this.biyoloji.oralExamNote * 0.20)) /3.0;
    }

    void isPass() {
        System.out.println("**************************************");
        calcAverageNote();
        if (this.avarage > 55) {
            System.out.println("Habbam sınıfı uyanıyor!!!");
            this.isPass = true;
        } else {
            System.out.println("Hababam sınıfı sınıfta kaldı!!!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(mat.name + " Yazılı Notu: " + mat.examNote + " Sözlü Notu: " + mat.oralExamNote);
        System.out.println(fizik.name + " Yazılı Notu: " + fizik.examNote + " Sözlü Notu: " + fizik.oralExamNote);
        System.out.println(biyoloji.name + " Yazılı Notu: " + biyoloji.examNote + " Sözlü Notu: " + biyoloji.oralExamNote);
        System.out.println("Ortalamanız: " + this.avarage);
    }
}
