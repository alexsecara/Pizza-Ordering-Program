
package com.mycompany.pizza;



/**
 *
 * @author Alex
 */
import java.util.Scanner;
public class Pizza {
    char size;
    boolean[] toppings;
    String specialty;
//Constructor 
    public Pizza(char size) {
        this.size = size;
        //Creating boolean array
        this.toppings = new boolean[27];
        //If pizza ordered not a specialty, set it as "none".
        this.specialty = "none";
    }

    public char getSize() {
        return size;
    }
  
    public void setSize(char size) {
        this.size = size;
    }

    public boolean[] getToppings() {
        return toppings;
    }

    public void setToppings(int index, boolean hasToppings) {
        this.toppings[index] = hasToppings;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String code) {
        this.specialty = code;
    }
    //Creating a method to calculate the pricing of the pizzas (not specialty).
    public double calculatePrice(){
        double pizzaPricing=0;
        int numofRegtop = 0;
        int numofGourtop = 0;
        double pizzabasePrice = 0;
        double regtopPrice = 0;
        double gourtopPrice = 0;
        
        for(int i = 0;i<20;i++){
            if(toppings[i]==true){numofRegtop++;}
            
        }
        for(int i =20;i<toppings.length-1;i++){
            if(toppings[i]==true){numofGourtop++;}
        }
        //Using switch statements instead of if statements to make code more efficient
        switch(size){
            case 'P':
                pizzabasePrice = 8.84;
                regtopPrice = 0.48;
                gourtopPrice = 0.6;
                break;
                
            case 'S':
                pizzabasePrice = 13.26;
                regtopPrice=0.88;
                gourtopPrice=0.94;
                break;
                
            case 'M':
                pizzabasePrice = 17.68;
                regtopPrice = 0.88;
                gourtopPrice = 0.94;
                break;
                
            case 'L':
                pizzabasePrice = 21.23;
                regtopPrice = 0.88;
                gourtopPrice = 0.94;
                break;
            
            case 'Q':
                pizzabasePrice = 30.08;
                regtopPrice = 1.77;
                gourtopPrice = 1.98;
                break;
                
            case 'K':
                pizzabasePrice = 36.27;
                regtopPrice = 1.77;
                gourtopPrice = 1.98;
                break;
        }
        //Calculating pizza prices with rounding and returning the pricing of the pizza.
        pizzaPricing = pizzabasePrice + (numofRegtop*regtopPrice) + (numofGourtop*gourtopPrice);
        pizzaPricing= pizzaPricing*100;
        pizzaPricing = Math.round(pizzaPricing);
        pizzaPricing = pizzaPricing/100;
        return pizzaPricing;
    }

                    



//Creating a method which creates the array "toppings" where both regular and gourmet toppings
//are stored by there given codes. The array is then returned.    
    public static String[] toppings(){
        
        String[] toppings= new String[27];
        toppings[0]="sausage";
        toppings[1]="bacon";
        toppings[2]="beef";
        toppings[3]="anchovies";
        toppings[4]="freshmush";
        toppings[5]="slicetom";
        toppings[6]="greenolive";
        toppings[7]="hotpepp";
        toppings[8]="garlic";
        toppings[9]="basil";
        toppings[10]="pepperoni";
        toppings[11]="ham";
        toppings[12]="chicken";
        toppings[13]="mushrooms";
        toppings[14]="greenpepp";
        toppings[15]="blackolive";
        toppings[16]="onions";
        toppings[17]="pineapple";
        toppings[18]="redpepp";
        toppings[19]="xcheese";
        toppings[20]="artichoke";
        toppings[21]="suntom";
        toppings[22]="provolone";
        toppings[23]="parmigiano";
        toppings[24]="roastedpepp";
        toppings[25]="feta";
        toppings[26]="romano";
        
        return toppings;
    
    }
  //Creating an array which sets specialty prices for each given specialty pizza and
    //their sizes. The specialty prices are then returned.
    public static double specialtyPrices(String code, char size){
        
        double specialtyPrice = 0;
        //Utilizing both if statements and switch statements in order to make code efficient
        //and create prices for the specialty pizzas for each respective type of specialty pizza. 
        //The specialtyPrice is then returned.
        if(code.equals("deluxe")==true){
            switch(size){
                case 'P':
                    specialtyPrice=10.41;
                    break;
                
                case 'S':
                    specialtyPrice = 15.62;
                    break;
                    
                case 'M':
                    specialtyPrice =20.34;
                    break;
                    
                case 'L':
                    specialtyPrice=23.88;
                    break;
                    
                case 'Q':
                    specialtyPrice =34.5;
                    break;
                    
                case 'K':
                    specialtyPrice=40.69;
                    break;
                  
            }
        }
        
        if(code.equals("super")==true){
          switch(size){
            case 'P':
                    specialtyPrice=10.99;
                    break;
                
                case 'S':
                    specialtyPrice = 16.8;
                    break;
                    
                case 'M':
                    specialtyPrice =21.23;
                    break;
                    
                case 'L':
                    specialtyPrice=24.77;
                    break;
                    
                case 'Q':
                    specialtyPrice =35.39;
                    break;
                    
                case 'K':
                    specialtyPrice=41.57;
                    break;   
          }
                         
        }
        
        if(code.equals("vegetarian")==true){
            switch(size){
            case 'P':
                    specialtyPrice=10.99;
                    break;
                
                case 'S':
                    specialtyPrice = 16.8;
                    break;
                    
                case 'M':
                    specialtyPrice =21.23;
                    break;
                    
                case 'L':
                    specialtyPrice=24.77;
                    break;
                    
                case 'Q':
                    specialtyPrice =35.39;
                    break;
                    
                case 'K':
                    specialtyPrice=41.57;
                    break;   
          }
        }
        if(code.equals("sicilian")==true){
           switch(size){
            case 'P':
                    specialtyPrice=11.91;
                    break;
                
                case 'S':
                    specialtyPrice = 18.17;
                    break;
                    
                case 'M':
                    specialtyPrice =23.34;
                    break;
                    
                case 'L':
                    specialtyPrice=27.63;
                    break;
                    
                case 'Q':
                    specialtyPrice =27.63;
                    break;
                    
                case 'K':
                    specialtyPrice=46.79;
                    break;   
          }
        }
              if(code.equals("greek")==true){
            switch(size){
            case 'P':
                    specialtyPrice=11.91;
                    break;
                
                case 'S':
                    specialtyPrice = 18.17;
                    break;
                    
                case 'M':
                    specialtyPrice =23.34;
                    break;
                    
                case 'L':
                    specialtyPrice=27.63;
                    break;
                    
                case 'Q':
                    specialtyPrice =39.25;
                    break;
                    
                case 'K':
                    specialtyPrice=46.79;
                    break;   
          }
        }
              if(code.equals("hawaiian")==true){
            switch(size){
            case 'P':
                    specialtyPrice=9.72;
                    break;
                
                case 'S':
                    specialtyPrice = 15.03;
                    break;
                    
                case 'M':
                    specialtyPrice =19.46;
                    break;
                    
                case 'L':
                    specialtyPrice=23;
                    break;
                    
                case 'Q':
                    specialtyPrice =33.18;
                    break;
                    
                case 'K':
                    specialtyPrice=38.92;
                    break;   
          }
            
          }
              
              return specialtyPrice;
    }
            
public static void main(String[] args){
        
   Scanner myScanner = new Scanner(System.in);
  //Asking customer for their information. 
   System.out.println("Please enter your first name.");
   
   String nameF = myScanner.nextLine();
   
   System.out.println("Please enter your last name.");
   
   String nameL = myScanner.nextLine();
   
   System.out.println("What is your address?");
   
   String address = myScanner.nextLine();
   
   System.out.println("Please enter your phone number. Ex: 5195349685");
   
   double phoneNum = myScanner.nextDouble();
   
   System.out.println("Please enter how many pizzas you would like to order.");
   
    int pizzaNum = myScanner.nextInt();
    myScanner.nextLine();
    //Creating an array of Pizza objects. The size of the array is the value of variable pizzaNum
    Pizza pizzasOrdered[]=new Pizza[pizzaNum];
    //Calling on toppings method and creating the array toppings.
    String [] toppings = toppings();
    //Initalizing booleans to use in do while loops later in the code.
    boolean specialtyPizza = false;
    boolean regularPizza = false;
    boolean validTopping = false;
    String code = "";
        //Asking customer for what pizzas and toppings they want. 
    for(int i = 0; i<pizzaNum;i++){
        
       
        System.out.println("Would you like to order a specialty pizza? Please input \"Y\", if you would like a specialty pizza.");
        String specialtyInput = myScanner.nextLine();
        
        if(specialtyInput.equals("Y")){
            do{
                System.out.println("What specialty pizza would you like? Our options are: deluxe, super, vegetarian, sicilian, greek and hawaiian.");
                
                code = myScanner.nextLine();
                
                switch (code) {
                    case "deluxe":
                        specialtyPizza =true;
                        break;
                    case "super":
                        specialtyPizza=true;
                        break;
                    case "vegetarian":
                        specialtyPizza=true;
                        break;
                    case "sicilian":
                        specialtyPizza = true;
                        break;
                    case "greek":
                        specialtyPizza=true;
                        break;
                    case "hawaiian":
                        specialtyPizza = true; 
                        break;
                    default:
                       System.out.println("This pizza is not in our menu. Please enter a different specialty pizza.");
                       
                }
                    
                
            }while(specialtyPizza == false);
         
            System.out.println("Please enter what size(s) of the speciality pizza(s) you would like. Types are: P, S, M, L, Q and K.");
            String specSize;
            boolean specialtySize = false;
            do{
               specSize = myScanner.nextLine();
               
               switch(specSize){
                   
                   case "P":
                       specialtySize = true;
                       break;
                   case "S":
                       specialtySize = true;
                       break;
                       
                   case "M":
                       specialtySize=true;
                       break;
                       
                   case"L":
                       specialtySize=true;
                       break;
                       
                   case"Q":
                       specialtySize=true;
                       break;
                       
                   case"K":
                       specialtySize=true;
                       break;
                     
                   default:
                       System.out.println("The size you inputted is not a size we offer. Please re-enter the size you would like.");
                  
               }
               
            }while(specialtySize==false);
            
            char SizeN= specSize.charAt(0);
            char size = SizeN;
            //Creating new "Pizza" object. Utilizes the constructor established,
            //takes in a character as an argument and assigns it to the "ith" position
            //in the pizzasOrdered array. The value "SizeN" becomes the size of the new Pizza object. 
            pizzasOrdered[i]=new Pizza(SizeN);
            pizzasOrdered[i].setSpecialty(code);
            
        }
        else{
            System.out.println("What size pizza would you like?");
            String sizeN;
            do{
                
                sizeN= myScanner.nextLine();
                
                switch (sizeN){
                    case "P":
                        regularPizza=true;
                        break;
                        
                    case "S":
                        regularPizza=true;
                        break;
                        
                    case "M":
                        regularPizza=true;
                        break;
                        
                    case "L":
                        regularPizza=true;
                        break;
                        
                    case "Q":
                        regularPizza=true;
                        break;
                        
                    case "K":
                        regularPizza=true;
                        break;
                        
                    default:
                        System.out.println("The type of regular pizza you inputted is not one that we offer. Please re-input.");
                        
                        
                }
                
                
            }while(regularPizza==false);
            
            char SizeN = sizeN.charAt(0);
            pizzasOrdered[i]=new Pizza(SizeN);
            //Asking customer for how many toppings they want and which ones
            System.out.println("How many toppings would you like?");
            int numofTop = myScanner.nextInt();
            String toppingInput;
            myScanner.nextLine();
            for(int j=0; j<numofTop;j++){
                do{
                    
                    System.out.println("Please enter one topping of your choice.");
                    toppingInput = myScanner.nextLine();
                 
                    for(String validTopp : toppings){
                        
                        
                        
                        if(toppingInput.equals(validTopp)==true){
                            validTopping = true;
                          break;
                         
                        }
                        
                    }
                    if(!validTopping){
                        System.out.println("Not a topping, please re-enter.");
                    }
                    
                }while(validTopping == false);
                
                for(int k =0; k<27; k++){
                    if(toppings[k].equals(toppingInput)){
                        pizzasOrdered[i].setToppings(k, true);
                        
                    }
                }
            }
            
            
            
        }
        
        
        
    }
    //Checking for discount
    System.out.println("If you have a discount code, please input it.");
    String discountInput = myScanner.nextLine();
    double discount = 0;
    if(discountInput.equals("DISCOUNT")){
       discount = 0.1; 
        
    }
    if(discountInput.equals("COMPSCI")){
        discount = 0.15;
        
    }
    
    //Asking for delivery or pickup and applying the appropriate fees and asking for special delivery instructions
    System.out.println("Would you like to have your pizza(s) delivered or picked up?");
    String deliveryOption = myScanner.nextLine();
    double delivCharge;
    String specialDeliv;
    String specialInst = "";
   
           
    if(deliveryOption.equals("Delivered")){
        delivCharge = 5;
        System.out.println("Do you have any special delivery instructions?");
        specialDeliv = myScanner.nextLine();
        if(specialDeliv.equals("Yes")){
            System.out.println("Please input your special delivery instructions below.");
            specialInst = myScanner.nextLine();
        }
        else{
            specialInst=("No special delivery instructions.");
        }
      
    }
    else{
        delivCharge = 0;
        
    }
    String tip;
    String tipOption = "";
    double percentTip=0;
    double dollarTip=0;
    if(deliveryOption.equals("Delivered")){
        System.out.println("Would you like to add a tip?");
       tip = myScanner.nextLine();
       if(tip.equals("Yes")){
           
           System.out.println("Would you like to tip in percent or in dollars?");
           tipOption = myScanner.nextLine();
           
           if(tipOption.equals("Percent")){
               
               System.out.println("How much would you like to tip in percent?");
               percentTip = myScanner.nextDouble();
               percentTip = percentTip/100;
                
           }
          
           else{
               System.out.println("How much would you like to tip in dollars?");
               dollarTip = myScanner.nextDouble();
           }
       }
       else{
           percentTip = 0;
           dollarTip = 0;
       }
       
    }
    else{
        System.out.println("Delivery option not selected, pizza(s) will be picked up.");
        
    }
   System.out.println("**********************************************");
   System.out.println("             Alexandra's Pizzeria");
   System.out.println("             456 Pizzeria Avenue");
   System.out.println("              Windsor, N3K 3J0");
   System.out.println("**********************************************");
   System.out.println("Customer:  "+nameL+", "+nameF);
   System.out.println("           "+address);
   System.out.println("           "+phoneNum+"\n");

    
   System.out.println("Special delivery instructions");
   System.out.println(specialInst+"\n");
   System.out.println("Number of Pizzas: "+pizzaNum+"\n");
   System.out.println("   Pizza                      Price");
   System.out.println("______________________________________________");

    
    double subtotal = 0;
    //Checking whether or not the specialty of Pizza object is "none". 
    //If it is, it calls the calculatePrice() method on the Pizza object to calculate the price of that pizza, 
    //and assigns the returned value to pizzaPricing. If the specialty is not "none", it calls the method specialtyPrices
    for(int i = 0; i<pizzaNum; i++){
        double pizzaPricing = 0;
        if(pizzasOrdered[i].getSpecialty().equals("none")){
            pizzaPricing = pizzasOrdered[i].calculatePrice();
        }
        else{
            pizzaPricing = specialtyPrices(pizzasOrdered[i].getSpecialty(),pizzasOrdered[i].getSize());
        }
        
        System.out.println("   Size: "+pizzasOrdered[i].getSize()+"                    Price: $"+pizzaPricing);
        System.out.print("   Toppings: ");
        for(int j = 0; j<27; j++){
            if(pizzasOrdered[i].getToppings()[j]==true){
                System.out.print(toppings()[j]+", ");
            }
        }
        System.out.println("\n   Specialty: "+pizzasOrdered[i].getSpecialty()+"\n");
        subtotal = subtotal + pizzaPricing;
    }
    //Calculating totals
    double discountAmount;
    subtotal = subtotal*100;
    subtotal = Math.round(subtotal);
    subtotal = subtotal/100;
    discountAmount = subtotal*discount;
    discountAmount = discountAmount*100;
    discountAmount = Math.round(discountAmount);
    discountAmount = discountAmount/100;
    
    double totalwDiscount = subtotal - discountAmount;
    double tax = totalwDiscount*0.13;
    tax = tax*100;
    tax = Math.round(tax);
    tax = tax/100;
    
    double tipAmount = totalwDiscount*percentTip;
    double tipResult = tipAmount + dollarTip;
    tipResult = tipResult*100;
    tipResult = Math.round(tipResult);
    tipResult = tipResult/100;
    
    double finalTotal = totalwDiscount + tax + delivCharge + tipResult;
    finalTotal = finalTotal*100;
    finalTotal = Math.round(finalTotal);
    finalTotal = finalTotal/100;
   System.out.println("             Subtotal:       $"+subtotal);
   System.out.println("             Discount:      -$"+discountAmount+"\n");
   System.out.println("             HST:            $"+tax);
   System.out.println("             Delivery:       $"+delivCharge);
   System.out.println("             Tip:            $"+tipResult);
   System.out.println("             Total:          $"+finalTotal);
    
    System.out.println("Thank you for chosing Alexandra's Pizzeria. Please come again soon!");
    
    
   
            }
            
            
            
        }
            
            
        
    





