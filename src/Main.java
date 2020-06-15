public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNum(5);
        bankAccount.changeCount();
        System.out.println(BankAccount.count);

        System.out.println(bankAccount.getAccountNum());

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAccountNum(6);
        bankAccount1.changeCount();
        System.out.println(bankAccount.getAccountNum()+"  "+bankAccount1.getAccountNum());
        System.out.println(BankAccount.count);
        //hey this is weird
    }
}
