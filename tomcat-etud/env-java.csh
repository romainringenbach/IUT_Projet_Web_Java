#!/bin/csh

#----------------------------------------------------------------
# J2SDK
#----------------------------------------------------------------

#setenv JAVA_HOME "/vol/app/jdk"
#setenv JDK_HOME ${JAVA_HOME}
#setenv jar_files "${JAVA_HOME}/jre/lib/rt.jar"
setenv CLASSPATH ".:..:./classes:../classes"
#setenv PATH "${JAVA_HOME}/bin:$PATH"


#----------------------------------------------------------------
# TOMCAT libs
#----------------------------------------------------------------

setenv jar_files `find "${PWD}/lib/" -name '*.jar'`
setenv classpath_ `echo ${jar_files} | sed 's/\ /:/g'`
setenv  CLASSPATH "${classpath_}:${CLASSPATH}"


#----------------------------------------------------------------
# Application
#----------------------------------------------------------------

setenv CLASSPATH "${PWD}/webapps/musiconline/WEB-INF/classes:${CLASSPATH}"


#----------------------------------------------------------------
# DEFAULT
#----------------------------------------------------------------

setenv CLASSPATH ".:../classes:../classes:target/classes:${CLASSPATH}"

