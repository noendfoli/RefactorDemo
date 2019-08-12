package gildedRose;

public class AgedStrategy extends ChangeStrategy {
    @Override
    void changeItem(Item item) {
        whenItemQualitySmallThan50(item);
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            whenItemQualitySmallThan50(item);
        }
    }

    private void whenItemQualitySmallThan50(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
