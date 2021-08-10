package pacage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventDemo extends JFrame {
	public ActionEventDemo()
	 {
	  setTitle("单击按钮事件响应");
	  JButton jb=new JButton("Press Me!");
	  jb.addActionListener(new ActionEventHandler());
	  setLayout(new FlowLayout());
	  add(jb);
	  setSize(300,100);
	  setVisible(true);
	 }
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  ActionEventDemo aed=new ActionEventDemo();
	 
	 }

	}
	  //ActionEvent Handler为监听器类
	class ActionEventHandler implements ActionListener   //内部类
	{
	 public void actionPerformed(ActionEvent e)
	 {
	  System.out.println("ActionEvent occurred");
	 }
	 
	}
