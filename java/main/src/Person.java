import org.jetbrains.annotations.Nullable;

public class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Nullable // 자바 코드를 쓰기 위해서는 Nullable인지 아닌지 붙여줘야한다.
    public String getName() {
        return name;
    }
}
