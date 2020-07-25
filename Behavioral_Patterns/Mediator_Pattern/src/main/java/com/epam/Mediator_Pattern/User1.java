package com.epam.Command_Pattern;

public class User1 extends Participant {  
      
    private String name;  
    private ApnaChatRoom chat;  
     
    public void sendMsg(String msg) {  
    chat.showMsg(msg,this);  
          
    }  
  
    public void setname(String name) {  
        this.name=name;  
    }  
  
    public String getName() {  
        return name;  
    }  
      
    public User1(ApnaChatRoom chat){  
        this.chat=chat;  
    }     
      
}