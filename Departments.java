import java.lang.Math;
abstract class Departments implements Root{  
    //private data members  
    private String department,partners;  
    private int nr;
    private Administration admin;
    
    //Declaring constructors
    public Departments(String department, Administration admin, String partners ){
      this.department=department;
      this.admin=admin;
      this.partners=partners;
    }
    public Departments(){
      
    }
    public String getDepartment(){  
      return department;  
    }  
     
    public void setDepartment(String department){  
      this.department=department ; 
    }
    public int getNr(){  
      return nr;  
    }  
   
    public void setNr(int nr){  
      this.nr=nr ; 
    }  

    public String getPartners(){  
      return partners;  
    }  
     
    public void setPartners(String partners){  
      this.partners=partners ; 
    }  
    
    public Administration getAdmin(){  
      return admin;  
    }  
     
    public void setAdmin(Administration admin){  
      this.admin=admin ; 
    }  
    //Declaring abstract class
    abstract void adress();

    
}  