/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritagecharity;



/**
 *
 *
 */
public class Register {
    
    String firstname;
    String surname;
    int telno;
    String email;
    
    
    public Register(String fname, String sname, int telephone, String email_address){
        firstname = fname;
        surname = sname;
        telno= telephone;
        email = email_address;
        
    }
    
   public String getFirstName(){
       return firstname;
   }
   
    public void setFirstName(String fname){
       firstname=fname;
   }
    
    public String getSurname(){
       return surname;
   }
   
    public void setSurame(String sname){
       surname=sname;
   }
    
    public int getTelphoneNo(){
       return telno;
   }
   
   public void setTelephoneNo(int telphone){
       telno=telno;
   }
   
   public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
