package model;

public class Hitter extends Player {
    
    //屬性
    byte hitterClass; //打者類型

    /*
        0:速度型    1:選球型    2:大砲型
        3:巧打型    4:盲砲型
     */

    boolean isLefty; //是否為左打者
    protected byte[] pitchTypeSights; //球種辨識力

    /*
        0:直球    1:卡特球    2:伸卡球
        3:曲球    4:指叉球    5:變速球
        6:滑球    7:橫掃球    8:蝴蝶球
    */
    
    //建構子
    //只有指定打擊會直接使用這個建構子
     public Hitter(String name, short jerseyNumber, short luck, short collaboration, short clutch, byte hitterClass, boolean isLefty, byte[] pitchTypeSights){
        super(name, jerseyNumber, luck, collaboration, clutch);
        this.hitterClass = hitterClass;
        this.isLefty = isLefty;
        this.pitchTypeSights = pitchTypeSights;
     }

}
