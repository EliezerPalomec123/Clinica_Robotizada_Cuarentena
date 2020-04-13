
package Conexion_BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion_BD {
    Connection conexion;
    Connection c2;
    String NBase="Clinica";
    public static String UserServidor;
    public static String PasswordServidor;
    Statement st,s;

    //Metodo Para conectarse con la Base de Datos
    public boolean ConectaBD(String Usuario,String Contraseña){
        try{
            this.UserServidor=Usuario;
            this.PasswordServidor=Contraseña;
            c2=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+NBase,Usuario,Contraseña);
            if(c2!=null)
                System.out.println("Cónexion estalecida");
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
            //JOptionPane.showMessageDialog(null,ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error Usuario o Contraseña incorrecta", "Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public java.sql.ResultSet consulta(String consul){
        ResultSet r=null;
        try {
            java.sql.Statement stm= c2.createStatement();
            r = stm.executeQuery(consul);
        }catch(SQLException e){
            System.out.println("Error no encontrado");
        }
            return r;
    }

    public void InsertTableAlumno(String mat,String nombre,String ApellidoP,String ApellidoM){
       String sql="insert into Alumno values(?,?,?,?)";
       try {
           PreparedStatement stm= c2.prepareStatement(sql);
           stm.setString(1,mat);
           stm.setString(2,nombre);
           stm.setString(3,ApellidoP);
           stm.setString(4,ApellidoM);
           stm.executeUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error, No se pudo registrar el alumno");
       }
    }

    public void InsertTableInscrito(String mat,String idS,String grupo){
       String sql="insert into Inscrito values(?,?,?)";
       try {
           PreparedStatement stm= c2.prepareStatement(sql);
           stm.setString(1,mat);
           stm.setString(2,idS);
           stm.setString(3,grupo);
           stm.executeUpdate();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Error de insercion en Inscrito");
       }
    }
    
    public String CallProcVal(String mat,String nom, String Ap,String AM) throws SQLException{

        //CallableStatement sp = conn.prepareCall(" CALL contar_productos(?,?)");
        CallableStatement sp=c2.prepareCall(" CALL Insertar_datos(?,?,?,?,?)"); //Se prepara el sql para llamar al procedimmiento almacenado.  
        sp.setString(1,mat);
        sp.setString(2,nom);
        sp.setString(3,Ap);
        sp.setString(4,AM);
        sp.registerOutParameter(5,java.sql.Types.VARCHAR); //Se registra el parámetro de salida.
        sp.execute();
        String resul=sp.getString(5); // Se guarda la variable de salida en resul.
        return resul;
    }
    
    public boolean UpdateTableAlumno(String mat,String nombre,String ApellidoP,String ApellidoM, String matriculaBusqueda){
       String sql="UPDATE Alumno Set Matricula = ?,nombre = ?, ApellidoP = ?, ApellidoM = ? where Matricula=?;";
       //String sql="insert into Alumno values(?,?,?,?)";
       try {
           PreparedStatement stm= c2.prepareStatement(sql);
           stm.setString(1,mat);
           stm.setString(2,nombre);
           stm.setString(3,ApellidoP);
           stm.setString(4,ApellidoM);
           stm.setString(5,matriculaBusqueda);
           stm.executeUpdate();
           return true;
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"Ocurrio un error al actualizar los datos verifique los campos");
           return false;
       }
    }
   
    
    
    public String CallProcEmple(String Ntrabaja,String nom, String Ap,String Am,String tipo) throws SQLException{

        //CallableStatement sp = conn.prepareCall(" CALL contar_productos(?,?)");
        CallableStatement sp=c2.prepareCall(" CALL Insertar_datos_Trabajador(?,?,?,?,?,?)"); //Se prepara el sql para llamar al procedimmiento almacenado.  
        sp.setString(1,Ntrabaja);
        sp.setString(2,nom);
        sp.setString(3,Ap);
        sp.setString(4,Am);
        sp.setString(5,tipo);
        sp.registerOutParameter(6,java.sql.Types.VARCHAR); //Se registra el parámetro de salida.
        sp.execute();
        String resul=sp.getNString(6); // Se guarda la variable de salida en resul.
       
        return resul;
} 
    
    
    
    
    
    //Metodo para eliminar alumnos de la base de datos
    public void DeleteAlumno(String mat){
       String sql="delete from Alumno where Matricula= "+mat;
       try{
           Statement stm= c2.createStatement();
           stm.executeUpdate(sql);
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
    }
   
/************************************************************************************************************************************/    
    public boolean InsertDefine(String idP,String grupo,String HSustituida,String idSolicitante,String HI,String HF,String Fecha){
        String sql="insert into Define values(?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stm=c2.prepareStatement(sql);
            stm.setString(1,"T-0125");
            
            stm.setString(2,idP);
            System.out.println(idP);
            stm.setString(3,grupo);
            System.out.println(grupo);
            stm.setString(4,HSustituida);
            System.out.println(HSustituida);
            stm.setString(5,idSolicitante);
            System.out.println(idSolicitante);
            stm.setString(6,HI);
            System.out.println(HI);
            stm.setString(7,HF);
            System.out.println(HF);
            stm.setString(8,Fecha);
            System.out.println(Fecha);
            stm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } 
    }
    
    
    public void InsertPE(String id,String nombre,String F_I,String F_F) throws SQLException{
        String sql="insert into Plan_Estudios values(?,?,?,?)";
        PreparedStatement stm=c2.prepareStatement(sql);
        stm.setString(1,id);
        System.out.println(id);
        stm.setString(2,nombre);
        System.out.println(nombre);
        stm.setString(3,F_I);
        System.out.println(F_I);
        stm.setString(4,F_F);
        System.out.println(F_F);
        stm.executeUpdate();   
    }
    
    
    
    
    
    
    
/************************************************************************************************************************************/    

    
    public void InsertPracticas(String id_Prac,String id_Materia,String NombreP){
        String sql="insert into Practicas values(?,?,?,?)";
        try {
            PreparedStatement stm=c2.prepareStatement(sql);
            stm.setString(0,id_Prac);
            stm.setString(1,id_Materia);
            stm.setString(2,NombreP);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void InsertMateria(String id_Materia,String id_PlanEstudios,String Nombre,String NSemestre){
            String sql="insert into Materia values(?,?,?,?)";
        try {
            PreparedStatement stm=c2.prepareStatement(sql);
            stm.setString(0,id_Materia);
            stm.setString(1,id_PlanEstudios);
            stm.setString(2,Nombre);
            stm.setString(3,NSemestre);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void InsertRealiza(String mat,String id_Practicas,String H_Entrada,String H_Salida,String Fecha){
        String sql="insert into Realiza values(?,?,?,?,?);";
        try {
            PreparedStatement stm=c2.prepareStatement(sql);
            stm.setString(1,mat);
            stm.setString(2,id_Practicas);
            stm.setString(3,H_Entrada);
            stm.setString(4,H_Salida);
            stm.setString(5,Fecha);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void updateSal(String horasal,String mat){
        String sql="update Realiza set H_Salida=? where Matricula=?";
        try{
            PreparedStatement stm=c2.prepareStatement(sql);
            stm.setString(1,horasal);
            stm.setString(2,mat);
            stm.executeUpdate();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"No actualize la hora de salida");
        }
    }
    
    //Metodo para cerrra la conexion que se hizo a la base de datos
    public void cerrar(){
        try {
            c2.close();
            c2=null;
            System.out.println("Cerrando conexión");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}