package challenges;

import challenges.bank.AccountType;
import challenges.bank.BankAccount;
import challenges.bank.BankCustomer;

import java.util.List;

public class ChallengeMain {

    public static void main(String[] args) {

//        BankAccount account = new BankAccount(AccountType.CHECKING, 500);
//        System.out.println(account);
//        CHECKING $500,00

        BankCustomer joe = new BankCustomer("Joe", 500.00, 10_000.00);
        System.out.println(joe);
//        Customer: Joe (id:000000010000000)
//        CHECKING $500,00
//        SAVINGS $10000,00

        List<BankAccount> accounts = joe.getAccounts();
        accounts.clear();
        System.out.println(joe);
//        Customer: Joe (id:000000010000000) → not good

        accounts.add(new BankAccount(AccountType.CHECKING, 15_000));
        System.out.println(joe);
//        Customer: Joe (id:000000010000000)
//        CHECKING $15000,00    → wrong



//        After the key added:
//        Customer: Joe (id:000000010000000)
//        CHECKING $500,00
//        SAVINGS $10000,00
//
//        Customer: Joe (id:000000010000000)
//        CHECKING $500,00
//        SAVINGS $10000,00
//
//        Customer: Joe (id:000000010000000)
//        CHECKING $500,00
//        SAVINGS $10000,00
    }
}