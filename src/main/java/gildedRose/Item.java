package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ChangeStrategy changeStrategy;
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        if(name.equals("Aged Brie")){
            this.changeStrategy = new AgedStrategy();
        }else if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
            this.changeStrategy = new BackstageStrategy();
        }else if(name.equals("Sulfuras, Hand of Ragnaros")){
            this.changeStrategy = new SulfurasStrategy();
        }else {

        }
    }

}
