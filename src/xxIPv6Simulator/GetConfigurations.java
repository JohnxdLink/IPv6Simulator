package xxIPv6Simulator;

import java.util.Random;

public class GetConfigurations {
	
	// Default
	private String wifiName = "";
	private String defaultGateWay = "10.0.0.0";
	private String subnetMask = "255.255.255.0";
	
	// Addresses and Network and MAc Arrays
	private String[] ipv4Address = {"192.168.1.0", "192.168.1.1", "192.168.1.2", "192.168.1.3", "192.168.1.4", "192.168.1.5"};
	private String[] networkPrefix = {"2001:db8:abcd::", "2001:db8:efgh::", "2001:db8:ijkl::", "2001:db8:mnop::", "2001:db8:qrst::"};
	private String[] macAddress = {"00:1A:2B:3C:4D:5E", "00:1F:2A:3B:4C:5D", "00:1E:2D:3C:4B:5A", "00:1D:2C:3B:4A:59", "00:1C:2B:3A:4F:5E"};

	
	private String[] phoneIpv4Address = {"192.168.1.6", "192.168.1.7", "192.168.1.8", "192.168.1.9", "192.168.1.10", "192.168.1.11"};
	
	Random randomNum = new Random();
	
	// Selecting an Element in those Arrays
	int rndmIpv4 = randomNum.nextInt(ipv4Address.length);
	int rndmNetworkPrefix = randomNum.nextInt(networkPrefix.length);
	int rndmMacAddress = randomNum.nextInt(macAddress.length);
	
	int rndmPhoneIpv4 = randomNum.nextInt(phoneIpv4Address.length);
	
	// Addresses Will be Selected
	private String ipv4Selected = ipv4Address[rndmIpv4];
	private String networkPrefixSelected = networkPrefix[rndmNetworkPrefix];
	private String macAddressSelected = macAddress[rndmMacAddress];
	
	private String phoneIpv4Selected = phoneIpv4Address[rndmPhoneIpv4];
	
	
	// Getting All Selected Address, Mac, and Network
	public String getWifiName() {
		return wifiName;
	}
	
	public String getDefaultGateway() {
		return defaultGateWay;
	}
	
	public String getsubnetMask() {
		return subnetMask;
	}
	
	public String getIpv4Address() {
		return ipv4Selected;
	}
	
	public String getNetworkPrefix() {
		return networkPrefixSelected;
	}
	
	public String getMacAddress() {
		return macAddressSelected;
	}
	
	public String getPhoneIpv4Address() {
		return phoneIpv4Selected;
	}
	
	// Setting Wifi Name
	public void setWifiName(String userWifiName) {
		wifiName = userWifiName;
	}
}
