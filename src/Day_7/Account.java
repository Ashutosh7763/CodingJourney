package Day_7;

public class Account {
    public static String accountNo;
    public static long balance;

    Account(String accountNo, long balance) {
        if(accountNo==null || accountNo.isEmpty()){
            System.err.println("Account number should not be null and empty");
        }
        if(balance<0){
            System.err.println("Balance should not be negative");
        }
        this.balance = balance;
        this.accountNo = accountNo;
    }

        public static void main (String[]args){
            Account account = new Account("8859474948494", 456);
            System.out.println("Account NO. :" + Account.accountNo);
            System.out.println("Balance:" + Account.balance);

            Account account1=new Account("",87);
            Account account2=new Account("5695793598579",-567);

        }
    }
