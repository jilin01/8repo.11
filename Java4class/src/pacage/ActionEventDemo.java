package pacage;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventDemo extends JFrame {
	public ActionEventDemo()
	 {
	  setTitle("������ť�¼���Ӧ");
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
	  //ActionEvent HandlerΪ��������
	class ActionEventHandler implements ActionListener   //�ڲ���
	{
	 public void actionPerformed(ActionEvent e)
	 {
	  System.out.println("ActionEvent occurred");
	 }
	 
	}
