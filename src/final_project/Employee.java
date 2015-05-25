/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package final_project;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Hashen
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    int xMouse;
    int yMouse;
    public Employee() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            noImg();
        } catch (Exception ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jXDatePicker1 = new com.toedter.calendar.JDateChooser();
        jXDatePicker2 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tekton Pro Cond", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                                                                                    Employee");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Actions-button-cancel-icon (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee ID");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Started Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Title");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Telephone No");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date of Birth");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Next of Kin");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Emergency Contact");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Email");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 150, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 150, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 195, 150, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Miss.", "Mrs." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 95, 150, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 145, 150, 30));

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 245, 150, 30));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 345, 150, 30));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 395, 150, 30));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 445, 150, 30));
        getContentPane().add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 295, 150, 30));
        getContentPane().add(jXDatePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 495, 150, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tekton Pro Ext", 1, 12), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 220, 240));

        jButton6.setText("jButton6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 30, 30));

        jButton1.setFont(new java.awt.Font("Tekton Pro", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Browse");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save 1.png"))); // NOI18N
        jButton2.setText("Save");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save 2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/update a.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/update 2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clear1.png"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/clear2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete 1.png"))); // NOI18N
        jButton5.setText("Delete");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/delete 2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACKIMG/emp.png"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:em.
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jTextField3.grabFocus();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField2.getText().equals("")|| jTextField2.getText().length()<5)
             JOptionPane.showMessageDialog(this, "Employee ID is Invalid");
        
        else
        insert();
     

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       update();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       cls();
        try {
            noImg();
        } catch (Exception e) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 String a=jTextField2.getText();
        int dr = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Delete The Record?");
		if(dr==JOptionPane.YES_OPTION){
                    
                    try{
                        Statement st=javaConnect.ConnectorDB();
            st.executeUpdate("delete from  employee where NIC='"+a+"' ");
            JOptionPane.showMessageDialog(this,"Customer Deleted");
            cls();
            noImg();
            
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                    
                }
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY(); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
     int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);   // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       filename=f.getAbsolutePath();
       
       try{
           File image=new File(filename);
           FileInputStream fis=new FileInputStream(image);
           ByteArrayOutputStream bos=new ByteArrayOutputStream();
           byte[] buf=new byte[1024];
           
           for(int readNum;(readNum=fis.read(buf))!=-1;){
               bos.write(buf, 0, readNum);
           }
           pib=bos.toByteArray();
           
           format=new ImageIcon(pib);
           jLabel14.setIcon(format);
       }catch(Exception e){
       
       }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
cls();        
        try{
            int eno=10001;
            String z=null;
            int test =0;
            Statement st=javaConnect.ConnectorDB();
             ResultSet rs = st.executeQuery("SELECT NIC FROM employee ORDER BY NIC");
             while (rs.next()) {
                z=rs.getString("NIC"); 
                test=1;
             }
            if(test==1){
                int a=Integer.parseInt(z);
                a++;
                z=Integer.toString(a);
                
            }
            else{
                z=Integer.toString(eno);
            }
             jTextField2.setText(z);
            
        }
        catch(Exception e){
        
        }
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
      String no = jTextField5.getText();
        char c = evt.getKeyChar();

        if (no.length() == 0) {
            if (c == '+') {
            } else if (c == '0') {
            } else {
                evt.consume();
            }
        } else if (no.length() < 12 && no.length() > 0) {
            if (no.charAt(0) == '+') {
                System.out.println("+");
                if (no.length() <= 12) {
                    if (Character.isDigit(c)) {
                    } else {
                        evt.consume();
                    }
                } else {
                    evt.consume();
                }
            } else if (no.charAt(0) == '0') {
                System.out.println("0");
                if (no.length() <= 9) {
                    if (Character.isDigit(c)) {
                    } else {
                        evt.consume();
                    }
                } else {
                    evt.consume();
                }
            } else {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField5KeyTyped

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
      try{
        Statement st=javaConnect.ConnectorDB();
        ResultSet r = st.executeQuery("SELECT NIC FROM employee WHERE NIC LIKE '%" + jTextField2.getText() + "%'");
        Vector v1 = new Vector();

            while (r.next()) {
                v1.add(r.getString("NIC"));

            }

            jComboBox2.setModel(new DefaultComboBoxModel(v1));
            jComboBox2.setPopupVisible(true);
            jTextField2.setText(jTextField2.getText());   
           
       }
       catch(Exception e)
        {
              e.printStackTrace();     
                   
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
        } else {
            if(c=='v'| c=='V'){
                
            }
            else{
            evt.consume();
            }
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        jTextField2.setText(jComboBox2.getSelectedItem().toString());
        searchByNic();
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }
    public void noImg() {
        try{
       ImageIcon format = new ImageIcon(getClass().getResource("/IMG/Lost.jpg"));
        jLabel14.setIcon(format);
       // pib=format.toString().getBytes();
        
        File image = new File(getClass().getResource("/IMG/Lost.jpg").getFile());
           FileInputStream fis=new FileInputStream(image);
           ByteArrayOutputStream bos=new ByteArrayOutputStream();
           byte[] buf=new byte[1024];
           
           for(int readNum;(readNum=fis.read(buf))!=-1;){
               bos.write(buf, 0, readNum);
           }
           pib=bos.toByteArray();
        
        }catch(Exception e){}
    }
    
    public void cls(){
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        try{
        noImg();
        }catch(Exception e){}
         DateFormat dt=new SimpleDateFormat("yyyy-MM-dd");
        
        String x="2014-12-03";
        try{
        Date y=dt.parse(x);
        jXDatePicker1.setDate(y);
        jXDatePicker2.setDate(y);
        }catch(Exception e){}
        
        String z="Mr.";
        jComboBox1.setSelectedItem(z);  
        
        
        
        
        
    }
    
    
    public void insert(){
        
        try{
            s2=jTextField2.getText();
            s3=jTextField3.getText();
            s4=jTextField4.getText();
            s5=jTextField5.getText();
            s7=jTextField7.getText();
            s8=jTextField8.getText();
            s9=jTextField9.getText();
            jcbs1=(String)jComboBox1.getSelectedItem();
            ds1 =dt.format(jXDatePicker1.getDate());
            ds2 =dt.format(jXDatePicker2.getDate());
            
           // Statement st=javaConnect.ConnectorDB();
           // st.executeUpdate("insert into employee values ('"+s2+"','"+jcbs1+"','"+s3+"','"+s4+"','"+s5+"','"+ds1+"','"+s7+"','"+s8+"','"+s9+"','"+ds2+"','"+pib+"')");
            
            
            Connection conn;
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project?zeroDateTimeBehavior=convertToNull","root","");
            String sql="insert into employee values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, s2);
            pst.setString(2, jcbs1);
            pst.setString(3, s3);
            pst.setString(4, s4);
            pst.setString(5, s5);
            pst.setString(6, ds1);
            pst.setString(7, s7);
            pst.setString(8, s8);
            pst.setString(9, s9);
            pst.setString(10, ds2);
            pst.setBytes(11, pib);
            
            pst.execute();
            
             JOptionPane.showMessageDialog(this,"Customer Recorded");
             cls();
             noImg();
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this,e);
        }         
    }
    
    public void update(){
        try{
            
            s2=jTextField2.getText();
            s3=jTextField3.getText();
            s4=jTextField4.getText();
            s5=jTextField5.getText();
            s7=jTextField7.getText();
            s8=jTextField8.getText();
            s9=jTextField9.getText();
            jcbs1=(String)jComboBox1.getSelectedItem();
            ds1 =dt.format(jXDatePicker1.getDate());
            ds2 =dt.format(jXDatePicker2.getDate());
                    
                    int dr = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Replace The Record?");
                    if(dr==JOptionPane.YES_OPTION){

                       // Statement st=javaConnect.ConnectorDB();
                       // st.executeUpdate("update customer set Name='"+c+"',Tel='"+d+"',Address='"+e+"',Email='"+f+"',Title='"+b+"' where NIC='"+a+"'");
                        
                        Connection conn;
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project?zeroDateTimeBehavior=convertToNull","root","");
            String sql="update  employee set NIC=?,Title=?,Name=?,Address=?,Tel=?,DOB=?,NOK=?,EContact=?,Email=?,SDate=?,EIMG=?  where NIC='"+s2+"'";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setString(1, s2);
            pst.setString(2, jcbs1);
            pst.setString(3, s3);
            pst.setString(4, s4);
            pst.setString(5, s5);
            pst.setString(6, ds1);
            pst.setString(7, s7);
            pst.setString(8, s8);
            pst.setString(9, s9);
            pst.setString(10, ds2);
            pst.setBytes(11, pib);
            
            pst.execute(); 
                        JOptionPane.showMessageDialog(null, "Record Updated");
                        cls();
                        noImg();
            
                    }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this,e);
        }
        
    }
    
    
    
    
    public void searchByNic(){
        try{
            
            Statement st=javaConnect.ConnectorDB();
        ResultSet rs = st.executeQuery("SELECT * FROM employee WHERE NIC='" + jTextField2.getText() + "'");
        if (rs.next()) {
           jTextField2.setText(rs.getString("NIC"));
           jTextField3.setText(rs.getString("Name"));
           jTextField4.setText(rs.getString("Address"));
           jTextField5.setText(rs.getString("Tel"));
           
           jTextField7.setText(rs.getString("NOK"));
           jTextField8.setText(rs.getString("EContact"));
           jTextField9.setText(rs.getString("Email"));
           
           String jcbs1 =rs.getString("Title");
           jComboBox1.setSelectedItem(jcbs1);  
           
           ds1=rs.getString("DOB");
           ds2=rs.getString("SDate");
           Date y1=dt.parse(ds1);
           jXDatePicker1.setDate(y1);           
            Date y2=dt.parse(ds2);
            jXDatePicker2.setDate(y2);
            
            pib=rs.getBytes("EIMG");
            format=new ImageIcon(pib);
           jLabel14.setIcon(format);
           
           
        }
        else{
            JOptionPane.showMessageDialog(this, "Cusomer not Registered ");
            cls();
        }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.toedter.calendar.JDateChooser jXDatePicker1;
    private com.toedter.calendar.JDateChooser jXDatePicker2;
    // End of variables declaration//GEN-END:variables

private ImageIcon format=null;
String filename=null;
int s=0;
byte[] pib=null;
String s2=null;
String s3=null;
String s4=null;
String s5=null;
String s7=null;
String s8=null;
String s9=null;
String jcbs1=null;
String ds1=null;
String ds2=null;
 DateFormat dt=new SimpleDateFormat("yyyy-MM-dd");


}
