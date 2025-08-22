package models;

//打者
public class Hitter extends Player {
    
    //特有屬性
    int power;                      //力量值
    int batControl;                 //球棒控制力
    int plateDiscipline;            //選球
    int speed;                      //跑壘速度
    boolean isLefty;                  //是否為左打者
    protected int[] pitchTypeSights; //球種辨識力
    public boolean availableForBatting = true;

    //目前簡化為0:直球 1:變化球

    /*
        0:直球    1:卡特球    2:伸卡球
        3:曲球    4:指叉球    5:變速球
        6:滑球    7:橫掃球    8:蝴蝶球
    */
    

    //建構子
    //只有指定打擊會直接使用這個建構子
    public Hitter(String name, int number, int luck, int collaboration, int clutch, 
                  int power, int batControl, int plateDiscipline, int speed, boolean isLefty, int[] pitchTypeSights){
        
        super(name, number, luck, collaboration, clutch);
        this.speed           = speed;
        this.power           = power;
        this.batControl      = batControl;
        this.plateDiscipline = plateDiscipline;
        this.isLefty         = isLefty;
        this.pitchTypeSights = pitchTypeSights;
    }

}
