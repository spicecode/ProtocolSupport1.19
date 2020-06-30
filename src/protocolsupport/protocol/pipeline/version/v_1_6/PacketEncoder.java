package protocolsupport.protocol.pipeline.version.v_1_6;

import protocolsupport.api.utils.NetworkState;
import protocolsupport.protocol.ConnectionImpl;
import protocolsupport.protocol.packet.PacketType;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.noop.NoopLoginSuccess;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.noop.NoopSetCompression;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.v_4_5_6.LoginDisconnect;
import protocolsupport.protocol.packet.middleimpl.clientbound.login.v_4_5_6_7.EncryptionRequest;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopAdvancements;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopAdvanementsTab;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopBossBar;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopCamera;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopCombatEvent;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopCraftRecipeConfirm;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopDeclareCommands;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopDeclareRecipes;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopDeclareTags;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopEntitySound;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopLookAt;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopPlayerListHeaderFooter;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopResourcePack;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopServerDifficulty;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopSetCooldown;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopSetViewCenter;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopStatistics;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopStopSound;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopTitle;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopUnlockRecipes;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopUpdateViewDistance;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopVehicleMove;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.noop.NoopWorldBorder;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.BlockAction;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.BlockBreakAnimation;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.BlockBreakConfirm;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.BlockChangeSingle;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.ChangeDimension;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.EntityAnimation;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.Explosion;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.GameStateChange;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.HeldSlot;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.KickDisconnect;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.SpawnExpOrb;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.SpawnLiving;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.SpawnNamed;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.SpawnObject;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.SpawnPainting;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.SpawnPosition;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.StartGame;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.TabComplete;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6.UpdateMap;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.BlockChangeMulti;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.BlockTileUpdate;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.BookOpen;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.ChunkData;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.ChunkLight;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.ChunkUnload;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.CollectEffect;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.CustomPayload;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.Entity;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityDestroy;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityEffectAdd;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityEffectRemove;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityEquipment;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityHeadRotation;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityLook;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityMetadata;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityRelMove;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityRelMoveLook;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityStatus;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityTeleport;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.EntityVelocity;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.KeepAlive;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.MerchantTradeList;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.PlayerListSetEntry;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.SetExperience;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7.WorldEvent;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8.WorldCustomSound;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8.WorldSound;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16.InventoryClose;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16.InventoryConfirmTransaction;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16.InventoryData;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16.InventorySetItems;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16.InventorySetSlot;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16.ScoreboardDisplay;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_4_5_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16.TimeUpdate;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_5_6_7.InventoryOpen;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_5_6_7.ScoreboardObjective;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_5_6_7.ScoreboardScore;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_5_6_7.ScoreboardTeam;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_5_6_7.WorldParticle;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6.BlockOpenSignEditor;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6.Chat;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6.SetPosition;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6_7.EntityAttributes;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6_7.InventoryHorseOpen;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6_7.SetHealth;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6_7_8.EntityLeash;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6_7_8.EntityPassengers;
import protocolsupport.protocol.packet.middleimpl.clientbound.play.v_6_7_8_9r1_9r2_10_11_12r1_12r2_13_14r1_14r2_15_16.PlayerAbilities;
import protocolsupport.protocol.packet.middleimpl.clientbound.status.noop.NoopPong;
import protocolsupport.protocol.packet.middleimpl.clientbound.status.v_5_6.ServerInfo;
import protocolsupport.protocol.pipeline.version.util.encoder.AbstractPacketEncoder;

public class PacketEncoder extends AbstractPacketEncoder {

	public PacketEncoder(ConnectionImpl connection) {
		super(connection);
	}

	{
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_DISCONNECT, LoginDisconnect::new);
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_ENCRYPTION_BEGIN, EncryptionRequest::new);
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_SET_COMPRESSION, NoopSetCompression::new);
		registry.register(NetworkState.LOGIN, PacketType.CLIENTBOUND_LOGIN_SUCCESS, NoopLoginSuccess::new);
		registry.register(NetworkState.STATUS, PacketType.CLIENTBOUND_STATUS_SERVER_INFO, ServerInfo::new);
		registry.register(NetworkState.STATUS, PacketType.CLIENTBOUND_STATUS_PONG, NoopPong::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_KEEP_ALIVE, KeepAlive::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_START_GAME, StartGame::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CHAT, Chat::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_UPDATE_TIME, TimeUpdate::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_EQUIPMENT, EntityEquipment::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_POSITION, SpawnPosition::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SET_HEALTH, SetHealth::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_RESPAWN, ChangeDimension::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_POSITION, SetPosition::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_HELD_SLOT, HeldSlot::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_ANIMATION, EntityAnimation::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_NAMED, SpawnNamed::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_COLLECT_EFFECT, CollectEffect::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_OBJECT, SpawnObject::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_LIVING, SpawnLiving::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_PAINTING, SpawnPainting::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SPAWN_EXP_ORB, SpawnExpOrb::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_VELOCITY, EntityVelocity::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_DESTROY, EntityDestroy::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_NOOP, Entity::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_REL_MOVE, EntityRelMove::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_LOOK, EntityLook::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_REL_MOVE_LOOK, EntityRelMoveLook::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_TELEPORT, EntityTeleport::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_HEAD_ROTATION, EntityHeadRotation::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_STATUS, EntityStatus::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_LEASH, EntityLeash::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_METADATA, EntityMetadata::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_EFFECT_ADD, EntityEffectAdd::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_EFFECT_REMOVE, EntityEffectRemove::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SET_EXPERIENCE, SetExperience::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_ATTRIBUTES, EntityAttributes::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CHUNK_SINGLE, ChunkData::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_CHANGE_MULTI, BlockChangeMulti::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_CHANGE_SINGLE, BlockChangeSingle::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_BREAK_CONFIRM, BlockBreakConfirm::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_ACTION, BlockAction::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_BREAK_ANIMATION, BlockBreakAnimation::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_EXPLOSION, Explosion::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_EVENT, WorldEvent::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_SOUND, WorldSound::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_CUSTOM_SOUND, WorldCustomSound::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_PARTICLES, WorldParticle::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_GAME_STATE_CHANGE, GameStateChange::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_OPEN, InventoryOpen::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_HORSE_OPEN, InventoryHorseOpen::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_CLOSE, InventoryClose::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_SET_SLOT, InventorySetSlot::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_SET_ITEMS, InventorySetItems::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_DATA, InventoryData::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WINDOW_TRANSACTION, InventoryConfirmTransaction::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_UPDATE_MAP, UpdateMap::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BLOCK_TILE, BlockTileUpdate::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SIGN_EDITOR, BlockOpenSignEditor::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_PLAYER_INFO, PlayerListSetEntry::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_PLAYER_ABILITIES, PlayerAbilities::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_TAB_COMPLETE, TabComplete::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SCOREBOARD_OBJECTIVE, ScoreboardObjective::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SCOREBOARD_SCORE, ScoreboardScore::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SCOREBOARD_DISPLAY_SLOT, ScoreboardDisplay::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SCOREBOARD_TEAM, ScoreboardTeam::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CUSTOM_PAYLOAD, CustomPayload::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_KICK_DISCONNECT, KickDisconnect::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_PASSENGERS, EntityPassengers::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CHUNK_UNLOAD, ChunkUnload::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CHUNK_LIGHT, ChunkLight::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_MERCHANT_TRADE_LIST, MerchantTradeList::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BOOK_OPEN, BookOpen::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SERVER_DIFFICULTY, NoopServerDifficulty::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_COMBAT_EVENT, NoopCombatEvent::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_WORLD_BORDER, NoopWorldBorder::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_TITLE, NoopTitle::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_PLAYER_LIST_HEADER_FOOTER, NoopPlayerListHeaderFooter::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CAMERA, NoopCamera::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SET_COOLDOWN, NoopSetCooldown::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_BOSS_BAR, NoopBossBar::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_VEHICLE_MOVE, NoopVehicleMove::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_STATISTICS, NoopStatistics::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_RESOURCE_PACK, NoopResourcePack::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_UNLOCK_RECIPES, NoopUnlockRecipes::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ADVANCEMENTS, NoopAdvancements::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ADVANCEMENTS_TAB, NoopAdvanementsTab::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_CRAFT_RECIPE_CONFIRM, NoopCraftRecipeConfirm::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_DECLARE_COMMANDS, NoopDeclareCommands::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_DECLARE_RECIPES, NoopDeclareRecipes::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_DECLARE_TAGS, NoopDeclareTags::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_STOP_SOUND, NoopStopSound::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_LOOK_AT, NoopLookAt::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_SET_VIEW_CENTER, NoopSetViewCenter::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_UPDATE_VIEW_DISTANCE, NoopUpdateViewDistance::new);
		registry.register(NetworkState.PLAY, PacketType.CLIENTBOUND_PLAY_ENTITY_SOUND, NoopEntitySound::new);
	}

}
