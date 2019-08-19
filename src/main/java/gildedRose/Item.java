package gildedRose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    private ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
        setItemStrategy(name);
        this.name = name;
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

    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
