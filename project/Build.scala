import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2-i18n-sample"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
    	"com.github.julienrf" %% "play-jsmessages" % "1.3"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
    	resolvers += "julienrf.github.com" at "http://julienrf.github.com/repo/"       
    )

}
