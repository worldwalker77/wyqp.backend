package cn.worldwalker.game.wyqp.backend.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import cn.worldwalker.game.wyqp.backend.domain.Result;
import cn.worldwalker.game.wyqp.backend.domain.VersionModel;

public interface GameService {
	
	public Result uploadClientFile(MultipartFile multipartFile, String newFeature, String clientVersion, String urarPath);
	
	public Result getVersionList(VersionModel versionModel);
	
	public VersionModel getVersion();
}
