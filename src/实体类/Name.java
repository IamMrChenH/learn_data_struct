package 实体类;

/**
 * @author chenh
 * @date ${date}
 */
public class Name {
    public String name1;
    public String name2;

    public Name(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                '}';
    }
}
