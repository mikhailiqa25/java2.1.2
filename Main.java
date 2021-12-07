public class Main {
    public static void main(String[] args) {
        // Текущее количество денег на Клиентском счете в руб.
        int curentclientaccount = 100;
        // Стоимость одного бонусного рубля в руб.
        int bonusprise = 100;
        // Количество внесенный на клинентский счет денег в руб.
        int addmoney = 1100;
        // Условие для получения бонусных рублей (если счёт будет пополнет более чем на 1000 руб.)
        if (addmoney > 1000) {
            System.out.println("балланс пополнен на");
            System.out.println(addmoney);
            System.out.println("начисленные бонусные рубли");
            System.out.println (addmoney / bonusprise);
            System.out.println ("текущий балланс");
            System.out.println (addmoney / bonusprise + curentclientaccount + addmoney);
        } else {
            // Условие пополнения счета (если счёт будет пополнет менее чем на 1000 руб.)
            System.out.println("балланс пополнен на");
            System.out.println(addmoney);
            System.out.println("текущий балланс");
            System.out.println(curentclientaccount + addmoney);
        }
            }
}