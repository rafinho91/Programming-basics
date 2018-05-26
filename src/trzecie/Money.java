package trzecie;

public class Money {
    public static void main(String[] args) {
        double moneyDouble = 1765.54;
        int money = (int)(moneyDouble * 100);
        System.out.println(moneyDouble + " zl");
        System.out.println("----------");
        payMoney(money);
    }

    private static void payMoney(double money) {
        final int[] billons = {20000,10000,5000,2000,1000,500,100,50,20,10,5,2,1};
        int i = 0;
        while (i<billons.length && money != 0){
            int j = 0;
            while(money >= billons[i]){
                money = money - billons[i];
                j++;
            }
            if (j>0) {
                printMoney(billons[i], j);
            }
            i++;
        }

    }

    private static void printMoney(int billon, int j) {
        if (billon > 100) {
            System.out.println(j + " x " + billon / 100 + " zl");
        }else{
            System.out.println(j + " x " + billon + " gr");
        }
    }
}
