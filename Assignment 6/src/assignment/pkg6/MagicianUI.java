//GUI implementation for CMPSC 221 assignment 6
//Written by Alexander Kohler 
package assignment.pkg6;

import java.awt.BorderLayout;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Alex
 */
public class MagicianUI extends javax.swing.JFrame {

    public MagicianUI() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        label3 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        label3.setText("label3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setLineWrap(true);
        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Welcome to the Magician Scheduler! To schedule a magician    click the Schedule tab. To view our current schedule status click on the Status tab. ");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("About", jPanel4);

        jLabel2.setText("Please enter first and last name");

        jLabel1.setText("Please select a Holiday");

        //Holiday data retrieval
        Holidays holidayData = new Holidays();
        String[] holidayStrings = new String[25]; // max amt of magicians is 10
        holidayStrings = holidayData.retrieveHolidays();
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(holidayStrings));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jFormattedTextField1.setText("Name");
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Add Holiday");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jFormattedTextField2.setText("Holiday Name");
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Add additional holiday:");

        jFormattedTextField3.setText("Magician's Name");
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Add additional magician: ");

        jButton4.setText("Add Magician");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Magicians magicianData = new Magicians();
        String[] myMagicians = new String [20];
        myMagicians = magicianData.retrieveMagicians();
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(myMagicians));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton5.setText("Drop Magician");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Remove magician from schedule: ");

        jLabel8.setText("Cancel Customer Holiday");

        //olidays holidayData = new Holidays();
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Customer"}));
        jComboBox5.setEnabled(false);
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jComboBox6.setEnabled(false);
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Holiday"}));
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });

        jButton6.setText("Cancel Customer Holiday");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Where from?", "Schedule", "Waiting List"}));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox5, 0, 110, Short.MAX_VALUE)
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addContainerGap(309, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jButton1))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(135, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane2.addTab("Schedule", jPanel2);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Holidays");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Magicians");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Waiting List");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jComboBox2.setEnabled(false);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(holidayStrings));

        jComboBox3.setEnabled(false);
        String[] magicianStrings = new String[10]; // max amt of magicians is 10
        magicianStrings = magicianData.retrieveMagicians();
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(magicianStrings));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton2.setText("Generate Table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Note: priority under waiting list signifies priority of customer A=high, B=low");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton3))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Status", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        boolean errorFlag = false; //for sake of letting application know whether or not to execute a query (can't execute a query with no holiday/magician specification)

        //holiday jcombobox not selected error handling
        if (jRadioButton1.isSelected() && jComboBox2.getSelectedItem().toString().equals("Holiday")) //if the holiday button is selected
        {
            JOptionPane.showMessageDialog(jFrame1, "Please choose a holiday", "Error", JOptionPane.ERROR_MESSAGE);
            errorFlag = true;
        }

        //magician jcombobox not selected error handling
        if (jRadioButton2.isSelected() && jComboBox3.getSelectedItem().toString().equals("Magician")) {
            JOptionPane.showMessageDialog(jFrame1, "Please choose a magician", "Error", JOptionPane.ERROR_MESSAGE);
            errorFlag = true;
        }

        if (errorFlag == false) //if the user has supplied correct inputs
        {
            Schedule scheduleData = new Schedule();
            Magicians magicianData = new Magicians();
            WaitingList waitingData = new WaitingList();

            JFrame frame = new JFrame();//for sake of table popups
            frame.setLayout(new BorderLayout());

            if (jRadioButton1.isSelected()) //holiday button is selected
            {

                JTable myHolidayTable = new JTable();
                myHolidayTable = scheduleData.getHolidayTable(jComboBox2.getSelectedItem().toString());

                int holidayTableSize = myHolidayTable.getRowCount();
                myHolidayTable.setEnabled(false);
                if (holidayTableSize < 1) {
                    JOptionPane.showMessageDialog(jFrame1, "There are currently no reservations for " + jComboBox2.getSelectedItem().toString() + " !", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    frame.add(new JScrollPane(myHolidayTable));
                    frame.setTitle("Schedule for " + jComboBox2.getSelectedItem().toString());
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }//end else
            }//end holiday case handling

            if (jRadioButton2.isSelected()) {
                //check for empty table
                JTable myMagicianTable = new JTable();
                myMagicianTable = scheduleData.getMagicianTable(jComboBox3.getSelectedItem().toString());
                int magicianTableSize = myMagicianTable.getRowCount();
                myMagicianTable.setEnabled(false);

                if (magicianTableSize < 1) {
                    JOptionPane.showMessageDialog(jFrame1, jComboBox3.getSelectedItem().toString() + " does not currently have anyone scheduled!", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    frame.add(new JScrollPane(myMagicianTable));
                    frame.setTitle("Schedule for magician " + jComboBox3.getSelectedItem().toString());
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }

            }//end magician case handling

            if (jRadioButton3.isSelected()) {

                JTable myWaitingTable = new JTable();
                myWaitingTable = waitingData.getTable();
                int waitingTableSize = myWaitingTable.getRowCount();

                myWaitingTable.setEnabled(false);

                if (waitingTableSize < 1) //if the waiting table is empty
                {
                    JOptionPane.showMessageDialog(jFrame1, "There is nobody currently on the waiting list.", "Error", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    frame.add(new JScrollPane(myWaitingTable));
                    frame.setTitle("Waiting list");
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }

            }//end waiting list case handling

            if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected() && !jRadioButton3.isSelected()) {
                JOptionPane.showMessageDialog(jFrame1, "Please select one of the radio buttons", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }//end errorflag if

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(false);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jComboBox2.setEnabled(true);
        jComboBox3.setEnabled(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       //user error handling
        boolean errorFlag = false;
        if (jComboBox7.getSelectedItem().toString().equals("Where from?"))
        {
         JOptionPane.showMessageDialog(jFrame1, "Please choose what list you wish to remove from. ('Where from?' Drop down box)", "Error", JOptionPane.WARNING_MESSAGE);
         errorFlag = true;
        }
        
        else if (jComboBox5.getSelectedItem().toString().equals("Customer"))
        {
            JOptionPane.showMessageDialog(jFrame1, "Please choose a customer.", "Error", JOptionPane.WARNING_MESSAGE);
            errorFlag = true;
        }
        
        else if (jComboBox6.getSelectedItem().toString().equals("Holiday"))
        { 
         JOptionPane.showMessageDialog(jFrame1, "Please choose a holiday.", "Error", JOptionPane.WARNING_MESSAGE);
         errorFlag = true;
        }
        
        
        
        
        if (jComboBox7.getSelectedItem().toString().equals("Schedule") && !errorFlag){//if we are removing from schedule
           Schedule scheduleData = new Schedule();
           WaitingList waitingData = new WaitingList();
           String removedCustomer = jComboBox5.getSelectedItem().toString();
           String holiday = jComboBox6.getSelectedItem().toString();
           String magician = scheduleData.getMagician(removedCustomer, holiday);
           boolean found = false;
           //first remove customer
           scheduleData.removeCustomer(removedCustomer, magician, holiday);
           //second, check the waiting list to see if someone can be scheduled for that holiday
           if (waitingData.onWaitingListFor(holiday, false)){//check high priority first 
                   //if there is someone available, schedule them
                    found = true;
                    String newCustomer = waitingData.retrieveFromWaitingList(holiday, false);
                    scheduleData.insertCustomer(newCustomer, magician, holiday);
                    //then remove them from waiting list
                    waitingData.removeCustomer(newCustomer, holiday, false);
                   //if not, check low priority 
                     JOptionPane.showMessageDialog(jFrame1, removedCustomer + " has been removed from the schedule." + newCustomer + " was removed from the waiting list and scheduled for " + holiday + " with " + magician + " instead." , "Notice", JOptionPane.INFORMATION_MESSAGE);
           }
          else   //check low priority
            {
               if (waitingData.onWaitingListFor(holiday, true)){//check high priority first 
                   //if there is someone available, schedule them
                   found = true;
                    String newCustomer = waitingData.retrieveFromWaitingList(holiday, true);
                    scheduleData.insertCustomer(newCustomer, magician, holiday);
                    //then remove them from waiting list
                    waitingData.removeCustomer(newCustomer, holiday, true);    
                     JOptionPane.showMessageDialog(jFrame1, removedCustomer + " has been removed from the schedule." + newCustomer + " was removed from the waiting list and scheduled for " + holiday + " with " + magician + " instead." , "Notice", JOptionPane.INFORMATION_MESSAGE);
                    }  
            }    
           
           if (found == false)
           {
                JOptionPane.showMessageDialog(jFrame1, "Customer removed." , "Notice", JOptionPane.INFORMATION_MESSAGE);
                jComboBox5.setSelectedItem("Customer");
                jComboBox6.setSelectedItem("Holiday");
                jComboBox5.setEnabled(false);
                jComboBox6.setEnabled(false);
                jComboBox7.setSelectedItem("Where from?");
           
          
           }
           
          
       }//end removal from schedule if clause 
        
        
        if (jComboBox7.getSelectedItem().toString().equals("Waiting List") && !errorFlag)//if we are removing from waiting list 
        {
           WaitingList waitingData = new WaitingList();
           boolean customerPriority = waitingData.getCustomerPriority(jComboBox5.getSelectedItem().toString(), jComboBox6.getSelectedItem().toString());//in the extreme case that a customer is waitlisted for a holiday with two different priorities, we want to grab his/her priority just to be safef
           waitingData.removeCustomer(jComboBox5.getSelectedItem().toString(), jComboBox6.getSelectedItem().toString(), customerPriority);
           
      
           
           
            JOptionPane.showMessageDialog(jFrame1, "Customer removed." , "Notice", JOptionPane.INFORMATION_MESSAGE);
             jComboBox5.setSelectedItem("Customer");
             jComboBox6.setSelectedItem("Holiday");
             jComboBox5.setEnabled(false);
             jComboBox6.setEnabled(false);
            jComboBox7.setSelectedItem("Where from?");

        }//end removal from waiting list if clause
        
        
       
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
      
            
        if (jComboBox5.getSelectedItem().toString().equals("Customer"))
        {
            jComboBox6.setEnabled(false);
        }
        else
        {
            
            if (jComboBox7.getSelectedItem().toString().equals("Schedule"))
            {
            jComboBox6.setEnabled(true);
            String [] customerHolidayStrings = new String [25];
            
            Schedule scheduleData = new Schedule();
            customerHolidayStrings = scheduleData.getCustomerHolidays(jComboBox5.getSelectedItem().toString());
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(customerHolidayStrings));
            }
            
            if (jComboBox7.getSelectedItem().toString().equals("Waiting List"))
            {
            jComboBox6.setEnabled(true);
            String [] waitingCustomerHolidayStrings = new String [25];
            WaitingList waitingData = new WaitingList();
            waitingCustomerHolidayStrings = waitingData.getCustomerHolidays(jComboBox5.getSelectedItem().toString());
            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(waitingCustomerHolidayStrings));
            
            }
            
            

        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    //drop magician button
    //The Drop command must remove a magician from the application. Any customers the magician has scheduled must be rescheduled with another magician if possible. If the 
    //customer can not be rescheduled, the customer must be put on the front of the waiting list so they will have the first opportunity to be rescheduled.
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jComboBox4.getSelectedItem().toString().equals("Magician"))
        JOptionPane.showMessageDialog(jFrame1, "Please choose a magician to remove from the schedule!", "Error", JOptionPane.WARNING_MESSAGE);

        else
        {
            //first, check if the customers scheduled with the magician can be rescheduled with another magician.

            //iterate through loop of holidays
            Holidays holidayData = new Holidays();
            Schedule scheduleData = new Schedule();
            Magicians magicianData = new Magicians();
            WaitingList waitingData = new WaitingList();
            String [] holidayList = new String [25];
            holidayList = holidayData.retrieveHolidays();
            String currentCustomer;
            String removedMagician = jComboBox4.getSelectedItem().toString();
            String rescheduledMagician;
            //gonna try just removing magician here to make further queries easier..
            magicianData.removeMagician(removedMagician);
            //grab pre loop time stamp (so we can show all values that happened after this
                java.sql.Timestamp preLoopTimeStamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
                //give some time to ensure timestamp will be different
                try {
                    Thread.sleep( 500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MagicianUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                //i think algorithm is wrong.
                for (int i=0; i <holidayList.length; i++)
                {
                    //check to see if there was a customer scheduled for removedMagician at holidayList[i]
                    if (scheduleData.scheduledCustomer(holidayList[i], removedMagician)){
                        //get our customer that was scheduled for our removed magician at holidayList[i]
                        currentCustomer = scheduleData.getScheduledCustomer(holidayList[i], removedMagician);

                        //see if there is another magicianAvailable for this customer at the given holiday
                        if (magicianData.magiciansAvailable(holidayList[i])){
                            //true, get an available magician
                            rescheduledMagician = magicianData.grabAvailableMagician(holidayList[i]);
                            //then insert them into the schedule!
                            scheduleData.insertCustomer(currentCustomer, rescheduledMagician, holidayList[i]);//customer magician holiday

                            //then remove their previous entry with the removed magician
                            scheduleData.removeCustomer(currentCustomer, removedMagician, holidayList[i]);
                        }
                        //otherwise do nothing, there is no available magician

                        //second, ASSERT - if reaching this else, the customer could not be rescheduled, and will be put on front of the waiting lis.
                        else
                        {
                            waitingData.addCustomer(currentCustomer, holidayList[i], false); //false, not general waiting list, should be given priotrity A

                            //remove previous entry with removed magician
                            scheduleData.removeCustomer(currentCustomer, removedMagician, holidayList[i]);
                        }
                        //the customer should also be removed from the schedule no matter what, since this is within check for a customer scheduled with removedMagician

                    }//end check for scheduledCustomer

                }//end for loop

                //the magician has been removed, refresh the combo box
                String [] magicianStrings = new String [25];
                magicianStrings =   magicianData.retrieveMagicians();
                jComboBox4.removeAllItems();
                jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(magicianStrings));

                //also refresh combo box on schedule tab (combo box 3)
                jComboBox3.removeAllItems();
                jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(magicianStrings));

                //get our new rescheduled schedule and waiting list
                JTable rescheduledSchedule = new JTable();
                rescheduledSchedule= scheduleData.getRescheduledCustomers(preLoopTimeStamp);

                JTable rescheduledWaitingList = new JTable();
                rescheduledWaitingList = waitingData.getRescheduledCustomers(preLoopTimeStamp);

                boolean scheduleChanges = false;
                boolean waitingChanges = false;

                if (rescheduledSchedule.getRowCount() > 0)
                {
                    scheduleChanges = true;
                    JOptionPane.showMessageDialog(jFrame1, "With the removal of " + removedMagician + ", some customers were able to be rescheduled. Click okay to see who was rescheduled", "Notification", JOptionPane.INFORMATION_MESSAGE);
                    //add table here

                    JFrame frame = new JFrame();//for sake of table popup
                    frame.setTitle("Customers that were rescheduled");
                    frame.setLayout(new BorderLayout());
                    frame.add(new JScrollPane(rescheduledSchedule));
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                }

                if (rescheduledWaitingList.getRowCount() > 0)
                {
                    waitingChanges = true;
                    JOptionPane.showMessageDialog(jFrame1, "With the removal of " + removedMagician + ", some customers were not able to be scheduled and have been added to the waiting list. They have been given max priority.", "Notification", JOptionPane.INFORMATION_MESSAGE);
                    //add table here

                    JFrame frame = new JFrame();//for sake of table popup
                    frame.setTitle("Customers that were wait-listed (as a result of " + removedMagician + " leaving");
                    frame.setLayout(new BorderLayout());
                    frame.add(new JScrollPane(rescheduledWaitingList));
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }

                if (!(waitingChanges || scheduleChanges))
                JOptionPane.showMessageDialog(jFrame1, "With the removal of " + removedMagician + ", there  were no changes to the schedule.", "Notification", JOptionPane.INFORMATION_MESSAGE);

            }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Magicians magicianData = new Magicians();
        if (jFormattedTextField3.getText().equals("Magician's Name") || !isUseless(jFormattedTextField3.getText()))
        JOptionPane.showMessageDialog(jFrame1, "Please enter a magician!", "Error", JOptionPane.WARNING_MESSAGE);
        else
        {
            if (jFormattedTextField2.getText().length() < 25)
            {
                String[] magicianStrings = new String[25];
                magicianStrings = magicianData.retrieveMagicians();

                String currentMagician = jFormattedTextField3.getText();

                List valid = Arrays.asList(magicianStrings);
                if (valid.contains(currentMagician))  //if item exists
                {
                    JOptionPane.showMessageDialog(jFrame1, "This magician already exists in our database!", "Error", JOptionPane.WARNING_MESSAGE);

                }//end existence check

                else //otherwise, the magician does not exist in the database and we may add him/her
                {

                    magicianData.addMagician(currentMagician);

                    //we will now need a list of holidays to iterate through, and a method to check if those holidays are in the waiting list
                    Holidays holidayData = new Holidays();
                    String[] holidayStrings = new String [25];
                    holidayStrings = holidayData.retrieveHolidays();

                    WaitingList waitingData = new WaitingList();
                    Schedule scheduleData = new Schedule();
                    for (int i=0; i < holidayStrings.length; i++)
                    {
                        String myCustomer = "error"; //for debugging purposes
                        //first check to see if there is someone on the waiting list for holiday 1 (method onWaitingListFor(holidayName)
                            if (waitingData.onWaitingListFor(holidayStrings[i], false))//since we are only adding one magician, we must only check the waiting list for one specific customer with the desired holiday
                            {//we will first check for the high priority case (^^^ generalWaitinList = false)
                                //if there is, get their name (retrieveFrom waitingList)
                                myCustomer = waitingData.retrieveFromWaitingList(holidayStrings[i], false);//retrieve someone who is priority status A (generalWaitingList = false)
                                //then, remove them from the waiting list (removeCustomer)
                                waitingData.removeCustomer(myCustomer, holidayStrings[i], false);//boolean indicates priority
                                //finally, schedule them with the new magician
                                scheduleData.insertCustomer(myCustomer, currentMagician, holidayStrings[i]); //cust, magician, holiday
                                //

                            }
                            else if (waitingData.onWaitingListFor(holidayStrings[i], true))//then check low priority
                            {
                                //we could not find a high priority customer, check for a low priority customer looking to schedule a magician for holiday[i]
                                //if there is, get their name (retrieveFrom waitingList)
                                myCustomer = waitingData.retrieveFromWaitingList(holidayStrings[i], true);//retrieve someone who is priority status B (generalWaitingList = true)
                                //then, remove them from the waiting list (removeCustomer)
                                waitingData.removeCustomer(myCustomer, holidayStrings[i], true);//boolean indicates priority
                                //finally, schedule them with the new magician
                                scheduleData.insertCustomer(myCustomer, currentMagician, holidayStrings[i]); //cust, magician, holiday
                                //
                            }

                        }//end for loop

                        JTable magicianTable = scheduleData.getMagicianTable(currentMagician);

                        if (magicianTable.getRowCount() > 0)
                        {
                            JOptionPane.showMessageDialog(jFrame1, "With the addition of " + currentMagician + ", some spots have opened! Click okay to see who was removed from the waiting list and scheduled with our new magician.", "Notification", JOptionPane.INFORMATION_MESSAGE);
                            JFrame frame = new JFrame();//for sake of table popup
                            frame.setTitle("Customers removed from waiting list and scheduled with " + currentMagician);
                            frame.setLayout(new BorderLayout());
                            frame.add(new JScrollPane(magicianTable));
                            frame.pack();
                            frame.setLocationRelativeTo(null);
                            frame.setVisible(true);
                        }

                        else
                        JOptionPane.showMessageDialog(jFrame1, "Magician " + currentMagician + " has been added to our database.", "Notification", JOptionPane.INFORMATION_MESSAGE);

                        //we also need to refresh the combobox containing magicianNames over in the schedule tab (combo box 3, for claficiation
                            magicianStrings = magicianData.retrieveMagicians();//grab new data
                            jComboBox3.removeAllItems();
                            jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(magicianStrings));

                            //also must refresh combobox in remove magician..    (jcombobox4
                                jComboBox4.removeAllItems();
                                jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(magicianStrings));

                            }

                        }//end length check if clause

                        else
                        {
                            JOptionPane.showMessageDialog(jFrame1, "Your holiday was too long to be entered into the database.", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //make sure you're doing a size check on the string (do no bigger than 24)
        Holidays holidayData = new Holidays();

        //first, check to see if any text was even entered
        if (jFormattedTextField2.getText().equals("Holiday Name") || !isUseless(jFormattedTextField2.getText()))
        JOptionPane.showMessageDialog(jFrame1, "Please enter a holiday!", "Error", JOptionPane.WARNING_MESSAGE);
        else
        {
            if (jFormattedTextField2.getText().length() < 25)
            {
                String[] holidayStrings = new String[25];
                holidayStrings = holidayData.retrieveHolidays();

                DefaultComboBoxModel itemChecker = new DefaultComboBoxModel(holidayStrings);

                if (itemChecker.getIndexOf(jFormattedTextField2.getText()) == -1 ) //if item does not exist
                {

                    holidayData.addHoliday(jFormattedTextField2.getText());
                    JOptionPane.showMessageDialog(jFrame1, "Holiday " + jFormattedTextField2.getText() + " has been added to our holiday database!" , "Notification", JOptionPane.INFORMATION_MESSAGE);

                    //refresh combo box data
                    holidayStrings = holidayData.retrieveHolidays();//grab new data
                    jComboBox1.removeAllItems();
                    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(holidayStrings));
                }//end existence check

                else //otherwise, the item exists
                {
                    JOptionPane.showMessageDialog(jFrame1, "This holiday already exists in our database!", "Error", JOptionPane.WARNING_MESSAGE);
                }

            }//end length check if clause

            else
            {
                JOptionPane.showMessageDialog(jFrame1, "Your holiday was too long to be entered into the database.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }//end else encasing what happens if the user has actually entered something
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        boolean errorFlag = false;

        //USER ERROR- no holiday chosen
        if (jComboBox1.getSelectedItem().equals("Holiday")) {
            JOptionPane.showMessageDialog(jFrame1, "Please choose a holiday", "Error", JOptionPane.ERROR_MESSAGE);
            errorFlag = true;
        }

        //USER ERROR- no first name entered
        if (jFormattedTextField1.getText().equals("Name")) {
            JOptionPane.showMessageDialog(jFrame1, "Please enter your name", "Error", JOptionPane.ERROR_MESSAGE);
            errorFlag = true;
        }

        //create requireed data
        Magicians magicianData = new Magicians();
        Schedule scheduleData = new Schedule();
        WaitingList waitingData = new WaitingList();

        //case 1-there is a magician free
        if (magicianData.magiciansAvailable(jComboBox1.getSelectedItem().toString()) && errorFlag == false) { //if there are magicians available at the selected holiday
            String grabbedMagician = magicianData.grabAvailableMagician(jComboBox1.getSelectedItem().toString());
            scheduleData.insertCustomer(jFormattedTextField1.getText(), grabbedMagician, jComboBox1.getSelectedItem().toString());
            JOptionPane.showMessageDialog(jFrame1, "You have scheduled the magician " + grabbedMagician + " for the holiday " + jComboBox1.getSelectedItem().toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
            
            //since we have added a customer to the schedule we must update jComboBox5 if it is currently selected for schedule 
            if (jComboBox7.getSelectedItem().toString().equals("Schedule"))
            {
            String [] updatedArray = new String [25];
            updatedArray = scheduleData.getCustomerList();
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(updatedArray));
            }
            
        } else {
            if (errorFlag == false) {
                waitingData.addCustomer(jFormattedTextField1.getText(), jComboBox1.getSelectedItem().toString(), true); //name, holiday
                JOptionPane.showMessageDialog(jFrame1, "Unforunately, there were no available magicians for " + jComboBox1.getSelectedItem().toString() + ", however, you have been added to the waiting list.", "Message", JOptionPane.INFORMATION_MESSAGE);
            
            //since we have addded a customer to waiting list we must check if we need to update jComboBox5
            if (jComboBox7.getSelectedItem().toString().equals("Waiting List"))
            {
            String [] updatedArray = new String [25];
            updatedArray = waitingData.getCustomerList();
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(updatedArray));      
            }
            
            
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed

    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed

        if (!jComboBox7.getSelectedItem().toString().equals("Where from?"))
        {
            jComboBox5.setEnabled(false);
        }
        else
        {
            jComboBox5.setEnabled(false);
            jComboBox6.setEnabled(false);

        }

        if (jComboBox7.getSelectedItem().toString().equals("Schedule"))
        {
            jComboBox5.setEnabled(true);
            String [] customerList= new String [25];
            Schedule scheduleData = new Schedule();
            customerList = scheduleData.getCustomerList();
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(customerList));
        }

        if (jComboBox7.getSelectedItem().toString().equals("Waiting List"))
        {
            jComboBox5.setEnabled(true);
            String [] customerWaitList = new String[25];
            WaitingList waitingData = new WaitingList();
            customerWaitList = waitingData.getCustomerList();
            jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(customerWaitList));

        }

    }//GEN-LAST:event_jComboBox7ActionPerformed

    public boolean isUseless( final String string)//used in next method (below) 
    {
   return string != null && !string.isEmpty() && !string.trim().isEmpty();
    }
    
    
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
            java.util.logging.Logger.getLogger(MagicianUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MagicianUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MagicianUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MagicianUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MagicianUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Label label3;
    // End of variables declaration//GEN-END:variables
}
