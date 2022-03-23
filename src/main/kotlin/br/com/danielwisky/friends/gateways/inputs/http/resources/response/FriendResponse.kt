package br.com.danielwisky.friends.gateways.inputs.http.resources.response

import br.com.danielwisky.friends.domains.Friend
import java.time.LocalDateTime

data class FriendResponse(
    var id: String? = null,
    var name: String? = null,
    var cellphone: String? = null,
    var email: String? = null,
    var createdDate: LocalDateTime? = null,
    var lastModifiedDate: LocalDateTime? = null
) {

    constructor(friend: Friend) : this(
        id = friend.id,
        name = friend.name,
        cellphone = friend.cellphone,
        email = friend.email,
        createdDate = friend.createdDate,
        lastModifiedDate = friend.lastModifiedDate
    )
}