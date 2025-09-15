package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Kryptonite")) continue;

            if (item.name.equals("Comté") || item.name.equals("Pass VIP Concert")) {

                if (item.quality < 50) {
                    item.quality++;

                    if (item.name.equals("Pass VIP Concert")) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.quality++;
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.quality++;
                            }
                        }
                    }
                }
            } else {
                if (item.quality > 0) {
                    item.quality--;
                }
            }
            item.sellIn = item.sellIn - 1;

            if (item.sellIn < 0) {
                if (item.name.equals("Comté") && item.quality < 50)
                    item.quality++;
                else {
                    if (item.name.equals("Pass VIP Concert")) {
                        item.quality = 0;
                    } else if (item.quality > 0)
                        item.quality--;

                }
            }
        }
    }
}