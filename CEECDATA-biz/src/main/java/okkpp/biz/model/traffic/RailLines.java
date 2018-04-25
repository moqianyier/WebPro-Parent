package okkpp.biz.model.traffic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_traffic_rail_lines")
public class RailLines implements Serializable {
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
     * ��·�ܳ���
     */
    @Column(name = "rail_lines_total")
    private Integer railLinesTotal;

    /**
     * ��·������ת��
     */
    @Column(name = "goods_transported")
    private Double goodsTransported;

    /**
     * ��·������ת��
     */
    @Column(name = "passengers_carried")
    private Double passengersCarried;

    /**
     * ���
     */
    private Integer sort;

    /**
     * ��������
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
     * ��ȡ��·�ܳ���
     *
     * @return rail_lines_total - ��·�ܳ���
     */
    public Integer getRailLinesTotal() {
        return railLinesTotal;
    }

    /**
     * ������·�ܳ���
     *
     * @param railLinesTotal ��·�ܳ���
     */
    public void setRailLinesTotal(Integer railLinesTotal) {
        this.railLinesTotal = railLinesTotal;
    }

    /**
     * ��ȡ��·������ת��
     *
     * @return goods_transported - ��·������ת��
     */
    public Double getGoodsTransported() {
        return goodsTransported;
    }

    /**
     * ������·������ת��
     *
     * @param goodsTransported ��·������ת��
     */
    public void setGoodsTransported(Double goodsTransported) {
        this.goodsTransported = goodsTransported;
    }

    /**
     * ��ȡ��·������ת��
     *
     * @return passengers_carried - ��·������ת��
     */
    public Double getPassengersCarried() {
        return passengersCarried;
    }

    /**
     * ������·������ת��
     *
     * @param passengersCarried ��·������ת��
     */
    public void setPassengersCarried(Double passengersCarried) {
        this.passengersCarried = passengersCarried;
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
     * ��ȡ��������
     *
     * @return updated - ��������
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * ���ø�������
     *
     * @param updated ��������
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}