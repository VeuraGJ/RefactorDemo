package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_9_given_a_normal_item_its_sellIn_is_8_quality_is_10(){
        //given
        Item[] items = {new Item("Noraml",8,10)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(9,items[0].quality);
    }


    @Test
    public void should_return_0_given_a_normal_item_its_sellIn_is_8_quality_is_0(){
        //given
        Item[] items = {new Item("Noraml",8,0)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(0,items[0].quality);
    }
    @Test
    public void should_return_10_given_a_Sulfuras_item_its_sellIn_is_8_quality_is_10(){
        //given
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros",8,10)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(10,items[0].quality);
    }
    @Test
    public void should_return_8_given_a_normal_item_its_sellIn_is_0_quality_is_10(){
        //given
        Item[] items = {new Item("Noraml",0,10)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(8,items[0].quality);
    }
    @Test
    public void should_return_0_given_a_normal_item_its_sellIn_is_0_quality_is_1(){
        //given
        Item[] items = {new Item("Noraml",0,1)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(0,items[0].quality);
    }
    @Test
    public void should_return_9_given_a_normal_item_its_sellIn_is_1_quality_is_10(){
        //given
        Item[] items = {new Item("Noraml",1,10)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(9,items[0].quality);
    }
    @Test
    public void should_return_10_given_a_Sulfuras_item_its_sellIn_is_negative_1_quality_is_10(){
        //given
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros",-1,10)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(10,items[0].quality);
    }
    @Test
    public void should_return_50_given_a_Aged_Brie_item_its_sellIn_is_8_quality_is_50(){
        //given
        Item[] items = {new Item("Aged Brie",8,50)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(50,items[0].quality);
    }
    @Test
    public void should_return_50_given_a_Aged_Brie_item_its_sellIn_is_0_quality_is_50(){
        //given
        Item[] items = {new Item("Aged Brie",-1,50)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(50,items[0].quality);
    }

    @Test
    public void should_return_50_given_a_Aged_Brie_item_its_sellIn_is_8_quality_is_49(){
        //given
        Item[] items = {new Item("Aged Brie",8,49)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(50,items[0].quality);
    }
    @Test
    public void should_return_50_given_a_Aged_Brie_item_its_sellIn_is_0_quality_is_49(){
        //given
        Item[] items = {new Item("Aged Brie",0,49)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(50,items[0].quality);
    }

    @Test
    public void should_return_49_given_a_Aged_Brie_item_its_sellIn_is_0_quality_is_47(){
        //given
        Item[] items = {new Item("Aged Brie",0,47)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(49,items[0].quality);
    }

    @Test
    public void should_return_49_given_a_Backstage_item_its_sellIn_is_11_quality_is_48(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",11,48)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(49,items[0].quality);
    }
    @Test
    public void should_return_50_given_a_Backstage_item_its_sellIn_is_10_quality_is_48(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",10,48)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(50,items[0].quality);
    }
    @Test
    public void should_return_49_given_a_Backstage_item_its_sellIn_is_6_quality_is_47(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",6,47)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(49,items[0].quality);
    }
    @Test
    public void should_return_50_given_a_Backstage_item_its_sellIn_is_5_quality_is_47(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",5,47)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(50,items[0].quality);
    }

    @Test
    public void should_return_0_given_a_Backstage_item_its_sellIn_is_0_quality_is_47(){
        //given
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert",0,47)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(0,items[0].quality);
    }


}