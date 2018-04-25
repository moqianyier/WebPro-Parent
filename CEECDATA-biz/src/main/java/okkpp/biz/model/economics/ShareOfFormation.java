package okkpp.biz.model.economics;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_economics_share_of_formation")
public class ShareOfFormation implements Serializable {
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
     * �ʱ��γ��ܶ�(%)
     */
    private Double share;

    /**
     * ��λ
     */
    private String unit;

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
     * ��ȡ�ʱ��γ��ܶ�(%)
     *
     * @return share - �ʱ��γ��ܶ�(%)
     */
    public Double getShare() {
        return share;
    }

    /**
     * �����ʱ��γ��ܶ�(%)
     *
     * @param share �ʱ��γ��ܶ�(%)
     */
    public void setShare(Double share) {
        this.share = share;
    }

    /**
     * ��ȡ��λ
     *
     * @return unit - ��λ
     */
    public String getUnit() {
        return unit;
    }

    /**
     * ���õ�λ
     *
     * @param unit ��λ
     */
    public void setUnit(String unit) {
        this.unit = unit;
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