package okkpp.biz.model.overall;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_overall_freshwater")
public class FreshWater implements Serializable {
    @Id
    private Integer id;

    /**
     * ���Ҵ���
     */
    private String country;

    /**
     * �˾���������ˮ��Դ
     */
    private Double renewable;

    /**
     * ռˮ��Դ�������ı���
     */
    private Double internal;

    /**
     * ũҵ��ˮ
     */
    private Double agriculture;

    /**
     * ��ҵ��ˮ
     */
    private Double industry;

    /**
     * ������ˮ
     */
    private Double domestic;

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
     * ��ȡ�˾���������ˮ��Դ
     *
     * @return renewable - �˾���������ˮ��Դ
     */
    public Double getRenewable() {
        return renewable;
    }

    /**
     * �����˾���������ˮ��Դ
     *
     * @param renewable �˾���������ˮ��Դ
     */
    public void setRenewable(Double renewable) {
        this.renewable = renewable;
    }

    /**
     * ��ȡռˮ��Դ�������ı���
     *
     * @return internal - ռˮ��Դ�������ı���
     */
    public Double getInternal() {
        return internal;
    }

    /**
     * ����ռˮ��Դ�������ı���
     *
     * @param internal ռˮ��Դ�������ı���
     */
    public void setInternal(Double internal) {
        this.internal = internal;
    }

    /**
     * ��ȡũҵ��ˮ
     *
     * @return agriculture - ũҵ��ˮ
     */
    public Double getAgriculture() {
        return agriculture;
    }

    /**
     * ����ũҵ��ˮ
     *
     * @param agriculture ũҵ��ˮ
     */
    public void setAgriculture(Double agriculture) {
        this.agriculture = agriculture;
    }

    /**
     * ��ȡ��ҵ��ˮ
     *
     * @return industry - ��ҵ��ˮ
     */
    public Double getIndustry() {
        return industry;
    }

    /**
     * ���ù�ҵ��ˮ
     *
     * @param industry ��ҵ��ˮ
     */
    public void setIndustry(Double industry) {
        this.industry = industry;
    }

    /**
     * ��ȡ������ˮ
     *
     * @return domestic - ������ˮ
     */
    public Double getDomestic() {
        return domestic;
    }

    /**
     * ����������ˮ
     *
     * @param domestic ������ˮ
     */
    public void setDomestic(Double domestic) {
        this.domestic = domestic;
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