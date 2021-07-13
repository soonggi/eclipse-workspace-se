package wb;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class StudentMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMainFrame frame = new StudentMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentMainFrame() {
		setTitle("학생관리프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 654);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton studentListBtn = new JButton("1. 학생리스트");
		studentListBtn.setHorizontalAlignment(SwingConstants.LEFT);
		studentListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1. 학생 리스트버튼 클릭 시 실행되는 메쏘드");
			}
		});
		studentListBtn.setBounds(25, 31, 159, 28);
		contentPane.add(studentListBtn);
		
		JButton studentCalculatorBtn = new JButton("2. 학생총점평균평점계산");
		studentCalculatorBtn.setHorizontalAlignment(SwingConstants.LEFT);
		studentCalculatorBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2. 학생총점평균평점계산");
			}
		});
		studentCalculatorBtn.setBounds(25, 93, 159, 28);
		contentPane.add(studentCalculatorBtn);
	}
}
