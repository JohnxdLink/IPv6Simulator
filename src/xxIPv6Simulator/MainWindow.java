package xxIPv6Simulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {
	/*s
	 * Project      : IPv6 Simulator
	 * Developer    : Castro John Christian
	 * Message      : 
	 * Date Created : 04/22/2024
	 */

	private JFrame frmWelcomeIpv;
	private JTextField TxtF_Wifi_Name;
	private JTextField TxtF_Ip_Four_Add;
	private JTextField TxtF_Subnet;
	private JTextField textField_2;
	private JTextField TxtF_Net_Prefix;
	private JTextField TxtField_Setting_Wifi_Name;
	private JTextField textField_1;

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
		
		JPanel PhonePanel = new JPanel();
		PhonePanel.setBackground(new Color(240, 255, 255));
		PhonePanel.setBounds(10, 76, 250, 474);
		PhonePanel.setLayout(null);
		WholePanel.add(PhonePanel);
		
		JPanel PhMenuPanel = new JPanel();
		PhMenuPanel.setBackground(Color.WHITE);
		PhMenuPanel.setBounds(30, 400, 190, 40);
		PhonePanel.add(PhMenuPanel);
		PhMenuPanel.setLayout(null);
		
		JPanel ScreenSettingPanel = new JPanel();
		ScreenSettingPanel.setBackground(Color.WHITE);
		ScreenSettingPanel.setBounds(30, 39, 190, 350);
		ScreenSettingPanel.setVisible(false);
		PhonePanel.add(ScreenSettingPanel);
		ScreenSettingPanel.setLayout(null);
		
		JPanel SettingPanel01 = new JPanel();
		SettingPanel01.setBounds(0, 0, 190, 30);
		ScreenSettingPanel.add(SettingPanel01);
		SettingPanel01.setLayout(null);
		
		JLabel Lbl_Setting_Txt = new JLabel("Settings");
		Lbl_Setting_Txt.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 14));
		Lbl_Setting_Txt.setBounds(0, 0, 77, 30);
		SettingPanel01.add(Lbl_Setting_Txt);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 41, 190, 30);
		ScreenSettingPanel.add(panel_1);
		
		JLabel Lbl_Setting_Wifi_Name_Text = new JLabel("Wifi Name:");
		Lbl_Setting_Wifi_Name_Text.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Setting_Wifi_Name_Text.setBounds(0, 0, 65, 30);
		panel_1.add(Lbl_Setting_Wifi_Name_Text);
		
		TxtField_Setting_Wifi_Name = new JTextField();
		TxtField_Setting_Wifi_Name.setBounds(64, 0, 125, 30);
		panel_1.add(TxtField_Setting_Wifi_Name);
		TxtField_Setting_Wifi_Name.setColumns(10);
		
		JPanel SettingPanel02 = new JPanel();
		SettingPanel02.setLayout(null);
		SettingPanel02.setBounds(0, 82, 190, 30);
		ScreenSettingPanel.add(SettingPanel02);
		
		JButton Btn_Setting_Connect = new JButton("Connect");
		Btn_Setting_Connect.setBackground(new Color(127, 255, 0));
		Btn_Setting_Connect.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		Btn_Setting_Connect.setBounds(0, 0, 190, 30);
		SettingPanel02.add(Btn_Setting_Connect);
		
		JPanel SettingPanel03 = new JPanel();
		SettingPanel03.setLayout(null);
		SettingPanel03.setBounds(0, 123, 190, 30);
		ScreenSettingPanel.add(SettingPanel03);
		
		JLabel Lbl_Status = new JLabel("Status:");
		Lbl_Status.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Status.setBounds(0, 0, 190, 30);
		SettingPanel03.add(Lbl_Status);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(0, 164, 190, 30);
		ScreenSettingPanel.add(panel_2_1);
		
		JLabel Lbl_Wifi_Name_Connected = new JLabel("Wifi Name:");
		Lbl_Wifi_Name_Connected.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Wifi_Name_Connected.setBounds(0, 0, 190, 30);
		panel_2_1.add(Lbl_Wifi_Name_Connected);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(0, 205, 190, 30);
		ScreenSettingPanel.add(panel_2_1_1);
		
		JLabel Lbl_Mac_Address = new JLabel("Mac Address:");
		Lbl_Mac_Address.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Mac_Address.setBounds(0, 0, 190, 30);
		panel_2_1_1.add(Lbl_Mac_Address);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(0, 246, 190, 30);
		ScreenSettingPanel.add(panel_2_1_1_1);
		
		JLabel Lbl_Ipv4_Address_Connected = new JLabel("Ipv4 Address:");
		Lbl_Ipv4_Address_Connected.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Ipv4_Address_Connected.setBounds(0, 0, 190, 30);
		panel_2_1_1_1.add(Lbl_Ipv4_Address_Connected);
		
		JPanel panel_2_1_1_1_1 = new JPanel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBounds(0, 287, 190, 30);
		ScreenSettingPanel.add(panel_2_1_1_1_1);
		
		JLabel Lbl_For_Ipv6 = new JLabel("Ipv6 Address:");
		Lbl_For_Ipv6.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_For_Ipv6.setBounds(0, 0, 77, 30);
		panel_2_1_1_1_1.add(Lbl_For_Ipv6);
		
		JPanel panel_2_1_1_1_2 = new JPanel();
		panel_2_1_1_1_2.setLayout(null);
		panel_2_1_1_1_2.setBounds(0, 320, 190, 30);
		ScreenSettingPanel.add(panel_2_1_1_1_2);
		
		JLabel Lbl_Ipv6_Address_Connected = new JLabel("0000:0000:0000:0000");
		Lbl_Ipv6_Address_Connected.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Ipv6_Address_Connected.setBounds(0, 0, 190, 30);
		panel_2_1_1_1_2.add(Lbl_Ipv6_Address_Connected);
		
		JPanel ScreenHomePanel = new JPanel();
		ScreenHomePanel.setLayout(null);
		ScreenHomePanel.setBackground(Color.WHITE);
		ScreenHomePanel.setVisible(false);
		ScreenHomePanel.setBounds(30, 39, 190, 350);
		PhonePanel.add(ScreenHomePanel);
		
		JPanel ScreenBrowsePanel = new JPanel();
		ScreenBrowsePanel.setLayout(null);
		ScreenBrowsePanel.setBackground(Color.WHITE);
		ScreenBrowsePanel.setVisible(false);
		ScreenBrowsePanel.setBounds(30, 39, 190, 350);
		PhonePanel.add(ScreenBrowsePanel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 11, 170, 67);
		ScreenBrowsePanel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/social.png")));
		lblNewLabel_1.setBounds(0, 0, 170, 67);
		panel_3.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 76, 170, 25);
		ScreenBrowsePanel.add(textField_1);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.setBounds(91, 110, 89, 23);
		ScreenBrowsePanel.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 169, 170, 170);
		ScreenBrowsePanel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/dog_images/shepherd.png")));
		lblNewLabel_2.setBounds(0, 0, 170, 170);
		panel_4.add(lblNewLabel_2);
		
		JPanel PhBackgroundPanel = new JPanel();
		PhBackgroundPanel.setBackground(new Color(240, 255, 255));
		PhBackgroundPanel.setBounds(0, 0, 250, 474);
		PhonePanel.add(PhBackgroundPanel);
		PhBackgroundPanel.setLayout(null);
		
		JLabel Lbl_Phone_Img = new JLabel("");
		Lbl_Phone_Img.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Phone Frame.png")));
		Lbl_Phone_Img.setBounds(0, 0, 250, 474);
		PhBackgroundPanel.add(Lbl_Phone_Img);

		JPanel InternetPanel = new JPanel();
		InternetPanel.setBorder(new LineBorder(Color.BLUE));
		InternetPanel.setLayout(null);
		InternetPanel.setBackground(new Color(240, 255, 255));
		InternetPanel.setBounds(834, 76, 250, 474);
		WholePanel.add(InternetPanel);
		
		JLabel Lbl_Internet_Img = new JLabel("");
		Lbl_Internet_Img.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Internet Icon.png")));
		Lbl_Internet_Img.setBounds(50, 36, 160, 160);
		InternetPanel.add(Lbl_Internet_Img);
		
		JLabel Lbl_Internet_Stat = new JLabel("Internet:");
		Lbl_Internet_Stat.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 18));
		Lbl_Internet_Stat.setBounds(10, 0, 80, 25);
		InternetPanel.add(Lbl_Internet_Stat);
		
		JLabel Lbl_Internet_Indicator = new JLabel("NOT CONNECTED");
		Lbl_Internet_Indicator.setForeground(Color.RED);
		Lbl_Internet_Indicator.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 18));
		Lbl_Internet_Indicator.setBounds(70, 0, 138, 25);
		InternetPanel.add(Lbl_Internet_Indicator);
		
		JPanel RouterPanel = new JPanel();
		RouterPanel.setBorder(new LineBorder(Color.BLUE));
		RouterPanel.setLayout(null);
		RouterPanel.setBackground(new Color(240, 255, 255));
		RouterPanel.setBounds(270, 76, 554, 285);
		WholePanel.add(RouterPanel);
		
		JLabel Lbl_Router_Img = new JLabel("");
		Lbl_Router_Img.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Router Icon.png")));
		Lbl_Router_Img.setBounds(10, 33, 170, 170);
		RouterPanel.add(Lbl_Router_Img);
		
		JLabel Lbl_Wifi_Stat = new JLabel("Wifi Status:");
		Lbl_Wifi_Stat.setFont(new Font("Franklin Gothic Medium Cond", Font.PLAIN, 18));
		Lbl_Wifi_Stat.setBounds(10, 0, 80, 25);
		RouterPanel.add(Lbl_Wifi_Stat);
		
		JLabel Lbl_Wifi_Indicator = new JLabel("OFF");
		Lbl_Wifi_Indicator.setForeground(Color.RED);
		Lbl_Wifi_Indicator.setBounds(90, 0, 50, 25);
		RouterPanel.add(Lbl_Wifi_Indicator);
		Lbl_Wifi_Indicator.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 18));
		
		JPanel RouterInfoPanel = new JPanel();
		RouterInfoPanel.setBackground(new Color(84, 117, 128));
		RouterInfoPanel.setBounds(190, 11, 354, 263);
		RouterPanel.add(RouterInfoPanel);
		RouterInfoPanel.setLayout(null);
		
		JPanel SubRouterInfoPanel01 = new JPanel();
		SubRouterInfoPanel01.setBackground(new Color(84, 117, 128));
		SubRouterInfoPanel01.setBounds(10, 11, 334, 33);
		RouterInfoPanel.add(SubRouterInfoPanel01);
		SubRouterInfoPanel01.setLayout(null);
		
		JLabel Lbl_Wifi_Name = new JLabel("Wifi Name:");
		Lbl_Wifi_Name.setForeground(new Color(101, 221, 185));
		Lbl_Wifi_Name.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		Lbl_Wifi_Name.setBounds(0, 0, 125, 33);
		SubRouterInfoPanel01.add(Lbl_Wifi_Name);
		
		TxtF_Wifi_Name = new JTextField();
		TxtF_Wifi_Name.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		TxtF_Wifi_Name.setBounds(135, 0, 199, 33);
		SubRouterInfoPanel01.add(TxtF_Wifi_Name);
		TxtF_Wifi_Name.setColumns(10);
		
		JPanel SubRouterInfoPanel02 = new JPanel();
		SubRouterInfoPanel02.setLayout(null);
		SubRouterInfoPanel02.setBackground(new Color(84, 117, 128));
		SubRouterInfoPanel02.setBounds(10, 55, 334, 33);
		RouterInfoPanel.add(SubRouterInfoPanel02);
		
		JLabel Lbl_Ip_Four_Add = new JLabel("Ipv4 Address:");
		Lbl_Ip_Four_Add.setForeground(new Color(101, 221, 185));
		Lbl_Ip_Four_Add.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		Lbl_Ip_Four_Add.setBounds(0, 0, 125, 33);
		SubRouterInfoPanel02.add(Lbl_Ip_Four_Add);
		
		TxtF_Ip_Four_Add = new JTextField();
		TxtF_Ip_Four_Add.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		TxtF_Ip_Four_Add.setColumns(10);
		TxtF_Ip_Four_Add.setBounds(135, 0, 199, 33);
		SubRouterInfoPanel02.add(TxtF_Ip_Four_Add);
		
		JPanel SubRouterInfoPanel03 = new JPanel();
		SubRouterInfoPanel03.setLayout(null);
		SubRouterInfoPanel03.setBackground(new Color(84, 117, 128));
		SubRouterInfoPanel03.setBounds(10, 99, 334, 33);
		RouterInfoPanel.add(SubRouterInfoPanel03);
		
		JLabel Lbl_Subnet_Name = new JLabel("Subnet Mask:");
		Lbl_Subnet_Name.setForeground(new Color(101, 221, 185));
		Lbl_Subnet_Name.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		Lbl_Subnet_Name.setBounds(0, 0, 125, 33);
		SubRouterInfoPanel03.add(Lbl_Subnet_Name);
		
		TxtF_Subnet = new JTextField();
		TxtF_Subnet.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		TxtF_Subnet.setColumns(10);
		TxtF_Subnet.setBounds(135, 0, 199, 33);
		SubRouterInfoPanel03.add(TxtF_Subnet);
		
		JPanel SubRouterInfoPanel04 = new JPanel();
		SubRouterInfoPanel04.setLayout(null);
		SubRouterInfoPanel04.setBackground(new Color(84, 117, 128));
		SubRouterInfoPanel04.setBounds(10, 143, 334, 33);
		RouterInfoPanel.add(SubRouterInfoPanel04);
		
		JLabel Lbl_Gateway = new JLabel("Gateway:");
		Lbl_Gateway.setForeground(new Color(101, 221, 185));
		Lbl_Gateway.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		Lbl_Gateway.setBounds(0, 0, 125, 33);
		SubRouterInfoPanel04.add(Lbl_Gateway);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(135, 0, 199, 33);
		SubRouterInfoPanel04.add(textField_2);
		
		JPanel SubRouterInfoPanel05 = new JPanel();
		SubRouterInfoPanel05.setLayout(null);
		SubRouterInfoPanel05.setBackground(new Color(84, 117, 128));
		SubRouterInfoPanel05.setBounds(10, 187, 334, 33);
		RouterInfoPanel.add(SubRouterInfoPanel05);
		
		JLabel Lbl_Net_Prefix_Name = new JLabel("Network Prefix:");
		Lbl_Net_Prefix_Name.setForeground(new Color(101, 221, 185));
		Lbl_Net_Prefix_Name.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		Lbl_Net_Prefix_Name.setBounds(0, 0, 125, 33);
		SubRouterInfoPanel05.add(Lbl_Net_Prefix_Name);
		
		TxtF_Net_Prefix = new JTextField();
		TxtF_Net_Prefix.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		TxtF_Net_Prefix.setColumns(10);
		TxtF_Net_Prefix.setBounds(135, 0, 199, 33);
		SubRouterInfoPanel05.add(TxtF_Net_Prefix);
		
		JButton BtnGenerate = new JButton("Generate");
		BtnGenerate.setFocusable(false);
		BtnGenerate.setBackground(new Color(255, 255, 119));
		BtnGenerate.setBounds(10, 229, 167, 23);
		RouterInfoPanel.add(BtnGenerate);
		
		JButton BtnSave = new JButton("Save");
		BtnSave.setFocusable(false);
		BtnSave.setBackground(new Color(127, 255, 0));
		BtnSave.setBounds(177, 229, 167, 23);
		RouterInfoPanel.add(BtnSave);
		
		JPanel SummaryPanel = new JPanel();
		SummaryPanel.setBorder(new LineBorder(Color.BLUE));
		SummaryPanel.setLayout(null);
		SummaryPanel.setBackground(new Color(240, 255, 255));
		SummaryPanel.setBounds(270, 360, 554, 190);
		WholePanel.add(SummaryPanel);
		
		JLabel Lbl_Process_Img = new JLabel("");
		Lbl_Process_Img.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Process Icon.png")));
		Lbl_Process_Img.setBounds(10, 11, 170, 170);
		SummaryPanel.add(Lbl_Process_Img);
		
		/* JPanels & Buttons */
		JPanel WifiBtnPanel = new JPanel();
		WifiBtnPanel.setBackground(new Color(240, 255, 255));
		WifiBtnPanel.setBounds(1019, 0, 65, 65);
		HeaderPanel.add(WifiBtnPanel);
		WifiBtnPanel.setLayout(null);
		
		JButton WifiBtn = new JButton("");
		WifiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lbl_Wifi_Indicator.setText("ON");
				Lbl_Wifi_Indicator.setForeground(new Color(127, 255, 0));
			}
		});
		WifiBtn.setBackground(new Color(240, 255, 255));
		WifiBtn.setBorder(null);
		WifiBtn.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Wifi Icon.png")));
		WifiBtn.setBounds(0, 0, 65, 65);
		WifiBtnPanel.add(WifiBtn);
		
		JPanel PhSettingsPanel = new JPanel();
		PhSettingsPanel.setBackground(Color.WHITE);
		PhSettingsPanel.setBounds(10, 0, 36, 36);
		PhMenuPanel.add(PhSettingsPanel);
		PhSettingsPanel.setLayout(null);
		
		JButton BtnPhSetting = new JButton("");
		BtnPhSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScreenSettingPanel.setVisible(true);
				ScreenHomePanel.setVisible(false);
				ScreenBrowsePanel.setVisible(false);
				
			}
		});
		BtnPhSetting.setBackground(new Color(255, 255, 255));
		BtnPhSetting.setBorder(null);
		BtnPhSetting.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/setting.png")));
		BtnPhSetting.setBounds(0, 0, 36, 36);
		PhSettingsPanel.add(BtnPhSetting);
		
		JPanel PhBrowsePanel = new JPanel();
		PhBrowsePanel.setBackground(Color.WHITE);
		PhBrowsePanel.setBounds(144, 0, 36, 36);
		PhMenuPanel.add(PhBrowsePanel);
		PhBrowsePanel.setLayout(null);
		
		JButton BtnPhBrowser = new JButton("");
		BtnPhBrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScreenSettingPanel.setVisible(false);
				ScreenHomePanel.setVisible(false);
				ScreenBrowsePanel.setVisible(true);
			}
		});
		BtnPhBrowser.setBackground(new Color(255, 255, 255));
		BtnPhBrowser.setBorder(null);
		BtnPhBrowser.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/browser.png")));
		BtnPhBrowser.setBounds(0, 0, 36, 36);
		PhBrowsePanel.add(BtnPhBrowser);
		
		JPanel PhHomePanel = new JPanel();
		PhHomePanel.setBackground(Color.WHITE);
		PhHomePanel.setBounds(76, 0, 36, 36);
		PhMenuPanel.add(PhHomePanel);
		PhHomePanel.setLayout(null);
		
		JButton BtnPhHome = new JButton("");
		BtnPhHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScreenSettingPanel.setVisible(false);
				ScreenHomePanel.setVisible(true);
				ScreenBrowsePanel.setVisible(false);
			}
		});
		BtnPhHome.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/home.png")));
		BtnPhHome.setBorder(null);
		BtnPhHome.setBackground(new Color(255, 255, 255));
		BtnPhHome.setBounds(0, 0, 36, 36);
		PhHomePanel.add(BtnPhHome);
		
		/* End of JPanels & Buttons */
	}
}
