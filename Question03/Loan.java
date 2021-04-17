/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question03;

/**
 *
 * @author Bala Shankar Malladi
 */
public class Loan {
    double interest;
    int amount;

    public Loan(double interest, int amount) {
        this.interest = interest;
        this.amount = amount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double calcAmount(){
    return amount*interest;
    }

    @Override
    public String toString() {
        return "Calculated loan amount is " + interest ;
    }
    
}
