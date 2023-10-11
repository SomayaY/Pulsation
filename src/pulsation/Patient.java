
package pulsation;

import java.io.Serializable;


public class Patient implements Serializable {
    
   private String Name;
   private String Email;
   private String Adrees;
   private String Birth;
   private String Gender ;
   private String Phone;
   private String Password;
   private String FileNumber;
   
    
    public Patient(String name,String email,String adrees,String birth, String gender ,String phone , String password ,String fileNumber){
        Name=name;
        Email=email;
        Adrees=adrees;
        Birth=birth;
        Gender=gender;
        Phone =phone;
        Password=password;
        FileNumber=fileNumber;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public String getAdrees(){
        return Adrees;
    }
    
    public String getBirth(){
        return Birth;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public String getPhone(){
        return Phone;  
    }
    
     public String getFileNumber(){
        return FileNumber;
    }
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    

