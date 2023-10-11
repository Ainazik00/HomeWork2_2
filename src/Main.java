import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Flowers[] flowers = {createObject("Rose"), createObject("Peony"), createObject("Chamomile")};
        for (Flowers printable : flowers) {
            printable.print();
        }
        System.out.println("Введите название цветов");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите параметры цветов");
        Scanner flowerss = new Scanner(System.in);
        String parametres = scanner.nextLine();
        System.out.println("Название цветка: " + name);
        System.out.println("Параметры цветка: " + parametres);
    }
    public static Flowers createObject(String className) {
        Flowers flowers = null;
        switch (className) {
            case "Rose":
                flowers=new Rose("Sahara","yellow",6.5);
                break;
            case "Peony":
                flowers=new Peony("Lactiflora","pink",10);
                break;
            case "Chamomile":
                flowers=new Chamomile("Antemis","white",true);
                break;
        }
        return flowers;
    }
}
