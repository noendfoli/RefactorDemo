package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (isAged_brieOrBackstage(items[i])) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    itemQualitySmallThan50(i);
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            sellInSmallThan0(items[i]);
        }
    }

    private void sellInSmallThan0(Item item) {
        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                itemNameNotEqualsBackstage(item);
            } else {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
            }
        }
    }

    private void itemNameNotEqualsBackstage(Item item) {
        if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (item.quality > 0) {
                if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                    item.quality = item.quality - 1;
                }
            }
        } else {
            item.quality = item.quality - item.quality;
        }
    }

    private void itemQualitySmallThan50(int i) {
        items[i].quality = items[i].quality + 1;

        if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            itemNameEqualsBacksage(items[i]);
        }
    }

    private void itemNameEqualsBacksage(Item item) {
        if (item.sellIn < 11) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }

        if (item.sellIn < 6) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
    }

    private boolean isAged_brieOrBackstage(Item item) {
        return !item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert");
    }
}