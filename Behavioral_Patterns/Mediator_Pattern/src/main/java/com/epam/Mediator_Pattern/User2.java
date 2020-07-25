package com.epam.Command_Pattern;

public class User2 extends Participant {  
 
   private String name;  
   private ApnaChatRoom chat;  
 
   public void sendMsg(String msg) {  
   this.chat.showMsg(msg,this);  
         
   }  
 
   public void setname(String name) {  
       this.name=name;  
   } 
   public String getName() {  
       return name;  
   }  
     
   public User2(ApnaChatRoom chat){  
       this.chat=chat;  
   }  
 
     
     
}  