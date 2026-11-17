package com.example.escaladeobreiros.login.viewModel

import com.example.escaladeobreiros.login.data.User

class LoginScreenViewModel {
    var usuario = User("","","")

    fun createUser(user: User){
        if (usuario.email == user.email && usuario.password == user.password){

        }
    }
}