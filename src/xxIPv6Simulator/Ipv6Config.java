package xxIPv6Simulator;

import java.math.BigInteger;

public class Ipv6Config {
	
	private String ipv6ConfigComplete;
	
	public String getIpv6ConfigComplete(String networkPrefix, String deviceMacAddress) {
		String interfaceIdentifier = generateInterfaceIdentifier(deviceMacAddress);
		ipv6ConfigComplete = networkPrefix + interfaceIdentifier;
		
		return ipv6ConfigComplete;
	}
	
	public String generateInterfaceIdentifier(String tempMacAddress) {
		String[] macParts = tempMacAddress.split(":");
		StringBuilder macBuilder = new StringBuilder();
		
		for (String part : macParts) {
            macBuilder.append(part);
        }
        String macWithoutColon = macBuilder.toString();
		
        StringBuilder modifiedMac = new StringBuilder(macWithoutColon.substring(0, 6));
        modifiedMac.append("FFFE");
        modifiedMac.append(macWithoutColon.substring(6));
        
        BigInteger macBigInt = new BigInteger(modifiedMac.toString(), 16);
        BigInteger invertedBitMac = macBigInt.flipBit(7);
        
        return String.format("%04x:%04x:%04x:%04x", invertedBitMac.shiftRight(48).intValue() & 0xFFFF, invertedBitMac.shiftRight(32).intValue() & 0xFFFF, invertedBitMac.shiftRight(16).intValue() & 0xFFFF, invertedBitMac.intValue() & 0xFFFF);
	}
}
