public class Earth {

    public static void main(String []args){

        Human shagufta;
        shagufta = new Human();
        shagufta.age = 5;
        shagufta.height = 88;
        shagufta.name = "Shagufta";
        shagufta.eyeColor = "Blue";

        shagufta.speak();

        Human Joel = new Human();
        Joel.name = "Joel Mark";
        Joel.age = 77;
        Joel.height = 99;
        Joel.eyeColor = "Brown";

        Joel.speak();



    }
}
