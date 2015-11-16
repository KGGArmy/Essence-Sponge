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

package org.essencemc.essencesponge.managers.config;

import ninja.leaping.configurate.commented.CommentedConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;
import org.essencemc.essencesponge.EssenceSponge;

import java.io.File;
import java.io.IOException;

/**
 * Config for handling messages
 */
public class ConfigMessages implements Configurable {

    private static ConfigMessages instance = new ConfigMessages();
    private File messagesConfig = new File(EssenceSponge.getInstance().getConfigDir() + "messages.conf");
    private ConfigurationLoader<CommentedConfigurationNode> configLoader = HoconConfigurationLoader.builder().setFile(messagesConfig).build();
    private CommentedConfigurationNode configNode;

    private ConfigMessages() {
    }

    public static ConfigMessages getInstance() {
        return instance;
    }

    @Override
    public void setup() {
        if (!messagesConfig.exists()) {
            try {
                messagesConfig.createNewFile();
                load();
                setDefaultNodes();
                save();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            load();
    }

    @Override
    public void load() {
        try {
            configNode = configLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save() {
        try {
            configLoader.save(configNode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void upgradeNodes() {

    }

    @Override
    public void setDefaultNodes() {
        getConfig().getNode("MESSAGES").setComment("The variables that can be used in the messages:\n" +
                "{player}: Player name\n" +
                "");
    }

    @Override
    public CommentedConfigurationNode getConfig() {
        return configNode;
    }
}
