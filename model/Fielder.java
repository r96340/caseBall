package model;

//野手
public class Fielder extends Hitter implements Fieldable {
    
    //屬性
    protected short[] positionAffinities; //守位適性
    //0:角落內野 1:中線內野 2:角落外野 3:中外野
    public short position;               //實際守位

    public Fielder(String name, short jerseyNumber, short luck, short collaboration, short clutch, 
                   short power, short batControl, short plateDiscipline, short speed, boolean isLefty, byte[] pitchTypeSights,
                   short[] positionAffinities, short position){

        super(name, jerseyNumber, luck, collaboration, clutch, power, batControl, plateDiscipline, speed, isLefty, pitchTypeSights);
        this.positionAffinities = positionAffinities;
        this.position     = position;
    }

    public short getPositionAffinity(byte index){return this.positionAffinities[index];};
}
