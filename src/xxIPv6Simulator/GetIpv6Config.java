package xxIPv6Simulator;

public class GetIpv6Config {
	
	private String internetNetworkPrefix;
	private String deviceMacAddress;
	
	public String getInternetNetworkPrefix() {
		return internetNetworkPrefix;
	}
	
	public String getDeviceMacAddress() {
		return deviceMacAddress;
	}
	
	public void setInternetNetworkPrefix(String setterInternetPrefix) {
		internetNetworkPrefix = setterInternetPrefix;
	}
	
	public void setDeviceMacAddress(String setterDeviceMacAddress) {
		deviceMacAddress = setterDeviceMacAddress;
	}
}
