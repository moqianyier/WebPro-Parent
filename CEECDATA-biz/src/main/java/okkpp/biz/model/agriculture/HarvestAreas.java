package okkpp.biz.model.agriculture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_agriculture_harvest_areas")
public class HarvestAreas implements Serializable {
    @Id
    private Integer id;

    /**
     * ����
     */
    private String country;

    /**
     * ����
     */
    private Integer cereals;

    /**
     * ����
     */
    private Integer rice;

    /**
     * С��
     */
    private Integer wheat;

    /**
     * ����
     */
    private Integer maize;

    /**
     * ��
     */
    private Integer soybeans;

    /**
     * ����
     */
    private Integer groundnuts;

    /**
     * �Ͳ���
     */
    private Integer rapeseed;

    /**
     * ����
     */
    private Integer seedcotton;

    /**
     * ���
     */
    private Integer sugerbeets;

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
     * ��ȡ����
     *
     * @return cereals - ����
     */
    public Integer getCereals() {
        return cereals;
    }

    /**
     * ���ù���
     *
     * @param cereals ����
     */
    public void setCereals(Integer cereals) {
        this.cereals = cereals;
    }

    /**
     * ��ȡ����
     *
     * @return rice - ����
     */
    public Integer getRice() {
        return rice;
    }

    /**
     * ���õ���
     *
     * @param rice ����
     */
    public void setRice(Integer rice) {
        this.rice = rice;
    }

    /**
     * ��ȡС��
     *
     * @return wheat - С��
     */
    public Integer getWheat() {
        return wheat;
    }

    /**
     * ����С��
     *
     * @param wheat С��
     */
    public void setWheat(Integer wheat) {
        this.wheat = wheat;
    }

    /**
     * ��ȡ����
     *
     * @return maize - ����
     */
    public Integer getMaize() {
        return maize;
    }

    /**
     * ��������
     *
     * @param maize ����
     */
    public void setMaize(Integer maize) {
        this.maize = maize;
    }

    /**
     * ��ȡ��
     *
     * @return soybeans - ��
     */
    public Integer getSoybeans() {
        return soybeans;
    }

    /**
     * ���ô�
     *
     * @param soybeans ��
     */
    public void setSoybeans(Integer soybeans) {
        this.soybeans = soybeans;
    }

    /**
     * ��ȡ����
     *
     * @return groundnuts - ����
     */
    public Integer getGroundnuts() {
        return groundnuts;
    }

    /**
     * ���û���
     *
     * @param groundnuts ����
     */
    public void setGroundnuts(Integer groundnuts) {
        this.groundnuts = groundnuts;
    }

    /**
     * ��ȡ�Ͳ���
     *
     * @return rapeseed - �Ͳ���
     */
    public Integer getRapeseed() {
        return rapeseed;
    }

    /**
     * �����Ͳ���
     *
     * @param rapeseed �Ͳ���
     */
    public void setRapeseed(Integer rapeseed) {
        this.rapeseed = rapeseed;
    }

    /**
     * ��ȡ����
     *
     * @return seedcotton - ����
     */
    public Integer getSeedcotton() {
        return seedcotton;
    }

    /**
     * ��������
     *
     * @param seedcotton ����
     */
    public void setSeedcotton(Integer seedcotton) {
        this.seedcotton = seedcotton;
    }

    /**
     * ��ȡ���
     *
     * @return sugerbeets - ���
     */
    public Integer getSugerbeets() {
        return sugerbeets;
    }

    /**
     * �������
     *
     * @param sugerbeets ���
     */
    public void setSugerbeets(Integer sugerbeets) {
        this.sugerbeets = sugerbeets;
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