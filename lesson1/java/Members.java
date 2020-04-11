public abstract class Members {
    protected int JumpH;
    protected int RunD;
    protected String name;


    public void run(){
        System.out.println(name+" бежит");
    }
    public void jump(){System.out.println(name+" прыгает");}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getJumpH() {
        return JumpH;
    }

    public  void setJumpH(int jumpH) {
        JumpH = jumpH;
    }

    public void setRunD(int runD) {
        RunD = runD;
    }

    public int getRunD() {
        return RunD;
    }
}
