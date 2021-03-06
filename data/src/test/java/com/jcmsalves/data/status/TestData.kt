package com.jcmsalves.data.status

import com.jcmsalves.data.status.model.LineStatusModel
import com.jcmsalves.data.status.model.StatusModel
import com.jcmsalves.domain.status.model.LineStatus

fun getLineStatusModel(): LineStatusModel {
    return LineStatusModel(
        id = "id",
        name = "name",
        statusModels = listOf(getStatusModel())
    )
}

fun getStatusModel(): StatusModel {
    return StatusModel(
        severityLevel = "severity_level",
        severityLevelDescription = "severity_level_description"
    )
}

fun getExpectedLineStatus(): LineStatus {
    return LineStatus(
        id = "id",
        name = "name",
        severityLevel = "severity_level",
        severityLevelDescription = "severity_level_description"
    )
}
