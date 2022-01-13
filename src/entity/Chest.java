package entity;

import helper.ItemTypeEnum;
import util.TypeEnumRandomizer;

public class Chest {
    private final Item item;

    public Item getItem() {
        return item;
    }

    public Chest() {
        item = ItemTypeEnum.getByTypeName(TypeEnumRandomizer.randomize(ItemTypeEnum.class).getTypeName());
    }
}
