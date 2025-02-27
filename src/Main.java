public class Main {
    public static void main(String[] args) {
        System.out.println("YES");
        Point punkt =new Point(2.3,4.5);

        System.out.println(punkt.toString());
        System.out.println(punkt.toSvg());
        punkt.translate(2.3,4.5);
        System.out.println(punkt.toSvg());
        Point punkt2=punkt.translated(14,20);
        System.out.println(punkt2.toSvg());
    }

}
