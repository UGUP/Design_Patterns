import thirdParty.icciBankApi;

public class ICCIBankAPIAdapter implements BankAPIAdapter {

    private icciBankApi iccibankapi = new icciBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }

}
