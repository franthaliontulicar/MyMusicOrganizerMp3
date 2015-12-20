
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test{
    /**
     * Test para comprobar el funcionamiento correcto de los métodos
     * checkIndex, validIndex, listFile y removeFile.
     */
    public void test1(){
        MusicOrganizer organizadorMp3 = new MusicOrganizer();

        //Comprobación de que no hay elementos en la lista
        organizadorMp3.checkIndex(0);

        /*Comprueba cuales serian los valores correctos(rango)
        Se añaden tres elementos a la lista y se comprueban sin mostrar nada por pantalla */
        organizadorMp3.addFile("radio.mp3");
        organizadorMp3.addFile("radio1.mp3");
        organizadorMp3.addFile("radio2.mp3");
        organizadorMp3.checkIndex(0);
        organizadorMp3.checkIndex(1);
        organizadorMp3.checkIndex(2);

        //Comprobamos valores no validos de la lista(fuera de rango)
        organizadorMp3.checkIndex(3);

        //Comprobamos que el objeto identifica los valores  validos(dentro de rango) 
        organizadorMp3.validIndex(0);
        organizadorMp3.validIndex(1);
        organizadorMp3.validIndex(2);
        //y erroneos(fuera de rango)
        organizadorMp3.validIndex(3);

        //Mostramos los valores  de la lista 
        organizadorMp3.listFile(0);
        organizadorMp3.listFile(1);
        organizadorMp3.listFile(2);

        //Eliminamos un elemento de la lista 
        organizadorMp3.removeFile(0);
        //El segundo elemento de la lista pasa a ser el primero y el tercero el segundo 
        organizadorMp3.listFile(0);
        organizadorMp3.listFile(1);

    }
}