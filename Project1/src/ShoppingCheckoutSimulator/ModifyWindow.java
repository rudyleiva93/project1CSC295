/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShoppingCheckoutSimulator;

/**
 *
 * @author rleiva
 */

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ModifyWindow extends javax.swing.JFrame {

    private SearchWindow sw;
    private List<CustomerInfo>customer;
    private int orderNumber;
    
    /**
     * Creates new form ModifyWindow
     */
    public ModifyWindow(SearchWindow sw, List<CustomerInfo>customer, int orderNumber) {
        this.sw = sw;
        this.customer = customer;
        this.orderNumber = orderNumber;
        
       // jTextField_firstName.setText(customer.get(orderNumber).getFirstName());
        
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

        jTextField_address2 = new javax.swing.JTextField();
        jLabel_city = new javax.swing.JLabel();
        jRadioButton_mr = new javax.swing.JRadioButton();
        jTextField_city = new javax.swing.JTextField();
        jRadioButton_ms = new javax.swing.JRadioButton();
        jLabel_state = new javax.swing.JLabel();
        jRadioButton_mrs = new javax.swing.JRadioButton();
        jComboBox_state = new javax.swing.JComboBox<>();
        jLabel_postcode = new javax.swing.JLabel();
        jTextField_postcode = new javax.swing.JTextField();
        jButton_cancel = new javax.swing.JButton();
        jLabel_title = new javax.swing.JLabel();
        jLabel_firstName = new javax.swing.JLabel();
        jTextField_firstName = new javax.swing.JTextField();
        jLabel_lastName = new javax.swing.JLabel();
        jTextField_lastName = new javax.swing.JTextField();
        jLabel_address1 = new javax.swing.JLabel();
        jTextField_address1 = new javax.swing.JTextField();
        jButton_submit = new javax.swing.JButton();
        jLabel_address2 = new javax.swing.JLabel();
        jLabel_visa = new javax.swing.JLabel();
        jPasswordField_visa = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_city.setText("City");

        jRadioButton_mr.setText("Mr.");

        jRadioButton_ms.setText("Ms.");

        jLabel_state.setText("State");

        jRadioButton_mrs.setText("Mrs.");

        jComboBox_state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "California", "Florida", "New York", "Texas", "Washington" }));

        jLabel_postcode.setText("Postcode");

        jButton_cancel.setText("Cancel");
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });

        jLabel_title.setText("Title");

        jLabel_firstName.setText("First Name");

        jTextField_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_firstNameActionPerformed(evt);
            }
        });

        jLabel_lastName.setText("Last Name");

        jLabel_address1.setText("Address 1");

        jButton_submit.setText("Submit");
        jButton_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_submitActionPerformed(evt);
            }
        });

        jLabel_address2.setText("Address 2");

        jLabel_visa.setText("Visa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_submit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_city)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_lastName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_lastName))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_address1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_address1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel_address2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_city, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_address2)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_postcode)
                                        .addComponent(jLabel_visa)
                                        .addComponent(jLabel_state))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jComboBox_state, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_postcode, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                        .addComponent(jPasswordField_visa)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_firstName)
                                        .addComponent(jLabel_title))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jRadioButton_mr)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButton_ms)
                                            .addGap(18, 18, 18)
                                            .addComponent(jRadioButton_mrs))
                                        .addComponent(jTextField_firstName)))))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_title)
                    .addComponent(jRadioButton_mr)
                    .addComponent(jRadioButton_ms)
                    .addComponent(jRadioButton_mrs))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_firstName)
                    .addComponent(jTextField_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_lastName)
                    .addComponent(jTextField_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_address1)
                    .addComponent(jTextField_address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_address2)
                    .addComponent(jTextField_address2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_city)
                    .addComponent(jTextField_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_state)
                    .addComponent(jComboBox_state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_postcode)
                    .addComponent(jTextField_postcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_visa)
                    .addComponent(jPasswordField_visa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_cancel)
                    .addComponent(jButton_submit))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_cancelActionPerformed

    private void jButton_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_submitActionPerformed

        if (jRadioButton_mr.isSelected())
        {
            customer.get(orderNumber).setTitle(jRadioButton_mr.getText());
        }
        else if (jRadioButton_ms.isSelected())
        {
            customer.get(orderNumber).setTitle(jRadioButton_ms.getText());
        }
        else if (jRadioButton_mrs.isSelected())
        {
            customer.get(orderNumber).setTitle(jRadioButton_mrs.getText());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Must Select a title!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        customer.get(orderNumber).setFirstName(jTextField_firstName.getText());
        customer.get(orderNumber).setLastName(jTextField_lastName.getText());
        customer.get(orderNumber).setAddress1(jTextField_address1.getText());
        customer.get(orderNumber).setAddress2(jTextField_address2.getText());
        customer.get(orderNumber).setCity(jTextField_city.getText());
        String state = (String)jComboBox_state.getSelectedItem();
        customer.get(orderNumber).setState(state);
        customer.get(orderNumber).setPostcode(jTextField_postcode.getText());
        customer.get(orderNumber).setVisa(jPasswordField_visa.getText());

        if (customer.get(orderNumber).getFirstName().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Must enter your first name!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (customer.get(orderNumber).getLastName().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Must enter your last name!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (customer.get(orderNumber).getAddress1().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Must enter your address!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (customer.get(orderNumber).getCity().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Must enter your city!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (customer.get(orderNumber).getPostcode().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Must enter your postcode!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if (customer.get(orderNumber).getVisa().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Must enter your visa number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            //customer.add(cust);
            JOptionPane.showMessageDialog(null, "Order Modified!", "Order Submitted", JOptionPane.INFORMATION_MESSAGE);

            /*jTextField_firstName.setText("");
            jTextField_lastName.setText("");
            jTextField_address1.setText("");
            jTextField_address2.setText("");
            jTextField_city.setText("");
            jTextField_postcode.setText("");
            jPasswordField_visa.setText("");*/
            //orderNumber++;
            this.setVisible(false);
            sw.setVisible(true);
        }

    }//GEN-LAST:event_jButton_submitActionPerformed

    private void jTextField_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_firstNameActionPerformed
        //jTextField_firstName.setText(customer.get(orderNumber).getFirstName());
    }//GEN-LAST:event_jTextField_firstNameActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyWindow().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_submit;
    private javax.swing.JComboBox<String> jComboBox_state;
    private javax.swing.JLabel jLabel_address1;
    private javax.swing.JLabel jLabel_address2;
    private javax.swing.JLabel jLabel_city;
    private javax.swing.JLabel jLabel_firstName;
    private javax.swing.JLabel jLabel_lastName;
    private javax.swing.JLabel jLabel_postcode;
    private javax.swing.JLabel jLabel_state;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_visa;
    private javax.swing.JPasswordField jPasswordField_visa;
    private javax.swing.JRadioButton jRadioButton_mr;
    private javax.swing.JRadioButton jRadioButton_mrs;
    private javax.swing.JRadioButton jRadioButton_ms;
    private javax.swing.JTextField jTextField_address1;
    private javax.swing.JTextField jTextField_address2;
    private javax.swing.JTextField jTextField_city;
    private javax.swing.JTextField jTextField_firstName;
    private javax.swing.JTextField jTextField_lastName;
    private javax.swing.JTextField jTextField_postcode;
    // End of variables declaration//GEN-END:variables
}
