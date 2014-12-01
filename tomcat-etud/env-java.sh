#!/bin/sh

#----------------------------------------------------------------
# J2SDK
#----------------------------------------------------------------

# export JAVA_HOME "/vol/app/jdk"
# export JDK_HOME ${JAVA_HOME}
# export jar_files "${JAVA_HOME}/jre/lib/rt.jar"
# export CLASSPATH "${jar_files}"
# export PATH "${JAVA_HOME}/bin:$PATH"


#----------------------------------------------------------------
# TOMCAT libs
#----------------------------------------------------------------

export jar_files=`find "${PWD}/lib/" -name '*.jar'`
export classpath_=`echo ${jar_files} | sed 's/\ /:/g'`
export CLASSPATH="${classpath_}:${CLASSPATH}"


#----------------------------------------------------------------
# Application
#----------------------------------------------------------------

export CLASSPATH="${PWD}/webapps/musiconline/WEB-INF/classes:${CLASSPATH}"


#----------------------------------------------------------------
# DEFAULT
#----------------------------------------------------------------

export CLASSPATH=".:../classes:../classes:target/classes:${CLASSPATH}"

