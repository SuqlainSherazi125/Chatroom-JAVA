
package cms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Teacher_Chat extends  javax.swing.JFrame
{
    static Socket s;
    static ServerSocket ss;
    static DataInputStream din;
    static DataOutputStream dout;
    Connection con =null;
    
   
    static String receive2="",send2="";
    
    public Teacher_Chat() {
        setVisible(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textbox2 = new javax.swing.JTextField();
        sendbtn2 = new javax.swing.JButton();
        savechat2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msg_area2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        timea = new javax.swing.JTextArea();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 51));
        setForeground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(20, 72, 124));
        jPanel1.setForeground(new java.awt.Color(255, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Type here :");

        textbox2.setBackground(new java.awt.Color(204, 204, 204));
        textbox2.setForeground(new java.awt.Color(51, 51, 51));
        textbox2.setToolTipText("");
        textbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textbox2ActionPerformed(evt);
            }
        });

        sendbtn2.setBackground(new java.awt.Color(51, 153, 0));
        sendbtn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sendbtn2.setForeground(new java.awt.Color(255, 255, 255));
        sendbtn2.setText("Send");
        sendbtn2.setToolTipText("");
        sendbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtn2ActionPerformed(evt);
            }
        });

        savechat2.setBackground(new java.awt.Color(153, 102, 0));
        savechat2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        savechat2.setForeground(new java.awt.Color(255, 255, 255));
        savechat2.setText("Save Chat");
        savechat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savechat2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Teacher");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        msg_area2.setEditable(false);
        msg_area2.setBackground(new java.awt.Color(204, 204, 204));
        msg_area2.setColumns(20);
        msg_area2.setForeground(new java.awt.Color(51, 51, 51));
        msg_area2.setRows(5);
        msg_area2.setBorder(null);
        msg_area2.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(msg_area2);

        timea.setEditable(false);
        timea.setBackground(new java.awt.Color(204, 204, 204));
        timea.setColumns(20);
        timea.setLineWrap(true);
        timea.setRows(5);
        timea.setBorder(null);
        jScrollPane3.setViewportView(timea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textbox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendbtn2))
                    .addComponent(savechat2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(savechat2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtn2ActionPerformed
    try{
        String msgout ="";
        msgout = textbox2.getText().trim();
        dout.writeUTF(msgout);
        
    }
    catch(Exception e){
        System.out.println("Exception occured!!");
    }
        
    String f2;                   //for Faculty Chat table
    f2=this.textbox2.getText();

    try{
        DatabaseConnectivity c = new DatabaseConnectivity();
        con=c.getInstance();
           
    if(con!=null){
        Statement state = con.createStatement();
        state.executeQuery("insert into TeacherChat values('"+f2+"')");
        System.out.println("Statement executed.");
    }
    }
        
    catch(SQLException e){
        System.out.println("Could not connect "+ e.getMessage());
    }
    
    DateFormat dateFormat = new SimpleDateFormat("HH:mm");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    msg_area2.setText(msg_area2.getText().trim()+"\nYou: \t"+textbox2.getText()+"\t");
    timea.append(dateFormat.format(cal.getTime())+"\n");
    //timearea.setText("\n");
    textbox2.setText("");
    
    }//GEN-LAST:event_sendbtn2ActionPerformed

    private void textbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textbox2ActionPerformed
        receive2=textbox2.getText();
    }//GEN-LAST:event_textbox2ActionPerformed

    private void savechat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savechat2ActionPerformed
       String msg2 = msg_area2.getText().toString();
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("./TeacherChat_Record.txt"));
            writer.write(msg2);
            writer.close();
           
        }
        catch (Exception e) {}
         JOptionPane.showMessageDialog(this,"Saved Successfully.");
    }//GEN-LAST:event_savechat2ActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher_Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_Chat().setVisible(true);
            }
        });

        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
        Calendar cal = Calendar.getInstance();
        String msgin = "",msgout="";
        try {
            ss = new ServerSocket( 1201);
            s = ss.accept();

            din = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            while (!msgin.equals("exit")) {
                msgin = din.readUTF();
                receive2 = msgin;
                msg_area2.setText(msg_area2.getText().trim() + "\nStudent\t" + receive2+"\t");
                timea.append(dateFormat.format(cal.getTime())+"\n");
            }

        } 
        catch (Exception e) {
            System.out.println("Exception occured!!");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextArea msg_area2;
    private javax.swing.JButton savechat2;
    private javax.swing.JButton sendbtn2;
    private javax.swing.JTextField textbox2;
    private static javax.swing.JTextArea timea;
    // End of variables declaration//GEN-END:variables
}
