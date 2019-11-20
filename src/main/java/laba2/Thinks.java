package laba2;

public class Thinks {
    private String name;
    private int count;
    private String Conditional;
    private String Size;
    public Thinks(String nam1, int count1){
        this.count=count1;
        this.name=nam1;
        System.out.println("Объект "+name+" создан "+ "в количестве "+ count);
    }
    public Thinks(String nam1, String Conditional1, String Size1){
        this.Conditional=Conditional1;
        this.name=nam1;
        this.Size=Size1;
        System.out.println("Объект "+name+" создан "+ "с состоянием "+ Conditional+" размером "+Size);
    }

    public String GetName(){
        return name;
    }
    public String GetSize(){
        return Size
                ;
    }
    public String GetCond(){
        return Conditional;
    }
    public int GetCount(){

        return count;
    }
}
