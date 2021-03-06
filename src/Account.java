public abstract class Account {
    protected String accountNo;
    protected String name;
    protected String surname;
    protected boolean isOpen;
    protected double accountBalance;
    public enum TypeOfAccount {
        PRIVATE,
        BUSINESS;
    }
    protected TypeOfAccount typeOfAccount;

    public void openAccount(String name,String surname,String accountNo) {
        this.name = name;
        this.surname=surname;
        this.accountNo= accountNo;
        this.accountBalance = 0;
        this.isOpen = true;
            }

    public void remmitance(double income ){
        this.accountBalance += income;
    }
    public void paycheck(double withdraw){
        this.accountBalance -= withdraw;
    }
    public TypeOfAccount getTypeOfAccount(){
         return typeOfAccount;
     }

    public double getAccountBallance() {
        return accountBalance;
    }

    public String toString(){
        return  "Typ konta : "+typeOfAccount +"\n"+
                "Numer konta : "+accountNo+"\n"+
                "Saldo konta : "+accountBalance+"\n"+
                "Imię : " + name+"\n"+
                "Nazwisko  : "+surname+"\n";

     }
}
