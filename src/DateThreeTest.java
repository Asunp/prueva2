/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */

public class DateThreeTest {
  public static void main(String args[]){
      
      DateThree date = new DateThree();
      date.setMonth(10);
      date.setDay(16);
      date.setYear(2011);
     
      
      System.out.println("The date is: " + date.getMonth() + "/" + date.getDay() + "/" + date.getYear());

  } // end main
} // end class
