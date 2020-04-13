/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excel;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;

public class Excel {
    
    JFileChooser FileChooser=new JFileChooser(); 
    
    public void importarExcel(DefaultTableModel modelo){
        try {
            boolean datosCargado=true;
            //Abrimos la ventana, guardamos la opcion seleccionada por el usuario
            int seleccion = FileChooser.showDialog(null, "Importar Hoja Excel");//titulo
            File file = FileChooser.getSelectedFile();//Nos muestra una ventana donde se seleccionara el archivo xls

            if(seleccion==JFileChooser.APPROVE_OPTION){//Si el usuario, pincha en aceptar
                if(!file.getName().endsWith("xls"))//Si el usuario selecciona un archivo que no termine con extencion xls						  
                      JOptionPane.showMessageDialog(null, "Seleccione un archivo xls...", "Error",JOptionPane.ERROR_MESSAGE);
                else{ 
                    Workbook libroTrabajo = null;//creamos un libro de trabajo que contendra los datos que se imporan del archivo seleccionado
                    try {
                        libroTrabajo = Workbook.getWorkbook(file);//A el objeto libroTrabajo le pasamos todas las hojas que contenga el archivo seleccionado
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Error al guardar el libro de trabajo", "Error",JOptionPane.ERROR_MESSAGE);
                    }
                    for (int numeroDeHoja = 0; numeroDeHoja < libroTrabajo.getNumberOfSheets(); numeroDeHoja++) {
                        Sheet hoja = libroTrabajo.getSheet(numeroDeHoja);//ceamos un objeto hoja y le asignamos la primer hoja del libroTrabajo
                        //se establecen los valores de las tablas de exel en un jtable
                        for (int j = 1; j < hoja.getRows(); j++) {//controlamos filas 
                            if (hoja.getCell(0, j).getContents().replace(" ","").length()!=0 && hoja.getCell(1, j).getContents().replace(" ","").length()!=0 && hoja.getCell(2, j).getContents().replace(" ","").length()!=0 && hoja.getCell(3, j).getContents().replace(" ","").length()!=0 && hoja.getCell(4, j).getContents().replace(" ","").length()!=0)//Condicion para validar que el primer campo de el archivo excel no se encuentre vacio                            
                                modelo.addRow(new Object[]{hoja.getCell(0, j).getContents(),hoja.getCell(1, j).getContents(),hoja.getCell(2, j).getContents(),hoja.getCell(3, j).getContents(),hoja.getCell(4, j).getContents()});//Agregamos los datos a la tabla
                            else
                                datosCargado=false;
                        }
                    }
                }
                if (datosCargado)
                    JOptionPane.showMessageDialog(null, "¡¡Exito al cargar todos los datos!!");
                else
                    JOptionPane.showMessageDialog(null, "Algunos registros no pudieron ser cargados","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    

    
}
