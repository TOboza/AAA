public class BussinessAccount extends  Account{
String nip;
String regon;

    @Override
    public void openAccount(String name, String surname, String accountNo) {
        throw new RuntimeException("Nie można utworzyć konta Firmowego bez Regonu i NIPu.");
    }

    public void openAccount(String name, String surname, String accountNo, String NIP, String REGON) {
        super.openAccount(name,surname,accountNo);
        this.nip=NIP;
        this.regon=REGON;
        this.typeOfAccount = TypeOfAccount.BUSINESS;

    }
}
