package protocolsupport.protocol.packet.middle.clientbound.play;

import io.netty.buffer.ByteBuf;
import protocolsupport.api.chat.ChatAPI;
import protocolsupport.api.chat.components.BaseComponent;
import protocolsupport.protocol.packet.middle.ClientBoundMiddlePacket;
import protocolsupport.protocol.serializer.StringSerializer;
import protocolsupport.protocol.utils.types.WindowType;
import protocolsupport.utils.ProtocolVersionsHelper;

public abstract class MiddleInventoryOpen extends ClientBoundMiddlePacket {

	protected int windowId;
	protected WindowType type;
	protected BaseComponent title;
	protected int slots;
	protected int horseId;

	@Override
	public void readFromServerData(ByteBuf serverdata) {
		windowId = serverdata.readUnsignedByte();
		type = WindowType.getById(StringSerializer.readString(serverdata, ProtocolVersionsHelper.LATEST_PC, 32));
		title = ChatAPI.fromJSON(StringSerializer.readString(serverdata, ProtocolVersionsHelper.LATEST_PC));
		slots = serverdata.readUnsignedByte();
		if (type.equals("EntityHorse")) {
			horseId = serverdata.readInt();
		}
	}

	@Override
	public void handle() {
		cache.setOpenedWindow(type);
	}

}
