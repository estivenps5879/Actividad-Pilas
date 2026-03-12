# Editor de Texto con Pilas

## Objetivo del proyecto
Implementar un editor de texto simple en consola que use estructuras de datos tipo pila para soportar las operaciones de "deshacer" (undo) y "rehacer" (redo). El programa permite escribir líneas, deshacer la última línea escrita y rehacer líneas previamente deshechas.

## Estructura del proyecto
- src\EditorTexto.java — Código fuente (clases Pila y EditorTexto).
- out\production\Actividad pilas — Archivos .class compilados.
- Imagenes\ — Carpeta para guardar capturas de pantalla de la ejecución.

## Requisitos
- Java JDK 8 o superior.

## Instrucciones de ejecución
1. Abrir un terminal en la raíz del proyecto (C:\Users\TIVEN\IdeaProjects\Actividad pilas).
2. Verificar Java: `java -version`.
3. Compilar (si no hay archivos .class o desea recompilar):
   javac -d "out\production\Actividad pilas" src\EditorTexto.java

4. Ejecutar el programa:
   java -cp "out\production\Actividad pilas" EditorTexto

Nota: Si utilizas un IDE (IntelliJ IDEA, Eclipse), abre el proyecto y ejecuta la clase `EditorTexto` directamente.

## Uso (menú)
Al ejecutar verás un menú con opciones:
1. Escribir texto — Añade una línea al documento (se guarda en la pila principal).
2. Deshacer — Quita la última línea escrita y la mueve a la pila secundaria.
3. Rehacer — Recupera la última línea deshecha desde la pila secundaria de vuelta a la principal.
4. Mostrar texto actual — Muestra todas las líneas almacenadas en la pila principal.
5. Salir — Termina el programa.

Comportamiento importante: al escribir una nueva línea se borra la pila secundaria (no se puede rehacer después de escribir nueva entrada).

## Capturas de pantalla

### 1. Menú principal
![Captura de pantalla 2026-03-12 002458.png](Imagenes/Captura%20de%20pantalla%202026-03-12%20002458.png)

### 2. Escribir texto
![Captura de pantalla 2026-03-12 002527.png](Imagenes/Captura%20de%20pantalla%202026-03-12%20002527.png)

### 3. Deshacer y Rehacer
![Captura de pantalla 2026-03-12 002627.png](Imagenes/Captura%20de%20pantalla%202026-03-12%20002627.png)

![Captura de pantalla 2026-03-12 002636.png](Imagenes/Captura%20de%20pantalla%202026-03-12%20002636.png)

### 4. Mostrar texto actual
![Captura de pantalla 2026-03-12 002924.png](Imagenes/Captura%20de%20pantalla%202026-03-12%20002924.png)

### 5. Salir
![Captura de pantalla 2026-03-12 002941.png](Imagenes/Captura%20de%20pantalla%202026-03-12%20002941.png)

## Contribuyentes
- Estiven Patiño Suárez