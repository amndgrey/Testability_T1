import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int price = 10_000;
        int miles = service.calculate(price);

        System.out.println(miles);

        int miles2 = service.calculate(500); //выводимое в консоль значение соответствует результатам предыдущей версии приложения

        System.out.println(miles2);
    }
}
