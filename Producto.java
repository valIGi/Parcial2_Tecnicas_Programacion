public class Producto {

    private String nombre;
    private String descripcion;
    private int precio;
    private int cantidadDeInventario;

    public String Producto(String nombre, String descripcion, int precio, int cantidadDeInventario){

        public String getNombre {
            return nombre;
        }
        public String getDescripcion {
            return descripcion;
        }
        public void setPrecio {
            this.precio = precio;

        }
        public void setCantidadDeInventario {
            this.cantidadDeInventario = cantidadDeInventario;
    }
        public static void main(String[]) {
            Producto marcas = new Producto();
            marcas.registrarMarca(
                    new Telefono(
                            "Telefono",
                            "Telefono con 32gb",
                            10
                    )
            );
            marcas.registrarMarca(
                    new Laptop(
                            "Laptop",
                            "Laptop de ultima generacion",
                            5
                    )
            );marcas.registrarMarca(
                    new Accesorio(
                            "Accesorio",
                            "Sirve para todo tipo de telefono",
                            20
                    )
            );

}

