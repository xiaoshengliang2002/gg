package com.java.principle.inversion;

public class DePendecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.reseive(new WeiXin());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{
    public String getInfo(){
        return "电子邮件信息:hello,word";
    }
}

class WeiXin implements IReceiver{
    public String getInfo(){
        return "微信消息:hello,杰克";
    }
}

class Person{
    public void reseive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
