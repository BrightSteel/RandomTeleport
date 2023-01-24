package me.darkeyedragon.randomtp.teleport;

import me.darkeyedragon.randomtp.api.event.RandomEvent;
import me.darkeyedragon.randomtp.api.event.RandomTeleportCompletionEvent;
import me.darkeyedragon.randomtp.api.teleport.TeleportProperty;
import me.darkeyedragon.randomtp.api.world.player.RandomPlayer;
import me.darkeyedragon.randomtp.common.teleport.CommonTeleportProperty;
import me.darkeyedragon.randomtp.common.teleport.CommonTeleportPropertyBuilder;
import me.darkeyedragon.randomtp.event.RandomTeleportCompletedEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class SpigotCompletionEvent implements RandomTeleportCompletionEvent {

    @Override
    public void call(RandomPlayer player, TeleportProperty property) {
        Player bukkitPlayer = Bukkit.getPlayer(player.getUniqueId());
        CommonTeleportProperty teleportProperty = (CommonTeleportProperty) new CommonTeleportPropertyBuilder().bypassTeleportDelay(property.isBypassTeleportDelay()).bypassCooldown(property.isBypassCooldown()).bypassEco(property.isBypassEco()).delay(property.getDelay()).cancelOnMove(property.getCancelOnMove()).commandIssuer(property.getCommandIssuer()).initTime(property.getInitTime()).particle(property.getParticle()).price(property.getPrice()).target(property.getTarget()).world(property.getWorld()).build();
        Bukkit.getPluginManager().callEvent(new RandomTeleportCompletedEvent(bukkitPlayer, teleportProperty));
    }

}
