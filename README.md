# Tarea: ["Documentacion codigo Juego de rol"]

# Requisitos

- Java JDK (versión 18 )

## Instalación y Uso

1. Abre el proyecto en tu IDE preferido (por ejemplo, IntelliJ IDEA, Eclipse).
2. Compila el proyecto.
3. Ejecuta el programa principal desde la clase principal `Main java`.
4. Sigue las instrucciones para utilizar el programa.

## Descripción

Desarrolla un fichero README.md para el ejercicio realizado en clase de desarrollo de un juego de rol.

El fichero debse contener al menos:

- Una cabecera principal
- Cabeceras secundarias de sección
- Al menos una lista.
- Al menos un enlace
- Al menos una imagen.
- Al menos un extracto de código.

El fichero README debe contener información tanto técnica como instrucciones de uso del propio juego. Tendrá una sección donde se listan y describen las clases utilizadas, y como arrancar el juego (se podrá adjuntar una captura de pantalla indicando el botón que se usa para arrancar el juego, puede ser el RUN del IDE que estés utilizando).
Tendrá otra sección con las instrucciones del juego, es decir, describir su panel de control, las teclas que tiene que usar el jugador, el tipo de items que podrá equiparse junto con la descripción de los mismos (daño, índice de esquiva), así como el modo de finalizar la partida, equiparse un item, tipo de enemigos con los que podrá encontrarse, etc.

# Tenemos las sguientes clases

- Personaje, la clase principal. 
- Inventario, es la clase inventario donde tenemos los objetos. 
- Dados, para que nos de un numero aleatorio. 
- Enemigo, la clase contra la que va a pelear el personaje a traves de unos 
- Item una clase la cual va a contener los objetos.

### Clase Personaje:

#### Atributos

- **Nombre**: Tipo string, Nombre del personaje.
- **Nivel**: Tipo int, Nivel del personaje (Empieza en 1)
- **Experiencia acumulada**: Tipo int, Es la experiencia de cuando matas al enemigo
- **Inventario**: De la clase Inventario.
- **Item**: De la clase Item.
- **Enemigo**: De la clase Enemigo.
- **Dado**: De la clase dado.

#### Métodos

- **GetNombre**: Nos devuelve el nombre del personaje.
- **GetItem**: Nos devuelve el de el Inventario en el metodo de itemequipado, el item que tiene equipado. (Nos devuelve el nombre).
- **GetExperienciaacumulada** Nos devuelve la experiencia aculada
- **Experiencia añadida (Int cantidad)**: A la experiencia acumulada le añade la cantidad
- **Subirdenivel**: aumenta el nivel
- **Añadir inventario (Item item)**: Recibe un item y llama al metodo de La clase Inventario
- **ListarItem**: LLamar al metodo del inventario para listar los items
- **Equipar Item (Int numero)** Para seleccionar del arryze la posicion donde esta el item
- **Luchar (Enemigo enemigo)** la experiencia acumulada le añade la experiencia que otorga el enemigo + llama a el metodo subir de nivel

- **Subirdenivel**: Metodo para subir el nivel, contiene un alamcen

- **Atacar**: Metodo para luchar con el enemigo
- **Esquivar**: Es el metodo que depende del arma que tenga el jugador esquiva mejor o peor

### Clase Item:

#### Atributos

- **Nombre**: Tipo string, Nombre del Item.
- **Descripcion**: Tipo String Descripcion del personaje

#### Métodos

- **GetNombre**: Nos devuelve el nombre del Item.
- **GetDescripcion**: Nos da la descripcion del item
- **ToString** Metodo para recuperar el nombre

### Clase Enemigo:

#### Atributos

- **Nombre**: Tipo string, Nombre del personaje.
- **ExperienciaOtorga**: Tipo Int Es la experiencia que otorga el enemigo.

#### Métodos

- **GetNombre**: Nos devuelve el nombre del Enemigo.
- **GetExperienciaOtorga**: Devuelve un integer que es la experiencia que otorga el enemigo.
- **Atacar (Personaje personaje)** Es el metodo de atacar del enemigo, que lo recibe el personaje.

### Clase Inventario:

#### Atributos

- **Item[]**: Tipo Arryze, Tipo de arryze.
- **Capacidad**: Tipo int Define la capacidad del arryze
- **Item itemequipado** Es de la clase Item

#### Métodos

- **Añadir objeto al inventario**: Un while mientras que el objeto no haya sido insertado y el arryze no este vacio que vaya añadiendo los objetos al inventario.
- **ListarItem**: Metodo para listar todos los objetos de un arryze que recibe como parametro un numero.
- **GetItemEquipado** Metodo para recuperar el item.

### Clase Enemigo:

#### Atributos

- **Nombre**: Tipo string, Nombre del personaje.
- **ExperienciaOtorga**: Tipo Int Es la experiencia que otorga el enemigo.

#### Métodos

- **GetNombre**: Nos devuelve el nombre del Enemigo.
- **GetExperienciaOtorga**: Devuelve un integer que es la experiencia que otorga el enemigo.
- **Atacar (Personaje personaje)** Es el metodo de atacar del enemigo, que lo recibe el personaje.

### Clase Dado:

#### Atributos

- **Random Lanzar**: Tipo Random, Lanza un numero random.

#### Metodos

- **Lanzar (Recibe el numero de caras)**: Devuelve un numero.

### Main:

#### Atributos

- **enemigo**: Es el constructor de Enemigo.
- **Atributos**: Son varios atributos para que funcionen los metodos, por ejemplo tenemos un menu el cual nos da una serie de opciones y para elegir las opciones.

#### Instrucciones para jugar

![](image.png) Le daremos a iniciare arriba para que inicie el programa, Iniciara el programa y debera de poner el nombre, y seleccionas una de las opciones de juego, ejemplo vamos a seleccionar la 1

![](image-1.png)

Una vez seleccionada la 1º opcion abra un combate.

## Autor

- Nombre: Manuel Copado
- Contacto: manuelcopadorubio200436@gmail.com
- [Readme del juego](https://github.com/Manu09234/JuegoRol)

