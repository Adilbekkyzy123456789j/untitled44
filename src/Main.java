public class Main {
    public static void main(String[] args) {


        Box <String>box = new Box<>("Big","Black");
        System.out.println("Класс который принимаеть только String тип:"+box);
        Box<Integer> box1= new Box<>(1,645);
        System.out.println("Класс который принимаеть только Integer тип:"+box1);

        method(box);
    }
        public static <T>void method (T argument){
        System.out.println("Возвращаеть новый класс:"+argument);
    }
}