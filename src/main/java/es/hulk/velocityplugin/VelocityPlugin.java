package es.hulk.velocityplugin;

import com.google.inject.Inject;
import com.velocitypowered.api.event.lifecycle.ProxyInitializeEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;
import es.hulk.velocityplugin.commands.TestCommand;
import es.hulk.velocityplugin.events.JoinEvent;
import org.slf4j.Logger;
import revxrsal.commands.CommandHandler;

@Plugin(
        id = "VelocityPlugin",
        name = "VelocityPlugin",
        version = "1.0-SNAPSHOT"
)
public class VelocityPlugin {

    private final ProxyServer server;
    private final Logger logger;
    private final CommandHandler commandHandler;

    @Inject
    public VelocityPlugin(ProxyServer server, Logger logger, CommandHandler commandHandler) {
        this.server = server;
        this.logger = logger;
        this.commandHandler = commandHandler;
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        logger.info("Hello from VelocityPlugin!");
        server.eventManager().register(this, new JoinEvent());
        commandHandler.register(new TestCommand());
    }
}
