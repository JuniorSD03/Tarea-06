package Pregunta04;

import java.util.Scanner;

public class Libro {
    Scanner scanner = new Scanner(System.in);


    private String titulo;
    private Integer codig;
    private Autor autor[];
    private int contadorAutor;
    private String anioPublicacion;
    private Capitulo capitulo[];
    private int contadorCapitulo;


    public Libro(){
        this.autor = new Autor[2];
        this.contadorAutor = 0;

        this.capitulo = new Capitulo[2];
        this.contadorCapitulo = 0;
    }


    public Libro(String titulo, Integer codig, String anioPublicacion) {
        this.titulo = titulo;
        this.codig = codig;
        this.anioPublicacion = anioPublicacion;
    }


    public void agregarAutor(Autor autor){
        this.autor[contadorAutor++] = autor;
    }

    public void buscarCapitulo(){
        String busqueda;
        System.out.println("¿Que capitulo busca?");
        busqueda = scanner.nextLine();
        int band=0;

        for (int i=0; i<getCapitulo().length;i++){
            String cap = capitulo[i].getNombreCapitulo();
            if (cap.equals(busqueda)){ /*El == no funciona y no sé porqué, pero encontré este método*/
                System.out.println("Caputilo " + capitulo[i].getNombreCapitulo() + " encontrado en la posición " + i);
                band=1;
                break;
            }
        }
        if(band==0){
            System.out.println("Capitulo no encontrado");
        }
    }


    public void agregarCapitulo(Capitulo capitulo){
        this.capitulo[contadorCapitulo++] = capitulo;
    }


    public Autor[] getAutor() {
        return autor;
    }

    public Capitulo[] getCapitulo() {
        return capitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCodig() {
        return codig;
    }

    public void setCodig(Integer codig) {
        this.codig = codig;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
