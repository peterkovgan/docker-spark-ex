import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf


object Application{

   val NUM_SAMPLES = 25


   def main(args:Array[String]):Unit={

        println("Hello, Ganesh!")

        val sc = new SparkContext(new SparkConf().setAppName("Computation"))

        val count = sc.parallelize(1 to NUM_SAMPLES).filter { _ =>

             val x = math.random

             val y = math.random

             x*x + y*y < 1

        }.count()

        println(s"Pi is roughly ${4.0 * count / NUM_SAMPLES}")

        
        sc.stop
   }

}
