package laba2;
import java.util.ArrayList;

public abstract class Somebody implements SomeboduInterface {
    private String name;
    protected ArrayList<Skill> skills = new ArrayList<Skill>();
    protected ArrayList<Cond> Conditional = new ArrayList<Cond>();

    public Somebody(String name){
        this.name=name;
    }


    public abstract ArrayList<Skill> getSkills();

    @Override
    public void setSkills(ArrayList<Skill> skills){
        System.out.println(skills);
        this.skills = skills;
    }

    @Override
    public String getName(){
        return this.name;
    }

}
