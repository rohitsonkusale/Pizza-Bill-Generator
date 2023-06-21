import java.sql.SQLOutput;

public class Pizza {
    private int price;
    private Boolean veg;


    public Pizza(Boolean veg){
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    private int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int bagPackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;



    public void addExtraCheese(){
        isExtraCheeseAdded = true;
      //  System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings(){
        isExtraToppingsAdded = true;
      //  System.out.println("Extra toppings added");
        this.price += extraToppingsAdded;
    }

    public void takeAway(){
        isOptedForTakeAway = true;
      //  System.out.println("take away opted");
        this.price += bagPackPrice;
    }

    public void getBill(){
        String bill = "";
        System.out.println("Pizza: "+ basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra Cheese Added: "+extraCheesePrice+ "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra Toppings Added: "+extraToppingsAdded+"\n";
        }
        if (isOptedForTakeAway){
            bill += "Take away: "+bagPackPrice+"\n";
        }
        bill += "Total Bill: "+this.price;
        System.out.println(bill);
    }

}
