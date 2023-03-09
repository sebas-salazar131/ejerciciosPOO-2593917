public class Persona2{

    //atributos
    int cedula;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String email;
    

    //metodos

    public Persona2(int cedula, String nombres, String apellidos, String direccion, String telefono, String email){
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.telefono=telefono;
        this.email=email;
    }

    public int getCedula(){
        return this.cedula;
    }
    public String getNombres(){
        return this.nombres;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getEmail(){
        return this.email;
    }

    public void setCedula(int cedula){
        this.cedula=cedula;
    }
    public void setNombres(String nombres){
        this.nombres= nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void mostrarDatosPersonales(){
        System.out.print(" |Documento: "+this.cedula);
        System.out.print(" |Nombres: "+this.nombres);
        System.out.print(" |Apellido: "+this.apellidos);
        System.out.print(" |Direccion: "+this.direccion);
        System.out.print(" |Telefono: "+this.telefono);
        System.out.println(" |Email: "+this.email);
    }
}    