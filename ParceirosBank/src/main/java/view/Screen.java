package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Screen extends JFrame implements ActionListener{
    
//    static String c = "04.763.356/0001-38";
//    static String c1 = "30.551.485/0001-72";
//    static String c2 = "28.806.649/0001-13";
//    static String c3 = "30.261.106/0001-00";
//    static String c4 = "29.326.587/0001-05";
//    static String c5 = "30.547.129/0001-85";
//    static String c6 = "28.806.649/0001-13";
//    static String c7 = "30.111.262/0001-94";
//    static String c8 = "26.058.218/0001-90";
//    static String c9 = "04.303.112/0001-72";
//    static String ca = "05.463.954/0001-54";
//    static String cb = "04.361.389/0001-51";
//    static String cc = "39.385.059/0001-80";
//    static String cd = "05.054.647/0001-10";
//    static String ce = "16.198.632/0001-41";
//    static String cf = "05.594.579/0001-81";
//    static String cg = "23.305.603/0001-05";
//    static String ch = "02.823.845/0001-02";
//    static String ci = "42.710.787/0001-25";
//    static String cj = "44.415.651/0001-18";
//    static String ck = "39.451.876/0001-90";
//    static String cl = "32.585.055/0001-05";
//    static String cm = "01.078.406/0001-50";
//    static String cn = "06.013.569/0002-59";
//    static String co = "36.966.446/0001-12";
//    static String cp = "08.454.186/0001-60";
//    static String cq = "42.710.787/0001-25";
//    static String cr = "24.080.175/0001-14";
//    static String cs = "39.320.692/0001-90";
//    static String ct = "02.767.534/0001-73";
//    static String cu = "08.864.565/0001-29";
//    static String cv = "35.343.950/0001-01";
//    static String cw = "39.358.593/0001-06";
//    static String cy = "06.013.569/0002-59";
//    static String cx = "25.244.451/0001-03";
//    static String cz = "10.275.707/0001-64";
//    static String c11 = "05.115.935/0001-37";
//    static String c22 = "04.145.589/0007-62";
//    static String c33 = "02.708.884/0001-69";
//    static String c44 = "31.727.338/0001-73";
//    static String c55 = "26.835.073/0002-78";
//    static String c66 = "01.635.041/0002-06";
//    static String c77 = "13.716.765/0001-74";
//    static String c88 = "23.791.050/0001-30";
//    static String c99 = "02.922.895/0001-47";
//    static String caa = "07.962.599/0001-93";
//    static String cbb = "07.830.414/0001-97";
//    static String ccc = "34.387.666/0001-66";
//    static String cdd = "10.679.515/0001-13";
    
    
    
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
  
