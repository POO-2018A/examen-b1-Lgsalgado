package bibliotecaPersonal;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Examen {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        Libro[] libros = new Libro[10];
        Libro[] librosFavoritos = new Libro[10];
        do {
            System.out.println("**************BIBLIOTECA PERSONAL**************");
            System.out.println();
            System.out.println("1.-INGRESAR NUEVO LIBRO A BIBLIOTECA: ");
            System.out.println("2.-IMPRIMIR LISTA DE TODOS LOS LIBROS FAVORITOS ");
            System.out.println("3.-CONTAR LIBROS DE AUTOR");
            System.out.println("4.-SALIR");
            opcion = scan.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("CUANTOS LIBROS DESEA INGRESAR: ");
                    System.out.println("RECUERDE SOLO PUEDE INGRESAR HASTA 10 LIBROS");
                    int x=scan.nextInt();
                        for (int i = 0; i < x; i++) {
                            scan.nextLine();
                            System.out.println("LIBRO " + (i + 1));
                            System.out.println("INGRESE EL TITULO: ");
                            String titulo = scan.nextLine();
                            //scan.nextLine();
                            System.out.println("INGRESE AÑO: ");
                            int anioLibro = scan.nextInt();
                            // System.out.println();
                            scan.nextLine();
                            System.out.println("SU LIBRO ES FAVORITO :");
                            System.out.println("INGRESE SI/NO");
                            String siOno=scan.nextLine();
                                    boolean libroFavorito=false;
                                    if(siOno.equals("si")||siOno.equals("SI")){
                                        libroFavorito=true;
                                        libros [i]=new Libro(titulo,anioLibro,libroFavorito);
                                    }
                            libros [i]=new Libro(titulo,anioLibro,libroFavorito);
                            System.out.println("INGRESE DATOS DEL AUTOR DEL LIBRO: ");

                            System.out.println("INGRESE NOMBRE DEL AUTOR");
                            String nombreAutor=scan.nextLine();
                            System.out.println("INGRESE PAIS DEL AUTOR");
                            String paisAutor=scan.nextLine();
                            Autor autores = new Autor(nombreAutor,paisAutor);
                            libros[i].setAutor(autores);

                        }
                        break;

                case 2:
                    System.out.println("USTED SELECCIONO IMPRIMIR LOS LIBROS FAVORITOS");
                    System.out.println("SU LISTA ES ");
                    for (int j=0;j>libros.length;j++){
                        System.out.println(libros[j]);
                    }
                    break;
                case 3:
                    System.out.println("USTED SELECCIONO CONTAR LIBROS");
                    for (int i=0;i<libros.length;i++){
                        System.out.println(libros[i].getAutor());

                    }
                    break;
                case 4:
                    System.out.println("GRACIAS");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA INGRESE UNA OPCION VALIDA");
                    System.out.println();

                    break;
            }
        }while (opcion != 4) ;
    }
}

