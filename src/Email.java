import java.util.Scanner;

public class Email {
       private String firstName;
       private String lastName;
       private int defaultPassword=10;
       private String password;
       private String departmentName;
       private String companySuffix="elixir.com";
       private String alternateEmail;
       private int mailBoxCapacity=200000;
       
       Email(String firstName,String lastName){
    	   this.firstName=firstName;
    	   this.lastName=lastName;
             System.out.println("Your Registered Full Name: "+firstName+ " "+lastName);
             this.departmentName= setDepartment();
             this.password=randomPassword(defaultPassword);
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
		 
    	   
    
       //Generate random password
      private String randomPassword(int length){
    	
    	   String passwordSet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@!#$%^&*()";
    	    char[] password= new char[length];
    	   for(int i=0;i<length;i++){
    		   int randomPass= (int)(Math.random()*passwordSet.length());
    		   password[i]=passwordSet.charAt(randomPass);
    		   System.out.println("Your password is: "+this.password);
    		   return  new String(password);
    		 
    	   }
		return passwordSet;
	
       }
       //set mail Capacity
       private void setMailBoxCapacity(int capacity){
    	   this.mailBoxCapacity=capacity;
    	   
       }
       //get Mailbox capacity
       public int getMailBoxCapacity(){
    	   return mailBoxCapacity;
       }
       //set alternate Email
     
      public void setAlternateEmail(String altEmail){
    	  this.alternateEmail=altEmail;
      }
      //get alternate email
      public String getAlternateEmail(){
    	  return alternateEmail;
      }
      //set AlternatePassword
      public void setAlternatePassword(String altPassword){
    	  this.password=altPassword;
      }
      //get alternate password
      public String getAlternatePassword(){
    	  return password;
      }
      public String showInfo(){
    	 String email=firstName+"."+lastName+"."+departmentName+"@"+companySuffix;
    	  return "fullName: " +firstName+ " "+lastName+
    		"\n Company Email: "+email+ 
    		"\n Department Name: "+departmentName+
    		"\n Mail Box Capacity: "+mailBoxCapacity+
    		"\n password: "+password;
      }
       
}

