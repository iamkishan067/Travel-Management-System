package travel.management.system;
import java.awt.*;
import javax.swing.*;


public class ViewHotels extends JFrame implements Runnable {
    Thread t;
    
    
    ImageIcon i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
    ImageIcon[] image = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10};
    
    Image i11, i12, i13, i14, i15, i16, i17, i18, i19, i20;
    Image[] image1 = {i11, i12, i13, i14, i15, i16, i17, i18, i19, i20};
    
    ImageIcon i21, i22, i23, i24, i25, i26, i27, i28, i29, i30;
    ImageIcon[] image11 = {i21, i22, i23, i24, i25, i26, i27, i28, i29, i30};
    
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JLabel[] label = {l1, l2, l3, l4, l5, l6, l7, l8, l9, l10};
    
    JLabel l21, l22, l23, l24, l25, l26, l27, l28, l29, l20;
    JLabel[] label1 = {l21, l22, l23, l24, l25, l26, l27, l28, l29, l20};
    
    String[] hotels_name = new String[] {"Umaid Bhawan Palace", "The Ritz-Carlton ", "Shangri-La", "The Oberoi", "Taj Bekal Resort & Spa", "Taj Madikeri Resort & Spa", "Wildflower Hall, An Oberoi Resort", "Kandu Palace", "Taj Lake Palace", "Taj Falaknuma Palace"}; 
    
    
    
    
    ViewHotels(){
        setBounds(490, 250, 1100, 700);
        setTitle("View Hotels");
        setLayout(null);
        
        for(int i = 0; i < 10; i++){
            
            label1[i] = new JLabel(hotels_name[i]);
            label1[i].setBounds(100, 540, 800, 50);
            label1[i].setFont(new Font("Raleway", Font.PLAIN, 45));
            label1[i].setForeground(Color.WHITE);
            add(label1[i]);
            
            image[i] = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/hotel" + i + ".jpg"));
            image1[i] = image[i].getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
            image11[i] = new ImageIcon(image1[i]);

            label[i] = new JLabel(image11[i]);
            label[i].setBounds(0, 0, 1100, 700);
            add(label[i]);
            
            
            
            t = new Thread(this);
            t.start();
        }
        
        
        
    }
    
    public void run(){
        for(int i = 0; i < 10; i++){
            try{
                this.label[i].setVisible(true);
                this.label1[i].setVisible(true);
                Thread.sleep(3200);
                this.label1[i].setVisible(false);
                this.label[i].setVisible(false);
                if(i == 9) this.setVisible(false);
            }catch(Exception e){
                
            }
        }
    }
    
    
    public static void main(String[] args){
        new ViewHotels().setVisible(true);
    }
}

