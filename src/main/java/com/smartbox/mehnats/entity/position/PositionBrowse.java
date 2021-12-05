package com.smartbox.mehnats.entity.position;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Position;


/**
 * User: Nurmuhammad
 * Date: 05/12/2021 11:26
 */
@UiController("mehnats_Position.browse")
@UiDescriptor("position-browse.xml")
@LookupComponent("positionsTable")
public class PositionBrowse extends StandardLookup<Position> {
}
