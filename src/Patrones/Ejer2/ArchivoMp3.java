package Patrones.Ejer2;

public class ArchivoMp3 implements ArchivoDeMusica {

    private FileMp3 fileMp3 = new FileMp3();

    @Override
    public String reproducir() {
        return fileMp3.playMp3("MP3");
    }

//    2. Por un lado, tenemos a nuestra disposición una clase concreta (externa, que no podemos modificar)
//    denominada FileMp3 que tiene un método para reproducir archivos con la siguiente declaración:
//    public String playMp3();
//    Por el otro lado, necesitamos reproducir archivos de ese tipo cumpliendo con la siguiente
//    interfaz ArchivoDeMusica:
//    public String reproducir();
//    ¿Qué patrón de los vistos en clase resuelve el problema? Utilizandolo, implementar la clase
//    ArchivoMp3, capaz de cumplir con la funcionalidad solicitada. Incluya todo el código necesario
//    para poder probar la funcionalidad solicitada.
//    (La reprodución puede simularse devolviendo un mensaje de texto, tal como “Reproduciendo archivo <extensión>”.)

}
