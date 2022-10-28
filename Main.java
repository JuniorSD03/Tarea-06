package Pregunta04;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Capitulo capitulo = new Capitulo();

        libro.setTitulo("Nombre libro");
        libro.setCodig(12121212);
        libro.setAnioPublicacion("2000");

        libro.agregarAutor(new Autor("Autor", "Numero Uno"));
        libro.agregarAutor(new Autor("Autor", "Numero Dos"));

        libro.agregarCapitulo(new Capitulo("Cap 01"));
        libro.agregarCapitulo(new Capitulo("Cap 02"));

        capitulo.agregarTema(new Tema("Tema 01"));
        capitulo.agregarTema(new Tema("Tema 02"));
        capitulo.agregarTema(new Tema("Tema 03"));

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Codigo: " + libro.getCodig());
        System.out.println("Año de publicaccion: " + libro.getAnioPublicacion());

        //USAMOS EL FOREACH DE JAVA PARA IMPRIMIR EL ARREGLO
        for (Autor au: libro.getAutor()){
            System.out.println("    Autor: " + au.getNombres() + " " + au.getApellidos());
        }
        for (Capitulo cap: libro.getCapitulo()){
            System.out.println("        Capitulo: " + cap.getNombreCapitulo());
            for (Tema tem: capitulo.getTema()){
                System.out.println("            Tema: " + tem.getNombreTema());
            }
        }

        libro.buscarCapitulo();
    }
}
