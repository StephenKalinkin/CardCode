/*Stephen Kalinkin
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * Name : Stephen Kalinkin
 * ID : 991604662
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        Card sixDiamonds = new Card("Diamonds",6);
        Card sevenHearts = new Card("Hearts", 7);
        nineClubs.setSuit("diamonds");
    }
}
