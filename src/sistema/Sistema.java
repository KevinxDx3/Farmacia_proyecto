/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema;

import InicioGUI.frmInicio;
import LoginGUI.frmLoguin;

/*
Creadores: Kevin Moreno, Erick Moreno, Martin Rosero
Version: 2.0
Fecha: 04/09/2022
*/


// Metodo Main Que inicia el programa llamando al loguin

//Las credenciales de la BDD som: usuario: admin, clave: 123
public class Sistema {

    public static void main(String[] args) {
        
        frmLoguin ini=new frmLoguin();
        ini.setVisible(true);
    }
    
}
