/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
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
package org.spongepowered.api.data.type;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.DefaultedRegistryReference;
import org.spongepowered.api.registry.Registry;
import org.spongepowered.api.registry.RegistryKey;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;

/**
 * An enumeration of vanilla {@link HandType}s.
 */
@SuppressWarnings("unused")
@RegistryScopes(scopes = RegistryScope.GAME)
public final class HandTypes {

    // @formatter:off

    // SORTFIELDS:ON

    /**
     * The hand used for main interactions such as using tools, and placing
     * blocks.
     */
    public static final DefaultedRegistryReference<HandType> MAIN_HAND = HandTypes.key(ResourceKey.sponge("main_hand"));

    /**
     * The hand used for secondary actions, such as a shield.
     */
    public static final DefaultedRegistryReference<HandType> OFF_HAND = HandTypes.key(ResourceKey.sponge("off_hand"));

    // SORTFIELDS:OFF

    // @formatter:on

    private HandTypes() {
    }

    public static Registry<HandType> registry() {
        return Sponge.game().registry(RegistryTypes.HAND_TYPE);
    }

    private static DefaultedRegistryReference<HandType> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.HAND_TYPE, location).asDefaultedReference(Sponge::game);
    }
}
