# MAS
##### add mysql jdbc驱动
mvn install:install-file -Dfile=ext_jar/mysql-connector-java-5.1.46.jar -DgroupId=com.mysql -DartifactId=mysql-connector-java-5.1.46 -Dpackaging=jar -DgeneratePom=true -Dversion=5.1.46

###2018-06-09
完成账户的添、删、改、查

###2018-06-18
集成Redis
集成事务处理
使用logback打印mybatis sql语句




