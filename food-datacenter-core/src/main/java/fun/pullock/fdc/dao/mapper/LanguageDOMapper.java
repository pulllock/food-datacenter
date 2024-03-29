package fun.pullock.fdc.dao.mapper;

import fun.pullock.fdc.dao.model.LanguageDO;

public interface LanguageDOMapper {

    int deleteByPrimaryKey(Long id);

    int insert(LanguageDO row);

    int insertSelective(LanguageDO row);

    LanguageDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LanguageDO row);

    int updateByPrimaryKey(LanguageDO row);

    LanguageDO selectByCode(String languageCode);
}