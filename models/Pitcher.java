package models;

//投手
public class Pitcher extends Player implements Fieldable {
    
    //特有屬性
    protected int[] pitchTypeControls; //球種別控制力

    //目前簡化為0:直球 1:變化球
    /*
        0:直球    1:卡特球    2:伸卡球
        3:曲球    4:指叉球    5:變速球
        6:滑球    7:橫掃球    8:蝴蝶球
    */
    
    public Pitcher(String name, int luck, int collaboration, int clutch, int[] pitchTypeControls){
        super(name, luck, collaboration, clutch);
        this.pitchTypeControls = pitchTypeControls;
    }

    //get方法
    public int getPitchTypeControl(byte index){return this.pitchTypeControls[index];};

    public void grabDirect(){};
    public void grabDropped(){};
    public void slidingCatch(){};
    public void divingCatch(){};
}
