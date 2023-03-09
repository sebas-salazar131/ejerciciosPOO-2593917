import java.util.Scanner;

public class Principal2{
    public static void main(String[]args){

        Scanner entrada= new Scanner(System.in);
        Scanner entrada_texto=new Scanner(System.in);
        int opcion=0;
        int pos_actual=0;
        Persona2 lista []=new Persona2[10];
        

        do{
            System.out.println("|------------------------------|");
            System.out.println("|----------PERSONAS------------|");
            System.out.println("|-    Personas registradas: "+pos_actual+"  |");
            System.out.println("|-                            -|");
            System.out.println("|1. Registrar persona          |");
            System.out.println("|2. Ver lista de persona       |");
            System.out.println("|3. Ordenar lista persona      |");
            System.out.println("|4. salir                      |");                    
            System.out.println("|------------------------------|");
            opcion=entrada.nextInt();
            

            if (opcion==1){ 
                System.out.print("ingrese una cedula: ");
                int cedula=entrada.nextInt();

                System.out.print("ingrese nombres: ");
                String nombres=entrada_texto.nextLine();

                System.out.print("ingrese apellidos: ");
                String apellidos=entrada_texto.nextLine();

                System.out.print("ingrese direccion: ");
                String direccion=entrada_texto.nextLine();

                System.out.print("ingrese un telefono: ");
                String telefono=entrada_texto.nextLine();

                System.out.print("ingrese un email: ");
                String email=entrada_texto.nextLine();

                
                Persona2 temporal =new Persona2(cedula, nombres, apellidos, direccion, telefono, email);
                boolean valido=true;
                for(int e=0;e<pos_actual;e++){
                    if(temporal.getCedula()==lista[e].getCedula()){
                        valido=false;
                        break;
                       
                    }
                }
                if(valido){
                    lista[pos_actual]=temporal;
                    pos_actual++;
                    System.out.println("-----REGISTRADO CON EXITO----");
                }else{
                    System.out.println("---ESTE DOCUMENTO YA ES EXISTENTE--");
                }

            }else if(opcion==2){
                for (int i=0; i<lista.length; i++){
                    if(lista[i]!=null){
                        lista[i].mostrarDatosPersonales();
                    }
                }
            }else if(opcion==3){
                for(int i=0; i<lista.length;i++){
                    for(int j=0;j<lista.length-1;j++){
                        if(lista[j]!=null && lista[j+1]!=null){
                            if(lista[j].getNombres().compareToIgnoreCase(lista[j+1].getNombres())>0){
                                Persona2 aux=lista[j];
                                lista[j]=lista[j+1];
                                lista[j+1]=aux;
                            }
                        }
                    }
                }

            }else if(opcion==4){
                System.out.println("|------------SALIENDO----------|");
            }else{
                System.out.println("|-------OPCION INVALIDA--------|");
            }

            

        }while(opcion!=4);
        

        
    }
}        