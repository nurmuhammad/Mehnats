package com.smartbox.mehnats.entity.download;

import io.jmix.ui.screen.*;
import com.smartbox.mehnats.entity.Download;


/**
 * User: Nurmuhammad
 * Date: 04/12/2021 18:45
 */
@UiController("mehnats_Download.browse")
@UiDescriptor("download-browse.xml")
@LookupComponent("downloadsTable")
public class DownloadBrowse extends StandardLookup<Download> {
}
