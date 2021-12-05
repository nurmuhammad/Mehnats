package com.smartbox.mehnats.screen.degree;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Degree;


/**
 * User: Nurmuhammad
 * Date: 05/12/2021 15:46
 */
@UiController("mehnats_Degree.browse")
@UiDescriptor("degree-browse.xml")
@LookupComponent("degreesTable")
public class DegreeBrowse extends StandardLookup<Degree> {
}
