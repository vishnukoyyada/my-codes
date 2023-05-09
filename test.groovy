BUILD_TRIGGER_BY =currentBuild.getBuildCauses()[0].userId
echo"$BUILD_TRIGGER_BY"
println "$BUILD_TRIGGER_BY.getClass()"