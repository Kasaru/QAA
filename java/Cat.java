public class Cat implements RunD,JumpH {
    private String name;
    void run() {
        System.out.println(name+" бежит");
    }
    void jump() {
        System.out.println(name+" прыгает как кошка");
    }
    public void jumpH() {
        System.out.println(name+" прыгает на"+2+" метра в высоту");
    }
    public void runD() {
        System.out.println(name+" бежит на"+100+"метров");
    }
}
