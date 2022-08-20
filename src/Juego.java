
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emili
 */
public class Juego extends javax.swing.JFrame {
    Random random = new Random();
    Login Login = new Login();
    
    //Atributos
    ArrayList <Personaje> Personajes = new ArrayList();
    ArrayList <Arma> Armas = new ArrayList();
    Date TiempoInicio;
    Date TiempoFin;
    //Fin Atributos
    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        
        //PREDETERMINADOS
        Armas.add(new Arma("Sniper", 80, 90));
        Armas.add(new Arma("Barrel Shotgun", 90, 20));
        
        Personajes.add(new Rastreador("Daku", 200, 100, Armas.get(0)));
        DefaultComboBoxModel mCB_SelectPersonaje = (DefaultComboBoxModel) CB_SelectPersonaje.getModel();
        mCB_SelectPersonaje.addElement(Personajes.get(0));
        
        DefaultComboBoxModel mCB_Personaje_Arma = (DefaultComboBoxModel) CB_Personaje_Arma.getModel();
        mCB_Personaje_Arma.addElement(Armas.get(0));
        mCB_Personaje_Arma.addElement(Armas.get(1));
        
        DefaultComboBoxModel mCB_Personaje_Tipo = (DefaultComboBoxModel) CB_Personaje_Tipo.getModel();
        mCB_Personaje_Tipo.addElement("Medico");
        mCB_Personaje_Tipo.addElement("Fortaleza");
        mCB_Personaje_Tipo.addElement("Rastreador");
        //FIN PREDETERMINADOS
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        CB_SelectPersonaje = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        BT_Comenzar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA_Juego = new javax.swing.JTextArea();
        FTF_Index = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        BT_Atacar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BT_CrearPersonaje = new javax.swing.JButton();
        TF_Personaje_Nombre = new javax.swing.JTextField();
        CB_Personaje_Tipo = new javax.swing.JComboBox<>();
        FTF_Personaje_Escudo = new javax.swing.JFormattedTextField();
        FTF_Personaje_Vida = new javax.swing.JFormattedTextField();
        CB_Personaje_Arma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TF_Arma_Nombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        FTF_Arma_Damage = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        BT_CrearArma = new javax.swing.JButton();
        FTF_Arma_Precision = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        jLabel11.setText("Seleccionar Personaje");

        CB_SelectPersonaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CB_SelectPersonaje.setModel(new javax.swing.DefaultComboBoxModel<>());

        jSeparator2.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setOpaque(true);

        jSeparator3.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(378, Short.MAX_VALUE)
                .addComponent(CB_SelectPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(495, 495, 495))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(563, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(550, 550, 550)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(CB_SelectPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(272, 272, 272)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(465, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Seleccionar", jPanel1);

        BT_Comenzar.setBackground(new java.awt.Color(0, 153, 204));
        BT_Comenzar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        BT_Comenzar.setForeground(new java.awt.Color(204, 204, 204));
        BT_Comenzar.setText("Comenzar");
        BT_Comenzar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_Comenzar.setOpaque(true);
        BT_Comenzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_ComenzarMouseClicked(evt);
            }
        });

        TA_Juego.setColumns(20);
        TA_Juego.setRows(5);
        jScrollPane1.setViewportView(TA_Juego);

        FTF_Index.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setText("Indice de Usuario a atacar");

        BT_Atacar.setBackground(new java.awt.Color(197, 30, 30));
        BT_Atacar.setText("Atacar");
        BT_Atacar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BT_Atacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_AtacarMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator1.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_Comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FTF_Index, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(BT_Atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(BT_Comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FTF_Index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(BT_Atacar))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Jugar", jPanel2);

        jLabel1.setText("Nombre");

        jLabel2.setText("Escudo");

        jLabel3.setText("Vida");

        jLabel4.setText("Arma");

        jLabel5.setText("Tipo");

        BT_CrearPersonaje.setText("Crear Personaje");
        BT_CrearPersonaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CrearPersonajeMouseClicked(evt);
            }
        });

        CB_Personaje_Tipo.setModel(new javax.swing.DefaultComboBoxModel<>());

        FTF_Personaje_Escudo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        FTF_Personaje_Vida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        FTF_Personaje_Vida.setToolTipText("");

        CB_Personaje_Arma.setModel(new javax.swing.DefaultComboBoxModel<>());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Crear Personaje");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Crear Arma");

        jLabel8.setText("Nombre");

        jLabel9.setText("Precision");

        FTF_Arma_Damage.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        jLabel10.setText("Daño");

        BT_CrearArma.setText("Crear Arma");
        BT_CrearArma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CrearArmaMouseClicked(evt);
            }
        });

        FTF_Arma_Precision.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(TF_Personaje_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(FTF_Personaje_Escudo))
                            .addComponent(jLabel8)
                            .addComponent(TF_Arma_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FTF_Arma_Damage, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BT_CrearArma)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel4)
                                    .addComponent(CB_Personaje_Arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FTF_Personaje_Vida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(CB_Personaje_Tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(BT_CrearPersonaje)))
                            .addComponent(FTF_Arma_Precision, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(675, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Personaje_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Personaje_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FTF_Personaje_Vida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FTF_Personaje_Escudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Personaje_Arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_CrearPersonaje))
                .addGap(77, 77, 77)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Arma_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FTF_Arma_Precision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FTF_Arma_Damage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_CrearArma))
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_CrearPersonajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CrearPersonajeMouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel mCB_SelectPersonaje = (DefaultComboBoxModel) CB_SelectPersonaje.getModel();
        
        
        if(TF_Personaje_Nombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifique que haya llenado todos los espacios");
        }else if(Integer.parseInt(FTF_Personaje_Vida.getText()) < 1 || Integer.parseInt(FTF_Personaje_Vida.getText()) > 100){
            JOptionPane.showMessageDialog(this, "La vida debe estar entre 1-100");
        }else if(Integer.parseInt(FTF_Personaje_Escudo.getText()) < 0 || Integer.parseInt(FTF_Personaje_Escudo.getText()) > 100){
            JOptionPane.showMessageDialog(this, "El escudo debe estar entre 0-100");
        }else{
            try {
                if(CB_Personaje_Tipo.getSelectedItem().equals("Medico") ){
                    Personajes.add(new Medico(TF_Personaje_Nombre.getText(), Integer.parseInt(FTF_Personaje_Vida.getText()), Integer.parseInt(FTF_Personaje_Escudo.getText()), (Arma) CB_Personaje_Arma.getSelectedItem() ));
                    mCB_SelectPersonaje.addElement(new Medico(TF_Personaje_Nombre.getText(), Integer.parseInt(FTF_Personaje_Vida.getText()), Integer.parseInt(FTF_Personaje_Escudo.getText()), (Arma) CB_Personaje_Arma.getSelectedItem() ));
                }else if(CB_Personaje_Tipo.getSelectedItem().equals("Rastreador")){
                    Personajes.add(new Rastreador(TF_Personaje_Nombre.getText(), Integer.parseInt(FTF_Personaje_Vida.getText()), Integer.parseInt(FTF_Personaje_Escudo.getText()), (Arma) CB_Personaje_Arma.getSelectedItem()));
                    mCB_SelectPersonaje.addElement(new Rastreador(TF_Personaje_Nombre.getText(), Integer.parseInt(FTF_Personaje_Vida.getText()), Integer.parseInt(FTF_Personaje_Escudo.getText()), (Arma) CB_Personaje_Arma.getSelectedItem()));
                }else{
                    Personajes.add(new Fortaleza(TF_Personaje_Nombre.getText(), Integer.parseInt(FTF_Personaje_Vida.getText()), Integer.parseInt(FTF_Personaje_Escudo.getText()), (Arma) CB_Personaje_Arma.getSelectedItem()));
                    mCB_SelectPersonaje.addElement(new Fortaleza(TF_Personaje_Nombre.getText(), Integer.parseInt(FTF_Personaje_Vida.getText()), Integer.parseInt(FTF_Personaje_Escudo.getText()), (Arma) CB_Personaje_Arma.getSelectedItem()));
                }    
                JOptionPane.showMessageDialog(this, "Personaje Creado Exitosamente");
                TF_Personaje_Nombre.setText("");
                FTF_Personaje_Vida.setText("");
                FTF_Personaje_Escudo.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Verifique que haya llenado todos los espacios");
            }    
        }
        
        
        
        
        
    }//GEN-LAST:event_BT_CrearPersonajeMouseClicked

    private void BT_CrearArmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CrearArmaMouseClicked
        // TODO add your handling code here:
        
        if(TF_Arma_Nombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Verifique que haya llenado todos los espacios");
        }else if(Integer.parseInt(FTF_Arma_Precision.getText()) < 1 || Integer.parseInt(FTF_Arma_Precision.getText()) > 100){
            JOptionPane.showMessageDialog(this, "La precisión debe estar entre 1-100");
        }else if(Integer.parseInt(FTF_Arma_Damage.getText()) < 1 || Integer.parseInt(FTF_Arma_Damage.getText()) > 100){
            JOptionPane.showMessageDialog(this, "El daño debe estar entre 1-100");
        }else{
            try {
                Armas.add(new Arma(TF_Arma_Nombre.getText(), Integer.parseInt(FTF_Arma_Damage.getText()), Integer.parseInt(FTF_Arma_Precision.getText())));

                DefaultComboBoxModel mCB_Personaje_Arma = (DefaultComboBoxModel) CB_Personaje_Arma.getModel();
                mCB_Personaje_Arma.addElement(new Arma(TF_Arma_Nombre.getText(), Integer.parseInt(FTF_Arma_Damage.getText()), Integer.parseInt(FTF_Arma_Precision.getText())));

                JOptionPane.showMessageDialog(this, "Arma Creada Exitosamente");
                TF_Arma_Nombre.setText("");
                FTF_Arma_Damage.setText("");
                FTF_Arma_Precision.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Verifique que haya llenado todos los espacios");
            }    
        }
        
        
    }//GEN-LAST:event_BT_CrearArmaMouseClicked

    private void BT_ComenzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_ComenzarMouseClicked
        // TODO add your handling code here:
        Date TiempoInicio =  new Date();
        
        Jugador Usuario = Login.getIngresado();
        Usuario.setPersonaje( (Personaje) CB_SelectPersonaje.getSelectedItem());
        
        TA_Juego.append("El Jugador: ["+ Usuario.getID() +"]"+ Usuario.getNombre() + " ha ingresado a la partida\n");
        
        for (int i = 0; i < 61; i++) {
        //ID
            int ID = 1 + random.nextInt(1000);
            while (Login.getIDs().contains(ID)) {
                ID = 1 + random.nextInt(1000);
            }
            Login.getIDs().add(ID);
        //Fin ID
        
        //Nombre
            String Nombre = "";
            for (int j = 0; j < 11; j++) {
                Nombre += (char) random.nextInt();
            }
        //Fin Nombre
        
        //Password
            char[] Password = new char[10];
            for (int j = 0; j < Password.length; j++) {
                Password[j] = (char) random.nextInt();
            }
        //Fin Password    
            Jugador Bot = new Jugador(Nombre, ID, Password);
            Login.getUsuarios().add(Bot);
            TA_Juego.append("El Jugador: ["+ Bot.getID() +"]"+ Bot.getNombre() + " ha ingresado a la partida\n");
        }
        
        
    }//GEN-LAST:event_BT_ComenzarMouseClicked

    private void BT_AtacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_AtacarMouseClicked
        // TODO add your handling code here:
        
        Jugador Usuario = Login.getIngresado();
        Usuario.setPersonaje( (Personaje) CB_SelectPersonaje.getSelectedItem());
        
        int index = Integer.parseInt(FTF_Index.getText());
        
        if(!Login.getIDs().contains(index)){
            JOptionPane.showMessageDialog(this, "Disparo fallido: ID incorrecto");
        }else{
            
        }
    }//GEN-LAST:event_BT_AtacarMouseClicked

    
//    public static int BinariaRec(ArrayList <Jugador> Usuarios, int index){
//        
//    } 
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Atacar;
    private javax.swing.JToggleButton BT_Comenzar;
    private javax.swing.JButton BT_CrearArma;
    private javax.swing.JButton BT_CrearPersonaje;
    private javax.swing.JComboBox<String> CB_Personaje_Arma;
    private javax.swing.JComboBox<String> CB_Personaje_Tipo;
    private javax.swing.JComboBox<String> CB_SelectPersonaje;
    private javax.swing.JFormattedTextField FTF_Arma_Damage;
    private javax.swing.JFormattedTextField FTF_Arma_Precision;
    private javax.swing.JFormattedTextField FTF_Index;
    private javax.swing.JFormattedTextField FTF_Personaje_Escudo;
    private javax.swing.JFormattedTextField FTF_Personaje_Vida;
    private javax.swing.JTextArea TA_Juego;
    private javax.swing.JTextField TF_Arma_Nombre;
    private javax.swing.JTextField TF_Personaje_Nombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
