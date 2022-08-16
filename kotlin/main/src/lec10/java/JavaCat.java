package lec10.java;

public class JavaCat extends JavaAnimal {

    public JavaCat(String species, int legCount) {
        super(species, legCount);
    }

    @Override
    public void move() {
        System.out.println("고양이가 사뿐 사뿐 걸어가~");
    }
}
