props = [:]
processTemplates "build.gradle", props
scmExclusions ".DS_Store", "*~", ".idea", "*.iml", "*.iws", "*.ipr", ".project", ".metadata", ".classpath", ".settings/", ".loadpath", ".gradle", ".gradletasknamecache", "/build", "/bin", "/tmp", "/out", "*.class", "*.tmp", "*.bak", "*.swp", "*~.nib", "*.jar", "*.war", "*.ear"
