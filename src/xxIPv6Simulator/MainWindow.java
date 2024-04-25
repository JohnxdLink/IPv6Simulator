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
import javax.swing.SwingConstants;

public class MainWindow {
	/*s
	 * Project      : IPv6 Simulator
	 * Developer    : Castro John Christian
	 * Message      : 
	 * Date Created : 04/22/2024
	 */
	
	GetConfigurations NetworkConfigurations = new GetConfigurations();
	GetIpv6Config Ipv6Process = new GetIpv6Config();
	Ipv6Config Ipv6Configuration = new Ipv6Config();
	
	SearchEngine googleSearch = new SearchEngine();

	private JFrame frmWelcomeIpv;
	private JTextField TxtF_Wifi_Name;
	private JTextField TxtF_Ip_Four_Add;
	private JTextField TxtF_Subnet;
	private JTextField TxtFGateway;
	private JTextField TxtF_Net_Prefix;
	private JTextField TxtField_Setting_Wifi_Name;
	private JTextField TxtF_Google_Search;
	
	String wifiName;
	String defaultGateway;
	String subnetMask;
	String ipv4Address;
	String ipv6Address;
	String networkPrefix;
	String macAddress;
	
	String phoneWifi;
	String phoneIpv4Address;
	String phoneIpv6Address;
	
	String search;
	
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

	public MainWindow() {
		initialize();
	}
	
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
		
		JPanel SettingPanel02 = new JPanel();
		SettingPanel02.setLayout(null);
		SettingPanel02.setBounds(0, 41, 190, 30);
		ScreenSettingPanel.add(SettingPanel02);
		
		JLabel Lbl_Setting_Wifi_Name_Text = new JLabel("Wifi Name:");
		Lbl_Setting_Wifi_Name_Text.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Setting_Wifi_Name_Text.setBounds(0, 0, 65, 30);
		SettingPanel02.add(Lbl_Setting_Wifi_Name_Text);
		
		TxtField_Setting_Wifi_Name = new JTextField();
		TxtField_Setting_Wifi_Name.setBounds(64, 0, 125, 30);
		SettingPanel02.add(TxtField_Setting_Wifi_Name);
		TxtField_Setting_Wifi_Name.setColumns(10);
		
		JPanel SettingPanel04 = new JPanel();
		SettingPanel04.setLayout(null);
		SettingPanel04.setBounds(0, 123, 190, 30);
		ScreenSettingPanel.add(SettingPanel04);
		
		JLabel Lbl_Status = new JLabel("Status:");
		Lbl_Status.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Status.setBounds(0, 0, 190, 30);
		SettingPanel04.add(Lbl_Status);
		
		JPanel SettingPanel05 = new JPanel();
		SettingPanel05.setLayout(null);
		SettingPanel05.setBounds(0, 164, 190, 30);
		ScreenSettingPanel.add(SettingPanel05);
		
		JLabel Lbl_Wifi_Name_Connected = new JLabel("Wifi Name:");
		Lbl_Wifi_Name_Connected.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Wifi_Name_Connected.setBounds(0, 0, 190, 30);
		SettingPanel05.add(Lbl_Wifi_Name_Connected);
		
		JPanel SettingPanel06 = new JPanel();
		SettingPanel06.setLayout(null);
		SettingPanel06.setBounds(0, 205, 190, 30);
		ScreenSettingPanel.add(SettingPanel06);
		
		JLabel Lbl_Mac_Address = new JLabel("Mac Address:");
		Lbl_Mac_Address.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Mac_Address.setBounds(0, 0, 190, 30);
		SettingPanel06.add(Lbl_Mac_Address);
		
		JPanel SettingPanel07 = new JPanel();
		SettingPanel07.setLayout(null);
		SettingPanel07.setBounds(0, 246, 190, 30);
		ScreenSettingPanel.add(SettingPanel07);
		
		JLabel Lbl_Ipv4_Address_Connected = new JLabel("Ipv4 Address:");
		Lbl_Ipv4_Address_Connected.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Ipv4_Address_Connected.setBounds(0, 0, 190, 30);
		SettingPanel07.add(Lbl_Ipv4_Address_Connected);
		
		JPanel SettingPanel08 = new JPanel();
		SettingPanel08.setLayout(null);
		SettingPanel08.setBounds(0, 287, 190, 30);
		ScreenSettingPanel.add(SettingPanel08);
		
		JLabel Lbl_For_Ipv6 = new JLabel("Ipv6 Address:");
		Lbl_For_Ipv6.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_For_Ipv6.setBounds(0, 0, 77, 30);
		SettingPanel08.add(Lbl_For_Ipv6);
		
		JPanel SettingPanel09 = new JPanel();
		SettingPanel09.setLayout(null);
		SettingPanel09.setBounds(0, 320, 190, 30);
		ScreenSettingPanel.add(SettingPanel09);
		
		JLabel Lbl_Ipv6_Address_Connected = new JLabel("0000:0000:0000:0000");
		Lbl_Ipv6_Address_Connected.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Ipv6_Address_Connected.setBounds(0, 0, 190, 30);
		SettingPanel09.add(Lbl_Ipv6_Address_Connected);
		
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
		
		JPanel GooglePanel = new JPanel();
		GooglePanel.setBackground(Color.WHITE);
		GooglePanel.setBounds(10, 11, 170, 67);
		ScreenBrowsePanel.add(GooglePanel);
		GooglePanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/social.png")));
		lblNewLabel_1.setBounds(0, 0, 170, 67);
		GooglePanel.add(lblNewLabel_1);
		
		TxtF_Google_Search = new JTextField();
		TxtF_Google_Search.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		TxtF_Google_Search.setColumns(10);
		TxtF_Google_Search.setBounds(10, 76, 170, 25);
		ScreenBrowsePanel.add(TxtF_Google_Search);
		
		JPanel GoogleResultPanel = new JPanel();
		GoogleResultPanel.setBackground(Color.WHITE);
		GoogleResultPanel.setBounds(10, 169, 170, 170);
		ScreenBrowsePanel.add(GoogleResultPanel);
		GoogleResultPanel.setLayout(null);
		
		JLabel Lbl_Google_Images = new JLabel("");
		Lbl_Google_Images.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/default photo.png")));
		Lbl_Google_Images.setBounds(0, 0, 170, 170);
		GoogleResultPanel.add(Lbl_Google_Images);
		
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
		
		JLabel Lbl_Preview_Image = new JLabel("");
		Lbl_Preview_Image.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/default photo.png")));
		Lbl_Preview_Image.setBounds(40, 251, 170, 170);
		InternetPanel.add(Lbl_Preview_Image);
		
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
		RouterInfoPanel.setVisible(false);
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
		TxtF_Ip_Four_Add.setEditable(false);
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
		TxtF_Subnet.setEditable(false);
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
		
		TxtFGateway = new JTextField();
		TxtFGateway.setEditable(false);
		TxtFGateway.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		TxtFGateway.setColumns(10);
		TxtFGateway.setBounds(135, 0, 199, 33);
		SubRouterInfoPanel04.add(TxtFGateway);
		
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
		TxtF_Net_Prefix.setEditable(false);
		TxtF_Net_Prefix.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		TxtF_Net_Prefix.setColumns(10);
		TxtF_Net_Prefix.setBounds(135, 0, 199, 33);
		SubRouterInfoPanel05.add(TxtF_Net_Prefix);
		
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
		
		JPanel PanelSummary = new JPanel();
		PanelSummary.setBounds(190, 11, 354, 170);
		SummaryPanel.add(PanelSummary);
		PanelSummary.setLayout(null);
		
		JPanel PanelSummaryTop = new JPanel();
		PanelSummaryTop.setBounds(0, 0, 354, 85);
		PanelSummary.add(PanelSummaryTop);
		PanelSummaryTop.setLayout(null);
		
		JLabel Lbl_Client_Header = new JLabel("Client Request");
		Lbl_Client_Header.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		Lbl_Client_Header.setBounds(10, 0, 138, 21);
		PanelSummaryTop.add(Lbl_Client_Header);
		
		JLabel Lbl_Get_Ipv6_Add = new JLabel("0000:0000:0000:0000");
		Lbl_Get_Ipv6_Add.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 12));
		Lbl_Get_Ipv6_Add.setBounds(10, 23, 334, 21);
		PanelSummaryTop.add(Lbl_Get_Ipv6_Add);
		
		JLabel Lbl_Send_Success_Indicator = new JLabel("NO REQUEST");
		Lbl_Send_Success_Indicator.setHorizontalAlignment(SwingConstants.RIGHT);
		Lbl_Send_Success_Indicator.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		Lbl_Send_Success_Indicator.setBounds(10, 53, 334, 21);
		PanelSummaryTop.add(Lbl_Send_Success_Indicator);
		
		JPanel PanelSummaryBot = new JPanel();
		PanelSummaryBot.setBounds(0, 85, 354, 85);
		PanelSummary.add(PanelSummaryBot);
		PanelSummaryBot.setLayout(null);
		
		JLabel Lbl_Internet_Response = new JLabel("Internet Response");
		Lbl_Internet_Response.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		Lbl_Internet_Response.setBounds(10, 0, 164, 21);
		PanelSummaryBot.add(Lbl_Internet_Response);
		
		JLabel Lbl_Responded_Indicator = new JLabel("NO RESPONSE YET");
		Lbl_Responded_Indicator.setHorizontalAlignment(SwingConstants.RIGHT);
		Lbl_Responded_Indicator.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		Lbl_Responded_Indicator.setBounds(10, 53, 334, 21);
		PanelSummaryBot.add(Lbl_Responded_Indicator);
		
		/* JPanels & Buttons */
		JPanel WifiBtnPanel = new JPanel();
		WifiBtnPanel.setBackground(new Color(240, 255, 255));
		WifiBtnPanel.setBounds(800, 0, 65, 65);
		HeaderPanel.add(WifiBtnPanel);
		WifiBtnPanel.setLayout(null);
		
		JButton Btn_Restart = new JButton("");
		Btn_Restart.setBackground(new Color(240, 255, 255));
		Btn_Restart.setBorder(null);
		Btn_Restart.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/reset.png")));
		Btn_Restart.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // Dispose the current frame
		        frmWelcomeIpv.dispose();

		        // Create a new instance of MainWindow
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
		});
		Btn_Restart.setBounds(1019, 0, 65, 65);
		HeaderPanel.add(Btn_Restart);
		
		JButton WifiBtn = new JButton("");
		WifiBtn.setBounds(955, 0, 65, 65);
		HeaderPanel.add(WifiBtn);
		WifiBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lbl_Wifi_Indicator.setText("ON");
				Lbl_Wifi_Indicator.setForeground(new Color(127, 255, 0));
				RouterInfoPanel.setVisible(true);
			}
		});
		WifiBtn.setBackground(new Color(240, 255, 255));
		WifiBtn.setBorder(null);
		WifiBtn.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/Wifi Icon.png")));
		
		JButton BtnGenerate = new JButton("Generate");
		BtnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ipv4Address = NetworkConfigurations.getIpv4Address();
				subnetMask = NetworkConfigurations.getsubnetMask();
				defaultGateway = NetworkConfigurations.getDefaultGateway();
				
				TxtF_Ip_Four_Add.setText(ipv4Address);
				TxtF_Subnet.setText(subnetMask);
				TxtFGateway.setText(defaultGateway);
			}
		});
		BtnGenerate.setFocusable(false);
		BtnGenerate.setBackground(new Color(255, 255, 119));
		BtnGenerate.setBounds(10, 229, 167, 23);
		RouterInfoPanel.add(BtnGenerate);
		
		JButton BtnSave = new JButton("Save");
		BtnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wifiName = TxtF_Wifi_Name.getText();
				NetworkConfigurations.setWifiName(wifiName);
				
				networkPrefix = NetworkConfigurations.getNetworkPrefix();
				
				if(!defaultGateway.isEmpty()) {
					Lbl_Internet_Indicator.setText("CONNECTED");
					Lbl_Internet_Indicator.setForeground(new Color(127, 255, 0));
					
					TxtF_Net_Prefix.setText(networkPrefix);
					
				} else {
					Lbl_Internet_Indicator.setText("NOT CONNECTED");
					Lbl_Internet_Indicator.setForeground(new Color(255, 0, 0));
				}
			}
		});
		BtnSave.setFocusable(false);
		BtnSave.setBackground(new Color(127, 255, 0));
		BtnSave.setBounds(177, 229, 167, 23);
		RouterInfoPanel.add(BtnSave);
		
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
		
		JPanel SettingPanel03 = new JPanel();
		SettingPanel03.setLayout(null);
		SettingPanel03.setBounds(0, 82, 190, 30);
		ScreenSettingPanel.add(SettingPanel03);
		
		JButton Btn_Setting_Connect = new JButton("Connect");
		Btn_Setting_Connect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				phoneWifi = TxtField_Setting_Wifi_Name.getText();
				
				if(phoneWifi.equalsIgnoreCase(wifiName)) {
					
					TxtField_Setting_Wifi_Name.setText(phoneWifi);
					Lbl_Status.setText("Status: Connected");
					
					Lbl_Wifi_Name_Connected.setText("Wifi: " + phoneWifi);
					
					phoneIpv4Address = NetworkConfigurations.getPhoneIpv4Address();
					macAddress = NetworkConfigurations.getMacAddress();
					
					Lbl_Mac_Address.setText("Mac Address: " + macAddress);
					Lbl_Ipv4_Address_Connected.setText("Ipv4 Address: " + phoneIpv4Address);
					
					Ipv6Process.setInternetNetworkPrefix(networkPrefix);
					Ipv6Process.setDeviceMacAddress(macAddress);
					
					String getNetworkPrefix = Ipv6Process.getInternetNetworkPrefix();
					String getMacAddress = Ipv6Process.getDeviceMacAddress();
					
					phoneIpv6Address = Ipv6Configuration.getIpv6ConfigComplete(getNetworkPrefix, getMacAddress);
					Lbl_Ipv6_Address_Connected.setText(phoneIpv6Address);
					
					ipv6Address = Lbl_Ipv6_Address_Connected.getText();
				
					
				} else if(phoneWifi.isEmpty()) {
					Lbl_Status.setText("Status: No Connection");
				} else {
					Lbl_Status.setText("Status: WIfi Not Found");
				}
			}
		});
		Btn_Setting_Connect.setFocusable(false);
		Btn_Setting_Connect.setBackground(new Color(127, 255, 0));
		Btn_Setting_Connect.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		Btn_Setting_Connect.setBounds(0, 0, 190, 30);
		SettingPanel03.add(Btn_Setting_Connect);
		
		// Google Search Button
		JButton Btn_Google_Search = new JButton("Search");
		Btn_Google_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search = TxtF_Google_Search.getText();
				
				if(!ipv6Address.isEmpty()) {
					googleSearch.setSearchEngine(search);
					googleSearch.setIpv6AddressFound(ipv6Address);
					
					Lbl_Get_Ipv6_Add.setText(googleSearch.getIpv6AddressFound());
					
					if(googleSearch.getSearchEngine().equalsIgnoreCase("Dog")) {
						Lbl_Send_Success_Indicator.setText("SEARCHING DOG");
						Lbl_Send_Success_Indicator.setForeground(new Color(0, 255, 0));
						
					} else if(googleSearch.getSearchEngine().equalsIgnoreCase("Cat")) {
						Lbl_Send_Success_Indicator.setText("SEARCHING CAT");
						Lbl_Send_Success_Indicator.setForeground(new Color(0, 255, 0));
					} else {
						Lbl_Send_Success_Indicator.setText("INPUT DOES NOT EXIST");
						Lbl_Send_Success_Indicator.setForeground(new Color(255, 0, 0));
					}
				}
				
			}
		});
		Btn_Google_Search.setBackground(Color.LIGHT_GRAY);
		Btn_Google_Search.setBounds(91, 110, 89, 23);
		ScreenBrowsePanel.add(Btn_Google_Search);
		
		
		// Internet Panel Send Feedback
		JPanel SendFeedbackPanel = new JPanel();
		SendFeedbackPanel.setLayout(null);
		SendFeedbackPanel.setBounds(10, 217, 230, 30);
		InternetPanel.add(SendFeedbackPanel);
		
		// Send Feedback Response
		JButton Btn_Send_Feedback = new JButton("View Image");
		Btn_Send_Feedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lbl_Responded_Indicator.setText("INTERNET IS RESPONDING");
				Lbl_Responded_Indicator.setForeground(new Color(101, 221, 185));
				Lbl_Preview_Image.setIcon(new ImageIcon(MainWindow.class.getResource(googleSearch.getSelectedImage())));
			}
		});
		Btn_Send_Feedback.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		Btn_Send_Feedback.setBackground(new Color(127, 255, 0));
		Btn_Send_Feedback.setBounds(0, 0, 230, 30);
		SendFeedbackPanel.add(Btn_Send_Feedback);
		
		JButton Btn_Response_Feedback = new JButton("Send Feedback");
		Btn_Response_Feedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lbl_Responded_Indicator.setText("RESPONDED SUCCESSFULLY");
				Lbl_Responded_Indicator.setForeground(new Color(0, 225, 0));
				TxtF_Google_Search.setText(null);
				
				Lbl_Preview_Image.setIcon(new ImageIcon(MainWindow.class.getResource("/xxIPv6Simulator/images/default photo.png")));
				Lbl_Google_Images.setIcon(new ImageIcon(MainWindow.class.getResource(googleSearch.getSelectedImage())));	
			}
		});
		Btn_Response_Feedback.setBackground(new Color(101, 221, 185));
		Btn_Response_Feedback.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		Btn_Response_Feedback.setBounds(10, 440, 230, 23);
		InternetPanel.add(Btn_Response_Feedback);
		
		/* End of JPanels & Buttons */
	}
}