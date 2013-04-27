name := "Selenium Test Harness"

version := "0.1"

libraryDependencies ++= Seq(
	"org.seleniumhq.selenium" % "selenium-java" % "2.32.0" % "test",
	"com.novocode" % "junit-interface" % "0.8" % "test->default",
	"org.fluentlenium" % "fluentlenium-core" % "0.7.8" % "test",
	"org.fluentlenium" % "fluentlenium-festassert" % "0.7.8" % "test",
	"org.easytesting" % "fest-assert-core" % "2.0M10" % "test"
)