package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            item.sellIn--;

            switch (item.name) {
                case "Kryptonite":
                    item.sellIn++;
                    break;
                case "Comté":
                    item.quality++;
                    //if (item.sellIn < 0) item.quality++;
                    break;
                case "Pass VIP Concert":
                    item.quality++;
                    if (item.sellIn < 10) item.quality++;
                    if (item.sellIn < 5) item.quality++;
                    if (item.sellIn < 0) item.quality = 0;
                    break;
                case "Pouvoirs Magiques":
                    item.quality -= 2;
                    if (item.sellIn < 0) item.quality -= 2;
                    break;
                default:
                    item.quality--;
                    if (item.sellIn < 0) item.quality--;
            }

            if (item.quality < 0) item.quality = 0;
            if (item.quality > 50) item.quality = 50;
        }
    }
}