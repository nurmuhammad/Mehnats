package com.smartbox.mehnats.entity.province;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Province;


/**
 * User: Nurmuhammad
 * Date: 04/12/2021 18:48
 */
@UiController("mehnats_Province.browse")
@UiDescriptor("province-browse.xml")
@LookupComponent("provincesTable")
public class ProvinceBrowse extends StandardLookup<Province> {
}
