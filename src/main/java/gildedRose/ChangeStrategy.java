package gildedRose;

public  abstract class ChangeStrategy {
    abstract void changeItem(Item item);
    public void whenItemQualitySmallThan50(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}
