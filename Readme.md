# Web Scraping de Pisos en Venta en Elda 

Este proyecto es una aplicación de Java que utiliza la biblioteca Jsoup para realizar web scraping en el sitio web pisos.com y obtener información sobre anuncios inmobiliarios en una página específica. En este ejemplo, se ha utilizado la página de ventas de pisos en Elda como fuente de datos.

## Descripción

La aplicación se conecta a la página web especificada, recopila información sobre los anuncios inmobiliarios y muestra detalles como el título, el precio y la descripción de cada piso o casa.

## Cómo funciona

La aplicación sigue los siguientes pasos:

1. Se establece la URL del sitio web objetivo.
2. Se utiliza Jsoup para conectarse a la página web y obtener su contenido HTML.
3. Se utilizan selectores CSS para identificar y extraer elementos específicos de la página que contienen información sobre los anuncios.
4. Se itera a través de los elementos encontrados y se extrae la información relevante, como el título y el precio del anuncio.
5. Se muestra la información en la consola.

## Uso

Asegúrate de tener Java instalado en tu sistema antes de ejecutar esta aplicación. Puedes compilar y ejecutar el código Java proporcionado en el archivo `Main.java`. Asegúrate también de tener la biblioteca Jsoup en tu proyecto.

```shell
javac Main.java
java Main