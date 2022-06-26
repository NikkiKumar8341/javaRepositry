package assignment4;

public interface Bank {
    void welcome();
    void thank();
}

abstract class GeneralBank implements Bank{
    abstract void getSavingsInterestRate();
    abstract void getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{

    public void welcome(){
        System.out.println("welcome to ICCI Bank");
    }
    public void thank(){
        System.out.println("visit ICCI Bank again");
    }
    public void getSavingsInterestRate(){
        System.out.println("Saving Interestrate"+4.0);
    }

    @Override
    public void getFixedDepositInterestRate() {
        System.out.println("FixedDepositInterestRate "+8.5);
    }
}

class KotMBank extends   GeneralBank{

    public void welcome(){
        System.out.println("welcome to KotmBank Bank");
    }
    public void thank(){
        System.out.println("visit KoTmBank Bank again");
    }


    public void getSavingsInterestRate(){
        System.out.println("Saving Interestrate"+6.0);
    }

    @Override
    public void getFixedDepositInterestRate() {
        System.out.println("FixedDepositInterestRate"+9);
    }

}

class BankDetails{
    public static void main(String[] args) {
        ICICIBank i=new ICICIBank();
        i.getFixedDepositInterestRate();

    }

}
