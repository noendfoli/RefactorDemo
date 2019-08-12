package gildedRose;

public class OtherStrategy extends ChangeStrategy {
    @Override
    void changeItem(Item item) {
        whenItemQualityGreatThan0(item);
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            whenItemQualityGreatThan0(item);
        }
    }

}
