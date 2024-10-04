package lab9;

public class BankTransaction {
    String describeTransaction(){
        return("This is a generic bank transaction");
    }
}

class DepositTransaction extends BankTransaction{
    @Override
    String  describeTransaction(){
        return "This is a deposit transaction. Adding funds to your account.";
    }
}

class WithdrawTransaction extends BankTransaction{
    @Override
    String  describeTransaction(){
        return "This is a withdrawal transaction. Taking funds from your account.";
    }
}

class BankingApplication{
    public static void main(String[] args) {
        BankTransaction bt=new BankTransaction();
        DepositTransaction dt=new DepositTransaction();
        WithdrawTransaction wt=new WithdrawTransaction();
        System.out.println(bt.describeTransaction());
        System.out.println(dt.describeTransaction());
        System.out.println(wt.describeTransaction());
    }

    
}