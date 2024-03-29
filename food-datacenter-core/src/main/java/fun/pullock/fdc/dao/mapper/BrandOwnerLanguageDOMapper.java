package fun.pullock.fdc.dao.mapper;

import fun.pullock.fdc.dao.model.BrandOwnerLanguageDO;
import org.apache.ibatis.annotations.Param;

public interface BrandOwnerLanguageDOMapper {

    int deleteByPrimaryKey(Long id);

    int insert(BrandOwnerLanguageDO row);

    int insertSelective(BrandOwnerLanguageDO row);

    BrandOwnerLanguageDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrandOwnerLanguageDO row);

    int updateByPrimaryKey(BrandOwnerLanguageDO row);

    BrandOwnerLanguageDO selectByBrandOwnerIdAndLanguageCode(@Param("brandOwnerId") Long brandOwnerId, @Param("languageCode") String languageCode);
}