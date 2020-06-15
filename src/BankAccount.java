public class BankAccount {
    private long accountNum;
    public static int count;

    public long getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(long accountNum) {
        this.accountNum = accountNum;
    }

    public void changeCount(){
        count+=2;
    }
}