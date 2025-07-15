package models;

//選手抽象類別
public abstract class Player {

    //屬性
    public String name;                      //球員名
    protected int luck;             //運氣值
    protected int collaboration;    //默契值
    protected int clutch;           //拚勁值

    //建構子
    protected Player(String name, int luck, int collaboration, int clutch){
        this.name                  = name;
        this.luck                  = luck;
        this.collaboration         = collaboration;
        this.clutch                = clutch;
    }

    //get方法
    public int getLuck(){return this.luck;};
    public int getCollaboration(){return this.collaboration;};
    public int getClutch(){return this.clutch;};

    public void showRegistry(int number){
        System.out.printf("%d\t%s\t\n", number, name);
    }

}
