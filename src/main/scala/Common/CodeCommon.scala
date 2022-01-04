/*
package Common

import org.apache.spark.sql.SparkSession

object CodeCommon {


  def createSparkSession(): SparkSession = {
    System.setProperty("hadoop.home.dir", "C:\\BigData\\hadoop\\bin\\winutils")
    val spark = SparkSession
      .builder
      .appName("HelloSpark")
      .config("spark.master", "local")
      .enableHiveSupport()
      .getOrCreate()
    spark
  }




}*/
