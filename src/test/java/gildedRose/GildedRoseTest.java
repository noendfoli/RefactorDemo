package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {


    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_Aged_Brie_quality_is_49_sell_in_is_1() {
        //given
        Item item = new Item("Aged Brie",1,49);
        Item[] items = new Item[1];
        int quality = 50;
        int sellIn = 0;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }

    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_Aged_Brie_quality_is_50_sell_in_is_1() {
        //given
        Item item = new Item("Aged Brie",1,50);
        Item[] items = new Item[1];
        int quality = 50;
        int sellIn = 0;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }

    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_Aged_Brie_quality_is_48_sell_in_is_0() {
        //given
        Item item = new Item("Aged Brie",0,48);
        Item[] items = new Item[1];
        int quality = 50;
        int sellIn = -1;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }

    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_Aged_Brie_quality_is_49_sell_in_is_0() {
        //given
        Item item = new Item("Aged Brie",1,49);
        Item[] items = new Item[1];
        int quality = 50;
        int sellIn = 0;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }

    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_Backstage_quality_is_49_sell_in_is_1() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",1,49);
        Item[] items = new Item[1];
        int quality = 50;
        int sellIn = 0;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }

    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_Backstage_quality_is_48_sell_in_is_1() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",1,48);
        Item[] items = new Item[1];
        int quality = 50;
        int sellIn = 0;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }

    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_Backstage_quality_is_47_sell_in_is_1() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",1,47);
        Item[] items = new Item[1];
        int quality = 50;
        int sellIn = 0;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }

    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_Backstage_quality_is_49_sell_in_is_0() {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",0,49);
        Item[] items = new Item[1];
        int quality = 0;
        int sellIn = -1;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }

    @Test
    public void should_change_correct_gilded_rose_items_length_is_one_and_item_name_is_xxx_is_50_sell_in_is_0() {
        //given
        Item item = new Item("xxx",0,50);
        Item[] items = new Item[1];
        int quality = 48;
        int sellIn = -1;
        items[0] = item;
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        assertEquals(quality,gildedRose.items[0].quality);
        assertEquals(sellIn,gildedRose.items[0].sellIn);

    }
}