/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucreativa.interfaz;

import com.ucreativa.interfaz.Main;
import java.util.Scanner;

/**
 *
 * @author silvi
 */
public class Submenus {
    //SUB MENUS: CURSO, CARRERA, ESTUDIANTE Y PROFESOR
    
    Main inicio = null;
    
    public Submenus(Main inicio) {
        this.inicio = inicio;
    }

    Scanner scanner01 = new Scanner(System.in);

    public void subMenuCurso() {
        boolean b = true;
        while (b) {
            System.out.println("-------------------SubMenu--------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1-Agregar");
            System.out.println("2-Modificar");
            System.out.println("3-Eliminar");
            System.out.println("4-Consultar");
            System.out.println("5-Generar lista de estudiantes matriculados");
            System.out.println("6-Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Opcion seleccionada:");
            String operacion = scanner01.nextLine();
            int operador = -1;
            try {
                operador = Integer.parseInt(operacion);
            } catch (NumberFormatException e) {
                System.out.println("Opcion invalida");
            }
            switch (operador) {
                case 1:
                    inicio.agregarCurso();
                    break;
                case 2:
                    inicio.modificarCurso();
                    break;
                case 3:
                    inicio.eliminarCurso();
                    break;
                case 4:
                    inicio.consultarCurso();
                    break;
                case 5:
                    inicio.generarListaEstudiantesCurso();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema");
                    b = false;
                    break;
                default:
                    break;
            }

        }
    }

    public void subMenuCarreras() {
        boolean b = true;
        while (b) {
            System.out.println("-------------------SubMenu--------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1-Agregar");
            System.out.println("2-Modificar");
            System.out.println("3-Eliminar");
            System.out.println("4-Consultar");
            System.out.println("5-Asignar director a Carrera");
            System.out.println("6-Eliminar director de Carrera");
            System.out.println("7-Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Opcion seleccionada:");
            String operacion = scanner01.nextLine();
            int operador = -1;
            try {
                operador = Integer.parseInt(operacion);
            } catch (NumberFormatException e) {
                System.out.println("Opcion invalida");
            }
            switch (operador) {
                case 1:
                    inicio.agregarCarrera();
                    break;
                case 2:
                    inicio.modificarCarrera();
                    break;
                case 3:
                    inicio.eliminarCarrera();
                    break;
                case 4:
                    inicio.consultarCarrera();
                    break;
                case 5:
                    inicio.asignarQuitarProfesorDirectorCarrera(false);
                    break;
                case 6:
                    inicio.asignarQuitarProfesorDirectorCarrera(true);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema");
                    b = false;
                    break;
                default:
                    break;
            }
        }
    }



    public void subMenuEstudiante() {
        boolean b = true;
        while (b) {
            System.out.println("-------------------SubMenu--------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1-Agregar");
            System.out.println("2-Modificar");
            System.out.println("3-Eliminar");
            System.out.println("4-Consultar");
            System.out.println("5-Asignar Carrera");
            System.out.println("6-Eliminar Carrera");
            System.out.println("7-Asignar Curso");
            System.out.println("8-Eliminar Curso");
            System.out.println("9-Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Opcion seleccionada:");
            String operacion = scanner01.nextLine();
            int operador = -1;
            try {
                operador = Integer.parseInt(operacion);
            } catch (NumberFormatException e) {
                System.out.println("Opcion invalida");
            }
            switch (operador) {
                case 1:
                    inicio.agregarEstudiante();
                    break;
                case 2:
                    inicio.ModificarEstudiante();
                    break;
                case 3:
                    inicio.eliminarEstudiante();
                    break;
                case 4:
                    inicio.consultarEstudiante();
                    break;
                case 5:
                    inicio.asignarQuitarCarreraEstudiante(false);
                    break;
                case 6:
                    inicio.asignarQuitarCarreraEstudiante(true);
                    break;
                case 7:
                  inicio.asignarQuitarCursoEstudiante(false);
                  break;
                case 8:
                  inicio.asignarQuitarCursoEstudiante(true);
                    break;
                 case 9:
                    System.out.println("Saliendo del sistema");
                    b = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void subMenuProfesor() {
        boolean b = true;
        while (b) {
            System.out.println("-------------------SubMenu--------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1-Agregar");
            System.out.println("2-Modificar");
            System.out.println("3-Eliminar");
            System.out.println("4-Consultar");
            System.out.println("5-Asignar Carrera");
            System.out.println("6-Eliminar Carrera");
            System.out.println("7-Salir");
            System.out.println("----------------------------------------------");
            System.out.println("Opcion seleccionada:");
            String operacion = scanner01.nextLine();
            int operador = -1;
            try {
                operador = Integer.parseInt(operacion);
            } catch (NumberFormatException e) {
                System.out.println("Opcion invalida");
            }
            switch (operador) {
                case 1:
                    inicio.agregarProfesor();
                    break;
                case 2:
                    inicio.ModificarProfesor();
                    break;
                case 3:
                    inicio.eliminarProfesor();
                    break;
                case 4:
                    inicio.consultarProfesor();
                    break;
                case 5:
                    inicio.asignarQuitarCarreraProfesor(false);
                    break;
                case 6:
                    inicio.asignarQuitarCarreraProfesor(true);
                    break;
                case 7:
                    System.out.println("Saliendo del sistema");
                    b = false;
                    break;
                default:
                    break;
            }
        }
    }
}
