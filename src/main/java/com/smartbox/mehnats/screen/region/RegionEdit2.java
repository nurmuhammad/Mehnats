package com.smartbox.mehnats.screen.region;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Region;


/**
 * User: Nurmuhammad
 * Date: 05/12/2021 11:32
 */
@UiController("mehnats_Region2.edit")
@UiDescriptor("region-edit2.xml")
@EditedEntityContainer("regionDc")
@PrimaryEditorScreen(Region.class)
public class RegionEdit2 extends StandardEditor<Region> {
}
