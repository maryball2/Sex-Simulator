package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static int returnRandomNumber(int min, int max){
        Random random = new Random();
        max -= 1;
        int number = random.nextInt((max - min) + 1) + min;
        return number;
    }

    public static void debugPersonObject(){
        Person riley = new Person();
        System.out.println("Your name is " + riley.returnName() + " and you are " + riley.returnAge() + " years old ");
        System.out.print("and you are " + riley.returnHeight() + " inches tall ");
        System.out.println("Your gender on the scale is " + riley.returnGender() + " your race is " + riley.returnRace());
        System.out.print(" your hair colour is " + riley.returnHairColour() + " your eye colour is " + riley.returnEyeColour());
        System.out.println(" Anal virginity: " + riley.returnAnalVirginity() + " oral virginity " + riley.returnOralVirginity());
        System.out.print(" genital virginity: " + riley.returnGenitalVirginity());
    }

    public static void main(String[] args) {
        debugPersonObject();
    }
}

class Person{

    String name;
    int gender;
    String hairColour;
    String race;
    int analVirginity;
    int oralVirginity;
    int genitalVirginity;
    int height;
    int age;
    String eyeColour;
    Tiddy breast;
    Penis dick;
    Vagina cunt;

    ArrayList<String> possibleHairColours = getPossibleHairColours();
    ArrayList<String> possibleSkinColours = getPossibleSkinColours();
    ArrayList<String> possibleEyeColours = getPossibleEyeColours();

    public Person(){
        name = getPossibleNames().get(Main.returnRandomNumber(0,getPossibleNames().size()));
        age = Main.returnRandomNumber(18,121);
        gender = Main.returnRandomNumber(1,11);
        hairColour = possibleHairColours.get(Main.returnRandomNumber(0,possibleHairColours.size()));
        race = possibleSkinColours.get(Main.returnRandomNumber(0,possibleSkinColours.size()));
        analVirginity = Main.returnRandomNumber(0,2);
        oralVirginity = Main.returnRandomNumber(0,2);
        genitalVirginity = Main.returnRandomNumber(0,2);
        height = Main.returnRandomNumber(48, 85);
        eyeColour = possibleEyeColours.get(Main.returnRandomNumber(0,possibleEyeColours.size()));
        if (gender >= 8 || (gender >= 3 && gender <= 4)){
            breast = new Tiddy();
        }


    }

    public Person(String name2){
        name = name2;
        age = Main.returnRandomNumber(18,121);
        gender = Main.returnRandomNumber(1,11);
        hairColour = possibleHairColours.get(Main.returnRandomNumber(0,possibleHairColours.size()));
        race = possibleSkinColours.get(Main.returnRandomNumber(0,possibleSkinColours.size()));
        analVirginity = Main.returnRandomNumber(0,2);
        oralVirginity = Main.returnRandomNumber(0,2);
        genitalVirginity = Main.returnRandomNumber(0,2);
        height = Main.returnRandomNumber(48, 85);
        eyeColour = possibleEyeColours.get(Main.returnRandomNumber(0,possibleEyeColours.size()));
        if (gender >= 8 || (gender >= 3 && gender <= 4)){
            breast = new Tiddy();
        }


    }


    public ArrayList<String> getPossibleHairColours() {
        ArrayList<String> possibleHairColours = new ArrayList<String>();
        possibleHairColours.add("brown");
        possibleHairColours.add("black");
        possibleHairColours.add("green");
        possibleHairColours.add("blonde");
        possibleHairColours.add("red");
        return possibleHairColours;
    }

    public String returnHairColour(){
        return hairColour;
    }

    public String returnName(){
        return name;
    }

    public String returnEyeColour(){
        return eyeColour;
    }

    public String returnRace(){
        return race;
    }

    public int returnGender(){
        return gender;
    }

    public int returnAnalVirginity(){
        return analVirginity;
    }

    public int returnOralVirginity(){
        return oralVirginity;
    }

    public int returnGenitalVirginity(){
        return genitalVirginity;
    }

    public int returnHeight(){
        return height;
    }

    public int returnAge(){
        return age;
    }

    public ArrayList<String> getPossibleSkinColours(){
        ArrayList<String> possibleSkinColours = new ArrayList<String>();
        possibleSkinColours.add("black");
        possibleSkinColours.add("white");
        possibleSkinColours.add("asian");
        possibleSkinColours.add("native american");
        possibleSkinColours.add("hispanic");
        possibleSkinColours.add("mongol");
        return possibleSkinColours;
    }

    public ArrayList<String> getPossibleEyeColours(){
        ArrayList<String> possibleEyeColours = new ArrayList<String>();
        possibleEyeColours.add("blue");
        possibleEyeColours.add("green");
        possibleEyeColours.add("hazel");
        possibleEyeColours.add("brown");
        possibleEyeColours.add("grey");
        possibleEyeColours.add("red");
        return possibleEyeColours;
    }

    public ArrayList<String> getPossibleNames(){
        // Names taken from stayathomemum.com
        ArrayList<String> possibleNames = new ArrayList<String>();
        possibleNames.add("Addison");
        possibleNames.add("Ainsley");
        possibleNames.add("Airlie");
        possibleNames.add("Alby");
        possibleNames.add("Alex");
        possibleNames.add("Andie");
        possibleNames.add("Arden");
        possibleNames.add("Blake");
        possibleNames.add("Brennan");
        possibleNames.add("Cameron");
        possibleNames.add("Casey");
        possibleNames.add("Chandler");
        possibleNames.add("Dakota");
        possibleNames.add("Darian");
        possibleNames.add("Fabian");
        possibleNames.add("Fox");
        possibleNames.add("Grae");

        return possibleNames;
    }

}

class Tiddy{
    String size;
    String nippleType;
    public Tiddy(){
        size = getPossibleBreastSize().get(Main.returnRandomNumber(0,getPossibleBreastSize().size()));
        nippleType = getPossibleNippleTypes().get(Main.returnRandomNumber(0,getPossibleNippleTypes().size()));
    }

    public ArrayList<String> getPossibleBreastSize(){
        ArrayList<String> possibleBreastSize = new ArrayList<String>();
        possibleBreastSize.add("A");
        possibleBreastSize.add("AA");
        possibleBreastSize.add("AAA");
        possibleBreastSize.add("B");
        possibleBreastSize.add("BB");
        possibleBreastSize.add("BBB");
        possibleBreastSize.add("C");
        possibleBreastSize.add("CC");
        possibleBreastSize.add("CCC");
        possibleBreastSize.add("D");
        possibleBreastSize.add("DD");
        possibleBreastSize.add("DDD");
        return possibleBreastSize;
    }

    public ArrayList<String> getPossibleNippleTypes(){
        ArrayList<String> nipType = new ArrayList<String>();
        nipType.add("long and large");
        nipType.add("long and small");
        nipType.add("short and large");
        nipType.add("short and small");
        return nipType;
    }
}

class Penis{
    
}

class Vagina{

}