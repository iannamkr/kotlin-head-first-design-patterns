package design.patterns.example.command

import CeilingFan
import CeilingFanHighCommand
import CeilingFanOffCommand
import Light
import LightOffCommand
import LightOnCommand
import Stereo
import StereoOff
import StereoOnForCD

fun main() {
    val remoteControl = RemoteControl().apply {
        setCommand(0, LightOnCommand(Light("LivingRoom")), LightOffCommand(Light("LivingRoom")))
        setCommand(1, LightOnCommand(Light("Kichen")), LightOffCommand(Light("Kichen")))
        setCommand(2, CeilingFanHighCommand(CeilingFan("Kichen")), CeilingFanOffCommand(CeilingFan("Kichen")))
        setCommand(3, StereoOnForCD(Stereo("LivingRoom")), StereoOff(Stereo("LivingRoom")))
        setCommand(4,
            MacroCommand(arrayOf(LightOnCommand(Light("LivingRoom")), StereoOnForCD(Stereo("LivingRoom")))),
            MacroCommand(arrayOf(LightOffCommand(Light("LivingRoom")), StereoOff(Stereo("LivingRoom"))))
        )
    }

    println(remoteControl.toString())

    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)

    remoteControl.onButtonWasPushed(1)
    remoteControl.offButtonWasPushed(1)

    remoteControl.onButtonWasPushed(2)
    remoteControl.offButtonWasPushed(2)

    remoteControl.onButtonWasPushed(3)
    remoteControl.offButtonWasPushed(3)

    println("======= macro =======")
    remoteControl.onButtonWasPushed(4)
    remoteControl.offButtonWasPushed(4)
}


