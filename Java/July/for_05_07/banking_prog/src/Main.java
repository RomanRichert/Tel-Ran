import ClientWithAccount.Client;
import ClientWithAccount.Account;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Допустим, вы пишите банковскую программу. У вас есть клиенты: юридические лица, физические лица, вип-клиеты.
        //У каждого клиента есть Account{String ibann, double balance}.
        // Условиями бизнеса предусмотрено, что по каждому счету начисляются проценты и после начисления клиентов информируют о балансе.
        // На счета физических лиц проценты начисляется базовый процент.
        // На счета юр.лиц начисляется процент, но при условие что остаток на счете не менее 10000.
        // На счета вип-клиетов начисляется базовый процент плюс бонус.
        // Информирование тоже осуществляется по разному:
        // юр.лица и физ.лица получают выписку письмом, вип клиеты получают письмом и емэйлом.
        //
        // Вам необходимо разработать систему классов, реализовать метод начисления и метод информирования.
        // Естественно, программа должна иметь возможность обрабатывать клиентов\счета списком.

        Client cl1 = new Client("Roman", "Richert", new Account("DE743713927400371392", 99999.99), "Private");
        Client cl2 = new Client("Anna", "Richert", new Account("DE604757916040075791", 199999.99), "VIP");
        Client cl3 = new Client("Barsick", "Richert", new Account("DE57656456595765645659", -100.01), "Private");
        Client cl33 = new Client("Barsick", "Richert", new Account("DE57656456595765645659", -100.01), "Private");
        Client cl4 = new Client("Blizzard", "Entertainment", new Account("DE33674246373367424637", 999999.99), "Entity");
        Client cl5 = new Client(null, null, new Account("DE85746799078574679907", 0.01), "Entity");
        Client cl6 = new Client("Mosya", "Richert", new Account("DE30579643583057964358", 6666.66), "VIP");
        Client cl66 = new Client("Mosya2", "Richert", new Account("DE30579643583057964358", 6666.66), "ВИП");
        Client cl7 = new Client("HV", "Meurer", new Account("DE19999601841999960184", 2048.64), "Entity");
        Client cl8 = new Client("Ralph", "Meurer", new Account(null, 524698.85), "Private");

        Set<Client> clientSet= new HashSet<>();
        clientSet.add(cl1);
        clientSet.add(cl2);
        clientSet.add(cl3);
        clientSet.add(cl33);
        clientSet.add(cl4);
        clientSet.add(cl5);
        clientSet.add(cl6);
        clientSet.add(cl66);
        clientSet.add(cl7);
        clientSet.add(cl8);




        for (Client cl: new ArrayList<>(clientSet)){
            cl.addPercentAndInform();
        }
    }


}