package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Kryptonite")) continue;

            item.sellIn--;

            if (item.name.equals("Comté") || item.name.equals("Pass VIP Concert")) {

                if (item.quality < 50) {
                    item.quality++;

                    if (item.name.equals("Pass VIP Concert")) {

                        if (item.sellIn < 10 && item.quality < 50)
                            item.quality++;

                        if (item.sellIn < 5 && item.quality < 50)
                            item.quality++;
                    }
                }
            } else item.quality--;


            if (item.sellIn < 0) {

                if (item.name.equals("Pass VIP Concert"))
                    item.quality = 0;

                if (item.name.equals("Comté") && item.quality < 50)
                    item.quality++;

                else item.quality--;
            }

            if (item.quality < 0) item.quality = 0;
        }
    }
}