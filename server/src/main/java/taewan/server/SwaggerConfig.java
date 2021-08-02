package taewan.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any()) // 모든 RequestMapping URI 추출
                .paths(PathSelectors.any()) // 경로 패턴 URI만 추출
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Taewan's Planner & History", //title
                "스프링부트 프로젝트", //description
                "v1", //version
                "서비스 약관 URL - 현재 없음", //termsOfServiceUrl
                "flynngu21@gmail.com", //contactName
                "License - 확인 중", //license
                "설정 중"); //licenseUrl
    }
}