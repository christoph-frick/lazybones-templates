import groovy.transform.CompileStatic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
@CompileStatic
class Application {

	static void main(String[] args) throws Exception {
		def app = new SpringApplication(Application)
		app.showBanner = false
		app.run(args)
	}

}

