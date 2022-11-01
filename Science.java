public class Science extends Departments{  
    //private data members   
    private int nr_st;


    public void welcome(){
        System.out.println("Welcome to the Science Department ");
    } 

    public int getNr_st(){  
      return nr_st;  
    }  
   
    public void setNr_st(int nr_st){  
      this.nr_st=nr_st ; 
    }  

    void adress(){
      String str="Big Cedar Way",code="408";
      System.out.println("Located on "+code+", "+str);
    }

    

}  