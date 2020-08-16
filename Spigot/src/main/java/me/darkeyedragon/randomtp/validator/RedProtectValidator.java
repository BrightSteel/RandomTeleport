package me.darkeyedragon.randomtp.validator;

import br.net.fabiozumbi12.RedProtect.Bukkit.RedProtect;
import me.darkeyedragon.randomtp.api.addon.PluginLocationValidator;
import me.darkeyedragon.randomtp.api.world.location.RandomLocation;
import me.darkeyedragon.randomtp.util.location.LocationUtil;
import org.bukkit.Location;

public class RedProtectValidator implements PluginLocationValidator {

    private final RedProtect instance;
    private boolean isLoaded;

    public RedProtectValidator() {
        instance = RedProtect.get();
        this.isLoaded = instance != null;
    }

    @Override
    public boolean isValid(RandomLocation location) {
        Location loc = LocationUtil.toLocation(location);
        return instance.getAPI().getRegion(loc) == null;
    }

    @Override
    public boolean isLoaded() {
        return isLoaded;
    }

    @Override
    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    @Override
    public Validator getValidator() {
        return Validator.RED_PROTECT;
    }
}
