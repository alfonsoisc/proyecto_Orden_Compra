import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Compras componentes PC");
        orden1.setCliente(new Cliente("Luis","Soto"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Western Digital", "Unidad SSD 480GB", 54890));
        orden1.addProducto(new Producto("MSI", "Monitor Optix G271", 363940));
        orden1.addProducto(new Producto("AMD", "Procesador AMD Ryzen 9 5900X", 599990));
        orden1.addProducto(new Producto("EVGA", "Tarjeta de video EVGA RTX 3080Ti", 1849990));

        OrdenCompra orde2 = new OrdenCompra("Compras electrodomesticas");
        orde2.setCliente(new Cliente("Alfonso", "Calihua"));
        orde2.setFecha(new Date());

        orde2.addProducto(new Producto("Fensa", "Cocina", 239990));
        orde2.addProducto(new Producto("Samsung", "Refrigerador", 429990));
        orde2.addProducto(new Producto("Midea", "Lavadora", 149990));
        orde2.addProducto(new Producto("Aspiradora", "IRobot", 199990));

        OrdenCompra orden3 = new OrdenCompra("Compra MAteriales para construccion");
        orden3.setCliente(new Cliente("Paola","Soriano"));
        orden3.setFecha(new Date());

        orden3.addProducto(new Producto("Melon", "Cemento 25kg", 4870));
        orden3.addProducto(new Producto("Grau", "Hormigon", 6040));
        orden3.addProducto(new Producto("Ceramicas Santiago", "Ladrillo", 790));
        orden3.addProducto(new Producto("Redline", "Escala articulada aluminio", 48990));

        OrdenCompra[] ordenes = {orden1,orde2,orden3};

        for (OrdenCompra orden : ordenes){
            System.out.println("Folio" + orden.getIdentificador());
            System.out.println("Cliente" + orden.getCliente());
            System.out.println("Descripcion" +  orden.getDescripcion());
            System.out.println("Fecha" + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()){
                System.out.println("Producto" +  i + ": " +  p.getNombre() +  " " + p.getFabricante()
                        + " Precio $" + p.getPrecio());
                i++;

            }
            System.out.println("------------------Siguiente---------------------------");

        }
    }
}
