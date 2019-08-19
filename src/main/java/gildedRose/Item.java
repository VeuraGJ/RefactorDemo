package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    private ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
        setItemStrategy(name);
        this.sellIn = sellIn;
        this.quality = quality;
    }
    private void setItemStrategy(String name){
        switch (name){
            case "Aged Brie":
                itemStrategy = new AgedBrieItemStrategy();
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                itemStrategy = new BackstageItemStrategy();
                break;
            case "Sulfuras, Hand of Ragnaros":
                itemStrategy = new SulfurasItemStrategy();
                break;
            default:
                itemStrategy = new NormalItemStrategy();
        }
    }
    public void updateQuality(){
        itemStrategy.updateQuality(this);
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
