package gildedRose;

public class SulfurasStrategy extends ChangeStrategy {
    @Override
    void changeItem(Item item) {
        whenItemQualityGreatThan0(item);
        if (item.sellIn < 0) {
            whenItemQualityGreatThan0(item);
        }
    }

}

