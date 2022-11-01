public class Informatics extends Departments{  
    //private data members   
    private int nr_st;


    public void welcome(){
        System.out.println("Welcome to the Info Department ");
    } 

    public int getNr_st(){  
      return nr_st;  
    }  
   
    public void setNr_st(int nr_st){  
      this.nr_st=nr_st ; 
    }  

    void adress(){
      String str="Circle Ave",code="7577";
      System.out.println("Located on "+code+", "+str);
    }

    

    
} 