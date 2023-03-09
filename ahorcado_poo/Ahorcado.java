import java.util.Scanner;

public class Ahorcado{
    private String palabra;
    private String letra;
    private String nombre;
    private  char arreglo[];
    private boolean jugando;

    public Ahorcado(){
        this.palabra="zorro";
        this.letra="";
        this.nombre="";
        this.arreglo=new char [5];
        this.jugando=true;
        this.limpiarTablero();

    }

    public void limpiarTablero(){
        for(int i=0; i<this.arreglo.length;i++){
            this.arreglo[i] = '_';
        }
    }

    public void imprimirTablero(){
        for(int i=0; i<this.arreglo.length;i++){
            System.out.print("["+this.arreglo[i]+"]");
        }
    }

    public void start(){
        System.out.print("ingrese una letra")
        String
    }

}    
