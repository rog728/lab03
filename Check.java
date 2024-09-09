//Rowan Gallagher, rog728@lehigh.edu
//CSE7 lab03
import java.util.Scanner; //importing the scanner
class Check //creating the class
{
    public static void main(String[] args) 
    {
        
        Scanner myScanner = new Scanner(System.in); //creating the scanner
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //prompting the user for the input
        double checkCost = myScanner.nextDouble(); //storing the next thing the user does in checkCost
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //asking what the tip percentage should be
        double tipPercent = myScanner.nextDouble(); //storing the next thing the user types in tipPercent
        tipPercent /= 100; //making tipPercent a decimal value
        System.out.print("Enter the number of people who went out to dinner: "); // Asking the number of people to divide by
        int numPeople = myScanner.nextInt(); //storing the number of people in a variable numPeople 
        double totalCost = checkCost * (1 + tipPercent); //declaring totalCost and then calculating it's value by adding the tip
        double costPerPerson = totalCost / numPeople; //declaring the costPerPerson and then finding it by dividing the cost by the amt of ppl 
        int dollars=(int)costPerPerson; //using the (int) statement to round down to the nearest the amount of dollars
        int dimes=(int)(costPerPerson * 10) % 10; //using the mod operator to return the remainder when you multiply the cost by 10 (creative)
        //you could also take the double value of the costPerPerson and then subtract the (int)costPerPerson to get the amount of change, then 
        //use the mod operator. It makes more intuitive sense to me. 
        int pennies=(int)(costPerPerson * 100) % 10; //using the mod operator to return the remainder when you multiply the cost by 100 (creative)
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);

}
}