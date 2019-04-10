package 注解.属性赋值注解;

import java.lang.reflect.Type;

public class Bean implements Type {
    public int id;
    public String name;

    @Override
    public String toString() {
        return "Bean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String getTypeName() {
        return getClass().getTypeName();
    }
}
