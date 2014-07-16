props = [:]
props.indy = ask('Use indy (true/1/y) [false]: ', 'indy', 'false').toBoolean()
processTemplates "build.gradle", props
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
