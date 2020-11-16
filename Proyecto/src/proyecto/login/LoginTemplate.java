/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.login;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font; 
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Emanuel P
 */
public class LoginTemplate extends JFrame{
    private JPanel pCentral,pFondo;
    private JLabel jlogin,jemail,jpassword,recuerdame,lLogo;
    private Font fuente;
    private Color colorEnfasis,colorComplemento;
    private JTextField tfcorreo;
    private JPasswordField tfcontrasena;
    private JButton bEntrar,bRegistrarme;
    private JCheckBox checkSi;
    private Cursor cMano,cText;
    private ImageIcon logo;
    public  LoginTemplate(){ 
        
            super("Prime Video");
            
            pCentral = new JPanel();
            pCentral.setLayout(null);
            pCentral.setSize(400,500);
            pCentral.setLocation(440,100);
            pCentral.setBackground(Color.WHITE);
            pCentral.setBorder(BorderFactory.createLineBorder(Color.black));   
            this.add(pCentral);
            
            pFondo = new JPanel();
            pFondo.setLayout(null);
            pFondo.setSize(1280,720);
            pFondo.setLocation(0,0);
            pFondo.setBackground(Color.WHITE);
            this.add(pFondo);
            
            lLogo = new JLabel();
            lLogo.setSize(198,73);
            lLogo.setLocation((pFondo.getWidth() - 198) / 2, 0);
            logo = new ImageIcon("resourses/images/PrimeVideo.PNG");
            lLogo.setIcon(logo);
            pFondo.add(lLogo);
            
                    
            jlogin = new JLabel("Iniciar Sesion");
            jlogin.setLayout(null);
            fuente = new Font("Arial", 1, 30);
            jlogin.setFont(fuente);
            jlogin.setSize(200,50);
            jlogin.setLocation(40,50);
            jlogin.setForeground(Color.BLACK);
            pCentral.add(jlogin);
            
            jemail = new JLabel("Dirección de e-mail o número de teléfono móvil ");
            jemail.setSize(280, 30);
            jemail.setLocation(40, 110);
            jemail.setForeground(Color.DARK_GRAY);
            pCentral.add(jemail);
            
            tfcorreo = new JTextField("");
            tfcorreo.setSize(320, 30);
            tfcorreo.setLocation(40, 142);
            tfcorreo.setForeground(Color.BLACK);
            tfcorreo.setBackground(Color.WHITE);
            tfcorreo.setCaretColor(Color.BLUE);
            pCentral.add(tfcorreo);
            
            jpassword = new JLabel("Contraseña ");
            jpassword.setSize(100, 30);
            jpassword.setLocation(40, 170);
            jpassword.setForeground(Color.DARK_GRAY);
            pCentral.add(jpassword);
            
            jpassword = new JLabel("¿Has olvidado la contraseña? ");
            jpassword.setSize(200, 30);
            jpassword.setLocation(150, 170);
            jpassword.setForeground(Color.BLUE);
            pCentral.add(jpassword);
            
            tfcontrasena = new JPasswordField("");
            tfcontrasena.setSize(320, 30);
            tfcontrasena.setLocation(40, 200);
            tfcontrasena.setForeground(Color.BLACK);
            tfcontrasena.setBackground(Color.WHITE);
            tfcontrasena.setCaretColor(Color.BLUE);
            cText = new Cursor(Cursor.TEXT_CURSOR);
            tfcontrasena.setCursor(cText);
            pCentral.add(tfcontrasena);
            
            bEntrar = new JButton("Iniciar Sesion");
            bEntrar.setSize(320, 35);
            bEntrar.setLocation(40, 250);
            colorEnfasis = new Color(242,200,95);
            colorComplemento = new Color(234,236,239);
            bEntrar.setBackground(colorEnfasis);
            bEntrar.setForeground(Color.BLACK);
            bEntrar.setFocusable(false);
            cMano = new Cursor(Cursor.HAND_CURSOR);
            bEntrar.setCursor(cMano);
            pCentral.add(bEntrar);
            
            checkSi = new JCheckBox("");
            checkSi.setSize(25, 25);
            checkSi.setFocusable(false);
            checkSi.setBackground(Color.WHITE);
            checkSi.setLocation(40,370);
            checkSi.setCursor(cMano);
            pCentral.add(checkSi);
            
            recuerdame = new JLabel("Recuérdame");
            recuerdame.setSize(280, 30);
            recuerdame.setLocation(65, 367);
            recuerdame.setForeground(Color.BLACK);
            pCentral.add(recuerdame);
            
            bRegistrarme = new JButton("Crea tu cuenta de Amazon");
            bRegistrarme.setSize(320, 35);
            bRegistrarme.setLocation(40, 400);
            colorComplemento = new Color(234,236,239);
            bRegistrarme.setBackground(colorComplemento);
            bRegistrarme.setForeground(Color.BLACK);
            bRegistrarme.setCursor(cMano);
            pCentral.add(bRegistrarme);
           


            this.setLayout(null);        
            this.setSize(1280 , 720);
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
    }
    
}
