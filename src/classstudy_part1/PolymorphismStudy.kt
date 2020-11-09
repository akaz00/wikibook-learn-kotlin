package classstudy_part1

interface Drawable {
    fun draw(c: Canvas)
}

class Canvas(width: Int, height: Int) {
    fun drawToCanvas(d : Drawable) {
        d.draw(this)
    }
}

// 사각형
class DrawableRectangle(val width: Int, val height: Int) : Drawable {
    private fun drawRectangle(c: Canvas) {
        println("캔버스에 ${width} x ${height} 크기의 사각형을 그립니다.")
    }
    override fun draw(c: Canvas) = drawRectangle(c)
}

// 원
class DrawableCircle(val centerX: Int, val centerY: Int, val radius: Int) : Drawable {
    private fun drawCircle(c: Canvas) {
        println("캔버스의 (${centerX}, ${centerY}) 위치에 반지름이 ${radius}인 원을 그립니다.")
    }
    override fun draw(c: Canvas) = drawCircle(c)
}

// 선
class DrawableLine(val x1: Int, val y1: Int, val x2: Int, val y2: Int) : Drawable {
    private fun drawLine(c: Canvas) {
        println("캔버스의 (${x1}, ${y1}) 위치에서 시작하여 (${x2}, ${y2}) 위치에서 끝나는 선을 그립니다.")
    }
    override fun draw(c: Canvas) = drawLine(c)
}

// 배경색
class DrawableBackground(val red: Int, val green: Int, val blue: Int) : Drawable {
    override fun draw(c: Canvas) = println("캔버스에 배경색(${red}, ${green}, ${blue})을 칠합니다.")
}

fun main(args : Array<String>) {
    val c = Canvas(500,500)
    val drawables = mutableListOf<Drawable>();
    drawables.add(DrawableRectangle(200, 200))
    drawables.add(DrawableCircle(250, 250, 50))
    drawables.add(DrawableLine(0, 0, 500, 500))
    drawables.add(DrawableBackground(255, 0, 0))

    for(d in drawables) {
        c.drawToCanvas(d)
    }
}

/*
class Canvas(width: Int, height: Int) {
    fun drawToCanvas(d : DrawableRectangle) {
        d.draw(this)
    }
    fun drawToCanvas(d : DrawableCircle) {
        d.draw(this)
    }
    fun drawToCanvas(d : DrawableLine) {
        d.draw(this)
    }
    fun drawToCanvas(d : DrawableBackground) {
        d.draw(this)
    }
}

class DrawableRectangle(val width: Int, val height: Int) {
    private fun drawRectangle(c: Canvas) {
        println("캔버스에 ${width} x ${height} 크기의 사각형을 그립니다.")
    }
    fun draw(c: Canvas) = drawRectangle(c)
}

class DrawableCircle(val centerX: Int, val centerY: Int, val radius: Int) {
    private fun drawCircle(c: Canvas) {
        println("캔버스의 (${centerX}, ${centerY}) 위치에 반지름이 ${radius}인 원을 그립니다.")
    }
    fun draw(c: Canvas) = drawCircle(c)
}

class DrawableLine(val x1: Int, val y1: Int, val x2: Int, val y2: Int) {
    private fun drawLine(c: Canvas) {
        println("캔버스의 (${x1}, ${y1}) 위치에서 시작하여 (${x2}, ${y2}) 위치에서 끝나는 선을 그립니다.")
    }
    fun draw(c: Canvas) = drawLine(c)
}

class DrawableBackground(val red: Int, val green: Int, val blue: Int) {
    fun draw(c: Canvas) = println("캔버스에 배경색(${red}, ${green}, ${blue})을 칠합니다.")
}

fun main(args : Array<String>) {
    val c = Canvas(500,500)

    val rectangle = DrawableRectangle(200, 200)
    val circle = DrawableCircle(250, 250, 50)
    val line = DrawableLine(0, 0, 500, 500)
    val background = DrawableBackground(255, 0, 0)

    c.drawToCanvas(rectangle)
    c.drawToCanvas(circle)
    c.drawToCanvas(line)
    c.drawToCanvas(background)
}
*/