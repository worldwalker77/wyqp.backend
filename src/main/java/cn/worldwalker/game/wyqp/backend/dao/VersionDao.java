package cn.worldwalker.game.wyqp.backend.dao;

import java.util.List;

import cn.worldwalker.game.wyqp.backend.domain.VersionModel;

public interface VersionDao {
	
	public Integer updateVersion(VersionModel versionModel);
	
	public List<VersionModel> selectVersionList(VersionModel versionModel);
	
	public Long selectVersionListCount(VersionModel versionModel);
	
	public VersionModel selectVersion(VersionModel versionModel);
	
}
