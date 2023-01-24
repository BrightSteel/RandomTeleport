package me.darkeyedragon.randomtp.api.event;

import me.darkeyedragon.randomtp.api.teleport.TeleportProperty;
import me.darkeyedragon.randomtp.api.world.player.RandomPlayer;

public interface RandomTeleportCompletionEvent {

    void call(RandomPlayer player, TeleportProperty proprty);

}
