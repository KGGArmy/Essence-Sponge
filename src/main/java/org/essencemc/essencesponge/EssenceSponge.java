/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Essence <http://essencemc.org>
 * Copyright (c) 2015 contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package org.essencemc.essencesponge;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.*;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.service.config.DefaultConfig;

import java.io.File;

import static org.essencemc.essencesponge.PluginDescription.*;

/**
 * The main class for Essence Sponge plugin
 */
@Plugin(id = ID, name = NAME, version = VERSION, dependencies = DEPENDENCIES)
public class EssenceSponge {

    @Inject
    @DefaultConfig(sharedRoot = false)
    private File configDir;

    @Inject
    private Logger logger;

    @Inject
    private Game game;

    @Listener
    public void onPreInitialization(GamePreInitializationEvent event) {
        getLogger().info(ID + " is loading...");

        if (!configDir.exists()) {
            configDir.mkdirs();
        }

        //TODO add config loaders

    }

    @Listener
    public void onInitialization(GameInitializationEvent event) {
        // TODO register commands
        // TODO register events
    }

    @Listener
    public void onLoadComplete(GameLoadCompleteEvent event) {
        getLogger().info(ID + " has been loaded!");
    }

    @Listener
    public void onStopping(GameStoppingEvent event) {
        getLogger().info(ID + " is unloading");
    }

    @Listener
    public void onStopped(GameStoppedServerEvent event) {
        getLogger().info(ID + " has been unloaded!");
    }

    public File getConfigDir() {
        return configDir;
    }

    public Logger getLogger() {
        return logger;
    }

    public Game getGame() {
        return game;
    }
}
