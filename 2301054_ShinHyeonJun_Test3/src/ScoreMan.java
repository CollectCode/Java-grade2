
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sshj1
 */
public class ScoreMan extends javax.swing.JFrame {
    StudentInfo clickedStudentInfo;
    ArrayList<StudentInfo> totalList = new ArrayList<>();
    ArrayList<StudentInfo> searchList = new ArrayList<>();
    ArrayList<StudentInfo> showList = totalList;
    int currentPageNum = 1;
    /**
     * Creates new form ScoreMan
     */
    public ScoreMan() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        korText = new javax.swing.JTextField();
        engText = new javax.swing.JTextField();
        mathText = new javax.swing.JTextField();
        avgText = new javax.swing.JTextField();
        rankText = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        dataReadButton = new javax.swing.JButton();
        serializationButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        dataWriteButton = new javax.swing.JButton();
        deSerializationButton = new javax.swing.JButton();
        resultPannel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        firstPageButton = new javax.swing.JButton();
        prevPageButton = new javax.swing.JButton();
        whereAmI = new javax.swing.JButton();
        nextPageButton = new javax.swing.JButton();
        lastPageButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("이름");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("국어");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("영어");
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("수학");
        jPanel1.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("평균");
        jPanel1.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("석차");
        jPanel1.add(jLabel6);

        nameText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        nameText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(nameText);

        korText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        korText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(korText);

        engText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        engText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(engText);

        mathText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        mathText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(mathText);

        avgText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        avgText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(avgText);

        rankText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        rankText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(rankText);

        jPanel2.setBackground(new java.awt.Color(0, 204, 51));
        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        insertButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        insertButton.setText("추가하기");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        jPanel2.add(insertButton);

        deleteButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        deleteButton.setText("삭제하기");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deleteButton);

        dataReadButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        dataReadButton.setText("파일읽기");
        dataReadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataReadButtonActionPerformed(evt);
            }
        });
        jPanel2.add(dataReadButton);

        serializationButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        serializationButton.setText("직렬화");
        serializationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serializationButtonActionPerformed(evt);
            }
        });
        jPanel2.add(serializationButton);

        updateButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        updateButton.setText("변경하기");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel2.add(updateButton);

        searchButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        searchButton.setText("조회하기");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel2.add(searchButton);

        dataWriteButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        dataWriteButton.setText("파일쓰기");
        dataWriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataWriteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(dataWriteButton);

        deSerializationButton.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        deSerializationButton.setText("역직렬화");
        deSerializationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deSerializationButtonActionPerformed(evt);
            }
        });
        jPanel2.add(deSerializationButton);

        resultPannel.setBackground(new java.awt.Color(0, 153, 153));
        resultPannel.setLayout(new java.awt.GridLayout(0, 5));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(new java.awt.GridLayout());

        firstPageButton.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        firstPageButton.setText("<<");
        firstPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstPageButtonActionPerformed(evt);
            }
        });
        jPanel4.add(firstPageButton);

        prevPageButton.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        prevPageButton.setText("<");
        prevPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevPageButtonActionPerformed(evt);
            }
        });
        jPanel4.add(prevPageButton);

        whereAmI.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jPanel4.add(whereAmI);

        nextPageButton.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        nextPageButton.setText(">");
        nextPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextPageButtonActionPerformed(evt);
            }
        });
        jPanel4.add(nextPageButton);

        lastPageButton.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        lastPageButton.setText(">>");
        lastPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastPageButtonActionPerformed(evt);
            }
        });
        jPanel4.add(lastPageButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
            .addComponent(resultPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultPannel, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void showTotalList()    {
        showList = totalList;
        showList();
    }
    
    private void showSearchList()    {
        showList = searchList;
        showList();
    }
    
    private void showList() {
        this.resultPannel.removeAll();
        
        for (int j = 0; j < showList.size(); j++)   {
            showList.get(j).rank = 1;
        }
        
        for (int k = 0; k < showList.size(); k++)   {
            for (int l = 0; l < showList.size(); l++)   {
                showList.get(k).setRank(showList.get(l).getAvg());
            }
        }
        
        for (int m = 0; m < showList.size(); m++)   {
            for (int n = 0; n < showList.size(); n++)   {
                if (showList.get(m).getRank() < showList.get(n).getRank())   {
                    StudentInfo tmp;
                    tmp = showList.get(m);
                    showList.set(m, showList.get(n));
                    showList.set(n, tmp);
                }
            }
        }
        
        try {
            for (int i = (currentPageNum-1)*5; i < currentPageNum*5; i++)   {
            ShButton obj = new ShButton(showList.get(i));
            this.resultPannel.add(obj);
            this.whereAmI.setText(currentPageNum + " / " + (((showList.size()-1)/5)+1));
            
            obj.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShButton click = (ShButton)evt.getSource();
                StudentInfo stu = click.getStudent();
                nameText.setText(stu.getName());
                korText.setText("" + stu.getKor());
                engText.setText("" +stu.getEng());
                mathText.setText("" +stu.getMath());
                avgText.setText("" + stu.getAvg());
                rankText.setText("" + stu.getRank());
                clickedStudentInfo = stu;                
            }
        });
        }
        } catch (Exception e) {
        }
        
        this.pack();
        clickedStudentInfo = null;
    }
    
    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        StudentInfo obj = new StudentInfo(this.nameText.getText(),
                                        Integer.parseInt(this.korText.getText()),
                                        Integer.parseInt(this.engText.getText()),
                                        Integer.parseInt(this.mathText.getText()));
        totalList.add(obj);
        showTotalList();
    }//GEN-LAST:event_insertButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        clickedStudentInfo.setName(this.nameText.getText());
        clickedStudentInfo.setKor(Integer.parseInt(this.korText.getText()));
        clickedStudentInfo.setEng(Integer.parseInt(this.engText.getText()));
        clickedStudentInfo.setMath(Integer.parseInt(this.mathText.getText()));
        clickedStudentInfo.setRank(Integer.parseInt(this.rankText.getText()));
        clickedStudentInfo.setAvg();
        
        showTotalList();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (clickedStudentInfo == null) {
            return;
        }
        
        totalList.remove(clickedStudentInfo);
        if (showList.size() % 5 == 0)   {
            currentPageNum--;
        }
        showTotalList();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchList.clear();
        
        for (int i = 0; i < totalList.size(); i++)  {
            if (totalList.get(i).getName().contains(nameText.getText()))    {
                searchList.add(totalList.get(i));
            }
        }
        
        showSearchList();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void objectification(String value)  {
        StudentInfo obj = new StudentInfo(value);
        totalList.add(obj);
    }
    
    private void dataReadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataReadButtonActionPerformed
        totalList.clear();
        
        String rfilename = "ScoreMan.dat";
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(rfilename));
            String info = "";
            while(true) {
                try {
                    info = br.readLine();
                    objectification(info);
                } catch (Exception e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        showTotalList();
    }//GEN-LAST:event_dataReadButtonActionPerformed

    private void dataWriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataWriteButtonActionPerformed
        String wfilename = "ScoreMan.dat";
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(wfilename, false));
            for (int i = 0; i < totalList.size(); i++)  {
                bw.write(totalList.get(i).getName() + " ");
                bw.write(totalList.get(i).getKor() + " ");
                bw.write(totalList.get(i).getEng() + " ");
                bw.write(totalList.get(i).getMath() + "");
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_dataWriteButtonActionPerformed

    private void serializationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serializationButtonActionPerformed
        String sfilename = "ScoreMan.ser";
        
        try {
            FileOutputStream fos = new FileOutputStream(sfilename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (int i = 0; i < totalList.size(); i++)  {
                oos.writeObject(totalList.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_serializationButtonActionPerformed

    private void deSerializationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deSerializationButtonActionPerformed
        totalList.clear();
        
        String dfilename = "ScoreMan.ser";
        
        try {
            FileInputStream fis = new FileInputStream(dfilename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true) {
                try {
                StudentInfo stu = (StudentInfo)ois.readObject();
                totalList.add(stu);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
        } catch (Exception e) {
        }
        
        showTotalList();
    }//GEN-LAST:event_deSerializationButtonActionPerformed

    private void firstPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstPageButtonActionPerformed
        if(currentPageNum >= 1) {
            currentPageNum = 1;
        }
        
        showList();
    }//GEN-LAST:event_firstPageButtonActionPerformed

    private void prevPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevPageButtonActionPerformed
        if (currentPageNum > 1) {
            currentPageNum--;
        }
        
        showList();
    }//GEN-LAST:event_prevPageButtonActionPerformed

    private void nextPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextPageButtonActionPerformed
        if (currentPageNum*5 < showList.size()) {
            currentPageNum++;
        }
        
        showList();
    }//GEN-LAST:event_nextPageButtonActionPerformed

    private void lastPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastPageButtonActionPerformed
        if (currentPageNum < ((showList.size()-1)/5)+1) {
            currentPageNum = (((showList.size()-1)/5)+1);
        }
        
        showList();
    }//GEN-LAST:event_lastPageButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ScoreMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreMan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField avgText;
    private javax.swing.JButton dataReadButton;
    private javax.swing.JButton dataWriteButton;
    private javax.swing.JButton deSerializationButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField engText;
    private javax.swing.JButton firstPageButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField korText;
    private javax.swing.JButton lastPageButton;
    private javax.swing.JTextField mathText;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton nextPageButton;
    private javax.swing.JButton prevPageButton;
    private javax.swing.JTextField rankText;
    private javax.swing.JPanel resultPannel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton serializationButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton whereAmI;
    // End of variables declaration//GEN-END:variables
}
