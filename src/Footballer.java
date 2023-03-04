public class Footballer extends Person {

  public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballClub=footballClub;
    }

    public void playFootbal(){

        System.out.println("Im playing football " + footballClub);
    }
}
