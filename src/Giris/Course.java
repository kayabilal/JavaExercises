package Giris;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbal_note;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        //this.teacher=teacher; //Course sınıfına ait bi nitelik olduğu için bu şekilde yazılabilir.
        int note=0;
        int verbal_note=0;

    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            printTeacher();
        }else{
            System.out.println("Öğretmen ve ders uyuşmuyor.");
        }


        //printTeacher();

    }

    void printTeacher(){
        this.teacher.print();
    }

}
