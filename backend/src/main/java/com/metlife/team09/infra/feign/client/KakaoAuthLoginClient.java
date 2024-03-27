package com.metlife.team09.infra.feign.client;

import com.metlife.team09.infra.feign.config.KakaoAuthFeignConfig;
import com.metlife.team09.infra.feign.dto.KakaoAuthLoginResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient(name = "KakaoAuthLoginClient", url = "https://kauth.kakao.com/oauth/token", configuration = KakaoAuthFeignConfig.class)
public interface KakaoAuthLoginClient {
	@PostMapping
	KakaoAuthLoginResponseDto getAccessToken(@SpringQueryMap Map<String, Object> parameters);
}
