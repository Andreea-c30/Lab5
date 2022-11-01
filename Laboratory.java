public class Laboratory extends Evaluation{  
   //private data members  
    private String object;
    private boolean admis,presented;
    private Students student;
    private Professors professor;
    public Laboratory(String object, boolean admis, Students student,Professors professor){
      this.object=object;
      this.admis=admis;
      this.student=student;
      this.professor=professor;
    }
    public Laboratory(){
   
    }

    void type(){
        System.out.println("---Laboratory---");
    } 

    boolean accept(){
        int t = 0;  
        int f = 5;
        boolean accept;
        int adm = (int)(Math.random()*(f-t+1)+t); 
        if(adm>2){
           accept=true;
        }
        else { accept=false;}
        return accept;
        

    }

    public double tax(){
         int t = 0;  
         int f = 20;
      int ab = (int)(Math.random()*(f-t+1)+t); 
      //System.out.println("Nr of absences: "+ab);
      double money=ab*30;
     // System.out.println("Has to pay the tax of : "+money+" Lei");
     return money;

    }
}  