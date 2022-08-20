package lec13.java;

public class JavaInnerClass {

    private String address;
    private LivingRoom livingRoom;

    public JavaInnerClass(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public class LivingRoom {
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }

        public String getAddress() {
            return JavaInnerClass.this.address;
        }
    }
}
