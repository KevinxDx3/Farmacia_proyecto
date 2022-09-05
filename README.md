# Proyecto de la asignatura Programación orientada a objetos

Integrantes: Martin Rosero, Kevin Moreno, Erick Palomo

### VIDEOS DE DOCUMENTACION DE FUNCIONAMIENTO Y EXPLICACION DEL CODIGO

Video Manual de Usuario: https://youtu.be/gIi2L6OiZmg
Video Manual de Desarrollo y Funcionalidad: https://youtu.be/JzRYxcLLmSU

-------------------------------------------------------------------------------

### DETALLES A TOMAR EN CUENTA:

Proyecto Desarrollado en NetBeans 14

Para su correcto funcionamiento sera necesario cambiar la direccion de la BDD
acorde a su computador, para esto seguir los siguientes pasos:

1) Localizar la clase "conexion.java" en el arbol del proyecto en NetBeans.
![image](https://user-images.githubusercontent.com/85313351/188401462-abb9675c-3547-4a22-b97c-e3dc4387c7bd.png)

2) Reemplazar la direccion en la linea de codigo  "String strConexionDB ="jdbc:sqlite:C:/Users/PC/Documents/NetBeansProjects/Farmacia_proyecto/Base de Datos/Farmacia.s3db";" con la BDD en su equipo
![image](https://user-images.githubusercontent.com/85313351/188401652-52ac037d-b147-4f54-9513-2e31a84fe5c4.png)

3) Importar la libreria de conexion para bases de datos
![image](https://user-images.githubusercontent.com/85313351/188401915-a485ecba-3472-45bd-adf3-2a1c1a4745c2.png)

## CODIGO

El proyecto se divide en varios modulos:

1) Loguin
![image](https://user-images.githubusercontent.com/85313351/188402543-d8629443-c075-41e7-aa57-70ead4f944c5.png)

2) Inicio
![image](https://user-images.githubusercontent.com/85313351/188402611-6db370a6-7ae4-43e6-b296-337e5272d26b.png)

3) CRUD Productos
![image](https://user-images.githubusercontent.com/85313351/188402668-5281a49e-4d8e-4952-acdf-df4903c9f8cc.png)

4) CRUD Bodega
![image](https://user-images.githubusercontent.com/85313351/188402719-430afd8b-8180-438b-b51a-be4f131009d7.png)

5) CRUD Facturacion
![image](https://user-images.githubusercontent.com/85313351/188402800-6a9b942c-3175-405e-84ec-b5098893b5b0.png)

Cada uno de estos cuenta con sus clases, las cuales llaman a la BDD y la leen o modifican, segun los permisos del
usuario.








