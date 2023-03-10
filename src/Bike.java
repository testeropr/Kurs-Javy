public class Bike implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jade rowerem z predkoscia" + speed);

    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem! naciskam mocno na pedały");

    }

    @Override
    public String info() {
        return "Rower";
    }
    public void zatankuj () {
        System.out.println("Aby miec duzo sily musze zjesc obiad");
    }
}
