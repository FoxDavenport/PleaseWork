package HashMap;
import java.util.*; 
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//Example of data retrieval with Hashing!

public class HashData
{
    public static void main(String args[]) 
    { 
        //clears the screen
        System.out.print('\u000C');
        
        //set integer exit equal to 0
        int exit=0;
        
        // Create a HashTable to store data about users
        // String values corresponding to string of arraylist
        LinkedHashMap<String, List<String>> UserInfo= new LinkedHashMap<>(); 
        
        //creates a list to store values for Fox Davenport
        List<String> FoxDavenport= new ArrayList<String>();
        FoxDavenport.add("UltimateLifeForm@gmail.com");
        FoxDavenport.add("Pineapple Pizza");
        
        //create a list to store values for Daniel Yang
        List<String> DanielYang= new ArrayList<String>();
        DanielYang.add("danielyang@yahoo.com");
        DanielYang.add("Tyler1");
        
        //create a list to store values for Mithil Pujar
        List<String> MithilPujar= new ArrayList<String>();
        MithilPujar.add("HugeMuscleMithil@muscle.com");
        MithilPujar.add("MUSCLE!");
        
        //create a list to store values for Mr. John
        List<String> MrJohn= new ArrayList<String>();
        MrJohn.add("OurLordAndSavior@holy.com");
        MrJohn.add("CodePower");
        
        //create a list to store values for Alex Clanton
        List<String> AlexClanton= new ArrayList<String>();
        AlexClanton.add("BadCoder@terrible.com");
        AlexClanton.add("CacaPooPoo");
        
        //create a list to store values for order 
        List<String> CT = new ArrayList<String>();
        CT.add("Email: ");
        CT.add("Password: ");
        
        //creates a scanner object for input from user
        Scanner input= new Scanner(System.in);
        
        //Input some user info into the map
        UserInfo.put("Fox Davenport", FoxDavenport);
        UserInfo.put("Mithil Pujar", MithilPujar);
        UserInfo.put("Daniel Yang", DanielYang);
        UserInfo.put("Mr. John", MrJohn);
        UserInfo.put("Alex Clanton", AlexClanton);
        
        System.out.println("Hi! Welcome to our mini databse! Please input a user you would like to learn about");
        System.out.println("Press 0 when you want to exit");
        
        // HashMap's key set
        Set<String> Username = UserInfo.keySet();
        System.out.println("Users: " + Username);
        
        //loops till user wants to exit
       while (exit==0){
        System.out.println("Which one do you want to get info on?");
        System.out.println("Please input the number of the user. Ex: Fox is 1, Mithil 2, etc...");
        int user= input.nextInt();
        
       if (user==0) {
            exit=1;
        }
        
        if(user==1) {
            List<String> FoxInfo= UserInfo.get("Fox Davenport");
            System.out.println("Fox's info: ");
            System.out.println(CT.get(0)+ FoxInfo.get(0)); 
            System.out.println(CT.get(1)+ FoxInfo.get(1) + "\n");
                    System.out.println(UserInfo.get("Fox Davenport") + "\n");

       } 
    
       if(user==2) {
           List<String> MithilInfo= UserInfo.get("Mithil Pujar");
        System.out.println("Mithil's info: ");
        System.out.println(CT.get(0)+ MithilInfo.get(0)); 
        System.out.println(CT.get(1)+ MithilInfo.get(1) + "\n");
        System.out.println(UserInfo.get("Mithil Pujar") + "\n");
       } 

       if(user==3) {
           List<String> DanielInfo= UserInfo.get("Daniel Yang");
            System.out.println("Daniel's info: ");
            System.out.println(CT.get(0)+ DanielInfo.get(0)); 
            System.out.println(CT.get(1)+ DanielInfo.get(1) + "\n");
            System.out.println(UserInfo.get("Daniel Yang") + "\n");
            
       }
    
       if(user==4) {
           List<String> MrJohnInfo= UserInfo.get("Mr. John");
        System.out.println("Mr John's info: ");
        System.out.println(CT.get(0)+ MrJohnInfo.get(0)); 
            System.out.println(CT.get(1)+ MrJohnInfo.get(1) + "\n");
        System.out.println(UserInfo.get("Mr. John") + "\n");
       } 
    
       if(user==5) {
           List<String> AlexInfo= UserInfo.get("Alex Clanton");
        System.out.println("Alex's info: ");
        System.out.println(CT.get(0)+ AlexInfo.get(0)); 
            System.out.println(CT.get(1)+ AlexInfo.get(1) + "\n");
        System.out.println(UserInfo.get("Alex Clanton") + "\n");
    } 
}
}
}