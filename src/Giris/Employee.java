package Giris;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;



    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;


    }

    public double tax(){
        if(this.salary<1000){
            return this.salary;
        } else{
            double tax=salary*0.03;
            return tax;
        }
    }

    int bonus(){
        if(this.workHours>40){
            int bonus=(this.workHours-40)*30;
            return bonus;

        }
        return 0;
    }

     double raiseSalary(){
        if (hireYear<=0  || hireYear>2021){
            System.out.println("You have entered an invalid year of employment. Check again");
        }
        else{
            int diffYear=2021-hireYear;
            double raise;

            if (diffYear>0 && diffYear<10){
                raise=this.salary*0.05;
                return raise;
            } else if (diffYear>9 && diffYear<20) {
                raise=salary*0.1;
                return raise;
            } else if (diffYear>19) {
                raise=salary*0.15;
                return raise;
            } else if (diffYear==0) {
                return 0;
            }
        }
            return 0;
     }

     public String toString(){

        double total=this.salary-tax() +bonus() +raiseSalary();
        double  totall=this.salary +bonus() -tax();
         System.out.println("Adı: " + this.name);
         System.out.println("Salary: " + this.salary);
         System.out.println("WorkHours: " + this.workHours);
         System.out.println("HireYear: " + this.hireYear);
         System.out.println("Tax: " + tax());
         System.out.println("Bonus: " + bonus());
         System.out.println("SalaryIncrease: " + raiseSalary());
         System.out.println("salary with taxes and bonuses : " + totall);
         System.out.println("TotalSalary: " + total);

         return null;


     }






}
