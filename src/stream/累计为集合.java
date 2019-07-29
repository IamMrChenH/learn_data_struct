package stream;

import 实体类.Name;

import java.util.ArrayList;

/**
 * @author chenh
 * @date ${date}
 */
public class 累计为集合 {

    public static void main(String[] args) {
        ArrayList<Name> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add(new Name("名称1" + i, "名称2" + i));

            for (Name name : names) {
                System.out.println(name);
            }
        }

    }
}
