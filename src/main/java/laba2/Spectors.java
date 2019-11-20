package laba2;

public class Spectors extends Mumi {
    public Spectors(String name) {
        super(name);
    }
    @Override
    public void addSkill(Skill skill) {
        if (skills.add(skill)){
            System.out.println(this.getName() +  " начали " + skill.getName()+"("+skill.getInfo()+")");
        }
    }
    @Override
    public void addCond(Cond conditional) {
        if (Conditional.add(conditional)){
            System.out.println(this.getName() +  " были " + conditional.getName());
        }
    }
}
