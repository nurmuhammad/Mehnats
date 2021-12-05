package com.smartbox.mehnats.screen.bot;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Bot;


/**
 * User: Nurmuhammad
 * Date: 05/12/2021 11:35
 */
@UiController("mehnats_Bot.edit")
@UiDescriptor("bot-edit.xml")
@EditedEntityContainer("botDc")
public class BotEdit extends StandardEditor<Bot> {
}
