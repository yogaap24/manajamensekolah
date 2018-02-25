/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manajamensekolah;


import Koneksi_db.Db_koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yoga Agung
 */
public class getData {
    public void getData( ){
     //menghapus isi table tblGaji
    
     model.fireTableDataChanged( );

     try{
           //membuat statemen pemanggilan data pada table tblGaji dari database
           Statement stat = (Statement) Db_koneksi.getKoneksi( ).createStatement( );
           String sql        = "Select * from daftar_guru";
           ResultSet res   = stat.executeQuery(sql);

           //penelusuran baris pada tabel tblGaji dari database
           while(res.next ()){
                Object[ ] obj = new Object[6];
                obj[0] = res.getString("no");
                obj[1] = res.getString("nama");
                obj[2] = res.getString("alamat_jalan");
                obj[3] = res.getString("status_kepegawaian");
                obj[4] = res.getString("jenis_ptk");

                model.addRow(obj);
            }
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
} 

    private static class model {

        private static Object getDataVector() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void fireTableDataChanged() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static void addRow(Object[] obj) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public model() {
        }
    }
}
