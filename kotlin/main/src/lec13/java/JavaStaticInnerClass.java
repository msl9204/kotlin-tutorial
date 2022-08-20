package lec13.java;

public class JavaStaticInnerClass {

    private String address;
    private LivingRoom livingRoom;

    public JavaStaticInnerClass(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    /**
     * static이 없을 경우, 내부클래스가 불필요하기 외부클래스의 정보를 가지고 있으므로
     * static 을 붙여주는게 더 좋다.
     */
    public static class LivingRoom {
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }
    }
}
