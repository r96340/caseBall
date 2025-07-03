package model;

//打者
public class Hitter extends Player {
    
    //特有屬性
    short power;                      //力量值
    short batControl;                 //球棒控制力
    short plateDiscipline;            //選球
    short speed;                      //跑壘速度
    boolean isLefty;                  //是否為左打者
    protected byte[] pitchTypeSights; //球種辨識力

    /*
        0:直球    1:卡特球    2:伸卡球
        3:曲球    4:指叉球    5:變速球
        6:滑球    7:橫掃球    8:蝴蝶球
    */
    

    //建構子
    //只有指定打擊會直接使用這個建構子
    public Hitter(String name, short jerseyNumber, short luck, short collaboration, short clutch, 
                  short power, short batControl, short plateDiscipline, short speed, boolean isLefty, byte[] pitchTypeSights){
        
        super(name, jerseyNumber, luck, collaboration, clutch);
        this.speed           = speed;
        this.power           = power;
        this.batControl      = batControl;
        this.plateDiscipline = plateDiscipline;
        this.isLefty         = isLefty;
        this.pitchTypeSights = pitchTypeSights;
    }

}
