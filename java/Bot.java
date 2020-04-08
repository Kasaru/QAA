public class Bot implements RunD,JumpH {
    public String name;
    void run() {
        System.out.println(name+" бежит");
    }
    void jump() {
        System.out.println(name+" прыгает как робот");
    }
    public void jumpH() {
        System.out.println(name+" прыгает на"+3+" метра в высоту");
    }
    public void runD() {
        System.out.println(name+" бежит на"+1000+"метров");
    }
}
