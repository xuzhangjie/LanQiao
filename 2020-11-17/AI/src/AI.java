import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;
import java.io.*;
public class AI extends MIDlet{
	Display display;
	MainCanvas mc; 
	public AI(){
		display=Display.getDisplay(this);
        mc=new MainCanvas(); 
		display.setCurrent(mc); } 
	    public void startApp(){ } 
    	public void destroyApp(boolean unc){ }
      	public void pauseApp(){ }
	}
	
	class MainCanvas extends Canvas{ /* ���������� �﷨���������� �������ƣ���ʶ����; */
	Image imgUp,imgDown,imgLeft,imgRight,currentImg; 
	Image imgLeft_1,imgLeft_2;
	int x=120,y=100;
	public MainCanvas(){ 
		try { /* ��������ֵ �﷨����������=value; */
		   imgDown=Image.createImage("/sayo10.png");
		   imgLeft=Image.createImage("/sayo12.png");
		   imgRight=Image.createImage("/sayo16.png");
		   imgUp=Image.createImage("/sayo14.png");
		   imgLeft_1=Image.createImage("/sayo02.png");
	       imgLeft_2=Image.createImage("/sayo22.png");
		     currentImg=imgDown; }
		catch (IOException e) {
			e.printStackTrace(); } 
			}
			public void paint(Graphics g)
				{ 
				g.setColor(0,0,0); 
				g.fillRect(0,0,getWidth(),getHeight());
			    g.drawImage(currentImg,x,y,0);//120��X���ꡢ100��Y���� 
			}
			public void keyPressed(int keyCode){ 
				int action=getGameAction(keyCode); 
			/* action��ֵ��UP��DOWN��LEFT��RIGHT */ 
			if(action==LEFT){ /* ʵ��ת����� */ /* ���������¸�ֵ���� */ 
				currentImg=imgLeft; 
			     x=x-1;
		     	repaint(); 
			} 
		     if(action==UP){ 
				currentImg=imgUp; 
				y=y-1;
		     	repaint(); 
			} 
			 if(action==DOWN){ 
				currentImg=imgDown; 
				y=y+1;
		     	repaint(); 
			} 
			if (action==RIGHT){ 
				currentImg=imgRight; 
				x=x+1;
		     	repaint(); 
			} 
			}
			}