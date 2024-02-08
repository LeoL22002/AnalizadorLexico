/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.io.File;

/**
 *
 * @author leo
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/leolo/OneDrive/Escritorio/Universidad/Compiladores/Programas/AnalizadorLexico/src/Analizador/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
   File archivo = new File(ruta);
   JFlex.Main.generate(archivo);
   
    }
}
