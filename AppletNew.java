import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import java.sql.*;
import java.applet.Applet;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import javax.swing.BoxLayout;	

//import javax.swing.BoxLayout.X_AXIS;
//import ConnectionProvider.ConnectionProvider;
public class AppletNew extends Applet implements MouseListener,ActionListener
{
	Frame f,w,b,p,m;
	Button b1,b5,b6,b7,b8,b9,b10;
	Panel p1,p2,p3,p4,p5;
	TextField n,pin,r,amount,p01,p02;
	TextArea ms;
	GridLayout g,g1,g2,g3,g4,g5;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
	long cno;
	int tamt,wamt;
	int hs=0; //100s
	int ts=0;//2000s
	int fs=0; //500s
	int atmfs,atmhs,atmts;
	int dts,dfs,dhs,dr; // for the database...
	GridLayout gv; //virtual frame
	Panel pv; //virtual panel
	Button bv1,bv2,bv3,bv4,bv5,bv6,bv7,bv8,bv9,bv0,bvc,bve,bven;
	String s3,s4,s5;
	//ImageIcon format=null;
	Label uimg;//user image
	//Home page for Atm operation
	JButton b11,b2,b3,b4;
	JFrame h1;
	JPanel p11,p12;
	JLabel img,j1,j2,j3;

		

	public AppletNew(){
		f=new Frame("ATM");
		f.setSize(1920,1080);
		p3=new Panel();
		n=new TextField(12);
		
		n.setBounds(80,300,120,40);
		pin=new TextField(4);
		pin.setBounds(800,30,120,40);
		l1=new Label("Enter Card Number:");
		l2=new Label("Enter your Pin");
		img=new JLabel();
		img.setBounds(150,150,150,150);
		
		f.add(n);
		f.add(pin);
		

       // f.setSize(500,500);
        f.setVisible(true);
        // g=new GridLayout(3,2);
        //p3.setLayout(2,2);
        p3.setBackground(Color.blue);
       	f.add(p3);
        p3.add(l1);
        p3.add(n);
        p3.add(l2);
        p3.add(pin);
      	pin.addActionListener(this);
      	pin.addMouseListener(this);
      	n.addMouseListener(this);
      	// f.setVisible(false);
      	// f.setVisible(true);
      	//virtualkeyboard();
      	nvirtualkeyboard();

//      	f.setLayout();


      	
      
	}
	//TextField r;
	 
	String gt;
	int ct;
	MouseEvent re;
	 @Override
   public void mouseClicked(MouseEvent re) {
    	// if(re.getSource()==pin){
    	// 	//gt=pin.toString();
    	// 	//System.out.println(gt);
    	// 	ct=0;
     //    System.out.println("you click...");
     //    virtualkeyboard();
    // }
    // if(re.getSource()==n)
    // {
    // 	// gt=re.getSource();
    // 	// System.out.println(gt);
    // 	ct=1;
    //     System.out.println("you click number...");
    //     virtualkeyboard();
    //     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    // }
    }

    @Override
    public void mousePressed(MouseEvent re) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent re) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent re) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent re) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


//buttons for nvirtual keyboard
    Panel npv;
    GridLayout ngv;
    Button nbv1,nbv2,nbv3,nbv4,nbv5,nbv6,nbv7,nbv8,nbv9,nbv0,nbvc,nbve,nbven;
//for cardno this is the virtual keyboard
    public void nvirtualkeyboard()
	{
		npv=new Panel();
      	ngv=new GridLayout();
        nbv0= new Button("0");
        nbv0.addActionListener(this);
        nbv1 = new Button("1");
        nbv1.addActionListener(this);
        nbv2 = new Button("2");
        nbv2.addActionListener(this);
        nbv3 = new Button("3");
        nbv3.addActionListener(this);
        nbv4 = new Button("4");
        nbv4.addActionListener(this);
        nbv5 = new Button("5");
        nbv5.addActionListener(this);
        nbv6 = new Button("6");
        nbv6.addActionListener(this);
        nbv7 = new Button("7");
        nbv7.addActionListener(this);
        nbv8 = new Button("8");
        nbv8.addActionListener(this);
        nbv9 = new Button("9");
        nbv9.addActionListener(this);
        nbvc = new Button("Clear");
        nbvc.addActionListener(this);
        nbve = new Button("Cancel");
        nbve.addActionListener(this);
        nbven = new Button("Enter");
        nbven.addActionListener(this);
        f.add(npv, BorderLayout.EAST);
        //pv.setSize(450,450);

        ngv = new GridLayout(3,3,3,3);
        npv.setLayout(ngv);
        npv.add(nbv0);
        npv.add(nbv1);
        npv.add(nbv2);
        npv.add(nbv3);
        npv.add(nbv4);
        npv.add(nbv5);
        npv.add(nbv6);
        npv.add(nbv7);
        npv.add(nbv8);
        npv.add(nbv9);
        npv.add(nbvc);
        npv.add(nbve);
        npv.add(nbven);
        
	}

    //for pin this the virtural keyboard
	public void virtualkeyboard()
	{
		pv=new Panel();
      	gv=new GridLayout();
        bv0= new Button("0");
        bv0.addActionListener(this);
        bv1 = new Button("1");
        bv1.addActionListener(this);
        bv2 = new Button("2");
        bv2.addActionListener(this);
        bv3 = new Button("3");
        bv3.addActionListener(this);
        bv4 = new Button("4");
        bv4.addActionListener(this);
        bv5 = new Button("5");
        bv5.addActionListener(this);
        bv6 = new Button("6");
        bv6.addActionListener(this);
        bv7 = new Button("7");
        bv7.addActionListener(this);
        bv8 = new Button("8");
        bv8.addActionListener(this);
        bv9 = new Button("9");
        bv9.addActionListener(this);
        bvc = new Button("Clear");
        bvc.addActionListener(this);
        bve = new Button("Cancel");
        bve.addActionListener(this);
        bven = new Button("Enter");
        bven.addActionListener(this);
        f.add(pv, BorderLayout.EAST);
        //pv.setSize(450,450);

        gv = new GridLayout(3,3,3,3);
        pv.setLayout(gv);
        pv.add(bv0);
        pv.add(bv1);
        pv.add(bv2);
        pv.add(bv3);
        pv.add(bv4);
        pv.add(bv5);
        pv.add(bv6);
        pv.add(bv7);pv.add(bv8);pv.add(bv9);
        pv.add(bvc);pv.add(bve);pv.add(bven);
        
	}

	//for image show 
	ImageIcon format,images;
	String cname,cacno,cphoneno;
	@Override
	public void actionPerformed(ActionEvent e){
		// this is for login operation
		if(e.getSource()==nbven)
		{
			virtualkeyboard();
			npv.setVisible(false);
			f.setVisible(false);
			f.setVisible(true);
		}
		if((e.getSource()==pin)||(e.getSource()==bven))
		{
			cno=Long.parseLong(n.getText());
		    int pno=Integer.parseInt(pin.getText());

		try{
			//Connection conn=ConnectionProvider.getcon();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
		PreparedStatement ps=con.prepareStatement("SELECT * FROM `user` WHERE Card_No="+cno+" AND PIN="+pno+";");
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{	tamt=rs.getInt(7);
			cname=rs.getString(2);
			cacno=rs.getString(3);
			cphoneno=rs.getString(6);
			String c="XXXXXX";
			char c2,e1=6;
			String substr="";
			cphoneno=c+cphoneno.substring(5,9);
			// 0 to 13
			cacno="XXXXXXXXXXXXX"+cacno.substring(9,13);
			//System.out.println(c+substr);

			// char[] arr=cphoneno.toCharArray();
			// for(e1: arr)
			// 	System.out.println(e1+"");


			 // for (int i = 0; i < cphoneno.length(); i++) 
			 // { 
    //         		//acphoneno=cphoneno.charAt(i)+"";
    //         		System.out.println(cphoneno.charAt(i)+"");	
    //         		//System.out.println(c+c2);	
            		
    //         		//cphoneno=cphoneno.concat(c);
					
            		
    //     		}
        						
        		

            	
            
      		    byte[] image = rs.getBytes("user_img"); //This creates an array of bytes to collect Image from database, usually when a file is uploaded in the database,it is saved as an array of bytes which can be compiled back to its normal form when downloaded.
                format = new ImageIcon(image); //this creates an ImageIcon from the bytes array collected from the image in the database.

                Image img1 = format.getImage(); //this creates an Image, this would be used to carry out the resizing, as ImageIcon cannot be resized directly with this method.
                Image newimage = img1.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH); // This resizes the Image using size from the label which we have placed in the program earlier.
                images = new ImageIcon(newimage);


			JOptionPane.showMessageDialog(null,"Successfully login....");
			f.setVisible(false);	
			homepage();
		}
		else
			JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin....");

	}catch(Exception e2){
		e2.printStackTrace();
		JOptionPane.showMessageDialog(null,e2);
	}


	}

//      //this for withdraw function
		if(e.getSource()==b11)
		{
			JOptionPane.showMessageDialog(null,"withdraw");
			withdraw();
			h.setVisible(false);
		}
		//this for balance enquiry
		if(e.getSource()==b2)
		{
			JOptionPane.showMessageDialog(null,"Balance Enquiry");

			balance();
			h.setVisible(false);
		}
		//this for mini statement
		if(e.getSource()==b3)
		{
			JOptionPane.showMessageDialog(null,"Mini Statement");
			ministat();
		}
		//clear button
		if  (e.getSource()==bve)
		{
			JOptionPane.showMessageDialog(null,"Transaction Cancelled");
			//f.setVisible(true);
			//h.setVisible(false);
			//w.setVisible(false);
			//b.setVisible(false);
			//m.setVisible(false);
			//p.setVisible(false);

		}

		//this for PIN change
		if(e.getSource()==b4)
		{
			JOptionPane.showMessageDialog(null,"Pin change");
			h.setVisible(false);
			pinchange();

		}
		//if yes withdraw
		if(e.getSource()==b5)
		{
			wamt=Integer.parseInt(amount.getText());
			int bamt=tamt-wamt;
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
				PreparedStatement ps2=con.prepareStatement("SELECT * FROM `atmbalance` WHERE ID=1;");
			ResultSet rs2=ps2.executeQuery();
			if(rs2.next())
			{
				int tatm=rs2.getInt(5);//atm total balance
				atmts=rs2.getInt(2);	//atm 2000s
				atmfs=rs2.getInt(3);	//atm 500s
				atmhs=rs2.getInt(4);	//atm 100s
				int batm=tatm-wamt; //check the amount inside the atm machine

			

				if(batm<=0)
					JOptionPane.showMessageDialog(null,"ATM have Insufficent balance!!");
				else{
				
			if(bamt<=0)//check the customer's balance amount..
			{
				JOptionPane.showMessageDialog(null,"Insufficent balance!!");
			}else{
				//for denomination of the amount..
				
				mwamt=wamt%500; //mwamt modules withdraw amount 
				if(mwamt!=0)
				{
					hs=mwamt/100;//find the 100s we need...
					denomination();
					dr=1;
				}
				else
				{
					denomination();
				}
				
				dts=atmts-ts;
				dfs=atmfs-fs;
				dhs=atmhs-hs;

			switch(dr)
			{
				case 1:
				{
			JOptionPane.showMessageDialog(null,"Successfully WithDraw Amount :" +wamt+"\n 2000 * "+ts+"\n 500 * "+fs+"\n 100 * "+hs+"");
			w.setVisible(false);
			f.setVisible(true);
			pin.setText("");
			n.setText("");	
			//System.out.println(" 2000 "+ts+" 500 "+fs+" 100 "+hs+"");
			//reset the balance amount of the customer
			PreparedStatement ps=con.prepareStatement("UPDATE `user` SET `Balance`="+bamt+" WHERE Card_No="+cno+";");
			int rs=ps.executeUpdate();
			// insert the transtion of the ATM machine...
			PreparedStatement ps1=con.prepareStatement("INSERT INTO `trans`(`T_ID`, `T_card`, `T_amount`, `2000`, `500`, `100`) VALUES (NULL,"+cno+","+wamt+","+ts+","+fs+","+hs+");");
			int rs1=ps1.executeUpdate();
			// reset the Atm balance amount and the denomination..
			PreparedStatement ps3=con.prepareStatement("UPDATE `atmbalance` SET `Balance`="+batm+",`2000`="+dts+",`500`="+dfs+",`100`="+dhs+" WHERE ID=1;");
			int rs3=ps3.executeUpdate();
			break;
				}
				case 0:
				{
					JOptionPane.showMessageDialog(null,"Transfer failed...");
					w.setVisible(false);
			f.setVisible(true);
			pin.setText("");
			n.setText("");
			break;
				}
			}
			}
			}
			}
			}catch(Exception f){
			System.out.println(f);
			}
		}

		
		//if no withdraw
		if(e.getSource()==b6)
		{
			amount.setText("");
			//JOptionPane.showMessageDialog(null,"No");

		}
		if(e.getSource()==b7)
		{
			int opin=Integer.parseInt(p01.getText());
			int npin=Integer.parseInt(p02.getText());
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
				PreparedStatement ps5=con.prepareStatement("SELECT * FROM `user` WHERE PIN="+opin+";");
				ResultSet rs5=ps5.executeQuery();
				if(rs5.next())
				{
				PreparedStatement ps4=con.prepareStatement("UPDATE `user` SET `PIN`="+npin+" WHERE Card_No="+cno+";");
				int rs4=ps4.executeUpdate();
				JOptionPane.showMessageDialog(null,"PIN Change Successfully....");
				}else
				{
					JOptionPane.showMessageDialog(null,"Old Pin Wrong!");
				}
			}catch(Exception e5){
				System.out.println(e5);
			}
		}

		//card virtual keyboard

		if(e.getSource()==nbv0)
        {
        	s3 = n.getText();
            s4 = "0";
            s5 = s3+s4;
            n.setText(s5);
        	
            
        }

        if(e.getSource()==nbv1)
        {
            s3 = n.getText();
            s4 = "1";
            s5 = s3+s4;
            n.setText(s5);
        }
        if(e.getSource()==nbv2)
        {
            s3 = n.getText();
            s4 = "2";
            s5 = s3+s4;
            n.setText(s5);
        }
        if(e.getSource()==nbv3)
        {
            s3 = n.getText();
            s4 = "3";
            s5 = s3+s4;
            n.setText(s5);
        }
        if(e.getSource()==nbv4)
        {
            s3 = n.getText();
            s4 = "4";
            s5 = s3+s4;
            n.setText(s5);
        }
        if(e.getSource()==nbv5)
        {
            s3 = n.getText();
            s4 = "5";
            s5 = s3+s4;
            n.setText(s5);
        }
        if(e.getSource()==nbv6)
        {
            s3 = n.getText();
            s4 = "6";
            s5 = s3+s4;
            n.setText(s5);
        }
        if(e.getSource()==nbv7)
        {
            s3 = n.getText();
            s4 = "7";
            s5 = s3+s4;
            n.setText(s5);
        }
        if(e.getSource()==nbv8)
        {
            s3 = n.getText();
            s4 = "8";
            s5 = s3+s4;
            n.setText(s5);
        }
        if(e.getSource()==nbv9)
        {
            s3 = n.getText();
            s4 = "9";
            s5 = s3+s4;
            n.setText(s5);
        }

        if(e.getSource()==nbvc)
        {
        n.setText("");
        }
  



		// pin virtual keyboard

		
		if(e.getSource()==bv0)
        {
        	s3 = pin.getText();
            s4 = "0";
            s5 = s3+s4;
            pin.setText(s5);
        	
            
        }

        if(e.getSource()==bv1)
        {
            s3 = pin.getText();
            s4 = "1";
            s5 = s3+s4;
            pin.setText(s5);
        }
        if(e.getSource()==bv2)
        {
            s3 = pin.getText();
            s4 = "2";
            s5 = s3+s4;
            pin.setText(s5);
        }
        if(e.getSource()==bv3)
        {
            s3 = pin.getText();
            s4 = "3";
            s5 = s3+s4;
            pin.setText(s5);
        }
        if(e.getSource()==bv4)
        {
            s3 = pin.getText();
            s4 = "4";
            s5 = s3+s4;
            pin.setText(s5);
        }
        if(e.getSource()==bv5)
        {
            s3 = pin.getText();
            s4 = "5";
            s5 = s3+s4;
            pin.setText(s5);
        }
        if(e.getSource()==bv6)
        {
            s3 = pin.getText();
            s4 = "6";
            s5 = s3+s4;
            pin.setText(s5);
        }
        if(e.getSource()==bv7)
        {
            s3 = pin.getText();
            s4 = "7";
            s5 = s3+s4;
            pin.setText(s5);
        }
        if(e.getSource()==bv8)
        {
            s3 = pin.getText();
            s4 = "8";
            s5 = s3+s4;
            pin.setText(s5);
        }
        if(e.getSource()==bv9)
        {
            s3 = pin.getText();
            s4 = "9";
            s5 = s3+s4;
            pin.setText(s5);
        }

        if(e.getSource()==bvc)
        {
        pin.setText("");
        }
  

	}
	public void withdraw()
	{
		w=new Frame("WithDraw");
		p2=new Panel();
		w.setVisible(true);
		w.setSize(1920,1080);
		amount=new TextField(20);
		l3=new Label("Enter Amount:");
		b5=new Button("Yes");
		b6=new Button("No");
		//g2=new GridLayout(3,2);

		//p2.setLayout(g2);
		p2.setBackground(Color.blue);
		w.add(p2);
		p2.add(l3);
		p2.add(amount);
		p2.add(b5);
		p2.add(b6);
		b5.addActionListener(this);
		b6.addActionListener(this);

		Timer time=new Timer();
      	time.schedule(new TimerTask(){
      		@Override
      		public void run()
      		{
      			JOptionPane.showMessageDialog(null,"Session Expired");
      			w.setVisible(false);
      			f.setVisible(true);
      			n.setText("");
      			pin.setText("");

      		}
      	},20000);



	}
	//golbal variables
	// int bwamt,swamt;//big percentage of the withdraw amount and small percentage of the withdraw amount..
	// int mbwamt;//find the big amount modules 

int wamt2;
int mwamt;//modules withdraw amount

	// amount denomination
	public void denomination()
	{
		wamt2=wamt/2000;
		if(wamt2<=1)
		{
			fs=((wamt-mwamt)/500)-1;
			hs=hs+5;
			dr=1;
			
		}else
		{
			ts=((wamt-mwamt)/2000)-1;
			fs=(((wamt-mwamt)/500)%4)+3;
			hs=hs+5;
			dr=1;
		}
		//2000s is insufficient..
		if(atmts<ts)
		{
			fs=fs+((ts-atmts)*4);
			ts=atmts;
			dr=1;
			
		}
		if(atmfs<fs)
		{
			hs=hs+((fs-atmfs)*5);
			fs=atmfs;
			dr=1;

		}
		if(atmhs<hs)
		{
			System.out.println("Don't have 100s");
			if(((hs-atmhs)%5)==0)
			{
				fs=fs+((hs-atmhs)/5);
				hs=atmhs;
				dr=1;
				if(atmfs<fs)
				{




					fs();
				}
							}
			else if((hs%5)==0) 
			{
				//if suppose the atm 100s is not match with 5's multiples.......
				fs=fs+(hs/5);
				hs=0;
				dr=1;
				if(atmfs<fs)
				{
					fs();
				}
			}
			else if(((hs-atmhs)%20)==0)
			{
				ts=ts+((hs-atmhs)/20);
				hs=atmhs;
				dr=1;
			}
			else if((hs%20)==0)
			{
				ts=ts+(hs/20);
				hs=0;
				dr=1;
			}
			else
			{
				hs=0;
				fs=0;
				ts=0;
				JOptionPane.showMessageDialog(null,"please enter the multiples of 500..");
				dr=0;
			}

		}
		// try
		// {
		// 	Class.forName("com.mysql.cj.jdbc.Driver");
		// 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");


		// }catch(Exception d)
		// {
		// 	System.out.println(d);
		// }
		

	}
	public void fs()
	{
		if(((fs-atmfs)%4)==0)
		{
				ts=ts+((fs-atmhs)/4);
				fs=atmfs;
				dr=1;
				if(atmts<ts)
				{
					JOptionPane.showMessageDialog(null,"Insuffident balance....");
					dr=0;
				}
		}
		else if((fs%4)==0)
		{	
				ts=ts+(fs/4);
				fs=0;
				dr=1;

		}else
		{
				hs=0;
				fs=0;
				ts=0;
				JOptionPane.showMessageDialog(null,"Please enter the  amount in multiples of 2000..");
				dr=0;
		}
	}

	public void balance()
	{
		b=new Frame("Balance");
		p2=new Panel();
		b.setVisible(true);
		b.setSize(500,500);
		b.setBackground(Color.blue);
		l4=new Label("Your Amount:");
		
		l5=new Label(String.valueOf(tamt));
		
		b.add(p2);
		
		
		p2.add(l4);
		p2.add(l5);
		
		Timer time=new Timer();
      	time.schedule(new TimerTask(){
      		@Override
      		public void run()
      		{
      			JOptionPane.showMessageDialog(null,"Session Expired");
      			b.setVisible(false);
      			f.setVisible(true);
      			n.setText("");
      			pin.setText("");
      		}
      	},10000);
		


	}
	
	// BufferedImage image;
	JFrame h;
	public void homepage()
	{
		h=new JFrame("Homepage");
		p11=new JPanel();
		p12=new JPanel();
		b11=new JButton("WithDraw");
		b2=new JButton("Balance Enquiry");
		b3=new JButton("Mini Statement");
		b4=new JButton("Pin Change");
		JLabel j01=new JLabel();
		j1=new JLabel("Customer Name:"+cname);
		j2=new JLabel("Account Number:"+cacno);
		j3=new JLabel("Phone Number:"+cphoneno);
	// 	try{
	// 		image=ImageIO.read(new File("C:/Users/yuvak/Desktop/jdk-14.0.2/bin/ATM/siva.jpg"));
	// }catch(IOException e){e.printStackTrace();}
		// ImageIcon imageIcon = new ImageIcon(fitimage(image, img.getWidth(), img.getHeight()));
   		 //img.setIcon(imageIcon);
		//img=new JLabel(new ImageIcon(image));
		//img.setVerticalAlignment(JLabel.TOP);
		img.setIcon(images);
		// img.setPreferredSize(new Dimension(400,400));
		h.setSize(1920,1080);
		h.setVisible(true);
		h.getContentPane().setBackground(Color.BLUE);
		g1=new GridLayout(3,2);
		h.add(p11, BorderLayout.EAST);
		//alignment of the panel
		h.add(p12, BorderLayout.WEST);
		p12.setSize(700, 500);
		   p11.setBackground(Color.blue);
		   BoxLayout boxlayout = new BoxLayout(p11, BoxLayout.Y_AXIS);
		   p11.setLayout(boxlayout);
		   // p12.setBackground(Color.blue);
		   // BoxLayout boxlayout1 = new BoxLayout(p12, BoxLayout.Y_AXIS);
		// p11.setLayout(boxlayout1);
		 p12.setLayout(g1);
		//p1.setLayout();
		p12.add(img);
		p12.add(j1);
		p12.add(j2);
		p12.add(j01);
		p12.add(j3);
		p11.add(b11);
		p11.add(b2);
		p11.add(b3);
		p11.add(b4);
		//setLayout (new javax.swing.BoxLayout(p11, javax.swing.BoxLayout.X_AXIS));
		b11.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		Timer time=new Timer();
      	time.schedule(new TimerTask(){
      		@Override
      		public void run()
      		{
      			JOptionPane.showMessageDialog(null,"Session Expired");
      			h.setVisible(false);
      			f.setVisible(true);
      			n.setText("");
      			pin.setText("");
      		}
      	},30000);
	}

	//pin change
	public void pinchange()
	{
		p=new Frame("Pinchange");
		p4=new Panel();
		b7=new Button("Save");
		l6=new Label("Enter Old PIN:");
		l7=new Label("Enter New PIN:");
		p01=new TextField(10);
		p02=new TextField(10);
		p.setSize(1920,1080);
		p.setVisible(true);

		p.setBackground(Color.blue);
		p.add(p4);
		g4=new GridLayout(3,2);
		p4.setLayout(g4);
		p4.add(l6);
		p4.add(p01);
		p4.add(l7);
		p4.add(p02);
		p4.add(b7);
		b7.addActionListener(this);
		Timer time=new Timer();
      	time.schedule(new TimerTask(){
      		@Override
      		public void run()
      		{
      			p.setVisible(false);
      			f.setVisible(true);
      			n.setText("");
      			pin.setText("");
      		}
      	},30000);

	}
	//mini statement
	public void ministat()
	{
		m=new Frame("Mini Statement");
		p5=new Panel();
		l8=new Label("Mini Staement");
		l9=new Label();
		ms=new TextArea();
		m.setVisible(true);
		m.setSize(1920,1080);
		m.setBackground(Color.blue);
		m.add(p5);
		p5.add(l8);
		p5.add(ms);	
		
		try{

			    Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
				PreparedStatement ps6=con.prepareStatement("SELECT * FROM `trans` WHERE T_card="+cno+";");
				ResultSet rs6=ps6.executeQuery();
				ms.setText("id\t\t Amount");
				l9.setText("id\t\t Amount");
				while(rs6.next())
				{
					int id=rs6.getInt("T_ID");
					int amo=rs6.getInt("T_amount");
				
					ms.setText(ms.getText()+"\n"+id+"\t\t"+amo);
					
				}

		}catch(Exception s){
			System.out.println(s);
		}

	}
	
	public static  void main(String[] args) {
		AppletNew l=new AppletNew();
	
	} }