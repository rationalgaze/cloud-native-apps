@Grab("spring-cloud-config-monitor")
@Grab("spring-cloud-starter-bus-amqp")

@EnableConfigServer
@EnableDiscoveryClient
class ConfigServer {
}