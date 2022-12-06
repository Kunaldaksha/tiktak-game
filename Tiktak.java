import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener
{
   Button b[]=new Button [9];
   Button bu;
   int count=0;
  TextField tx;
   
    Demo(){
        addWindowListener( new WindowAdapter(){public void windowClosing(WindowEvent e)
        {System.exit(0) ; }} );
       
        setLayout(null);
        setFont(new Font("",Font.BOLD,35));
		
		tx=new TextField(20);
		tx.setLocation(180,420);
		tx.setSize(200,50);
		add(tx);

        int x,y=100,k=0;
        for(int i=0; i<3; i++)
        {
        x=100;    
        for(int j=0;j<3;j++){
        b[k]=new Button("");
        b[k].setSize(100,100);
        b[k].setLocation(x,y);    x+=100;
        add(b[k]); k++;
        }
        y+=100;
        }

        for(int i=0 ;i<9; i++)
        b[i].addActionListener(this);
           
    }
    public void actionPerformed(ActionEvent e)
    { 
    bu= (Button) e.getSource();
    if(count%2==0)      bu.setLabel("0");
    else            	bu.setLabel("X");
	count++;
	bu.removeActionListener(this);
	
	 if(b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X" ||
	    b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X" ||
		b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X" ||
		b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X" ||
		b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X" ||
		b[2].getLabel()=="X" && b[5].getLabel()=="X" && b[8].getLabel()=="X" ||
		b[0].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X" ||
		b[2].getLabel()=="X" && b[4].getLabel()=="X" && b[6].getLabel()=="X" )
	 {
		 System.out.println("winner is "+b[0].getLabel());
		 tx.setText("Winner is X");
		 for(int i=0 ; i<9 ; i++)
			 b[i].removeActionListener(this);
		
	 }
	 
	 if(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0" ||
	    b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0" ||
		b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0" ||
		b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0" ||
		b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0" ||
		b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0" ||
		b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0" ||
		b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0" )
	 {
		 System.out.println("winner is "+b[0].getLabel());
		 tx.setText("Winner is 0");
		 for(int i=0 ; i<9 ; i++)
			 b[i].removeActionListener(this);
		
	 }
    }
}

public class Tiktak{
    public static void main(String args[]){
        Demo d=new Demo();
        d.setVisible(true);
        d.setSize(600,600);
        d.setBackground(Color.yellow);

    }
}