import javax.swing.*;
//import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
public class BubbleSort extends JPanel{
	//static JLabel text = new JLabel("Sorting Visualizer");;
	static JFrame jf = new JFrame("BubbleSort");
	public static void main(String args[]){	
	//	JPanel jp = new JPanel();
		BubbleSort bs = new BubbleSort();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(1000, 600);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jf.add(bs);
		int n = bs.arr.length;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-1-i; j++){
				if(bs.arr[j] > bs.arr[j+1]){
					int temp = bs.arr[j];
					bs.arr[j] = bs.arr[j+1];
					bs.arr[j+1] = temp;
				}
			}
			try{
				Thread.sleep(600);
			}
			catch(Exception e){

			}
			bs.repaint();
		}
	}

	int arr[] = {102,149,147,91, 172, 28};
	int x = 250, y = 250, width = 40;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g){
	//	jf.add(text);
		for(int i = 0; i < arr.length; i++){
			x += (width+2);
			g.setColor(Color.RED);
			g.drawRect(x, y-arr[i], width, arr[i]);
			
			g.fillRect(x, y-arr[i], width, arr[i]);
		}
		x = 250;
	}
}
