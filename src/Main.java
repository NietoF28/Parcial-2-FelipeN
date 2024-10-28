public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("ios","15gb",300.000,8,"windows");
        Celular celular1 = new Celular("28 mgp","iphone",300.000,9);

        Laptop laptop2 = new Laptop("Iphone 13","Aplle",400.000,8);
        Celular celular2 = new Celular("s24","Samsung",900.000,10);


        Cliente cliente1 = new Cliente("felipe","felipe@gmail.com");
        Cliente cliente2 = new Cliente("esteban","esteban@gmail.com");

        cliente2.comprarProducto(celular2, 1);
        cliente1.comprarProducto(celular1, 2);

        cliente1.comprarProducto(laptop1, 3);
        cliente2.comprarProducto(laptop2,2);
        cliente1.comprarProducto(celular1, 2);




        System.out.println("Inventario:");
        laptop1.mostarInformacion();
        celular1.mostarInformacion();




    }
}