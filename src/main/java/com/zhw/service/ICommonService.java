package com.zhw.service;

import com.zhw.pojo.CategoryInfoPO;
import com.zhw.pojo.PropertyPO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface ICommonService {
    List<CategoryInfoPO> listCategory();

    CategoryInfoPO getCategory(int id);

    Page pageCategory(int pageIndex, int size);

    Integer saveOrUpdateCategory(CategoryInfoPO category);

    void saveImage(Integer categoryId, MultipartFile image) throws IOException;

    void deleteCategory(int id);

    /**
     * 分页分类属性
     *
     * @param categoryId
     * @param pageIndex
     * @param size
     * @return
     */
    Page<PropertyPO> pageProperty(int categoryId, int pageIndex, int size);

    Integer saveProperty(PropertyPO propertyPO);

    void deleteProperty(PropertyPO propertyPO);

}
