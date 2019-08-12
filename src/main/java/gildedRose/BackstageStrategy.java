package gildedRose;

public class BackstageStrategy extends ChangeStrategy {
    @Override
    void changeItem(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.sellIn < 11) {
                whenItemQualitySmallThan50(item);
            }

            if (item.sellIn < 6) {
                whenItemQualitySmallThan50(item);
            }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }

    private void whenItemQualitySmallThan50(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
