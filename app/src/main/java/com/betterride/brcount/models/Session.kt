package com.betterride.brcount.models

import android.os.Bundle

data class Session(val day: String,
                   val schedule: String,
                   val junction: String)
{
    companion object {
        fun from(bundle: Bundle): Session {
            return Session(
                    bundle.getString("day")!!,
                    bundle.getString("schedule")!!,
                    bundle.getString("junction")!!
            )
        }
    }

    fun toBundle() : Bundle {
        val bundle = Bundle()
        bundle.putString("day", day)
        bundle.putString("schedule", schedule)
        bundle.putString("junction", junction)
        return bundle
    }
}