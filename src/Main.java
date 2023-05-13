public class Main {
    public static void main(String[] args) {
        /*
        TODO:
        * dodać jeszcze jeden samochód
        * w main stworzyć dwa samochody oraz dwie instrukcje obsługi
        * wysłać na teamsach link do gita

         */

        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.makeMazdaRX7(builder);
        Car MazdaRX7 = builder.getResult();
        System.out.println(MazdaRX7);

        ManualBuilder builderm = new ManualBuilder();
        director.makeMazdaRX7(builder);
        System.out.println(builderm);



        director.makeSkylineR34(builder);
        Car skyline = builder.getResult();
        System.out.println(skyline);

        ManualBuilder builderz = new ManualBuilder();
        director.makeMazdaRX7(builderz);
    }
}
