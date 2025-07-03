package models;

//選手抽象類別
public abstract class Player {

    //屬性
    String name;                      //球員名
    protected short luck;             //運氣值
    protected short collaboration;    //默契值
    protected short clutch;           //拚勁值

    //建構子
    protected Player(String name, short luck, short collaboration, short clutch){
        this.name                  = name;
        this.luck                  = luck;
        this.collaboration         = collaboration;
        this.clutch                = clutch;
    }

    //get方法
    public short getLuck(){return this.luck;};
    public short getCollaboration(){return this.collaboration;};
    public short getClutch(){return this.clutch;};

}
