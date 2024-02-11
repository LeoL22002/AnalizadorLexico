/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author leo
 */
public enum Tokens {
    Reservada,
    Cadena,
    Asignacion,
    Suma,
    Resta,
    Multiplicacion,
    Division,
    Identificador,
    Numero,
    Comparacion,
    ParentesisApertura,
    ParentesisCierre,
    LlaveApertura,
    LlaveCierre,
    PuntoYComa,
    Mayor,
    Menor,
    MayorIgual,
    MenorIgual,
    OpTernario,
    OpSeparacion,
    ERROR
}
