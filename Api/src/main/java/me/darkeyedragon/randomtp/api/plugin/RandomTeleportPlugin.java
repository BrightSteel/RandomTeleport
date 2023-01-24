package me.darkeyedragon.randomtp.api.plugin;

import me.darkeyedragon.randomtp.api.addon.AddonPlugin;
import me.darkeyedragon.randomtp.api.addon.RandomAddonManager;
import me.darkeyedragon.randomtp.api.config.RandomConfigHandler;
import me.darkeyedragon.randomtp.api.eco.EcoHandler;
import me.darkeyedragon.randomtp.api.event.RandomTeleportCompletionEvent;
import me.darkeyedragon.randomtp.api.failsafe.DeathTracker;
import me.darkeyedragon.randomtp.api.logging.PluginLogger;
import me.darkeyedragon.randomtp.api.message.MessageHandler;
import me.darkeyedragon.randomtp.api.metric.Metric;
import me.darkeyedragon.randomtp.api.scheduler.Scheduler;
import me.darkeyedragon.randomtp.api.teleport.CooldownHandler;
import me.darkeyedragon.randomtp.api.world.PlayerHandler;
import me.darkeyedragon.randomtp.api.world.RandomMaterialHandler;
import me.darkeyedragon.randomtp.api.world.RandomWorldHandler;
import net.kyori.adventure.platform.AudienceProvider;

import java.io.File;
import java.nio.file.Path;

public interface RandomTeleportPlugin<T> {


    AddonPlugin getPlugin(String name);

    PluginLogger getLogger();

    //CommandManager getCommandManager();

    EcoHandler getEcoHandler();

    boolean setupEconomy();

    RandomConfigHandler getConfigHandler();

    RandomWorldHandler getWorldHandler();

    DeathTracker getDeathTracker();

    T getInstance();

    File getDataFolder();

    Path getConfigPath();

    boolean isPluginLoaded(String name);

    AudienceProvider getAudience();

    MessageHandler getMessageHandler();

    void reloadConfig();

    PlayerHandler getPlayerHandler();

    Metric getStats();

    CooldownHandler getCooldownHandler();

    Scheduler getScheduler();

    RandomAddonManager getAddonManager();

    RandomMaterialHandler getMaterialHandler();

    boolean hasConsent();

    Platform getPlatform();

    RandomTeleportCompletionEvent getCompletionEvent();
}
