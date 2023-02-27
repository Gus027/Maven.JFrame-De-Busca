package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Screen extends JFrame implements ActionListener{
    
    
    
    
    public static void main(String[] args) {
        JFrame jf = new JFrame("Parceiros");
        JButton bt = new JButton("Buscar");
        JTextField jt = new JTextField();
        JLabel jl = new JLabel("Insira o CNPJ:");
        
       
   
    jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    jf.setSize(500,400);
    jf.setVisible(true);
    jf.setResizable(false);
    jf.getContentPane().setBackground(Color.GRAY);
    jf.setLocationRelativeTo(null);
        jf.setLayout(null);
    
    
    
    
    bt.setBounds(100,50,300,30);
    bt.setFont(new Font("Arial", Font.BOLD, 25));
    jf.add(bt);
    
    jt.setBounds(110,250, 300, 30);
    jt.setFont(new Font("Arial",Font.ITALIC, 30));
    jt.getText();
    jf.add(jt);
//    bt.addActionListener(new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent e) {         
//        if (c.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: SUCESSO \n--------------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c1.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: JAZAO \n--------------------------\nSENHA:*98zx65as ");
//        }        
//        else if(c2.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: DPRIME \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c3.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: SHALLON \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c4.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: PRAIA DE CAMBURI \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c5.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: LONGUI \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c6.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: FUNDAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c7.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: COLISEU \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c8.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: CINCO ESTRELAS\n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c9.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: REDE RUIZ\n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(ca.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: SAO PEDRO\n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cb.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: POSTOONDA\n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cc.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: MARLIN\n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cd.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: FENIX\n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(ce.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: POSTO VB\n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cf.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO:  REDE VALDIR\n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cg.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: MARLIM BRANCO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(ch.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: REDE PRIME \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(ci.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: POSTO CAMPEAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cj.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: BR CENTRO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(ck.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: POSTO ALDEIA \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cl.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: POSTO DRAGAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cm.compareTo(jt.getText())==0){
//                JOptionPane.showMessageDialog(null, "USUARIO: POSTO CAMPEAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cn.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: POSTO CAMPEAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(co.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: POSTO CAMPEAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cp.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: POSTO CAMPEAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cq.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: POSTO CAMPEAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cr.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: POSTO BRANCA III \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cs.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: 13DEMAIO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(ct.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: POSTO CAFE \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cu.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE PRIME \n--------------------------\nSENHA:*98zx65as ");
//       }
//        else if(cv.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: UNIPETRO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cw.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: COMERCIAL IATE \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cy.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: POSTO CAMPEAO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cx.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE UAI \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cz.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: PEDRA BRANCA II \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c11.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: UNIPETRO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c22.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE ARARA AZUL \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c33.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: BR CENTRO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c44.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: SERRA LINDA \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c55.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE SALLUZ \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c66.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE PRIME JS \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c77.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE PETROSHOP \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c88.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE LIDER MAX \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(c99.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: MIRANTE \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(caa.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: MARIA BONITA \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cbb.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE BRK \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(ccc.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE VILA NOVA \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else if(cdd.compareTo(jt.getText())==0){
//            JOptionPane.showMessageDialog(null, "USUARIO: REDE NILO \n--------------------------\nSENHA:*98zx65as ");
//        }
//        else{JOptionPane.showMessageDialog(null, "CNPJ INVALIDO\nOU NAO CADASTRADO NO BANCO");}        
//      }
//     });


    
    jl.setBounds(110, 210, 210, 40);
   // jl.setFont(new Font("Arial". FONT.PLAIN, 20));
    jf.add(jl);
  
   }  

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
  
