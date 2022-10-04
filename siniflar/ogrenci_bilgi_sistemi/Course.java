package siniflar.ogrenci_bilgi_sistemi;
//name,code,prefix,note,Teacher
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int oralExamNote;

    public Course( String name, String code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int examNote = 0;
        int oralExamNote = 0;
    }
    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }

    }

    void printTeacherInfo() {
        this.teacher.print();
    }
}
