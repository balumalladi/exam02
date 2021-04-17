/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question07;

/**
 *
 * @author Bala Shankar Malladi
 */
public enum Bike {
  AVENGER(2000),KAWASAKI(3000),NINJA(4000);
   public int price;

    private Bike(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
   
}
