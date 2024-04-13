public class Program {
    public static void main(String[] args) {
        Inputer inputer = Inputer.create();
        if (inputer != null) {
            Outputer outputer = new Outputer(inputer.getHumanCard());
        } else System.out.println("\nЗначения в файл не сохранены в файле, так как некорректны");
    }
}
