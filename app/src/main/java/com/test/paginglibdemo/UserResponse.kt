package com.test.paginglibdemo

import com.google.gson.annotations.SerializedName

class UserResponse {

    @field:SerializedName("data")
    var users: List<User>? = null
    @field:SerializedName("page")
    var page:Int=0
    @field:SerializedName("per_page")
    var perPage:Long=0
    @field:SerializedName("total")
    var total:Long=0
    @field:SerializedName("total_pages")
    var totalPages:Int=0
        get
        set(value) {totalPages=value}


}

class User {

    @field:SerializedName("avatar")
    var avatar: String? = null

    @field:SerializedName("email")
    var email: String? = null

    @field:SerializedName("first_name")
    var firstName: String? = null

    @field:SerializedName("id")
    var id: Long? = null

    @field:SerializedName("last_name")
    var lastName: String? = null
}