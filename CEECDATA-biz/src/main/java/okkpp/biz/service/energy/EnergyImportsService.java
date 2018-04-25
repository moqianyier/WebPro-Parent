package okkpp.biz.service.energy;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import okkpp.biz.dao.energy.EnergyImportsMapper;
import okkpp.biz.model.energy.EnergyImports;
import okkpp.biz.utils.CountryCode;
import tk.mybatis.mapper.entity.Example;

@Service
@Transactional
public class EnergyImportsService {

	@Autowired
	EnergyImportsMapper mapper;
	public List<EnergyImports> selectAll() {
		return CountryCode.replaceCountry(mapper.selectAll());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfo(int pn) {
		Example example = new Example(EnergyImports.class);
		example.setOrderByClause("country,sort");
		PageHelper.startPage(pn, 10);
		List<EnergyImports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <E> PageInfo<E> getPageInfoByCondition(Integer pn, String column, String condition) {
		Example example = new Example(EnergyImports.class);
		example.setOrderByClause("country,sort");
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike(column, "%" + condition + "%");
		PageHelper.startPage(pn, 10);
		List<EnergyImports> list = CountryCode.replaceCountry(mapper.selectByExample(example));
		return new PageInfo(list, 10);
	}

	// EnergyImports����
	public int updateEnergyImports(EnergyImports energyImports) {
		// TODO Auto-generated method stub
		return mapper.updateByPrimaryKeySelective(energyImports);
	}

	// EnergyImports����
	public int insertEnergyImports(EnergyImports energyImports) {
		return mapper.insertSelective(energyImports);
	}

	// EnergyImportsɾ��
	public int deleteEnergyImports(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
}
