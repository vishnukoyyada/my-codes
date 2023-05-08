BUILD_TRIGGER_BY = currentBuild.getBuildCauses()[0].shortDescription + " / " + currentBuild.getBuildCauses()[0].userId
if (BUILD_TRIGGER_BY == "kvishnuv"){
    print("yess")
}