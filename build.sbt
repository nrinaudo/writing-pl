enablePlugins(GhpagesPlugin)

organization       := "com.nrinaudo"
scalaVersion       := "3.3.1"
graphvizStylesheet := Some(graphvizSourceDirectory.value / "style.dss")

scalacOptions ++= Seq("-source", "future", "-Ykind-projector:underscores", "-deprecation")

SitePlugin.autoImport.makeSite / includeFilter :=
  "*.yml" | "*.md" | "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.eot" | "*.svg" | "*.ttf" |
    "*.woff" | "*.woff2" | "*.otf"

git.remoteRepo := "git@github.com:nrinaudo/writing-pl.git"
