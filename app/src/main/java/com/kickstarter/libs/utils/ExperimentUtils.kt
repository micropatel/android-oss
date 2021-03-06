package com.kickstarter.libs.utils

import com.kickstarter.libs.RefTag
import com.kickstarter.models.User
import java.util.*

object ExperimentUtils {

    fun attributes(user: User?, refTag: RefTag?, buildVersion: String): MutableMap<String, Any?> {
        return mutableMapOf(
                Pair("user_backed_projects_count", user?.backedProjectsCount() ?: 0),
                Pair("user_country", user?.location()?.country() ?: Locale.getDefault().country),
                Pair("session_os_version", String.format("Android %s", buildVersion)),
                Pair("session_ref_tag", refTag?.tag()),
                Pair("session_user_is_logged_in", user != null)
        )
    }
}
