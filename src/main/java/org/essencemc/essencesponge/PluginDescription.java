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

import java.util.Arrays;
import java.util.List;

/**
 * All the general plugin information
 */
public class PluginDescription {

    public static final String ID = "essenceSponge";
    public static final String NAME = "Essence Sponge";
    public static final String VERSION = "0.0.1-SNAPSHOT";
    public static final String DEPENDENCIES = "";
    public static final String WEBSITE = "http://www.essencemc.org";
    public static final String ISSUES = "https://github.com/KGGArmy/Essence-Sponge/issues";
    public static final String WIKI = "https://github.com/KGGArmy/Essence-Sponge/wiki";
    private static String[] authors = new String[]{"KingGoesGaming"};
    public static final List<String> AUTHORS = Arrays.asList(authors);

    private PluginDescription() {
    }
}
