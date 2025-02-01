class BankAccount{
    String accountNumber;
    String accountHolderName;
    double balance=0;
    void displayBalance(){
        System.out.println("BALANCE : "+this.balance);
    }
void deposit(double m){
    System.out.println(m+ " deposited in your account  ........");
    this.balance +=m;
}
void withdraw(double m){
    System.out.println(m+ " withdrawed from your account  ........");
    this.balance -=m;
}

}
public class banking {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountHolderName="Animesh Samantaray";
        b.accountNumber="T202312651";
        b.deposit(900087.9908);
        b.withdraw(1238.7789);
        b.displayBalance(); 
    }
}
