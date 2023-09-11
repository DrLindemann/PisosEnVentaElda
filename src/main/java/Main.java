import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        //URL donde haremos el scrap
        String url = "https://www.pisos.com/venta/pisos-elda/";

        try {
            // Realiza una solicitud HTTP GET y obtiene el HTML de la página
            Document doc = Jsoup.connect(url).get();

            // Busca todas las casas que se encuentran en etiquetas con la clase "ad-preview"
            Elements casas = doc.select(".ad-preview");
            //Dentro de cada casa busca los datos de las casas
            Elements pisos = doc.select(".ad-preview__inline");

            // Recorremos todos los contenedores donde hay pisos y pedimos los datos deseados
            for (Element casa : casas) {
                String titulo = casa.select(".ad-preview__title").text();
                String precio = casa.select(".ad-preview__price").text();
                String descripcion = "";
                //Recorremos la informacion de dentro de cada casa
                for (Element piso : pisos) {
                    descripcion = piso.select(".ad-preview__char.p-sm").text();
                }

                // Imprime la información de cada casa
                System.out.println("Título: " + titulo);
                System.out.println("Precio: " + precio);
                System.out.println("Descripción: " + descripcion);
                System.out.println("--------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}