package me.cxis.fdc.dao.mapper;

import me.cxis.fdc.dao.model.NutrientLanguageDO;

public interface NutrientLanguageDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NutrientLanguageDO row);

    int insertSelective(NutrientLanguageDO row);

    NutrientLanguageDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NutrientLanguageDO row);

    int updateByPrimaryKey(NutrientLanguageDO row);
}