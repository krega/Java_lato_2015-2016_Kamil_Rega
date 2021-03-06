
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamil
 */
public class Wybor_Kategorii implements  ActionListener {
    private JFrame framePanel;
    private JButton przyciskSport;
    private JButton przyciskPolityka;
    private JButton przyciskSztuka;
    private JButton przyciskLiteratura;
    private JButton przyciskHistoria;
    private String kategoria;
    private User user;
    IPobierzPytanie pytania;
    private ICredentialHandler hndlr;
    
    

    public Wybor_Kategorii(User us, ICredentialHandler hand)

    {
        user=us;
       pytania=new DostanPytanieZPliku();
       hndlr=hand;
       initJFramePanelFrame();
       initJButtonSport();
       initJButtonPolityka();
       initJButtonSztuka();
       initJButtonLiteratura();
       initJButtonHistoria();
       framePanel.setVisible(true);
       
    }
    public void initJButtonHistoria()
    {
        przyciskHistoria=new JButton("HISTORIA");
       przyciskHistoria.addActionListener(this);
        przyciskHistoria.setLayout(null);
        przyciskHistoria.setBounds(100,400,300,50);
        framePanel.add(przyciskHistoria);
    }
    public void initJButtonLiteratura()
    {
        przyciskLiteratura=new JButton("LITERATURA");
        przyciskLiteratura.addActionListener(this);
        przyciskLiteratura.setLayout(null);
        przyciskLiteratura.setBounds(100,320,300,50);
        framePanel.add(przyciskLiteratura);
    }
    public void initJButtonSztuka()
    {
        przyciskSztuka=new JButton("SZTUKA");
        przyciskSztuka.addActionListener(this);
        przyciskSztuka.setLayout(null);
        przyciskSztuka.setBounds(100,240,300,50);
        framePanel.add(przyciskSztuka);
    }
    public void initJFramePanelFrame()
    {
        framePanel=new JFrame("Okno Wyboru");
        framePanel.setLayout(null);
        framePanel.setBounds(600,600,600,600);
        framePanel.setSize(new Dimension(500, 600));
        framePanel.setLocation(100, 100);
    }
    public void initJButtonSport()
    {
        przyciskSport=new JButton("Sport");
         przyciskSport.addActionListener(this);
        przyciskSport.setLayout(null);
        przyciskSport.setBounds(100, 80, 300, 50);
        framePanel.add(przyciskSport);
    }
    public void initJButtonPolityka()
    {
         przyciskPolityka=new JButton("Polityka");
         przyciskPolityka.addActionListener(this);
         przyciskPolityka.setLayout(null);
         przyciskPolityka.setBounds(100,160,300,50);
         framePanel.add(przyciskPolityka);
    }
    @Override 
     public void actionPerformed(ActionEvent e) {
         Object src = e.getSource();
         if(src==przyciskHistoria)
         {
            String kategoria=Kategoria.Historia;
           
            
             try {
                 //pytania.PobierzPytanie(kategoria);

                  new Okno_Pytania(pytania,kategoria,user,hndlr);

                  framePanel.dispose();
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         if(src==przyciskPolityka)
         {
             String kategoria=Kategoria.Polityka;
              try {
              //   ustawPytanie.PobierzPytanie(kategoria);

                 new Okno_Pytania(pytania,kategoria,user,hndlr);

                  framePanel.dispose();
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         if(src==przyciskSport)
         {
                String kategoria=Kategoria.Sport;
             try {

                // ustawPytanie.PobierzPytanie(kategoria);

                 new Okno_Pytania(pytania,kategoria,user,hndlr);

                  framePanel.dispose();
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         if(src==przyciskLiteratura)
         {
             String kategoria=Kategoria.Literatura;
             try {
                // ustawPytanie.PobierzPytanie(kategoria);

                   new Okno_Pytania(pytania,kategoria,user,hndlr);

                    framePanel.dispose();

             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
         if(src==przyciskSztuka)
         {
             String  kategoria=Kategoria.Sztuka;
             
              try {
                 //pytania.PobierzPytanie(kategoria);
                   new Okno_Pytania(pytania,kategoria,user,hndlr);

                    framePanel.dispose();
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             
             } catch (IOException ex) {
                 Logger.getLogger(Wybor_Kategorii.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
     }
    
}
