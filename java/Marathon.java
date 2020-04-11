public class Marathon {

        public static void main(String[] args) {
                Members human = new Human();
                human.setName("Усейн");
                human.setJumpH(1);
                human.setRunD(500);
                Members bot = new Bot();
                bot.setName("Ведроид");
                bot.setJumpH(5);
                bot.setRunD(5000);
                Members cat = new Cat();
                cat.setName("Барсик");
                cat.setJumpH(2);
                cat.setRunD(10);
        Members[] members={bot,human,cat};
        for (Members member:members){
                member.run();
                System.out.println("Перед "+ member.name+"ом возникла стена");
                member.jump();
                if (member.JumpH>=Wall.height)System.out.println(member.name+" смог перепрыгнуть препядствие");
                        else if(member.JumpH<Wall.height)System.out.println(member.name+" не смог перепрыгнуть препядствие");
                        if(member.JumpH>=Wall.height)member.run();
                if(member.JumpH>=Wall.height && member.RunD>=Road.dist) System.out.println(member.name+" смог пробежать дистанцию");
                else if(member.RunD<Road.dist)System.out.println(member.name+" не смог добежать до конца дистанции");

        }

    }
}
