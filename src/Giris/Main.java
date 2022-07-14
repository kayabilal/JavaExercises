package Giris;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Ahmet Hoca","TRH","05530000000");
        //t1.print();
        Teacher t2=new Teacher("graham bell","FZK","00000");
        Teacher t3=new Teacher("Külyutmaz","BIO","1234");

        Course tarih=new Course("Tarih","101","TRH");
        //tarih.addTeacher(t1);
        Course fizik=new Course("fizik","102","FZK");
        //fizik.addTeacher(t2);
        Course biyo=new Course("biyoloji","101","BIO");
        //biyo.addTeacher(t3);

        //tarih.printTeacherInfo();

        Student s1=new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        //s1.addBulkExamNote(100,200,50);
        //s1.printNote();
        //s1.isPass();
        Student s2=new Student("Güdük Necmi","444","4",tarih,fizik,biyo);

        s2.addBulkExamNote(50,30,70);
        s2.addBulkVerbalNote(60,70,80);
        s2.calcAvarage();
        s2.isPass();
    }
}
