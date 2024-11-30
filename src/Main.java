public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int amount = 3076;
        int finalBalance = balance + amount;

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int result = finalBalance + bonus;

        System.out.println("Количество бонусных рублей : " + bonus + " рублей");
        System.out.println("Итоговая сумма на счету : " + result + " рублей");
    }
}

