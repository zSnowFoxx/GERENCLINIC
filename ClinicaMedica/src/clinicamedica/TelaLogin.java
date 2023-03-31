package clinicamedica;

import java.awt.Cursor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TelaLogin extends javax.swing.JPanel {
    private Clinica clinica;
    
    public TelaLogin() {
        initComponents();
        img_logo.setOpaque(false);
        btn_entrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        txt_criarConta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        File serial = new File("src\\arquivos\\usuario.ser");
        try {
            FileInputStream arquivo = new FileInputStream(serial);
            ObjectInputStream in = new ObjectInputStream(arquivo);
            
            this.clinica = (Clinica) in.readObject();
            in.close();
            arquivo.close();
            
            System.out.println("Desserializacao realizada.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Arquivo serial nao encontrado.");
            clinica = new Clinica();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        btn_entrar = new javax.swing.JButton();
        txt_pass = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_criarConta = new javax.swing.JLabel();
        img_logo = new extras.PicturePanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem Vindo!");

        btn_entrar.setBackground(new java.awt.Color(153, 255, 51));
        btn_entrar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setText("Entrar");
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entrarMouseClicked(evt);
            }
        });

        txt_pass.setBackground(new java.awt.Color(255, 255, 255));
        txt_pass.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(102, 102, 102));
        txt_pass.setText("Digite sua senha...");
        txt_pass.setToolTipText("");
        txt_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passFocusLost(evt);
            }
        });

        txt_user.setBackground(new java.awt.Color(255, 255, 255));
        txt_user.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txt_user.setForeground(new java.awt.Color(102, 102, 102));
        txt_user.setText("Digite seu email ou nome de usuário...");
        txt_user.setToolTipText("");
        txt_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_userFocusLost(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Não possue cadastro?");

        txt_criarConta.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_criarConta.setForeground(new java.awt.Color(255, 255, 255));
        txt_criarConta.setText("Crie uma conta");
        txt_criarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_criarContaMouseClicked(evt);
            }
        });

        img_logo.setImg(new ImageIcon("src\\arquivos\\logo-top-medic.png"));

        javax.swing.GroupLayout img_logoLayout = new javax.swing.GroupLayout(img_logo);
        img_logo.setLayout(img_logoLayout);
        img_logoLayout.setHorizontalGroup(
            img_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );
        img_logoLayout.setVerticalGroup(
            img_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Faça seu login...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(img_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_pass)
                            .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_criarConta)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_criarConta))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(img_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusGained
        if(txt_user.getText().equals("Digite seu email ou nome de usuário...")){
		txt_user.setText("");
	}
    }//GEN-LAST:event_txt_userFocusGained

    private void txt_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_userFocusLost
        if(txt_user.getText().equals("")){
		txt_user.setText("Digite seu email ou nome de usuário...");
	}
    }//GEN-LAST:event_txt_userFocusLost

    private void txt_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusGained
        if(txt_pass.getText().equals("Digite sua senha...")){
		txt_pass.setText("");
	}
    }//GEN-LAST:event_txt_passFocusGained

    private void txt_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passFocusLost
        if(txt_pass.getText().equals("")){
		txt_pass.setText("Digite sua senha...");
	}
    }//GEN-LAST:event_txt_passFocusLost

    private void btn_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_entrarMouseClicked

    private void txt_criarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_criarContaMouseClicked
        Janela.tc = new TelaCadastro();
        JFrame janela = (JFrame)SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().removeAll();
        janela.add(Janela.tc);
        janela.pack();
    }//GEN-LAST:event_txt_criarContaMouseClicked

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private extras.PicturePanel img_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel txt_criarConta;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
