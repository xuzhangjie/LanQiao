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
	
	class MainCanvas extends Canvas{ /* 变量的声明 语法：数据类型 变量名称（标识符）; */
	Image imgUp,imgDown,imgLeft,imgRight,currentImg; 
	Image imgLeft_1,imgLeft_2;
	int x=120,y=100;
	public MainCanvas(){ 
		try { /* 给变量赋值 语法：变量名称=value; */
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
			    g.drawImage(currentImg,x,y,0);//120：X坐标、100：Y坐标 
			}
			public void keyPressed(int keyCode){ 
				int action=getGameAction(keyCode); 
			/* action的值：UP、DOWN、LEFT、RIGHT */ 
			if(action==LEFT){ /* 实现转向代码 */ /* 给变量重新赋值即可 */ 
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