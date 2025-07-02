package model;

public abstract class Player {

    //屬性
    String name;                    //球員名
    short jerseyNumber;             //球衣號碼

    /*
        0:指定打擊  1:投手       2:捕手
        3:一壘手    4:二壘手     5:三壘手
        6:游擊手    7:角落外野手  8:中外野手
    */

    protected short luck;             //運氣值
    protected short collaboration;    //默契值
    protected short clutch;           //拚勁值

    //建構子
    protected Player(String name, short jerseyNumber, short luck, short collaboration, short clutch){
        this.name                  = name;
        this.jerseyNumber          = jerseyNumber;
        this.luck                  = luck;
        this.collaboration         = collaboration;
        this.clutch                = clutch;
    }

    //get方法
    protected short getLuck(){return this.luck;};
    protected short getCollaboration(){return this.collaboration;};
    protected short getClutch(){return this.clutch;};

}
