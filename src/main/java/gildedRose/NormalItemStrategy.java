package gildedRose;

public class NormalItemStrategy extends ItemStrategy {
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality()-1);
        }
        item.setSellIn(item.getSellIn()-1);
        if (item.getSellIn() < 0) {
            if (item.getQuality() > 0) {
                item.setQuality(item.getQuality()-1);
            }
        }
    }
}
