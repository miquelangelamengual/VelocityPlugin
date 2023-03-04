package es.hulk.velocityplugin.events;

import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.PostLoginEvent;
import com.velocitypowered.api.proxy.connection.Player;
import net.kyori.adventure.text.Component;

public class JoinEvent {

    @Subscribe
    public void onPlayerJoin(PostLoginEvent event) {
        Player player = event.player();
        player.sendMessage(Component.join(Component.text("Welcome to the server! ")));
    }

}
