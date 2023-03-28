import java.lang.Thread.sleep

fun main() {
    for (i in 1..20){
        print("\n")
    }
    println("@ emran.hejazi Welcome to your car!".red())
    sleep(500)
    print("> Enter your chair status: ")
    var chairStatus = readln().toBoolean()
    print("> Enter your belt status: ")
    var beltStatus = readln().toBoolean()
    print("> Enter your mirrors status: ")
    var mirrorsStatus = readln().toBoolean()
    print("> Enter your gear status: ")
    var gearStatus = readln().toBoolean()

    print("✓ Checking your things".blue())
    repeat(5) {
        print(".")
        sleep(400)
    }

    if (!chairStatus) {
        print("\n> fixing your chair".yellow())
        repeat(5) {
            print(".")
            sleep(1000)
        }
        chairStatus = true
    }
    if (!beltStatus){
        print("\n> setting your belt".yellow())
        repeat(5) {
            print(".")
            sleep(800)
        }
        beltStatus = true
    }
    if (!mirrorsStatus) {
        print("\n> fixing your mirrors".yellow())
        repeat(5) {
            print(".")
            sleep(500)
        }
        mirrorsStatus = true
    }
    if (!gearStatus) {
        print("\n> freeing your gear".yellow())
        repeat(5) {
            print(".")
            sleep(200)
        }
        gearStatus = true
    }
    println("\n✓ Everything is ready for start driving!".green())
}

fun String.red() = "\u001B[31m$this\u001B[0m"
fun String.green() = "\u001B[32m$this\u001B[0m"
fun String.blue() = "\u001B[34m${this}\u001B[0m"
fun String.yellow() = "\u001B[33m$this\u001B[0m"
