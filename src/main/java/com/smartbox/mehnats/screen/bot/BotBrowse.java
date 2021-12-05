package com.smartbox.mehnats.screen.bot;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Bot;


/**
 * User: Nurmuhammad
 * Date: 05/12/2021 11:35
 */
@UiController("mehnats_Bot.browse")
@UiDescriptor("bot-browse.xml")
@LookupComponent("botsTable")
public class BotBrowse extends StandardLookup<Bot> {
}
