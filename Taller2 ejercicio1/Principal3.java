import java.util.Scanner;

public class Principal3{
    public static void main(String[]args){

        Scanner entrada= new Scanner(System.in);
        Scanner entrada_texto=new Scanner(System.in);
        int opcion=0;
        int pos_actual=0;
        int opcion2=0;
        Persona3 lista []=new Persona3[10];
        

        do{
            System.out.println("|------------------------------  |");
            System.out.println("|----------PERSONAS------------  |");
            System.out.println("|-    Personas registradas: "+pos_actual+"    |");
            System.out.println("|-                            -  |");
            System.out.println("|1. Registrar cliente            |");
            System.out.println("|2. Ver lista de persona         |");
            System.out.println("|3. Modificar informacion cliente|");
            System.out.println("|4. Ver informacion cliente      |"); 
            System.out.println("|5. Eliminar cliente             |");
            System.out.println("|4. Salir                        |");
            System.out.println("|------------------------------  |");
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

                
                Persona3 temporal =new Persona3(cedula, nombres, apellidos, direccion, telefono, email);
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
                        lista[i].resumen();
                    }
                }
            }else if(opcion==3){
                System.out.println("ingrese su cedula para modificar informacion");
                int documento=entrada.nextInt();

                for(int o=0; o<pos_actual; o++){
                    if(documento==lista[o].getCedula()){
                        do{
                            System.out.println("1. cedula");
                            System.out.println("2. nombres");
                            System.out.println("3. apellidos");
                            System.out.println("4. direccion");
                            System.out.println("5. telefono");
                            System.out.println("6. email");
                            System.out.println("7. salir");
                            opcion2=entrada.nextInt(); 

                            if(opcion2==1){
                                System.out.println("ingrese la nueva cedula");
                                int nueva_cedula=entrada.nextInt();
                                lista[o].setCedula(nueva_cedula);
                            }else if(opcion2==2){
                                System.out.println("ingrese el nuevo nombre");
                                String nueva_nombre=entrada_texto.nextLine();
                                lista[o].setNombres(nueva_nombre);
                            }else if(opcion2==3){
                                System.out.println("ingrese el nuevo apellido");
                                String nueva_apellido=entrada_texto.nextLine();
                                lista[o].setApellidos(nueva_apellido);
                            }else if(opcion2==4){
                                System.out.println("ingrese la nueva direccion");
                                String nueva_direccion=entrada_texto.nextLine();
                                lista[o].setDireccion(nueva_direccion);
                            }else if(opcion2==5){
                                System.out.println("ingrese el nuevo telefono");
                                String nueva_telefono=entrada_texto.nextLine();
                                lista[o].setTelefono(nueva_telefono);
                            }else if(opcion2==6){
                                System.out.println("ingrese el nuevo email");
                                String nueva_email=entrada_texto.nextLine();
                                lista[o].setEmail(nueva_email);
                            }
                        }while(opcion2!=7);
                    }
                    
                }
                
            }else if(opcion==4){
                for (int i=0; i<lista.length; i++){
                    if(lista[i]!=null){
                        lista[i].resumen();
                    }
                }
                System.out.print("ingrese la cedula, para mostrar la informacion: ");
                int documento=entrada.nextInt();

                for(int i=0; i<pos_actual; i++){
                    if(documento==lista[i].getCedula()){
                        lista[i].mostrarDatosPersonales();    
                    }
                }
            }else if(opcion==5){
                for (int i=0; i<lista.length; i++){
                    if(lista[i]!=null){
                        lista[i].resumen();
                    }
                }
                System.out.print("ingrese la cedula que desea eliminar ");
                int eliminar=entrada.nextInt();

                for(int u=0; u<pos_actual;u++){
                    if(lista[u]!=null && eliminar==lista[u].getCedula()){
                        int pos=u;
                        for(int j=pos; j<lista.length-1;j++){
                            lista[j]=lista[j+1];
                        }
                    }
                }


            }else if(opcion==6){
                System.out.println("|------------SALIENDO----------|");
            }else{
                System.out.println("|-------OPCION INVALIDA--------|");
            }

            

        }while(opcion!=6);
        

        
    }
}        