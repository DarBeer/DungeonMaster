package helper;

import entity.Armour;
import entity.Item;
import entity.Room;
import entity.Weapon;

public enum ItemTypeEnum implements TypeEnum {
    WEAPON(new Weapon()),
    ARMOUR(new Armour());

    private final Item item;

    ItemTypeEnum(Item item) {
        this.item = item;
    }

    @Override
    public String getTypeName() {
        return item.getClass().getTypeName();
    }

    public static Item getByTypeName(String typeName) {
        for (ItemTypeEnum itemType : ItemTypeEnum.values()) {
            if (itemType.getTypeName().equals(typeName)) {
                return itemType.item;
            }
        }
        throw new NullPointerException("Сущности предмета с таким названием не существует.");
    }
}
