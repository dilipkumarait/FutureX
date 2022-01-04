import org.apache.spark.sql.SparkSession

import java.util.Properties
object FutureX {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder
      .appName("HelloSpark")
      .config("spark.master", "local")
      .enableHiveSupport()
      .getOrCreate()

    //create data frame from mysql table
    println("Creating the dataframe from mysql ")
    val tableProperties = new Properties()
    tableProperties.put("user", "root")
    tableProperties.put("password", "Deshraj@1992")
    val sqlTable = "gkcstoredb2.tblemployee1"

    val sqlDataframe = spark.read.jdbc("jdbc:mysql://localhost:3306/gkcodelab",sqlTable,tableProperties)

    sqlDataframe.show()
    println("shown")





  }

}
