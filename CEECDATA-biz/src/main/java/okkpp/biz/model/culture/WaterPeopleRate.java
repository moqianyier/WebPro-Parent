package okkpp.biz.model.culture;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_culture_water_people_rate")
public class WaterPeopleRate implements Serializable {
    @Id
    private Integer id;

    /**
     * ����/����
     */
    private String country;

    /**
     * ���
     */
    private String year;

    /**
     * ����������ʩ�˿�ռ���˿ڱ���
     */
    @Column(name = "sanitation_facilities")
    private Double sanitationFacilities;

    /**
     * �����������ˮԴ�˿�ռ���˿ڱ���
     */
    @Column(name = "water_source")
    private Double waterSource;

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
     * ��ȡ����/����
     *
     * @return country - ����/����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���/����
     *
     * @param country ����/����
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
     * ��ȡ����������ʩ�˿�ռ���˿ڱ���
     *
     * @return sanitation_facilities - ����������ʩ�˿�ռ���˿ڱ���
     */
    public Double getSanitationFacilities() {
        return sanitationFacilities;
    }

    /**
     * ��������������ʩ�˿�ռ���˿ڱ���
     *
     * @param sanitationFacilities ����������ʩ�˿�ռ���˿ڱ���
     */
    public void setSanitationFacilities(Double sanitationFacilities) {
        this.sanitationFacilities = sanitationFacilities;
    }

    /**
     * ��ȡ�����������ˮԴ�˿�ռ���˿ڱ���
     *
     * @return water_source - �����������ˮԴ�˿�ռ���˿ڱ���
     */
    public Double getWaterSource() {
        return waterSource;
    }

    /**
     * ���������������ˮԴ�˿�ռ���˿ڱ���
     *
     * @param waterSource �����������ˮԴ�˿�ռ���˿ڱ���
     */
    public void setWaterSource(Double waterSource) {
        this.waterSource = waterSource;
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