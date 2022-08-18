import java.util.Scanner;

public class Mail {
	
	 private String firstName;
     private String lastName;
     private int defaultPassword=10;
     private String password;
     private String departmentName;
     private String companySuffix="elixir.com";
     private String alternateEmail;
     private int mailBoxCapacity=200000;
     
     
     Mail(String firstName,String lastName){
    	   this.firstName=firstName;
    	   this.lastName=lastName;
             System.out.println("Your Registered Full Name: "+firstName+ " "+lastName);
             this.departmentName= setDepartment();
            // this.password=randomPassword(defaultPassword);
       }
       //department name
       
       public String setDepartment(){
    	  
    	   System.out.println("1: Sales Department");
    	   System.out.println("2: Accounts Department");
    	   System.out.println("3: Developers");
    	   System.out.println("4: HR Department");
    	   System.out.println("5: None");
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter an Option: ");
		 int choiceOfDepartment= sc.nextInt();
		 if(choiceOfDepartment==1){
			 return "Sales";
		 } else if(choiceOfDepartment==2){
				 return "Accounts Department";
			 }else if(choiceOfDepartment==3){
				 return "Developers";
			 } else if(choiceOfDepartment==4){
					 return "HR Department"; 
				 }else{
					 return " ";
				 }		 
       }

}
