/*
    @author David Ragipi
    @Version 2
    @date 10/2/10
    Description: This class adds and subtracts numbers and then prints all the functions that were executed
 */
public class AddingMachine {
    private int total;
    private String outputString = "0 ";
    //main method creates an addingmachine object and then performs the sample math functions and prints them
    public static void main(String[] args){
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add (4);
        myCalculator.subtract (2);
        myCalculator.add(5);
        System.out.print(myCalculator.toString());
    }
    /* initializes total to 0
     *@param none
     *@return nothing
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }
    /* returns 0
     *@param none
     *@return total
     */
    public int getTotal () {
        return total;
    }
    /* adds number to total
     *@param value:Int
     *@return nothing
     */
    public void add (int value) {
        total += value;
        outputString += "+ " + value + " ";
    }
    /* subtracts number from total
     *@param value:Int
     *@return nothing
     */
    public void subtract (int value) {
        total -= value;
        outputString += "- " + value + " ";
    }
    /* prints math functions
     *@param none
     *@return outputString
     */
    public String toString () {
        return outputString;
    }
    /* clears total and output string
     *@param none
     *@return none
     */
    public void clear() {
        outputString = "";
        total = 0;
    }
}