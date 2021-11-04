import javax.swing.*;
import java.text.DecimalFormat;

public class WidgetFactory {

    /*
    Lessons L1 - L3

    You have been asked by the manager of the Widget Factory to create a program which will tell how many days it will take to produce a number of widgets.
    It should also output the cost of the widgets, the cost to produce the widget and the profit.

    Specific Details:
     - 10 Widgets are made each hour
     - Plant runs 2 shifts of 8 hours a day, requiring 5 workers a shift ( 1 shift is 8 hours and 5 workers are working)
     - each worker makes $16.50 an hour
     - each widget sells for $10

     Programming Details:
     - prompt the user for the number of widgets using pop-up boxes
     - display # of widgets, # of days, Cost of production, Cost of widgets and profit
     - 2 or more (preferably more) methods - at least 1 to calculate # of day and one to calculate production costs
     - only WHOLE number of days, no half or partial days.
     - Output should be in proper currency form

     Example Run:

     Number of Widgets: 1000
     # of Days: 7
     Cost of Widgets: $10,000.00 = (# of widgets * $10)
     Cost of Production: $9,240.00 = ( 16.50 * 8 hours * 5 workers * 2 shifts * number of days)
     Profit: $760.00 (Cost of widgets - Cost of production)

     */
    static double pay = 16.50;
    static double costWidgets = 10.00;
    static int shifts = 2;
    static int workers = 5;
    static int hours = 8;


    public static void main(String[] args) {
        DecimalFormat round = new DecimalFormat("$#,###.00");

        int days = Integer.parseInt(JOptionPane.showInputDialog("How many days did you work?"));
        int numWidgets = Integer.parseInt(JOptionPane.showInputDialog("What is the number of widgets?"));

        double totalWidgetsCost = widgetsCost(costWidgets, numWidgets);

        double totalProductCost = productCost(days, pay, shifts, workers, hours);

        double profit = totalWidgetsCost - totalProductCost;

        JOptionPane.showMessageDialog(null, " The number of widgets is: " + numWidgets + "\nThe number of days is: " + days + "\nThe Cost of Widgets is: " + round.format(totalWidgetsCost) + "\nThe Cost of Production is: " + round.format(totalProductCost) + "\nThe total profit for ALL OF THIS issssssss: " + round.format(profit));



        System.exit(0);
    }

    public static double widgetsCost(double costWidgets, double numWidgets){

        return costWidgets * numWidgets;


    }

    public static double productCost(double days, double pay, int shifts, int workers, int hours){

        return days * pay * shifts * workers * hours;
    }


















}
