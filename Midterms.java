public class Midterms extends Evaluation{  
   //private data members  
    private String object;
    private boolean admis;
    private Students student;
    
    public Midterms(String object, boolean admis, Students student){
      this.object=object;
      this.admis=admis;
      this.student=student;
    }
    public Midterms(){
   
    }

    void type(){
        System.out.println("Evaluation form : midterm");
    } 
    
     double grading(){   
      int min1 = 1;  
      int max1 = 10;
       //Generate random grade 
     double grade = (int)(Math.random()*(max1-min1+1)+min1); 
      return grade;
      }
    
}  