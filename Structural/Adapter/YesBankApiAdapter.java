import thirdParty.yesBankApi;

public class YesBankApiAdapter implements  BankAPIAdapter{

    private yesBankApi yesbankapi= new yesBankApi();

    @Override
    public double getBalance(String accountNumber) {
       // String balance= yesbankapi.getBalance();
       // double balanceBalance= Double.parseDouble(balance);
        //return balance;
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
