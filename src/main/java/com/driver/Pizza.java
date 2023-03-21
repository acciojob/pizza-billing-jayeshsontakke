package com.driver;

public class Pizza {

    public  int price;
      public boolean isVeg;
    public  String bill;
    public int basePrice;
    public int cheesPrice;
    public int topingPrice;
    public int bagPrice;
    public boolean ischeesadded;
    public boolean istopingsadded;
    public boolean isbagsadded;
    public boolean isBillgenerated;
    public int totalPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            basePrice=300;
            topingPrice=70;
        }else{
            basePrice=400;
            topingPrice=120;
        }
       bagPrice=20;
        cheesPrice=80;
       ischeesadded=false;
       istopingsadded=false;
       isbagsadded=false;
       totalPrice+=basePrice;
        bill="Base Price Of The Pizza: "+basePrice+"\n";
    }

    public int getPrice(){

        return totalPrice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeesadded==false){
            this.totalPrice=totalPrice+cheesPrice;
            ischeesadded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(istopingsadded==false){
            this.totalPrice=this.totalPrice+topingPrice;
            istopingsadded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isbagsadded==false){
            totalPrice=totalPrice+bagPrice;
            isbagsadded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillgenerated==false){
            if(ischeesadded){
                bill=bill+"Extra Cheese Added: "+cheesPrice+"\n";
            }
            if(istopingsadded==true){
                bill=bill+"Extra Toppings Added: "+topingPrice+"\n";
            }
            if(isbagsadded==true){
                bill=bill+"Paperbag Added: "+bagPrice+"\n";
            }
            bill=bill+"Total Price: "+totalPrice+"\n";
            isBillgenerated=true;
        }
        return bill;
    }
}
