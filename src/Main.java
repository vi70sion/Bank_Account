import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Banko sąskaitos:
//        1 Sukurti interface 'Calculatable':
//        turi vieną abstraktų metoda 'calculateInterest', kuris gražina
//        double reikšmes. Parametrai nepaduodami.
//
//        2 Sukurti interface 'Account', kuris paveldi iš 'Calculatable'
//
//        3 Sukurti abstrakčią klasę 'BankAccount':
//        Ši klasė implementuoja sąsają 'Account'
//        Privadus laukas double 'balance'
//        Konstruktorius, kuris priima ir paduoda reikšmę fildui 'balance'
//        Sukurti getter ir setter.
//        Perrašyti metodą toString()
//
//        4 Skurti klasę 'SavingsAccount'
//        Ši klasė paveldi iš klasės 'BankAccount'
//        Vienas laukas double 'interstRate'
//        Suskurti konstrukturiu, kuriam reikia paduoti reikšmes:
//        'balance' ir 'interestRate'
//        Sukurti getter ir setter.
//        Perrašo metotą 'calculateInterest', t.y. kiek uždirbs iš palūkanų
//
//        5 Sukurti klasę 'CheckingAccount'
//        Ši klasė paveldi iš klasės 'BankAccount'
//        Vienas laukas double 'transactionFee'
//        Suskurti konstrukturiu, kuris paduoda reikšmes visiems laukams
//        Sukurti getter ir setter.
//        Ši sąskaita neskaičiuoją plaūkanų, todel gražna 0.
//
//        6 Kuriame objektus ir atliekame vesiksmus:
//        Sukurti List'a 'accounts'
//        Sukurti tris objektus iš klasės 'SavingsAccount' ir pridėti į List'a
//        Sukurti tris objektus iš klasės 'CheckingAccount' ir pridėti į List'a
//        Iteruoti per List'ą suskaičiuoti ir atspausdinti, kiek kivena sąskaita
//        uždirbs palūkanų.

        List<Account> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(1000.00, 4.00));
        accounts.add(new SavingsAccount(500.00, 5.00));
        accounts.add(new SavingsAccount(5000.00, 3.50));

        accounts.add(new CheckingAccount(500.00, 1.00));
        accounts.add(new CheckingAccount(1800.00, 1.00));
        accounts.add(new CheckingAccount(2500.00, 1.00));

        for(Account item : accounts){
            System.out.println(item.calculateInterest());
        }

    }
}