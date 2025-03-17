
package model;

public class User {
    
    private String firstname;
    private String age;
    private String nationality;
    
    public User(String firstname, String age, String nationality){
        this.firstname = firstname;
        this.age = age;
        this.nationality = nationality;
        
    }
    
    
    
    public String getFirstname(){
    
     return firstname;
    }
    
    public String getAge(){
    
        return age;
    }
    
    public String getNationality(){
    
        return nationality;
    }
   
    
}
