public class Administration extends Employees{  
    //private data members  
    private String position, level, functions;
    private Departments department;
   
    public void welcome(){
        System.out.println("Welcome to the administration");
    } 
    
     public String getFunctions(){  
      return functions;  
    }  
    
    public void setFunctions(String functions){  
      this.functions=functions ; 
    }  
    
    public Departments getDepartment(){  
      return department;  
    }  
    
    public void setDepartment(Departments department){  
      this.department=department ; 
    }  

    public String getPosition(){  
      return position;  
    }  
    
    public void setPosition(String position){  
      this.position=position ; 
    }  

    public String getLevel(){  
      return level;  
    }  
    
    public void setLevel(String level){  
      this.level=level ; 
    } 

    
//overriding the method salary
    public double salary(int working_hours, int p_h){
      double salary;
      salary=working_hours*p_h;
      return salary;
    }
    
   
}  