package com.magasin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void foo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Nested
    @DisplayName("GoldenMaster")
    class goldenMaster {
        Save save = new Save();

        /**
         * 
         * 
         * 
         * C'est ici que tu peux toucher !!!!
         * 
         * 
         * 
         */
        
        @Nested
        @DisplayName("Group Name")
        class groupName {
        
            // GIVEN
            int sellin = 0;
            int quality = 0;
        
            @Test
            @DisplayName("Group Name For Lambda")
            void groupNameForLambda() {
        
                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);
        
                // WHEN
                app.updateQuality();
        
                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;
        
                save.saveText("\nGroup Name");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);
        
                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals(sellin - 1, app.items[0].sellIn);
                    assertEquals(quality - 1, app.items[0].quality);
                });
            }
        
            @Test
            @DisplayName("Group Name For Comté")
            void groupNameForComté() {
        
                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);
        
                // WHEN
                app.updateQuality();
        
                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;
        
                save.saveText("\nGroup Name");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);
        
                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals(sellin - 1, app.items[0].sellIn);
                    assertEquals(quality - 1, app.items[0].quality);
                });
            }
        
            @Test
            @DisplayName("Group Name For Kryptonite")
            void groupNameForKryptonite() {
        
                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);
        
                // WHEN
                app.updateQuality();
        
                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;
        
                save.saveText("\nGroup Name");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);
                
                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(sellin - 1, app.items[0].sellIn);
                    assertEquals(quality - 1, app.items[0].quality);
                });
            }
        
            @Test
            @DisplayName("Group Name For Pass VIP Concert")
            void groupNameForPassVIPConcert() {
        
                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);
        
                // WHEN
                app.updateQuality();
        
                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;
        
                save.saveText("\nGroup Name");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);
                
                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(sellin - 1, app.items[0].sellIn);
                    assertEquals(quality - 1, app.items[0].quality);
                });
            }
        }


    }
}
