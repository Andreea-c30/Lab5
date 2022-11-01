import java.lang.Math;
abstract  class Students implements People{  
    //private data members  
    private String name;
    
    public void welcome(){
        System.out.println("--------------Information about students---------");
    } 
    
     public String getName(){  
      return name;  
    }  
     
    public void setName(String name){  
      this.name=name ; 
    }  

     //overriding method for getId()
    public int getId(){  
      int min = 200;  
      int max = 400;  
      //Generate random int value from 200 to 400   
      int b = (int)(Math.random()*(max-min+1)+min);  
      return b; 
      }  
    
   //abstract methods
    abstract void duration();
    abstract void type();

}  