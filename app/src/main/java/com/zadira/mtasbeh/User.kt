package com.zadira.mtasbeh

class User {
    var name=""
    var surname=""
    var age=""

    constructor(name: String, surname: String, age: String) {
        this.name = name
        this.surname = surname
        this.age = age
    }

    override fun toString(): String {
        return "User(name='$name', surname='$surname', age=$age)"
    }

}