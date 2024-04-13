public class Program {
    public static void main(String[] args) {
        HumanCard humanCard = new HumanCard();


        Inputer inp = new Inputer(humanCard);

        Outputer outp = new Outputer();
        outp.addHumanCard(humanCard);
    }
}
