import java.util.Date;

public class Main {
    public static void main(String[] args){
        Date date = new Date();
        String str = String.format("%tc", date);
        long balanceClient = 2_000_000_000;
        long transferAmount = 500_000_000;
        long totalBalance = balanceClient + transferAmount;
        System.out.printf("итоговый баланс на" + ' ' + str + ' ' + "составляет"+ ' ' + totalBalance);

    }
}
