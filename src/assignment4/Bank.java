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

    float savingInterrest=5.8f;
    float fixedDesposit=8.0f;

    public void welcome(){
        System.out.println("welcome to ICCI Bank");
    }
    public void thank(){
        System.out.println("visit ICCI Bank again");
    }
    public void getSavingsInterestRate(){

        System.out.println("Saving Interestrate"+savingInterrest);
    }

    @Override
    public void getFixedDepositInterestRate() {
        System.out.println("FixedDepositInterestRate "+fixedDesposit);
    }
}

class KotMBank extends   GeneralBank{

    float savingInterrest=6.0f;
    float fixedDesposit=9.0f;

    public void welcome(){
        System.out.println("welcome to KotmBank Bank");
    }
    public void thank(){
        System.out.println("visit KoTmBank Bank again");
    }


    public void getSavingsInterestRate(){
        System.out.println("Saving Interestrate"+savingInterrest);
    }

    @Override
    public void getFixedDepositInterestRate() {
        System.out.println("FixedDepositInterestRate"+fixedDesposit);
    }

}

class BankDetails{
    public static void main(String[] args) {
        ICICIBank i=new ICICIBank();
        KotMBank k=new KotMBank();
        GeneralBank gu=new KotMBank();
         GeneralBank g=new ICICIBank();

         i.getFixedDepositInterestRate();
         g.getSavingsInterestRate();

    }

}
