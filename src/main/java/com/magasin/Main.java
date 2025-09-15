/**
 * Sauvegarde du goldenMaster
 */

package com.magasin;

public class Main {

    public static void main(String[] args) {

        Item[] items = new Item[]{
                new Item("Lambda", 10, 0),
                new Item("Comté", 10, 0),
                new Item("Kryptonite", 10, 0),
                new Item("Pass VIP Concert", 10, 0),

                new Item("Lambda", 10, 10),
                new Item("Comté", 10, 10),
                new Item("Kryptonite", 10, 10),
                new Item("Pass VIP Concert", 10, 10),

                new Item("Lambda", 10, 20),
                new Item("Comté", 10, 20),
                new Item("Kryptonite", 10, 20),
                new Item("Pass VIP Concert", 10, 20),

                new Item("Lambda", 10, 40),
                new Item("Comté", 10, 40),
                new Item("Kryptonite", 10, 40),
                new Item("Pass VIP Concert", 10, 40)};

        Magasin app = new Magasin(items);
        int[][] results = new int[items.length][15];
        int[][] sellin = new int[items.length][15];
        for (int day = 0; day < 15; day++) {
           for (int itemIndex = 0; itemIndex < items.length; itemIndex++) {
                results[itemIndex][day] = app.items[itemIndex].quality;
               sellin[itemIndex][day] = app.items[itemIndex].sellIn;
           }
           app.updateQuality();
        }


        System.out.println("\n\n Evolution de la qualité");
        System.out.printf("%-15s", "Jours");
        for (int day = 1 ; day < 16 ; day++) {
            System.out.printf("%5d", day);
        }
        System.out.println();

        for (int item = 0; item < items.length; item++) {
            if (item % 4 == 0) System.out.println("");
            System.out.printf("%-15s", app.items[item].name);
            for (int val : results[item]) {
                System.out.printf("%5d", val);
            }
            System.out.println();
        }
        System.out.println("\n\n Evolution du SellIn");
        System.out.printf("%-15s", "Jours");
        for (int day = 1 ; day < 16 ; day++) {
            System.out.printf("%5d", day);
        }
        System.out.println();

        for (int item = 0; item < items.length; item++) {
            if (item % 4 == 0) System.out.println("");
            System.out.printf("%-15s", app.items[item].name);
            for (int val : sellin[item]) {
                System.out.printf("%5d", val);
            }
            System.out.println();
        }


    }
}