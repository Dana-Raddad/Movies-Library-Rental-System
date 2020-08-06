/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.beans.Statement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class mainWindow extends javax.swing.JFrame {

    /**
     * Creates new form mainWindow
     */
      Connection con =null;
    Statement st =null;
    private ResultSet rs=null;
    private PreparedStatement pst=null;
    public mainWindow() {
        setLocation(500,100);
        initComponents();
        setVisible(true);
        con=getCon ();
    }
     public Connection getCon () 
    {
        try
        {
            
            String url = "jdbc:mysql://localhost:3307/dana";
            Class.forName("com.mysql.jdbc.Driver");
            con=  DriverManager.getConnection (url,"root","");
             
            return con;
            
        }
        
        catch(SQLException | ClassNotFoundException e)
        {
            System.out.println(e);
        }
        return null;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 102, 255));

        jMenu1.setBackground(new java.awt.Color(204, 153, 255));
        jMenu1.setForeground(new java.awt.Color(153, 51, 255));
        jMenu1.setMnemonic('F');
        jMenu1.setText("File");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI Semilight", 3, 36)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setBackground(new java.awt.Color(255, 102, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(153, 0, 255));
        jMenuItem1.setText("import");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
        jMenuItem1.setName("import"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setBackground(new java.awt.Color(255, 153, 255));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(102, 0, 255));
        jMenuItem2.setText("export");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem3.setBackground(new java.awt.Color(255, 102, 255));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(153, 0, 204));
        jMenuItem3.setText("exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 153, 255));
        jMenu2.setForeground(new java.awt.Color(153, 51, 255));
        jMenu2.setText("Operations");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Segoe UI Historic", 2, 24)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(1, 0, 0, 0));

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(51, 0, 255));
        jMenuItem4.setText("Add a new video");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setBackground(new java.awt.Color(255, 153, 255));
        jMenuItem5.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(153, 0, 204));
        jMenuItem5.setText("Delete a video");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(51, 0, 255));
        jMenuItem6.setText("Search for a video");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setBackground(new java.awt.Color(255, 153, 255));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(153, 0, 204));
        jMenuItem7.setText("rent a video");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(51, 0, 255));
        jMenuItem8.setText("return a video");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setBackground(new java.awt.Color(255, 153, 255));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(153, 0, 204));
        jMenuItem9.setText("search for a customer ");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setBackground(new java.awt.Color(153, 153, 255));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(51, 0, 255));
        jMenuItem10.setText("Display All");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       /* JFileChooser choose;
        choose = new JFileChooser();
                choose.setDialogTitle(" file selection:");
		choose.setMultiSelectionEnabled(true);
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
                choose.showOpenDialog(null);
                File f=choose.getSelectedFile();
               try{
                    ////////////////////////////////////////
 
                
                
                //////////////////////////////////////
                }catch(Exception e){ System.out.println(e);}*/
               /* Connection con =getCon();             
                JFileChooser C=new JFileChooser();
                   C.setFileSelectionMode(JFileChooser.FILES_ONLY);
             // if (C.showOpenDialog(jButton1) == JFileChooser.APPROVE_OPTION){
            File f=C.getSelectedFile();
            String s=f.getAbsolutePath();
            if (f.isFile())
            { 
         File file = new File(s);
        
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
             Object a=new imp();
             DefaultTableModel model;
             model = (DefaultTableModel)a.getClass().getjTable1.getModel();
              Object[] lines = br.lines().toArray();
             for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(" ");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            
        }*/
        File fi;
                JFileChooser fc=new JFileChooser();
                fc.showOpenDialog(null);
                fi=fc.getSelectedFile(); 
    try {
        FileReader fr=new FileReader(fi);
        BufferedReader br = new BufferedReader(fr);
        Object[] input=br.lines().toArray();
        for(int i=0;i<input.length;i++)
        {
            jTextArea1.append(input[i].toString());
            jTextArea1.append("   \n");
        }
        // TODO add your handling code here:
    } catch (FileNotFoundException ex) {
    JOptionPane.showMessageDialog(null, ex);
    }
     
    


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         /*                  
We just finished working on a Database project in Java Netbeans.
        We added the feature Import which will import the database record of one user to a text file.*/

String IMPORT_QUERY = 
    "SELECT vedio_name,"
        + " length,"
        + " rated,"
        + " date_released,"
        + " cotegory "
        + " FROM vedio ; ";
       PrintStream  out=null;
    try {
      
        out= new PrintStream("C:\\Users\\hp\\Documents\\NetBeansProjects\\export.txt");
        pst = con.prepareStatement(IMPORT_QUERY);
      
        rs = pst.executeQuery(IMPORT_QUERY);
   
        out.println("vedio_name" + "\t\t|\t" + "length" + "\t\t\t|\t" + "rated" + 
             "\t\t\t|\t" + "date_released" + "\t\t|\t\n"+ "cotegory" );
        out.println("--------------------------------------------------"
                + "----------------------------------------------------------------------------");
            while(rs.next()){
              String  vedio_name = rs.getString("vedio_name");
              String  length = rs.getString("length");
              String  rated= rs.getString("rated");
              String  date_released = rs.getString("date_released");
              String  cotegory = rs.getString("cotegory");
               
                    out.println( vedio_name + "\t\t\t|\t" + length + "\t\t\t|\t" +
                        rated + "\t\t\t|\t" + date_released + "\t\t\t|\t\n"+
                        cotegory + "\t\t\t|\t\n");
            }
             
            out.println();
                out.println();
                out.println("++++++++++++++++++++++++++++++++++++++++++++");
                out.println();
                out.close();
            JOptionPane.showMessageDialog(null,"\nData exported!","Prompt:", 
                    JOptionPane.INFORMATION_MESSAGE);
          
    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null,"\nFile not found. Please check the file location.",
                "Error x203", JOptionPane.ERROR_MESSAGE);
    }     catch (SQLException ex) {
              Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
          }


                    
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if("exit".equals(evt.getActionCommand()))dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         try {
             // TODO add your handling code here:
             new Add();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new Return();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        new Delete();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        new Search();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new rent();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
         try {
             // TODO add your handling code here:
             new ALL();
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
       new Customer();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private Image ImageIcon(String cUsershpDesktopaaaa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
