package util;

import helper.TypeEnum;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class TypeEnumRandomizer {
    public static <E extends TypeEnum> E randomize(Class<E> clazz) {
        List<Object> eTypes = null;
        try {
            eTypes = Arrays.asList((Object[]) clazz.getMethod("values").invoke(null));
        } catch (Exception e) {
            // ignore
        }
        return clazz.cast(Objects.requireNonNull(eTypes).get(new Random().nextInt(eTypes.size())));
    }
}
