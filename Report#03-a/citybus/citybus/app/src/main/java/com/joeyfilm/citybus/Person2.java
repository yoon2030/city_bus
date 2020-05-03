package com.joeyfilm.citybus;

public class Person2 {
    private String name;
    private String content;
    private String content2;
    private String payBy_;
    private String money_;

    public Person2(){

    }
    public Person2(String name, String content, String content2, String payBy_, String money_){
        this.name = name;
        this.content = content;
        this.content2 = content2;
        this.payBy_ = payBy_;
        this.money_ = money_;
    }

    public String getPayBy_(){
        return payBy_;
    }
    public String getMoney_(){
        return money_;
    }
    public void setPayBy_(String payBy_){
        this.payBy_ = payBy_;
    }

    public void setMoney_(String money_){
        this.money_ = money_;
    }
    public String getContent2(){
        return content2;
    }

    public void setContent2(String content2){
        this.content2 = content2;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
