public class MadLibs {
    /*
  This program generates a mad lib story.
  Author: Jon Desserres
  Date: 2/14/2024
    */
    public static void main(String[] args){
        java.lang.String direction1 = "east";
        String adjective1 = "tall";
        String adjective2 = "fast";
        String adjective3 = "delicious";
        String verb1 = "hop";
        String noun1 = "park";
        String noun2 = "hammer";
        String noun3 = "taco";
        String noun4 = "table";
        String noun5 = "cat";
        String noun6 = "cactus";
        String name2 = "Bert";
        int number = 8;
        String place1 = "Barbados";

        //The template for the story
        String story = "As the sun began to rise from the "+direction1+", woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
        System.out.println(story);
    }
}
