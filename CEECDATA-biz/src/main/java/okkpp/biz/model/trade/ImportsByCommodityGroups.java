package okkpp.biz.model.trade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_trade_imports_by_commodity_groups")
public class ImportsByCommodityGroups implements Serializable {
    @Id
    private Integer id;

    /**
     * ����
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ũҵԭ����
     */
    private Double agricultural;

    /**
     * ʳƷ
     */
    private Double food;

    /**
     * ȼ��
     */
    private Double fuel;

    /**
     * ����ͽ���
     */
    @Column(name = "ores_and_metals")
    private Double oresAndMetals;

    /**
     * �Ƴ�Ʒ
     */
    private Double manufactures;

    /**
     * ���
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
     * ��ȡ����
     *
     * @return country - ����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���
     *
     * @param country ����
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
     * ��ȡũҵԭ����
     *
     * @return agricultural - ũҵԭ����
     */
    public Double getAgricultural() {
        return agricultural;
    }

    /**
     * ����ũҵԭ����
     *
     * @param agricultural ũҵԭ����
     */
    public void setAgricultural(Double agricultural) {
        this.agricultural = agricultural;
    }

    /**
     * ��ȡʳƷ
     *
     * @return food - ʳƷ
     */
    public Double getFood() {
        return food;
    }

    /**
     * ����ʳƷ
     *
     * @param food ʳƷ
     */
    public void setFood(Double food) {
        this.food = food;
    }

    /**
     * ��ȡȼ��
     *
     * @return fuel - ȼ��
     */
    public Double getFuel() {
        return fuel;
    }

    /**
     * ����ȼ��
     *
     * @param fuel ȼ��
     */
    public void setFuel(Double fuel) {
        this.fuel = fuel;
    }

    /**
     * ��ȡ����ͽ���
     *
     * @return ores_and_metals - ����ͽ���
     */
    public Double getOresAndMetals() {
        return oresAndMetals;
    }

    /**
     * ���ÿ���ͽ���
     *
     * @param oresAndMetals ����ͽ���
     */
    public void setOresAndMetals(Double oresAndMetals) {
        this.oresAndMetals = oresAndMetals;
    }

    /**
     * ��ȡ�Ƴ�Ʒ
     *
     * @return manufactures - �Ƴ�Ʒ
     */
    public Double getManufactures() {
        return manufactures;
    }

    /**
     * �����Ƴ�Ʒ
     *
     * @param manufactures �Ƴ�Ʒ
     */
    public void setManufactures(Double manufactures) {
        this.manufactures = manufactures;
    }

    /**
     * ��ȡ���
     *
     * @return sort - ���
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * �������
     *
     * @param sort ���
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