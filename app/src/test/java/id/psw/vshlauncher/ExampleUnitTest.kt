package id.psw.vshlauncher

import org.junit.Test

import org.junit.Assert.*
import java.io.File

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testSize(){
        System.out.println(File("I:\\Builds\\PacManUnity.apk").length().toSize())
    }

    @Test
    fun testApl(){
        for(i in 0 .. 100){
            System.out.println(i.toFloat().pingpong(10.0f, 1.0f))
        }
    }
}
