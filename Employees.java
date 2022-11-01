import java.lang.Math;
abstract class Employees implements People{  
    //private data members   
    private int working_hours, p_h;
    private String name;

    public String getName(){  
      return name;  
    }  
     
    public void setName(String name){  
      this.name=name ; 
    }  

   //getter method for working_hours  
    public int getWorking_hours(){  
      return working_hours;  
    }  
    //setter method for working_hours  
    public void setWorking_hours(int working_hours){  
      this.working_hours=working_hours ; 
    }  
    //getter method for price per hour  
    public int getP_h(){  
      return p_h;  
    }  
    //setter method for price per hour  
    public void setP_h(int p_h){  
      this.p_h=p_h ; 
    } 
   
    abstract double salary(int working_hours, int p_h);

    //overriding method for getId()
    public int getId(){  
      int min = 400;  
      int max = 1000;  
      //Generate random int value from 400 to 1000   
      int b = (int)(Math.random()*(max-min+1)+min);  
      return b; 
      }  
}  