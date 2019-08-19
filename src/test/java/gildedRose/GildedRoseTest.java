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
    public void should_return_7_given_a_normal_item_its_sellIn_is_8_quality_is_0(){
        //given
        Item[] items = {new Item("Noraml",8,0)};
        GildedRose gildedRose = new GildedRose(items);

        //when
        gildedRose.updateQuality();

        //then
        Assert.assertEquals(7,items[0].sellIn);
    }

}