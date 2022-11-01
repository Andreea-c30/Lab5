import java.io.*;
import java.lang.Thread;
import java.util.Scanner;    
import java.util.Random;
import java.lang.*;


class Main{  
    // Declaring ANSI_RESET so that we can reset the color
    public static final String ANSI_RESET = "\u001B[37m";
    
    // Declaring the color
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLUE = "\u001B[34m";

    static double totaltax=0,mid=0;
    static int failed=0,pass=0,csci=0,cinf=0,yf=0;
    public static void full_student(){
        //Data about students
        //creating instance of the encapsulated class 
    
        Full_time s1=new Full_time();   
        String[] firstName={"Nicole ","Eduard","Yazmin","Joe","Jane","Jessy","Anne","Elsa","Mia","Chris","Abel","Jack","Clar"};
        String[] lastName={"Johnson","Houghes","Wang","Wagk","Rios","Berret","Foster","Parker","Yu","Pratt","Burn","Lane","Blake"};
        Random index=new Random();
        // String[] firstName={"Nicole Johnson","Eduard Houghes"};
    
        //setting values for students
        s1.setName(firstName[index.nextInt(firstName.length)]+" "+lastName[index.nextInt(lastName.length)]);
         System.out.println("---->Student ->  Id: "+s1.getId()+"\tName: "+s1.getName()); 
        s1.type();s1.duration();
       
    }   



    public static void part_student(){
        //Data about students
        //creating instance of the encapsulated class 
        Part_time s2=new Part_time();    
        String[] firstName={"Nicole","Talia","Travis","Carolyn","Devon","Kristen","Litsy","Avery","Darian","Deacon","Gia","Jae"};
        String[] lastName={"Dominguez","Morton","Morton","Booker","Velazquez","Sharp","Dev","Benton","Pope","Campbell","Yates","Oneal"};
        Random index=new Random();
    
        //setting values for students
        s2.setName(firstName[index.nextInt(firstName.length)]+" "+lastName[index.nextInt(lastName.length)]); 
      
        //getting values 
        System.out.println("---->Student ->  Id: "+s2.getId()+"\tName: "+s2.getName()); 
        s2.type();s2.duration();
    
       
    }   

        public static void evaluation_lab(String[] disciplines){

        String[] firstName={"Mary","Kate","Kaleb","Willow","Ari","Juliana","Clark"};
        String[] lastName={"Reid","Millers","Crane","Porter","Charles","Estrada"};
       
        Random index=new Random();
        //Using dependancy injection
        Full_time st=new Full_time(); 
        Professors p1=new Professors(); 

        
        p1.setName(firstName[index.nextInt(firstName.length)]+" "+lastName[index.nextInt(lastName.length)]);

        Laboratory lab=new Laboratory();  
        lab.setObj(disciplines[index.nextInt(disciplines.length)]);
        lab.setProf(p1);
        lab.setStudent(st);
        System.out.println("---->Student ->  Id: "+lab.getStudent().getId()); 
        System.out.println("\tObject: "+lab.getObj()+" Professor : "+lab.getProf().getName());  
        lab.type();
        boolean ac=lab.accept();
        if(ac==true){
                  System.out.println("Accepted"); evaluation_mid();             
            }
        else { 
            System.out.println("Not Accepted \t>>Failed");failed++;yf++;
            }
        
        double money=lab.tax();
        totaltax=totaltax+money;
        System.out.println("Has to pay the tax of : "+money+" Lei");          


    }
 public static void evaluation_mid(){
            Midterms mid1=new Midterms();   
            mid1.type();
            double grade=mid1.grading();  
            mid=grade;
            if (grade>=5) { 
                System.out.println("Grade: "+grade); 
                evaluation_exam();
                }
            else {System.out.println("Grade: "+grade+"\tNot accepted to the exam >>Failed");failed++;yf++;}
                        


    }


   public static void evaluation_exam(){
       
        Exams ex=new Exams();  
        
        ex.type();
    
       double grade=ex.grading(); 
            if (grade>=5) { 
                
                double totgr=(ex.grading()*0.4)+(mid*0.6);
                System.out.println(">>Pass\t"+"Final grade: "+ totgr);
                pass++;
                }
            else {System.out.println("Grade: "+grade+"\tFail");failed++;yf++;}

    }


    public static void infdepartment(){
        
        //Using dependancy injection
        Administration a1=new Administration(); 
        a1.setName("Kalyani Travert");
        a1.setPosition("Head Chef");
        a1.setLevel("Superior");

        Informatics inf=new Informatics(); 
        inf.welcome();
        inf.setDepartment("Informatics");
        inf.setAdmin(a1);
        inf.setNr(25);
        inf.setPartners("Mathematical Association of America");
        
        System.out.println("Department -> "+inf.getDepartment());
        System.out.println(inf.getAdmin().getLevel()+" - "+inf.getAdmin().getPosition()+" -> "+inf.getAdmin().getName());
        inf.adress();
        System.out.println("\nNumber of instructors: "+inf.getNr()+"\nPartners: "+inf.getPartners());
        
  
    } 

    public static void scidepartment(){

        Administration a1=new Administration(); 
        a1.setName("Ken Davis");
        a1.setPosition("Head Chef");
        a1.setLevel("Superior");

        Science inf=new Science(); 
        inf.welcome();
        inf.setDepartment("Science");
        inf.setAdmin(a1);
        inf.setNr(30);
        inf.setPartners("National Science Association");

        System.out.println("Department -> "+inf.getDepartment());
        System.out.println(inf.getAdmin().getLevel()+" - "+inf.getAdmin().getPosition()+" -> "+inf.getAdmin().getName());
        inf.adress();
        System.out.println("\nNumber of instructors: "+inf.getNr()+"\nPartners: "+inf.getPartners());
  
    } 


    public static void main(String[] args){  
    
try{
   
   int month=0,year=0,mfst=0,mpst=0,full=0,part=0;
   int ipass,ifailed,spass,sfailed;
    Random rand = new Random(); 
      
    
    while(true)
     {
       
        int int_random = rand.nextInt(3); 
        if(int_random==0){
            System.out.println(" ");
            full_student();
            mfst++;full++;
        }
        if(int_random==1){
             System.out.println(" ");
             part_student();
             mpst++;part++;
        }
        else{ int next=0;
        while(next<=100){
        System.out.println(" ");
        full_student();
        mfst++;full++;
        System.out.println(" ");
        part_student();
        mpst++;part++;
        next++;
        }}
        month=month+1;
        year=year+1;
        if(month%30==0){
            
            System.out.println(ANSI_YELLOW+"\n\n\tStatistics of the month\n"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"Nr of students what went to university: "+mfst+" full-time\t"+mpst+" part-time"+"\nTotal: "+Integer.sum(mfst,mpst)+"\n\n"+ANSI_RESET);
            Thread.sleep(1000); 
            mfst=0;
            mpst=0;
        }
        if(month%50==0){
            Thread.sleep(1000);
             String[] Infodisciplines={"Mathematichs","Graphics","Science","English","Programing","Design","Modeling"};
            System.out.println(ANSI_GREEN+"\nDepartment INFO>>>>Begin of Session Time \n"+ANSI_RESET);
            int i=0;
             infdepartment();
            while(i<100)
            {
           
            evaluation_lab(Infodisciplines);
            i++;
            }
            ipass=pass;
            pass=0;
            ifailed=failed;
            failed=0;
            System.out.println(ANSI_GREEN+"\nEnd of Session Time\n"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"\nStatistics: \n"+"Nr. succesfully passed students: "+ipass+"\nNr of failed students: "+ifailed+ANSI_RESET);
            Thread.sleep(2000);

            String[] Sciencedisciplines={"Mechanics","Physics","Chemestry","English","Science"};
            System.out.println(ANSI_GREEN+"\nDepartment SCIENCE>>>>Begin of Session Time\n"+ANSI_RESET);
            int s=0;
            scidepartment();
            while(s<100)
            {
             
            evaluation_lab(Sciencedisciplines);
            s++;
            }            
            spass=pass;
            pass=0;
            sfailed=failed;
            failed=0;
            System.out.println(ANSI_GREEN+"\nEnd of Session Time\n"+ANSI_RESET);
            System.out.println(ANSI_BLUE+"\nStatistics: \n"+"Nr. succesfully passed students: "+spass+"\nNr of failed students: "+sfailed+ANSI_RESET);
            double x=(100*ipass)/i;
            double y=(100*spass)/s;
            System.out.println(ANSI_GREEN+"\n\n\tBest rate of success: " +ANSI_RESET);
            if(x>y){
                    System.out.println(ANSI_GREEN+"\nInformatics ... "+x +ANSI_RESET);
            }
            else if(y>x){ System.out.println(ANSI_GREEN+"\nScience ... "+y +ANSI_RESET);}
            Thread.sleep(2000);
            
            failed=0;
            pass=0;
            
        }
        if(year%100==0){
            int dif=Integer.sum(full,part)-yf;
             System.out.println(ANSI_PURPLE+"\n\n\t----------------Statistics of the year\n"+ANSI_RESET);
             System.out.println(ANSI_BLUE+"Nr of students what went to university: "+full+" full-time\t"+part+" part-time"+"\nTotal: "+Integer.sum(full,part)+"\n\n"+ANSI_RESET);
             System.out.println(ANSI_BLUE+"Successfully passed "+dif+" students out of "+Integer.sum(full,part) +ANSI_RESET);
             System.out.println(ANSI_BLUE+"Ammount of money generated from labs tax: "+totaltax+" Lei"+ANSI_RESET);
             Thread.sleep(2000); 
            full=0;
            part=0;

        }
     }

   }
      catch(InterruptedException ex)
      {
         ex.printStackTrace();
      }

    }  


}  

