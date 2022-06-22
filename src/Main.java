public class Main {
    //class shippingCosts main() num itemPrice num totalPrice output “What is the price of the item?” input itemPrice if   itemPrice >= 100 then output “Shipping is Free!” else totalPrice  = itemPrice * 1.02 output “The cost of shipping is” + totalPrice + “dollars.” end if return end class
    static double itemPrice = 500;
    static double totalPrice = 3;
    static double shippingCost = 1;
            

    public static void main(String[] args) {

        if (itemPrice >= 100) {
            System.out.println("Shipping is free!");
        }
        else {
            shippingCost = itemPrice * 0.02;
            totalPrice = itemPrice * 1.02;
            System.out.println("The cost of shipping is " + shippingCost + " dollars.");
            System.out.println("The total cost with shipping is " + totalPrice + " dollars.");
        }

    }
}