
public class Main {


    public static void main(String[] args) {

        Farfetchd peter = new Farfetchd("Peter","","","",29,39);

        peter.attack();
        peter.makeNoise();

        Unown womble = new Unown("Womble","","","",12,36,'G');

        womble.healSelf();
        womble.healSelf();
        womble.attack();
        womble.makeNoise();

        Charjabug scrumple = new Charjabug("Scrumple","","","",8,15);

        scrumple.attack();
        scrumple.makeNoise();

        Toxtricity rose = new Toxtricity("rose","","","",4,11,true);

        rose.attack();
        rose.makeNoise();
    }

}

abstract class Pokémon{

    private String name;
    private String type1;
    private String type2;
    private String sound;
    private int level;
    private int hp;

    public Pokémon(String name, String type1, String type2, String sound, int level, int hp) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.sound = sound;
        this.level = level;
        this.hp = hp;
    }

    public void makeNoise(){
        System.out.println(sound);
    }
    public void healSelf(){
        System.out.println(name+"'s HP has gone up from "+hp+" to "+(hp+10)+"!");
        this.setHp(this.getHp()+10);
    }

    abstract void attack();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int hp) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
//I chose to do the whole "FirePokémon" thing differently, because this is most likely how the games would handle it, it also works for pokémon that have multiple forms, like Toxtricity!
//Also, I just chose a few random pokémon that I think are interesting and weird to play with custom variables.
class Farfetchd extends Pokémon{

    public Farfetchd(String name, String type1, String type2, String sound, int level, int hp) {
        super(name, type1, type2, sound, level, hp);
        this.setType1("normal");
        this.setType2("");
        this.setSound("Far Far!");
    }

    @Override
    void attack() {
        System.out.println(this.getName()+" used 'Slash'!");
    }
}
class Unown extends Pokémon{

    //I'm not giving this a setter and getter because this form should be permanent for the Unown.
    private char form;

    public Unown(String name, String type1, String type2,  String sound, int level, int hp, char form) {
        super(name, type1, type2, sound, level, hp);
        this.setType1("psychic");
        this.setType1("");
        this.setSound("?̵̢̼̜̣̳̩̦͈̩̇̀͒̇̈́̏̒̕");
    }

    @Override
    void attack() {
        System.out.println(this.getName()+" used 'Hidden Power'!");
    }

}

class Charjabug extends Pokémon{

    public Charjabug(String name, String type1, String type2,  String sound, int level, int hp) {
        super(name, type1, type2, sound, level, hp);
        this.setType1("bug");
        this.setType1("electric");
        this.setSound("Chrrrrrrrjajaja");
    }

    @Override
    void attack() {
        System.out.println(this.getName()+" used 'Spark'!");
    }

}

class Toxtricity extends Pokémon{

    private boolean isAmped;

    public Toxtricity(String name, String type1, String type2, String sound, int level, int hp, boolean isAmped) {
        super(name, type1, type2, sound, level, hp);
        this.setType1("electric");
        this.setType1("poison");
        this.setSound("Txxxx! Txxxx!");
        this.isAmped = isAmped;
    }

    @Override
    void attack() {
        System.out.println(this.getName()+" used 'Discharge'!");
    }

    public boolean isAmped() {
        return isAmped;
    }

    public void setAmped(boolean amped) {
        isAmped = amped;
    }
}
