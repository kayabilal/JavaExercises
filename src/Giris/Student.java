package Giris;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;


    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;

    }
    void addBulkExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if(note2>=0 && note1<=100){
            this.c2.note=note2;
        }
        if(note3>=0 && note1<=100){
            this.c3.note=note3;
        }

    }

    void addBulkVerbalNote(int verb_note1,int verb_note2,int verb_note3){
        if(verb_note1>=0 && verb_note1<=100){
            this.c1.verbal_note=verb_note1;
        }
        if(verb_note2>=0 && verb_note2<=100){
            this.c2.verbal_note=verb_note2;
        }
        if(verb_note3>=0 && verb_note3<=100){
            this.c3.verbal_note=verb_note3;
        }
    }


    public void calcAvarage() {
        double tarihAv = this.c1.note *0.75 + this.c1.verbal_note * 0.25;
        double fizikAv = this.c2.note *0.8 + this.c2.verbal_note * 0.2;
        double biyoAv = this.c3.note *0.6 + this.c3.verbal_note * 0.4;
        double average = (tarihAv + fizikAv + biyoAv) / 3;
        this.average = average;
        printNote();
        isPass();
    }

    void isPass(){
        if(this.average>55){
            System.out.println("You have successfully passed the class.");
            isPass=true;
        }else{
            System.out.println("unfortunately you failed");
            isPass=false;
        }

    }
    void printNote(){
        System.out.println(this.c1.name + "Notu: "+this.c1.note+ "sözlü notu" + this.c1.verbal_note);
        System.out.println(this.c2.name + "Notu: "+this.c2.note+"sözlü notu"+ this.c2.verbal_note);
        System.out.println(this.c3.name + "Notu: "+this.c3.note+"sözlü notu"+this.c3.verbal_note);
        System.out.println("Average: "+ this.average);

    }




}
