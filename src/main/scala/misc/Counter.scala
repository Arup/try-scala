package misc

class Counter {
    private var value:Int = 0
    def increment() = {
        value += 1
    }
    def showVal() :Int= {
        value
    }
}
