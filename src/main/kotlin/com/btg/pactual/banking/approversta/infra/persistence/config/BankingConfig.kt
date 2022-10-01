//package com.btg.pactual.banking.approversta.infra.persistence.config
//
//import com.btgpactual.banking.acllibs.secrets.SecretsManager
//import org.springframework.beans.factory.annotation.Qualifier
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.boot.jdbc.DataSourceBuilder
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.context.annotation.Primary
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories
//import org.springframework.orm.jpa.JpaTransactionManager
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
//import org.springframework.transaction.PlatformTransactionManager
//import javax.persistence.EntityManagerFactory
//import javax.sql.DataSource
//
//@Configuration
//@EnableJpaRepositories(
//    entityManagerFactoryRef = "BankingManagerFactory",
//    basePackages = ["com.btg.pactual.banking.approversta.infra"],
//    transactionManagerRef = "transactionManager"
//)
////@EnableJpaRepositories(
////    basePackages = ["com.example.approversta"]
////)
//class BankingConfig {
//
//    @Value("\${database.secret.key}")
//    private val sManagerKey: String = ""
//
//    @Value("\${database.operations.region}")
//    private val region: String = ""
//
//    @Value("\${spring.jpa.properties.hibernate.default_schema}")
//    private val schema: String = ""
//
////    @Bean
//    @Bean(name = ["BankingSource"])
//    @Primary
//    fun dataSource(): DataSource {
//
//        val sr = SecretsManager(sManagerKey, region).getDbCredentials()
//
//        val teste = DataSourceBuilder.create()
//            .url("jdbc:postgresql://${sr.host}:${sr.port}/${sr.dbname}?currentSchema=$schema")
//            .username(sr.username)
//            .password(sr.password)
//            .driverClassName("org.postgresql.Driver")
//            .build()
//
//        println("=================")
//        return teste
//    }
//
//    @Bean(name = ["transactionManager"])
//    @Primary
//    fun usersTransactionManager(
//        @Qualifier("BankingManagerFactory") usersManagerFactory: EntityManagerFactory
//    ): PlatformTransactionManager {
//        return JpaTransactionManager(usersManagerFactory)
//    }
//
//    @Bean(name = ["BankingManagerFactory"])
//    @Primary
//    fun bankingEntityManagerFactory(
//        builder: EntityManagerFactoryBuilder, @Qualifier("BankingSource") dataSource: DataSource
//    ): LocalContainerEntityManagerFactoryBean {
//
//        return builder.dataSource(dataSource)
//            .packages("com.btg.pactual.banking.approversta.infra.persistence.entity")
//            .persistenceUnit("banking")
//            .properties(
//                mapOf(
//                    "hibernate.dialect" to "org.hibernate.dialect.PostgreSQL95Dialect"
//                )
//            )
//            .build()
//    }
//}