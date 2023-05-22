package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// This is the adapter class
public class BankCustomer extends BankDetails implements CreditCard {

    public void giveBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter account holder name:");
            String customerName = br.readLine();
            System.out.println("\n");

            System.out.print("Enter the account number:");
            long accNumber = Long.parseLong(br.readLine());
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankName = br.readLine();

            setAccHolderName(customerName);
            setAccNumber(accNumber);
            setBankName(bankName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreditCard() {
        long accNumber = getAccNumber();
        String accHolderName = getAccHolderName();
        String bName = getBankName();
        return ("The Account number " + accNumber + " of " + accHolderName + " in " + bName + " " +
                "bank is valid and authenticated for issuing the credit card. ");
    }
}
