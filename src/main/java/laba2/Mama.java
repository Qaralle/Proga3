package laba2;

public class Mama extends Mumi {
    public Mama(String name) {
        super(name);
    }
    @Override
    public void addSkill(Skill skill) {
        if (skills.add(skill)){
            System.out.println("Муми-" + this.getName() +  " начала " + skill.getName()+"("+skill.getInfo()+")");
        }
    }
    @Override
    public void addCond(Cond conditional) {
        if (Conditional.add(conditional)){
            System.out.println("Муми-" + this.getName() +  " была " + conditional.getName());
        }
    }

    public void Сontin(Skill skill) {
        if (skills.add(skill)){
            System.out.println("Муми-" + this.getName() +  " продолжила " + skill.getName()+"("+skill.getInfo()+")");
        }
    }
}
