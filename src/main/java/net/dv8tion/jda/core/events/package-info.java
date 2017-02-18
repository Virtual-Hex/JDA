/*
 *     Copyright 2015-2017 Austin Keener & Michael Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * <b><u>net.dv8tion.jda.core.events</u></b>
 *
 * <p>This package contains all implementations of {@link net.dv8tion.jda.core.events.Event Event}.
 * <br>These are specific depending on the event that has been received by the {@link net.dv8tion.jda.core.requests.WebSocketClient WebSocketClient}
 *
 * <p>All events are forwarded by an {@link net.dv8tion.jda.core.hooks.IEventManager IEventManager} implementation.
 * <br>Some events are specific for JDA internal events such as the {@link net.dv8tion.jda.core.events.ReadyEvent ReadyEvent}
 * which is only fired when JDA finishes to setup its internal cache.
 */
package net.dv8tion.jda.core.events;
