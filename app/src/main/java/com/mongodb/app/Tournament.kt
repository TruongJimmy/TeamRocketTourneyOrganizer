package com.mongodb.app

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmField
import java.util.*

open class Tournament(
    @PrimaryKey @RealmField("_id")
    var id: String? = null,
    var _partition: String = "",
    var name: String = "",
    var game: String = "",
    var participant: String = "",
    var location: String = "",
    var tournamentType: String = "",
    var date: String = "",
    //var tournamentOrganizer: User? = null
): RealmObject() {}