BUILD_TRIGGER_BY =currentBuild.getBuildCauses()[0].userId

if(${BUILD_TRIGGER_BY} == "null"){
    println("yess");
}