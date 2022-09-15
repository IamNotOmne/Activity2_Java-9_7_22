
package oop_concept;

public class Student {
    private int IDnum;
    private String gender;
    
    
    public void introduce(){
    System.out.println(" My name is Warloy Misa and in the below is my small info:");
    }
    

    
    public Student(int IDnum, String gender){
        super();
        this.IDnum = IDnum;
        this.gender = gender;
    }
    
    
    
    public int getIdno() {
        return IDnum;
    }
    public String setIdno(int IDnum){
        this.IDnum = IDnum;
    }
    public String getGender() {
        return gender;
    }
    public String setGender(String gender){
        this.gender = gender;
    }

    
    public static void main(String[] args) {
        Student Id_number = new Student(21103847, "Male");
        Id_number.introduce();
        System.out.println("");
            
        System.out.println(" This my USC ID number is " + Id_number.getIdno()+" and my Gender is " + Id_number.getGender() );

       
    }
    
}
