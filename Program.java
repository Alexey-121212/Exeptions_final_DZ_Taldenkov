public class Program {
    public static void main(String[] args) {
        Inputer inputer = Inputer.create();
        if (inputer != null) {
            Outputer outputer = new Outputer();
            outputer.addHumanCard(inputer.getHumanCard());
            System.out.println("\n" + inputer.getHumanCard());
        } else System.out.println("\nЗначения в файл не добавлены");


    }
}
