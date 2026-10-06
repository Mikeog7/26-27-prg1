# Plantillas

Esta carpeta contiene algunos archivos que puede usar como plantillas para diversos artefactos. Copie el archivo a su carpeta de entrega y modifíquelo; no edite el original.

## Código

|Plantilla|Para qué sirve|
|-|-|
|[ClaseJava.java](ClaseJava.java)|Punto de partida de un programa Java: una clase con su método `main`. El nombre del archivo debe coincidir con el de la clase.|

## Diagramas PlantUML

Los archivos `.puml` se pueden visualizar pegando su contenido en [PlantText](https://www.planttext.com/) o con la extensión *PlantUML* de VSCode.

|Plantilla|Para qué sirve|Referencia|
|-|-|-|
|[diagramaActividades.puml](diagramaActividades.puml)|Pasos de un algoritmo: secuencia, decisión (`if`) y repetición (`while`).|[Actividades](https://plantuml.com/es/activity-diagram-beta)|
|[diagramaEstados.puml](diagramaEstados.puml)|Estados por los que pasa algo y los eventos que lo hacen cambiar.|[Estados](https://plantuml.com/es/state-diagram)|
|[diagramaClases.puml](diagramaClases.puml)|Clases con sus atributos y métodos, y las relaciones entre ellas.|[Clases](https://plantuml.com/es/class-diagram)|
|[diagramaObjetos.puml](diagramaObjetos.puml)|Objetos concretos, con los valores de sus atributos en un momento dado.|[Objetos](https://plantuml.com/es/object-diagram)|
|[diagramaSecuencia.puml](diagramaSecuencia.puml)|Mensajes que se intercambian los participantes, en orden temporal.|[Secuencia](https://plantuml.com/es/sequence-diagram)|
|[arbolDirectorios.puml](arbolDirectorios.puml)|Estructura de carpetas y archivos (por ejemplo, el estado inicial y final de un reto).|[Salt](https://plantuml.com/es/salt)|

## Notación de visibilidad en los diagramas de clases

|Símbolo|Visibilidad|
|-|-|
|`-`|`private`|
|`+`|`public`|
|`#`|`protected`|
|`~`|*package* (sin modificador)|
