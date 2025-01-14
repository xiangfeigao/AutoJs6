package org.autojs.autojs.permission

import android.content.Context
import org.autojs.autojs.app.AppOps.isUsageStatsPermissionGranted
import org.autojs.autojs.ui.main.drawer.PermissionItemHelper
import org.autojs.autojs.util.IntentUtils

class UsageStatsPermission(override val context: Context) : PermissionItemHelper {

    override fun has() = isUsageStatsPermissionGranted(context)

    override fun request() = config()

    override fun revoke() = config()

    fun config() = IntentUtils.requestAppUsagePermission(context)

}