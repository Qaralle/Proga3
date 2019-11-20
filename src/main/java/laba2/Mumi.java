package laba2;


import java.util.ArrayList;

public class Mumi extends Somebody {


    public Mumi(String name) {
        super(name);
        System.out.println("Муми-" + name + " был призван Махемом");
    }

    @Override
    public ArrayList<Skill> getSkills() {
        return skills;
    }


    public void addSkill(Skill skill) {
        if (skills.add(skill)) {
            System.out.println("Муми-" + this.getName() + " начал " + skill.getName()+"("+skill.getInfo()+")");
        }
    }

    public void addCond(Cond conditional) {
        if (Conditional.add(conditional)) {
            System.out.println("Муми-" + this.getName() + " был " + conditional.getName());
        }
    }


    public void addRead(Reading skill, Lists list) {
        if (skills.add(skill)) {
            System.out.print("Муми-" + this.getName() + " начал " + skill.getName());
            switch (list) {
                case FirstList:
                    System.out.println(list);
                    break;
                case SecondList:
                    System.out.println(list);
                    break;
                case Continiue:
                    System.out.println(list);
                    break;

            }
        }
    }

    public void СontRead(Reading skill, Lists list) {
        if (skills.add(skill)) {
            System.out.print("Муми-" + this.getName() + " продолжил " + skill.getName()+"("+skill.getInfo()+")");
            switch (list) {
                case FirstList:
                    System.out.println(list);
                    break;
                case SecondList:
                    System.out.println(list);
                    break;
                case Continiue:
                    System.out.println(list);
                    break;

            }
        }
    }

    public void addLastSkill(LastSkills skill) {
        if (skills.add(skill)) {
            System.out.println("Муми-" + this.getName() + " делал " + skill.getName()+"("+skill.getInfo()+")");
        }
    }

    @Override
    public String toString() {
        return "(" + getName() + ", " + getSkills() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        return false;
    }
}

