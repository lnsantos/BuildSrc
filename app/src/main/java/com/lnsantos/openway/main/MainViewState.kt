package com.lnsantos.openway.main

interface MainViewState {

    fun render(state: MainState){
        splashDone(state == MainState.done)
    }

    fun splashDone(state: Boolean)

}