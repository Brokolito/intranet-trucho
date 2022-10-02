public class Principal {
    public static void main(String[] args) {
        Inicializar();
    }
public static void Inicializar(){
Curso curso=new Curso("Marcelo",1,"ICI-I");
curso.AddAlumno(new Alumno(21173339-6, curso.getNombre(), "Castro", curso.getCarrera()));

}
}
