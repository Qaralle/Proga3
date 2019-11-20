package laba2;

public class Skill {
    private String name;
    private String info;

    public Skill(String name1, String info1){
        this.name = name1;
        this.info = info1;
    }

    public String getName(){
        return name;
    }


    public String getInfo() {
        if (info == null)
            return "...";
        else
            return info;
    }

}