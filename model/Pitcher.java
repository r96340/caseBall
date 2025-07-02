package model;

public class Pitcher extends Player {
    
    //屬性
    protected short stamina;            //體力值（最大投球數）
    protected byte[] pitchTypeControls; //球種別控制力

    /*
        0:直球    1:卡特球    2:伸卡球
        3:曲球    4:指叉球    5:變速球
        6:滑球    7:橫掃球    8:蝴蝶球
    */
    
    public Pitcher(String name, short jerseyNumber, short luck, short collaboration, short clutch, short stamina, byte[] pitchTypeControls){
        super(name, jerseyNumber, luck, collaboration, clutch);
        this.stamina = stamina;
        this.pitchTypeControls = pitchTypeControls;
    }
}
