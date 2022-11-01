public class Professors extends Employees{  
    //private data members  
    private boolean permanent;  
 
    private int medh,pm;
    
    public void welcome(){
        System.out.println("Professor ->");
    }  

    public boolean getPermanent(){  
      return permanent;  
    }  
    
    public void setPermanent(boolean permanent){  
      this.permanent=permanent ; 
    }  
    //meditation hours
    public int getMedth(){  
      return medh;  
    }  
    
    public void setMedth (int medh){  
      this.medh=medh ; 
    }  
    //price per meditation
    public int getPm(){  
      return pm;  
    }  
    
    public void setPm (int pm){  
      this.pm=pm ; 
    }  

    //overriding the method salary
    double salary(int working_hours, int p_h){
      double salary;
      salary=(working_hours*p_h)+(medh*pm);
      return salary;
    }
    
    

}  