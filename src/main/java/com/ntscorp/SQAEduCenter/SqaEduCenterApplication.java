package com.ntscorp.SQAEduCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqaEduCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqaEduCenterApplication.class, args);
	}
	//해야할일
	// 1. 블로그에 나온대로 진행해보기
	// 2. yml 말고 repo로 변경하기
	// 3. 아래 코드 적용해보기 (DataSource 빌더를 repo에 등록하면 굳이 해줄 필요없는건지 확인필요)
	// @Bean
	//	@ConfigurationProperties(prefix = "spring.data.db-main")
	//	public DataSource mainDataSource() {
	//		return DataSourceBuilder.create().build();
	//	}
	//https://godekdls.github.io/Spring%20Boot/howto.data-access 확인
}
