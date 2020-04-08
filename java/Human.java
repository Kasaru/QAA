public class Human implements RunD,JumpH {
    private String name;
    void run() {
        System.out.println(name+" бежит");
    }
    void jump() {
        System.out.println(name+" прыгает как человек");
    }
    public void jumpH() {
        System.out.println(name+" прыгает на"+1+" метр в высоту");
    }
    public void runD() {
        System.out.println(name+" бежит на"+500+"метров");
    }
}
