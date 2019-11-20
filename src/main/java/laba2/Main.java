package laba2;

public class Main {


    public static void main(String[] args) {
        Papa papa=new Papa("Папа");
        papa.addCond(new Cond("обижен"));
        papa.addSkill(new Skill("вставать",null));
        papa.addSkill(new Skill("собирать листы *агрх* ",null));
        Thinks work = new Thinks("Работа ","закончена"," большая");
        papa.addLastSkill(new LastSkills("работу всю ночь",work.GetName()+" было "+work.GetCond()));
        Spectors spectors=new Spectors("Все");
        Mama mama=new Mama("Мама");
        Thinks slova= new Thinks("Cлова",0);
        mama.addSkill(new Skill("молчать и боятся произнести хоть слова", slova.GetName()+" было "+slova.GetCount()));
        spectors.addSkill(new Skill("молчать и боятся произнести хоть слова",slova.GetName()+" было "+slova.GetCount()));
        papa.addSkill(new Skill("Заканчивать работу и сразу же читать","Читает "+spectors.getName()));
        papa.addRead(new Reading("читать",null),Lists.FirstList);
        mama.addSkill(new Skill("подкладывать мармелад","Получатель "+papa.getName()));
        papa.СontRead(new Reading("читать",null),Lists.SecondList);
        mama.Сontin(new Skill("подкладывать мармелад","Получатель "+papa.getName()));
        Thinks nadejda=new Thinks("Надежды","существуют","большие");
        spectors.addCond(new Cond("возбуждены и полны "+ nadejda.GetSize()+" "+nadejda.GetName()));
        papa.СontRead(new Reading("читать",null),Lists.Continiue);



    }
}
