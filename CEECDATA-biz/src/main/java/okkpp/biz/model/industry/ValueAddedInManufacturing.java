package okkpp.biz.model.industry;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_industry_value_added_in_manufacturing")
public class ValueAddedInManufacturing implements Serializable {
    @Id
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ����ҵ����ֵ
     */
    @Column(name = "added_value")
    private Double addedValue;

    /**
     * ʳƷ�����Ϻ��̲���ҵ��ռ����
     */
    @Column(name = "food_beverages_tobacco")
    private Double foodBeveragesTobacco;

    /**
     * ��֯�ͷ�װ��ҵ��ռ����
     */
    @Column(name = "textiles_clothing")
    private Double textilesClothing;

    /**
     * ����
     */
    private Integer sort;

    /**
     * ����ʱ��
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ���Ҵ���
     *
     * @return country - ���Ҵ���
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù��Ҵ���
     *
     * @param country ���Ҵ���
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * ��ȡ���
     *
     * @return year - ���
     */
    public String getYear() {
        return year;
    }

    /**
     * �������
     *
     * @param year ���
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * ��ȡ����ҵ����ֵ
     *
     * @return added_value - ����ҵ����ֵ
     */
    public Double getAddedValue() {
        return addedValue;
    }

    /**
     * ��������ҵ����ֵ
     *
     * @param addedValue ����ҵ����ֵ
     */
    public void setAddedValue(Double addedValue) {
        this.addedValue = addedValue;
    }

    /**
     * ��ȡʳƷ�����Ϻ��̲���ҵ��ռ����
     *
     * @return food_beverages_tobacco - ʳƷ�����Ϻ��̲���ҵ��ռ����
     */
    public Double getFoodBeveragesTobacco() {
        return foodBeveragesTobacco;
    }

    /**
     * ����ʳƷ�����Ϻ��̲���ҵ��ռ����
     *
     * @param foodBeveragesTobacco ʳƷ�����Ϻ��̲���ҵ��ռ����
     */
    public void setFoodBeveragesTobacco(Double foodBeveragesTobacco) {
        this.foodBeveragesTobacco = foodBeveragesTobacco;
    }

    /**
     * ��ȡ��֯�ͷ�װ��ҵ��ռ����
     *
     * @return textiles_clothing - ��֯�ͷ�װ��ҵ��ռ����
     */
    public Double getTextilesClothing() {
        return textilesClothing;
    }

    /**
     * ���÷�֯�ͷ�װ��ҵ��ռ����
     *
     * @param textilesClothing ��֯�ͷ�װ��ҵ��ռ����
     */
    public void setTextilesClothing(Double textilesClothing) {
        this.textilesClothing = textilesClothing;
    }

    /**
     * ��ȡ����
     *
     * @return sort - ����
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * ��������
     *
     * @param sort ����
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return updated - ����ʱ��
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø���ʱ��
     *
     * @param updated ����ʱ��
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}