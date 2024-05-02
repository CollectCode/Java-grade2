
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class ProductInfoFrm extends javax.swing.JInternalFrame {
    DBManager db = MySqlDBManager.getInstance();
    /**
     * Creates new form ProductInfoFrm
     */
    public ProductInfoFrm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListTable = new javax.swing.JTable();
        jModelPnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jNoTxt = new javax.swing.JTextField();
        jNameTxt = new javax.swing.JTextField();
        jIdTxt = new javax.swing.JTextField();
        jPassTxt = new javax.swing.JPasswordField();
        jCommandPnl = new javax.swing.JPanel();
        jSearchBtn = new javax.swing.JButton();
        jSaveBtn = new javax.swing.JButton();
        jDeleteBtn = new javax.swing.JButton();
        jNewBtn = new javax.swing.JButton();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "no", "name", "id", "password"
            }
        ));
        jListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListTable);

        jModelPnl.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("no");
        jModelPnl.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("name");
        jModelPnl.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("id");
        jModelPnl.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("password");
        jModelPnl.add(jLabel4);

        jNoTxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jNoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jModelPnl.add(jNoTxt);

        jNameTxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jNameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jModelPnl.add(jNameTxt);

        jIdTxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jIdTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jModelPnl.add(jIdTxt);

        jPassTxt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPassTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jModelPnl.add(jPassTxt);

        jCommandPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSearchBtn.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jSearchBtn.setText("조회하기");
        jSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchBtnActionPerformed(evt);
            }
        });
        jCommandPnl.add(jSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        jSaveBtn.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jSaveBtn.setText("저장하기");
        jSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveBtnActionPerformed(evt);
            }
        });
        jCommandPnl.add(jSaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 130, 40));

        jDeleteBtn.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jDeleteBtn.setText("삭제하기");
        jDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteBtnActionPerformed(evt);
            }
        });
        jCommandPnl.add(jDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 130, 40));

        jNewBtn.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jNewBtn.setText("신규");
        jNewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewBtnActionPerformed(evt);
            }
        });
        jCommandPnl.add(jNewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
            .addComponent(jModelPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jCommandPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jModelPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCommandPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchBtnActionPerformed
        String sql = "SELECT * FROM staff;";
        db.executeQuery(sql, jListTable);
    }//GEN-LAST:event_jSearchBtnActionPerformed

    private void jListTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListTableMousePressed
            int clickedRow = jListTable.getSelectedRow();
            if (clickedRow < 0)
            {
                System.out.println("Not Valid Selection");
                return;
            }
            System.out.println("valid Selection, clickedRow = " + clickedRow);
            DefaultTableModel model = (DefaultTableModel) jListTable.getModel();
            Vector vt = (Vector) model.getDataVector().elementAt(clickedRow);
            this.jNoTxt.setText((String) vt.get(0));
            this.jNameTxt.setText((String) vt.get(1));
            this.jIdTxt.setText((String) vt.get(2));
            this.jPassTxt.setText((String) vt.get(3));
    }//GEN-LAST:event_jListTableMousePressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //jSearchBtnActionPerformed(null);
        this.jSearchBtn.doClick();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteBtnActionPerformed
        int clickedRow = jListTable.getSelectedRow();
            if (clickedRow < 0)
            {
                System.out.println("Not Valid Selection");
                return;
            }
        System.out.println("valid Selection, clickedRow = " + clickedRow);
        DefaultTableModel model = (DefaultTableModel) jListTable.getModel();
        Vector vt = (Vector) model.getDataVector().elementAt(clickedRow);
        String sql = "DELETE FROM staff WHERE no = '" + this.jNoTxt.getText() + "'";
        db.executeUpdate(sql);
        
        this.jSearchBtn.doClick();
    }//GEN-LAST:event_jDeleteBtnActionPerformed

    private void jNewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewBtnActionPerformed
        this.jListTable.clearSelection();
        this.jNoTxt.setText("");
        this.jNameTxt.setText("");
        this.jIdTxt.setText("");
        this.jPassTxt.setText("");
    }//GEN-LAST:event_jNewBtnActionPerformed

    private void jSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveBtnActionPerformed
        String no = this.jNoTxt.getText();
        String name = this.jNameTxt.getText();
        String id = this.jIdTxt.getText();
        String password = new String(this.jPassTxt.getPassword());

        int clickedRow = this.jListTable.getSelectedRow();
        String sql = "";
        
        if (clickedRow < 0) {
            sql = "insert into staff(name, id, password) values ('" + name + "', '" + id + "', '" + password + "');";
        } else {
            DefaultTableModel model = (DefaultTableModel) jListTable.getModel();
            Vector vt = (Vector) model.getDataVector().elementAt(clickedRow);
            no = (String) vt.get(0);
            sql = "update staff set name='" + name + "', id='" + id + "', password='" + password + "' where no=" + no + ";";
        }
        
        if (db.executeUpdate(sql) > 0)  {
//            this.jNameTxt.setText("");
            this.jSearchBtn.doClick();
        } else  {
            JOptionPane.showMessageDialog(null, "에러발생", "에러발생", JOptionPane.WARNING_MESSAGE);
        }
        this.jSearchBtn.doClick();
    }//GEN-LAST:event_jSaveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jCommandPnl;
    private javax.swing.JButton jDeleteBtn;
    private javax.swing.JTextField jIdTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTable jListTable;
    private javax.swing.JPanel jModelPnl;
    private javax.swing.JTextField jNameTxt;
    private javax.swing.JButton jNewBtn;
    private javax.swing.JTextField jNoTxt;
    private javax.swing.JPasswordField jPassTxt;
    private javax.swing.JButton jSaveBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearchBtn;
    // End of variables declaration//GEN-END:variables
}
