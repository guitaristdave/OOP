package practice.lesson4;

public class JSONConvert {

    public static <T> String convertor(T obj) {

        if (obj instanceof Integer) {
            return String.format("%s", ((Integer) obj).toString());
        }

        else if (obj instanceof String) {
            if (obj != null)
                return String.format("\"%s\"", obj);

        } else if (obj instanceof Cat) {
            return String.format(
                    "{\n\"name\": \"%s\", \n\"age\": \"%s\", \n\"color\": \"%s\", \n\"weight\": \"%s\", \n\"height\": \"%s\"\n}",
                    ((Cat) obj).getName(), ((Cat) obj).getAge(), ((Cat) obj).getColor(), ((Cat) obj).getWeight(),
                    ((Cat) obj).getHeight());
        }

        return null;

    }
}
