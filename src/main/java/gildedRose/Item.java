package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    private ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
    public void updateQuality(){
        if (name.equals("Aged Brie")) {
           itemStrategy = new AgedBrieItemStrategy();
        } else if(name.equals("Backstage passes to a TAFKAL80ETC concert")){
            itemStrategy = new BackstageItemStrategy();
        }else if(name.equals("Sulfuras, Hand of Ragnaros")){
            itemStrategy = new SulfurasItemStrategy();
        }else {
            itemStrategy = new NormalItemStrategy();
        }
        itemStrategy.updateQuality(this);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
