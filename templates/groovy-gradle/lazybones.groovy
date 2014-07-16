import org.apache.commons.io.FileUtils

props = [:]
props.indy = ask('Use indy (true/1/y) [false]: ', 'indy', 'false').toBoolean()
props.springboot = ask('Need springboot (true/1/y) [false]: ', 'springboot', 'false').toBoolean()
processTemplates "build.gradle", props
if (!props.springboot) {
	FileUtils.forceDelete(new File("${targetDir}/src/main/groovy/Application.groovy"))
}
if (hasFeature("scmExclusions")) {
	scmExclusions ".DS_Store",
		      "*~",
		      ".idea",
		      "*.iml",
		      "*.iws",
		      "*.ipr",
		      ".project",
		      ".metadata",
		      ".classpath",
		      ".settings/",
		      ".loadpath",
		      ".gradle",
		      ".gradletasknamecache",
		      "/build",
		      "/bin",
		      "/tmp",
		      "/out",
		      "*.class",
		      "*.tmp",
		      "*.bak",
		      "*.swp",
		      "*~.nib",
		      "*.jar",
		      "*.war",
		      "*.ear"
}
