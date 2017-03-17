package WebMvcAutoConfiguration;

import javax.servlet.Servlet;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.EnableWebMvcConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcAutoConfiguration {

	@Configuration
	public static class WebMvcAutoConfigurationAdapter extends WebMvcConfigurerAdapter {
		private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { "classpath:/META-INF/resources/webjars/",
				"classpath:/META-INF/resources/", "classpath:/resources/", "classpath:/resources/js/",
				"classpath:/resources/css/", "classpath:/static/", "classpath:/public/" };

		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
			if (!registry.hasMappingForPattern("/webjars/**")) {
				registry.addResourceHandler("/webjars/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
			}
		}
	}
}
