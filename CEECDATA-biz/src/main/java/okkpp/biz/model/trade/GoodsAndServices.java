package okkpp.biz.model.trade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_trade_goods_and_services")
public class GoodsAndServices implements Serializable {
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
     * ����ͷ������ռ����������ֵ����
     */
    @Column(name = "trade_export")
    private Double tradeExport;

    /**
     * ����ͷ������ռ����������ֵ����
     */
    @Column(name = "trade_import")
    private Double tradeImport;

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
     * ��ȡ����ͷ������ռ����������ֵ����
     *
     * @return trade_export - ����ͷ������ռ����������ֵ����
     */
    public Double getTradeExport() {
        return tradeExport;
    }

    /**
     * ���û���ͷ������ռ����������ֵ����
     *
     * @param tradeExport ����ͷ������ռ����������ֵ����
     */
    public void setTradeExport(Double tradeExport) {
        this.tradeExport = tradeExport;
    }

    /**
     * ��ȡ����ͷ������ռ����������ֵ����
     *
     * @return trade_import - ����ͷ������ռ����������ֵ����
     */
    public Double getTradeImport() {
        return tradeImport;
    }

    /**
     * ���û���ͷ������ռ����������ֵ����
     *
     * @param tradeImport ����ͷ������ռ����������ֵ����
     */
    public void setTradeImport(Double tradeImport) {
        this.tradeImport = tradeImport;
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