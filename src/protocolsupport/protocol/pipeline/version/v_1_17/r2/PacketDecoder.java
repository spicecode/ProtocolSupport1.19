package protocolsupport.protocol.pipeline.version.v_1_17.r2;

import protocolsupport.api.utils.NetworkState;
import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.middleimpl.serverbound.handshake.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.SetProtocol;
import protocolsupport.protocol.packet.middleimpl.serverbound.login.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.LoginCustomPayload;
import protocolsupport.protocol.packet.middleimpl.serverbound.login.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.LoginStart;
import protocolsupport.protocol.packet.middleimpl.serverbound.login.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.EncryptionResponse;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.ResourcePackStatus;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.AdvancementTab;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.CraftRecipeRequest;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.CustomPayload;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.NameItem;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.PickItem;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.QueryEntityNBT;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.SelectTrade;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.SetBeaconEffect;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.TabComplete;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_13_14r1_14r2_15_16r1_16r2_17r1_17r2.UpdateCommandMinecart;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_14r1_14r2_15_16r1_16r2_17r1_17r2.BlockDig;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_14r1_14r2_15_16r1_16r2_17r1_17r2.BlockPlace;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_14r1_14r2_15_16r1_16r2_17r1_17r2.QueryBlockNBT;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_14r1_14r2_15_16r1_16r2_17r1_17r2.UpdateCommandBlock;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_14r1_14r2_15_16r1_16r2_17r1_17r2.UpdateSign;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_14r1_14r2_15_16r1_16r2_17r1_17r2.UpdateStructureBlock;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_16r1_16r2_17r1_17r2.JigsawGenerate;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_16r1_16r2_17r1_17r2.JigsawUpdate;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_16r1_16r2_17r1_17r2.PlayerAbilities;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_16r1_16r2_17r1_17r2.UseEntity;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_16r2_17r1_17r2.RecipeBookRecipe;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_16r2_17r1_17r2.RecipeBookState;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_17r1_17r2.ClientSettings;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_17r1_17r2.SyncPong;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_17r2.EditBook;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_17r2.InventoryClick;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.CreativeSetSlot;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.Flying;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.HeldSlot;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.InventoryButton;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.InventoryClose;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.Look;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.Chat;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.ClientCommand;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.EntityAction;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.KeepAlive;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.Move;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.Spectate;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.SteerVehicle;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.Animation;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.MoveLook;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.MoveVehicle;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.SteerBoat;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.TeleportAccept;
import protocolsupport.protocol.packet.middleimpl.serverbound.play.v_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.UseItem;
import protocolsupport.protocol.packet.middleimpl.serverbound.status.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.Ping;
import protocolsupport.protocol.packet.middleimpl.serverbound.status.v_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16r1_16r2_17r1_17r2.ServerInfoRequest;
import protocolsupport.protocol.pipeline.version.util.decoder.AbstractModernPacketDecoder;

public class PacketDecoder extends AbstractModernPacketDecoder {

	public PacketDecoder(ConnectionImpl connection) {
		super(connection);
	}

	{
		registry.register(NetworkState.HANDSHAKING, 0x00, SetProtocol::new);
		registry.register(NetworkState.LOGIN, 0x00, LoginStart::new);
		registry.register(NetworkState.LOGIN, 0x01, EncryptionResponse::new);
		registry.register(NetworkState.LOGIN, 0x02, LoginCustomPayload::new);
		registry.register(NetworkState.STATUS, 0x00, ServerInfoRequest::new);
		registry.register(NetworkState.STATUS, 0x01, Ping::new);
		registry.register(NetworkState.PLAY, 0x00, TeleportAccept::new);
		registry.register(NetworkState.PLAY, 0x01, QueryBlockNBT::new);
		registry.register(NetworkState.PLAY, 0x03, Chat::new);
		registry.register(NetworkState.PLAY, 0x04, ClientCommand::new);
		registry.register(NetworkState.PLAY, 0x05, ClientSettings::new);
		registry.register(NetworkState.PLAY, 0x06, TabComplete::new);
		registry.register(NetworkState.PLAY, 0x07, InventoryButton::new);
		registry.register(NetworkState.PLAY, 0x08, InventoryClick::new);
		registry.register(NetworkState.PLAY, 0x09, InventoryClose::new);
		registry.register(NetworkState.PLAY, 0x0A, CustomPayload::new);
		registry.register(NetworkState.PLAY, 0x0B, EditBook::new);
		registry.register(NetworkState.PLAY, 0x0C, QueryEntityNBT::new);
		registry.register(NetworkState.PLAY, 0x0D, UseEntity::new);
		registry.register(NetworkState.PLAY, 0x0E, JigsawGenerate::new);
		registry.register(NetworkState.PLAY, 0x0F, KeepAlive::new);
		registry.register(NetworkState.PLAY, 0x11, Move::new);
		registry.register(NetworkState.PLAY, 0x12, MoveLook::new);
		registry.register(NetworkState.PLAY, 0x13, Look::new);
		registry.register(NetworkState.PLAY, 0x14, Flying::new);
		registry.register(NetworkState.PLAY, 0x15, MoveVehicle::new);
		registry.register(NetworkState.PLAY, 0x16, SteerBoat::new);
		registry.register(NetworkState.PLAY, 0x17, PickItem::new);
		registry.register(NetworkState.PLAY, 0x18, CraftRecipeRequest::new);
		registry.register(NetworkState.PLAY, 0x19, PlayerAbilities::new);
		registry.register(NetworkState.PLAY, 0x1A, BlockDig::new);
		registry.register(NetworkState.PLAY, 0x1B, EntityAction::new);
		registry.register(NetworkState.PLAY, 0x1C, SteerVehicle::new);
		registry.register(NetworkState.PLAY, 0x1D, SyncPong::new);
		registry.register(NetworkState.PLAY, 0x1E, RecipeBookState::new);
		registry.register(NetworkState.PLAY, 0x1F, RecipeBookRecipe::new);
		registry.register(NetworkState.PLAY, 0x20, NameItem::new);
		registry.register(NetworkState.PLAY, 0x21, ResourcePackStatus::new);
		registry.register(NetworkState.PLAY, 0x22, AdvancementTab::new);
		registry.register(NetworkState.PLAY, 0x23, SelectTrade::new);
		registry.register(NetworkState.PLAY, 0x24, SetBeaconEffect::new);
		registry.register(NetworkState.PLAY, 0x25, HeldSlot::new);
		registry.register(NetworkState.PLAY, 0x26, UpdateCommandBlock::new);
		registry.register(NetworkState.PLAY, 0x27, UpdateCommandMinecart::new);
		registry.register(NetworkState.PLAY, 0x28, CreativeSetSlot::new);
		registry.register(NetworkState.PLAY, 0x29, JigsawUpdate::new);
		registry.register(NetworkState.PLAY, 0x2A, UpdateStructureBlock::new);
		registry.register(NetworkState.PLAY, 0x2B, UpdateSign::new);
		registry.register(NetworkState.PLAY, 0x2C, Animation::new);
		registry.register(NetworkState.PLAY, 0x2D, Spectate::new);
		registry.register(NetworkState.PLAY, 0x2E, BlockPlace::new);
		registry.register(NetworkState.PLAY, 0x2F, UseItem::new);
	}

}
