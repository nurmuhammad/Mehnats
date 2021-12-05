package com.smartbox.mehnats.screen.region;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Region;


/**
 * User: Nurmuhammad
 * Date: 05/12/2021 11:27
 */
@UiController("mehnats_Region.browse")
@UiDescriptor("region-browse.xml")
@LookupComponent("regionsTable")
public class RegionBrowse extends StandardLookup<Region> {
}
