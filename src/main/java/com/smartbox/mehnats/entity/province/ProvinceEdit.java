package com.smartbox.mehnats.entity.province;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Province;


/**
 * User: Nurmuhammad
 * Date: 04/12/2021 18:48
 */
@UiController("mehnats_Province.edit")
@UiDescriptor("province-edit.xml")
@EditedEntityContainer("provinceDc")
public class ProvinceEdit extends StandardEditor<Province> {
}
