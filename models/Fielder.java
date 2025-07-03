package models;

//野手
public class Fielder extends Hitter implements Fieldable {
    
    //屬性
    protected int[] positionAffinities; //守位適性
    //0:角落內野 1:中線內野 2:角落外野 3:中外野
    public int position;               //實際守位

    public Fielder(String name, int luck, int collaboration, int clutch, 
                   int power, int batControl, int plateDiscipline, int speed, boolean isLefty, int[] pitchTypeSights,
                   int[] positionAffinities){

        super(name, luck, collaboration, clutch, power, batControl, plateDiscipline, speed, isLefty, pitchTypeSights);
        this.positionAffinities = positionAffinities;
    }

    //get方法
    public int getPositionAffinity(byte index){return this.positionAffinities[index];};

    public void grabDirect(){};
    public void grabDropped(){};
    public void slidingCatch(){};
    public void divingCatch(){};
}
