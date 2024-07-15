# Protección y Compresión de archivos por métodos de Hamming y Huffman <br>

 <img width="50px" src="https://github.com/tandpfun/skill-icons/raw/main/icons/Java-Dark.svg" /> 

:blossom: Funciona con archivos .txt y .docx. <br>
:blossom: Los archivos deben estar en la misma ruta del proyecto.<br>
:blossom: Créditos a mi compañero de equipo Juan Sánchez, quién realizó la parte de Protección y Compresión.<br>
:blossom: Yo realicé la Desprotección y Descompresión, además de la interfaz.<br>
:blossom: Laboratorio final para la materia Teoría de la Información y la Comunicación.<br>
:blossom: <a href="https://n9.cl/3ilrd" target="_blank">En este informe se detalla el funcionamiento del proyecto.</a><br><br>

<h1>Proyecto</h1>
    <p>
        1-Realizar un proyecto que permita a un archivo de tipo texto (txt, Word, WP, ...), ingresado por el usuario, pueda compactarlo (LAB2), protegerlo (para diferentes bloques (LAB1) – posibilitando corregir 1 error por bloque) generando un archivo codificado para ser enviado por un medio con ruido con una probabilidad de error muy baja.
    </p>
    <p>
        Este archivo generado será enviado por mail a otro usuario, que teniendo el mismo programa pueda leer el archivo recibido y pueda obtener archivo original realizando los procedimientos de desprotección y descompactación necesarios.
    </p>
    <p>
        Recordar y aplicar los programas realizados en LAB 1 Y LAB 2.
    </p>
    <p>
        El programa deberá tener un menú de opciones que permita:
    </p>
    <ul>
        <li>Compactar el archivo utilizando el método de Huffman. En este caso, realizaremos el método más efectivo, usando una tabla de frecuencias por archivo (las frecuencias específicas del archivo mismo). Tomaremos un archivo y aplicaremos Huffman para compactarlo. La tabla puede estar en el mismo archivo compactado o en un archivo adicional.</li>
        <li>Descompactar archivo compactado y así obtener el archivo original.</li>
        <li>Poder visualizar texto original y texto recuperado en pantalla.</li>
        <li>Proteger el archivo aplicando Hamming (módulos según LAB 1), debe ser posible aplicar Hamming al archivo texto original o al archivo compactado.</li>
        <li>Poder introducir errores máximo uno por módulo, aleatorio en qué módulo y aleatorio en la posición del módulo.</li>
        <li>Poder introducir 2 errores máximo por módulo en forma programada.</li>
        <li>Desproteger archivos sin corregir.</li>
        <li>Desproteger archivos corrigiendo.</li>
        <li>Poder visualizar texto original y texto recuperado en pantalla.</li>
    </ul>
    <p>
        Recordar y aplicar los programas realizados en LAB 1 Y LAB 2 y además:
    </p>
    <p>
        - PODER VER ESTADÍSTICAS DE COMPACTACIÓN Y DE PROTECCIÓN SEGÚN DIFERENTES TAMAÑOS DE MÓDULOS.
    </p>
