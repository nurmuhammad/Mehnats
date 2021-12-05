package com.smartbox.mehnats.screen.degree;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Degree;


/**
 * User: Nurmuhammad
 * Date: 05/12/2021 15:46
 */
@UiController("mehnats_Degree.edit")
@UiDescriptor("degree-edit.xml")
@EditedEntityContainer("degreeDc")
public class DegreeEdit extends StandardEditor<Degree> {
}
