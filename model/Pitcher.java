package model;

//投手
public class Pitcher extends Player implements Fieldable {
    
    //特有屬性
    protected short[] pitchTypeControls; //球種別控制力

    /*
        0:直球    1:卡特球    2:伸卡球
        3:曲球    4:指叉球    5:變速球
        6:滑球    7:橫掃球    8:蝴蝶球
    */
    
    public Pitcher(String name, short jerseyNumber, short luck, short collaboration, short clutch, short stamina, short[] pitchTypeControls){
        super(name, jerseyNumber, luck, collaboration, clutch);
        this.pitchTypeControls = pitchTypeControls;
    }

    //get方法
    public short getPitchTypeControl(byte index){return this.pitchTypeControls[index];};
}
