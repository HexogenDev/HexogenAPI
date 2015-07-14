package net.cyanwool.api.network;

public interface NetworkServer {

	public net.cyanwool.api.Server getServer();

	// public Server getProtocolServer();

	public int getPort();

	public String getHostAddress();

	// public void sendPacketForAll(Packet packet);

	// public void sendPacketDistance(Position pos, Packet packet, int radius);

	// public void sendPacketForAllExpect(Packet packet, Player expect);

	// public void sendPacketDistanceExpect(Position pos, Packet packet, int radius, Player expect);

}
