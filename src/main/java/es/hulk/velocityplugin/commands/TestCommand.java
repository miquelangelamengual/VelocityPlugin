package es.hulk.velocityplugin.commands;

import com.velocitypowered.api.proxy.connection.Player;
import net.kyori.adventure.text.Component;
import revxrsal.commands.annotation.Command;

public class TestCommand {

    @Command("test")
    public void test(Player player) {
        player.sendMessage(Component.text("Test command!"));
    }

}
