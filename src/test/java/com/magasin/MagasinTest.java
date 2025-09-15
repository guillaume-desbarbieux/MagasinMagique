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
        @DisplayName("Testing for sellIn = 0 and quality = 10")
        class testingForSellIn0AndQuality10 {
        
            // GIVEN
            int sellin = 0;
            int quality = 10;
        
            @Test
            @DisplayName("Testing for sellIn = 0 and quality = 10 For Lambda")
            void testingForSellIn0AndQuality10ForLambda() {
        
                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);
        
                // WHEN
                app.updateQuality();
        
                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;
        
                save.saveText("\nTesting for sellIn = 0 and quality = 10");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);
        
                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals( - 1, app.items[0].sellIn);
                    assertEquals(7, app.items[0].quality);
                });
            }
        
            @Test
            @DisplayName("Testing for sellIn = 0 and quality = 10 For Comté")
            void testingForSellIn0AndQuality10ForComté() {
        
                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);
        
                // WHEN
                app.updateQuality();
        
                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;
        
                save.saveText("\nTesting for sellIn = 0 and quality = 10");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);
        
                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals( - 1, app.items[0].sellIn);
                    assertEquals(12, app.items[0].quality);
                });
            }
        
            @Test
            @DisplayName("Testing for sellIn = 0 and quality = 10 For Kryptonite")
            void testingForSellIn0AndQuality10ForKryptonite() {
        
                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);
        
                // WHEN
                app.updateQuality();
        
                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;
        
                save.saveText("\nTesting for sellIn = 0 and quality = 10");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);
                
                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(0, app.items[0].sellIn);
                    assertEquals(10, app.items[0].quality);
                });
            }
        
            @Test
            @DisplayName("Testing for sellIn = 0 and quality = 10 For Pass VIP Concert")
            void testingForSellIn0AndQuality10ForPassVIPConcert() {
        
                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);
        
                // WHEN
                app.updateQuality();
        
                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;
        
                save.saveText("\nTesting for sellIn = 0 and quality = 10");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);
                
                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(- 1, app.items[0].sellIn);
                    assertEquals(0, app.items[0].quality);
                });
            }
        }

        @Nested
        @DisplayName("Testing for sellIn = 13 and quality = 30")
        class testingForSellIn13AndQuality30 {

            // GIVEN
            int sellin = 13;
            int quality = 30;

            @Test
            @DisplayName("Testing for sellIn = 13 and quality = 30 For Lambda")
            void testingForSellIn13AndQuality30ForLambda() {

                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 13 and quality = 30");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals(12, app.items[0].sellIn);
                    assertEquals(29, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 13 and quality = 30 For Comté")
            void testingForSellIn13AndQuality30ForComté() {

                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 13 and quality = 30");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals(12, app.items[0].sellIn);
                    assertEquals(31, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 13 and quality = 30 For Kryptonite")
            void testingForSellIn13AndQuality30ForKryptonite() {

                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 13 and quality = 30");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(13, app.items[0].sellIn);
                    assertEquals(30, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 13 and quality = 30 For Pass VIP Concert")
            void testingForSellIn13AndQuality30ForPassVIPConcert() {

                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 13 and quality = 30");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(12, app.items[0].sellIn);
                    assertEquals(31, app.items[0].quality);
                });
            }
        }

        @Nested
        @DisplayName("Testing for sellIn = 10 and quality = 0")
        class testingForSellIn10AndQuality0 {

            // GIVEN
            int sellin = 10;
            int quality = 0;

            @Test
            @DisplayName("Testing for sellIn = 10 and quality = 0 For Lambda")
            void testingForSellIn10AndQuality0ForLambda() {

                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 10 and quality = 0");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals(9, app.items[0].sellIn);
                    assertEquals(0, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 10 and quality = 0 For Comté")
            void testingForSellIn10AndQuality0ForComté() {

                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 10 and quality = 0");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals(9, app.items[0].sellIn);
                    assertEquals(1, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 10 and quality = 0 For Kryptonite")
            void testingForSellIn10AndQuality0ForKryptonite() {

                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 10 and quality = 0");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(10, app.items[0].sellIn);
                    assertEquals(0, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 10 and quality = 0 For Pass VIP Concert")
            void testingForSellIn10AndQuality0ForPassVIPConcert() {

                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 10 and quality = 0");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(9, app.items[0].sellIn);
                    assertEquals(2, app.items[0].quality);
                });
            }
        }

        @Nested
        @DisplayName("Testing for sellIn = 5 and quality = 20")
        class testingForSellIn5AndQuality20 {

            // GIVEN
            int sellin = 5;
            int quality = 20;

            @Test
            @DisplayName("Testing for sellIn = 5 and quality = 20 For Lambda")
            void testingForSellIn5AndQuality20ForLambda() {

                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 5 and quality = 20");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals(4, app.items[0].sellIn);
                    assertEquals(19, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 5 and quality = 20 For Comté")
            void testingForSellIn5AndQuality20ForComté() {

                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 5 and quality = 20");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals(4, app.items[0].sellIn);
                    assertEquals(21, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 5 and quality = 20 For Kryptonite")
            void testingForSellIn5AndQuality20ForKryptonite() {

                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 5 and quality = 20");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(5, app.items[0].sellIn);
                    assertEquals(20, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 5 and quality = 20 For Pass VIP Concert")
            void testingForSellIn5AndQuality20ForPassVIPConcert() {

                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 5 and quality = 20");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(4, app.items[0].sellIn);
                    assertEquals(23, app.items[0].quality);
                });
            }
        }

        @Nested
        @DisplayName("Testinf for max quality = 60")
        class testinfForMaxQuality60 {

            // GIVEN
            int sellin = 1;
            int quality = 60;

            @Test
            @DisplayName("Testinf for max quality = 60 For Lambda")
            void testinfForMaxQuality60ForLambda() {

                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTestinf for max quality = 60");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals(0, app.items[0].sellIn);
                    assertEquals(59, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testinf for max quality = 60 For Comté")
            void testinfForMaxQuality60ForComté() {

                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTestinf for max quality = 60");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals(0, app.items[0].sellIn);
                    assertEquals(60, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for max quality = 60 For Kryptonite")
            void testinfForMaxQuality60ForKryptonite() {

                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTestinf for max quality = 60");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(1, app.items[0].sellIn);
                    assertEquals(60, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testinf for max quality = 60 For Pass VIP Concert")
            void testinfForMaxQuality60ForPassVIPConcert() {

                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTestinf for max quality = 60");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(0, app.items[0].sellIn);
                    assertEquals(60, app.items[0].quality);
                });
            }
        }

        @Nested
        @DisplayName("Testing for sellIn = 3 and quality = 49")
        class testingForSellIn3AndQuality49 {

            // GIVEN
            int sellin = 3;
            int quality = 49;

            @Test
            @DisplayName("Testing for sellIn = 3 and quality = 49 For Lambda")
            void testingForSellIn3AndQuality49ForLambda() {

                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 3 and quality = 49");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals(2, app.items[0].sellIn);
                    assertEquals(48, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 3 and quality = 49 For Comté")
            void testingForSellIn3AndQuality49ForComté() {

                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 3 and quality = 49");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals(2, app.items[0].sellIn);
                    assertEquals(50, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 3 and quality = 49 For Kryptonite")
            void testingForSellIn3AndQuality49ForKryptonite() {

                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 3 and quality = 49");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(3, app.items[0].sellIn);
                    assertEquals(49, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 3 and quality = 49 For Pass VIP Concert")
            void testingForSellIn3AndQuality49ForPassVIPConcert() {

                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 3 and quality = 49");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(2, app.items[0].sellIn);
                    assertEquals(50, app.items[0].quality);
                });
            }
        }

        @Nested
        @DisplayName("Testing for sellIn = -5 and quality = 25")
        class testingForSellIn5AndQuality25 {

            // GIVEN
            int sellin = -5;
            int quality = 25;

            @Test
            @DisplayName("Testing for sellIn = -5 and quality = 25 For Lambda")
            void testingForSellIn5AndQuality25ForLambda() {

                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = -5 and quality = 25");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals(-6, app.items[0].sellIn);
                    assertEquals(23, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = -5 and quality = 25 For Comté")
            void testingForSellIn5AndQuality25ForComté() {

                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = -5 and quality = 25");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals(-6, app.items[0].sellIn);
                    assertEquals(27, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = -5 and quality = 25 For Kryptonite")
            void testingForSellIn5AndQuality25ForKryptonite() {

                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = -5 and quality = 25");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(-5, app.items[0].sellIn);
                    assertEquals(25, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = -5 and quality = 25 For Pass VIP Concert")
            void testingForSellIn5AndQuality25ForPassVIPConcert() {

                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = -5 and quality = 25");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(-6, app.items[0].sellIn);
                    assertEquals(0, app.items[0].quality);
                });
            }
        }

        @Nested
        @DisplayName("Testing for sellIn = 5 and quality = -3")
        class testingForSellIn5AndQuality3 {

            // GIVEN
            int sellin = 5;
            int quality = -3;

            @Test
            @DisplayName("Testing for sellIn = 5 and quality = -3 For Lambda")
            void testingForSellIn5AndQuality3ForLambda() {

                // GIVEN
                Item[] items = new Item[]{new Item("Lambda", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 5 and quality = -3");
                save.saveText("Param : name Lambda, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Lambda, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Lambda", app.items[0].name);
                    assertEquals(4, app.items[0].sellIn);
                    assertEquals(-3, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 5 and quality = -3 For Comté")
            void testingForSellIn5AndQuality3ForComté() {

                // GIVEN
                Item[] items = new Item[]{new Item("Comté", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 5 and quality = -3");
                save.saveText("Param : name Comté, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Comté, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Comté", app.items[0].name);
                    assertEquals(4, app.items[0].sellIn);
                    assertEquals(-2, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 5 and quality = -3 For Kryptonite")
            void testingForSellIn5AndQuality3ForKryptonite() {

                // GIVEN
                Item[] items = new Item[]{new Item("Kryptonite", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 5 and quality = -3");
                save.saveText("Param : name Kryptonite, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Kryptonite, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Kryptonite", app.items[0].name);
                    assertEquals(5, app.items[0].sellIn);
                    assertEquals(-3, app.items[0].quality);
                });
            }

            @Test
            @DisplayName("Testing for sellIn = 5 and quality = -3 For Pass VIP Concert")
            void testingForSellIn5AndQuality3ForPassVIPConcert() {

                // GIVEN
                Item[] items = new Item[]{new Item("Pass VIP Concert", sellin, quality)};
                Magasin app = new Magasin(items);

                // WHEN
                app.updateQuality();

                String name = app.items[0].name;
                int newSellin = app.items[0].sellIn;
                int newQuality = app.items[0].quality;

                save.saveText("\nTesting for sellIn = 5 and quality = -3");
                save.saveText("Param : name Pass VIP Concert, sellin " + sellin + ", quality " + quality);
                save.saveText("Result : name Pass VIP Concert, sellin " + newSellin + ", quality " + newQuality);

                // THEN
                assertAll(() -> {
                    assertEquals("Pass VIP Concert", app.items[0].name);
                    assertEquals(4, app.items[0].sellIn);
                    assertEquals(0, app.items[0].quality);
                });
            }
        }
    }
}
