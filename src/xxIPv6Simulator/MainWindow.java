package xxIPv6Simulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;

public class MainWindow {

	private JFrame frmWelcomeIpv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmWelcomeIpv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeIpv = new JFrame();
		frmWelcomeIpv.setTitle("Welcome | IPv6 Simulator");
		frmWelcomeIpv.setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/xxIPv6Simulator/images/JC Logo Blue.png")));
		frmWelcomeIpv.setBounds(100, 100, 1110, 600);
		frmWelcomeIpv.setLocationRelativeTo(null);
		frmWelcomeIpv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeIpv.getContentPane().setLayout(null);
		
		JPanel WholePanel = new JPanel();
		WholePanel.setBackground(new Color(240, 255, 255));
		WholePanel.setBounds(0, 0, 1094, 561);
		frmWelcomeIpv.getContentPane().add(WholePanel);
		WholePanel.setLayout(null);
		
		JPanel HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(240, 255, 255));
		HeaderPanel.setBounds(0, 0, 1094, 65);
		WholePanel.add(HeaderPanel);
		HeaderPanel.setLayout(null);
		
		JLabel Lbl_My_Logo = new JLabel("");
		Lbl_My_Logo.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/JC Logo Blue.png")));
		Lbl_My_Logo.setBounds(20, 0, 65, 65);
		HeaderPanel.add(Lbl_My_Logo);
		
		JLabel Lbl_Text_Logo = new JLabel("IPv6 Simulator");
		Lbl_Text_Logo.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 26));
		Lbl_Text_Logo.setForeground(new Color(0, 0, 255));
		Lbl_Text_Logo.setBounds(95, 0, 228, 65);
		HeaderPanel.add(Lbl_Text_Logo);
		
		JPanel WifiBtnPanel = new JPanel();
		WifiBtnPanel.setBackground(new Color(240, 255, 255));
		WifiBtnPanel.setBounds(1019, 0, 65, 65);
		HeaderPanel.add(WifiBtnPanel);
		WifiBtnPanel.setLayout(null);
		
		JButton WifiBtn = new JButton("");
		WifiBtn.setBackground(new Color(240, 255, 255));
		WifiBtn.setBorder(null);
		WifiBtn.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Wifi Icon.png")));
		WifiBtn.setBounds(0, 0, 65, 65);
		WifiBtnPanel.add(WifiBtn);
		
		JPanel PhonePanel = new JPanel();
		PhonePanel.setBackground(new Color(240, 255, 255));
		PhonePanel.setBounds(10, 76, 250, 474);
		WholePanel.add(PhonePanel);
		PhonePanel.setLayout(null);
		
		JLabel Lbl_Phone_Img = new JLabel("");
		Lbl_Phone_Img.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Phone Frame.png")));
		Lbl_Phone_Img.setBounds(0, 0, 250, 474);
		PhonePanel.add(Lbl_Phone_Img);
		
		JPanel InternetPanel = new JPanel();
		InternetPanel.setBorder(new LineBorder(Color.BLUE));
		InternetPanel.setLayout(null);
		InternetPanel.setBackground(new Color(240, 255, 255));
		InternetPanel.setBounds(834, 76, 250, 474);
		WholePanel.add(InternetPanel);
		
		JLabel Lbl_Internet_Img = new JLabel("");
		Lbl_Internet_Img.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Internet Icon.png")));
		Lbl_Internet_Img.setBounds(49, 11, 160, 160);
		InternetPanel.add(Lbl_Internet_Img);
		
		JPanel RouterPanel = new JPanel();
		RouterPanel.setBorder(new LineBorder(Color.BLUE));
		RouterPanel.setLayout(null);
		RouterPanel.setBackground(new Color(240, 255, 255));
		RouterPanel.setBounds(270, 76, 554, 237);
		WholePanel.add(RouterPanel);
		
		JLabel Lbl_Router_Img = new JLabel("");
		Lbl_Router_Img.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Router Icon.png")));
		Lbl_Router_Img.setBounds(10, 33, 170, 170);
		RouterPanel.add(Lbl_Router_Img);
		
		JLabel Lbl_Wifi_Stat = new JLabel("Wifi Status:");
		Lbl_Wifi_Stat.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 18));
		Lbl_Wifi_Stat.setBounds(10, 0, 80, 25);
		RouterPanel.add(Lbl_Wifi_Stat);
		
		JLabel Lbl_Wifi_Stat_1 = new JLabel("OFF");
		Lbl_Wifi_Stat_1.setForeground(Color.RED);
		Lbl_Wifi_Stat_1.setBounds(90, 0, 50, 25);
		RouterPanel.add(Lbl_Wifi_Stat_1);
		Lbl_Wifi_Stat_1.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 18));
		
		JPanel RouterInfoPanel = new JPanel();
		RouterInfoPanel.setBackground(new Color(84, 117, 128));
		RouterInfoPanel.setBounds(190, 11, 354, 215);
		RouterPanel.add(RouterInfoPanel);
		
		JPanel SummaryPanel = new JPanel();
		SummaryPanel.setBorder(new LineBorder(Color.BLUE));
		SummaryPanel.setLayout(null);
		SummaryPanel.setBackground(new Color(240, 255, 255));
		SummaryPanel.setBounds(270, 313, 554, 237);
		WholePanel.add(SummaryPanel);
		
		JLabel Lbl_Process_Img = new JLabel("");
		Lbl_Process_Img.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Process Icon.png")));
		Lbl_Process_Img.setBounds(10, 39, 170, 170);
		SummaryPanel.add(Lbl_Process_Img);
	}
}
