public class PrivateAccount extends Account {

    public String toString() {
        return super.toString();
    }

    public void openAccount(String name,String surname,String accountNo) {
        super.openAccount(name,surname,accountNo);
        this.typeOfAccount = TypeOfAccount.PRIVATE;

    }

    @Override
    public void remmitance(double income) {
        super.remmitance(income);
    }

    @Override
    public void paycheck(double withdraw) {
        super.paycheck(withdraw);
    }

    @Override
    public TypeOfAccount getTypeOfAccount() {
        return super.getTypeOfAccount();
    }

    @Override
    public double getAccountBallance() {
        return super.getAccountBallance();
    }
}
