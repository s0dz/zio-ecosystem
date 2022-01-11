package org.ziverge

import scala.collection.immutable.HashSet

object Data:
  val zioCore = Project("dev.zio", "zio")
  val coreProjects =
    List(
      zioCore,
      Project("dev.zio", "zio-test"),
      Project("dev.zio", "zio-test-sbt"),
      Project("dev.zio", "zio-test-magnolia"),
      Project("dev.zio", "zio-internal-macros"),
      Project("dev.zio", "zio-stacktracer"),
      Project("dev.zio", "izumi-reflect"),
      Project("dev.zio", "zio-streams"),
      Project("dev.zio", "izumi-reflect-thirdparty-boopickle-shaded")
    )

  val projects =
    coreProjects ++
      List(
        Project("dev.zio", "zio-cache", Some("https://github.com/zio/zio-cache")),
        // Project("dev.zio", "caliban-deriving", Some("https://github.com/zio/caliban-deriving")),
        Project("com.github.ghostdogpr", "caliban", Some("https://github.com/ghostdogpr/caliban")),
        Project("dev.zio", "zio-optics", Some("https://github.com/zio/zio-optics")),
        Project("dev.zio", "zio-json", Some("https://github.com/zio/zio-json")),
        Project("dev.zio", "zio-query", Some("https://github.com/zio/zio-query")),
        Project("dev.zio", "zio-schema", Some("https://github.com/zio/zio-schema")),
        Project("dev.zio", "zio-config", Some("https://github.com/zio/zio-config")),
        Project("dev.zio", "zio-config-typesafe", Some("https://github.com/zio/zio-config")),
        Project("dev.zio", "zio-kafka", Some("https://github.com/zio/zio-kafka")),
        Project("dev.zio", "zio-ftp", Some("https://github.com/zio/zio-ftp")),
        Project("dev.zio", "zio-aws-core", Some("https://github.com/zio/zio-aws")),
        Project("dev.zio", "zio-prelude"),
        Project("dev.zio", "zio-prelude-macros"),
        Project("dev.zio", "zio-interop-reactivestreams", Some("https://github.com/zio/interop-reactive-streams")),
        Project("dev.zio", "zio-interop-scalaz7x", Some("https://github.com/zio/interop-scalaz")),
        Project("dev.zio", "zio-interop-twitter", Some("https://github.com/zio/interop-twitter")),
        Project("nl.vroste", "zio-amqp", Some("https://github.com/svroonland/zio-amqp")),
        Project("dev.zio", "zio-interop-guava", Some("https://github.com/zio/interop-guava")),
        Project("io.7mind.izumi", "distage-core", Some("https://github.com/7mind/izumi")),
        Project("io.7mind.izumi", "logstage-core", Some("https://github.com/7mind/izumi")),
        Project("com.github.poslegm", "munit-zio", Some("https://github.com/poslegm/munit-zio")),
        Project("com.coralogix", "zio-k8s-client", Some("https://github.com/coralogix/zio-k8s")),
        Project("com.softwaremill.sttp.client3", "zio"),
        Project("com.softwaremill.sttp.client3", "httpclient-backend-zio", Some("https://github.com/softwaremill/sttp")),
        Project("com.softwaremill.sttp.client3", "async-http-client-backend-zio", Some("https://github.com/softwaremill/sttp")),
        Project("com.softwaremill.sttp.shared", "zio"),
        Project("io.d11", "zhttp", Some("https://github.com/dream11/zio-http")),
        Project("dev.zio", "zio-interop-cats", Some("https://github.com/zio/interop-cats")),
        Project("dev.zio", "zio-nio"),
        Project("dev.zio", "zio-zmx"),
        Project("dev.zio", "zio-actors"),
        Project("dev.zio", "zio-logging"),
        Project("dev.zio", "zio-metrics"),
        Project("dev.zio", "zio-process"),
        Project("dev.zio", "zio-akka-cluster"),
        Project("dev.zio", "zio-rocksdb"),
        Project("dev.zio", "zio-s3"),
        Project("dev.zio", "zio-opencensus"),
        Project("dev.zio", "zio-opentelemetry"),
        Project("dev.zio", "zio-opentracing"),
        Project("io.github.ollls", "zio-tls-http"),
        Project("com.vladkopanev", "zio-saga-core"),
        Project("io.scalac", "zio-slick-interop"),
        Project("dev.zio", "zio-sqs"),
        Project("dev.zio", "zio-webhooks"),
        // Project("com.github.jczuchnowski", "zio-pulsar"), // Scala 3 Only
        Project("nl.vroste", "rezilience"),
        Project("nl.vroste", "zio-kinesis"),
        Project("io.getquill", "quill-zio"),
        Project("io.getquill", "quill-jdbc-zio"),
        Project("io.github.gaelrenoux", "tranzactio"),
        Project("info.senia", "zio-test-akka-http"),
        Project("io.github.neurodyne", "zio-arrow")
      ).sortBy(_.artifactId)

  val awsSubprojects =
    List(
      Project("dev.zio", "zio-aws-dynamodb"),
      Project("dev.zio", "zio-aws-netty"),
      Project("dev.zio", "zio-aws-sqs"),
      Project("dev.zio", "zio-aws-kinesis"),
      Project("dev.zio", "zio-aws-cloudwatch"),
      Project("io.github.neurodyne", "zio-aws-s3")
    )

end Data
