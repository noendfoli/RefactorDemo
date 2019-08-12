package gildedRose;

public class SulfurasStrategy extends ChangeStrategy {
    @Override
    void changeItem(Item item) {
        whenItemQualitySmallThan0(item);
        if (item.sellIn < 0) {
            whenItemQualitySmallThan0(item);
        }
    }

    private void whenItemQualitySmallThan0(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
