package okkpp.biz.model.traffic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_traffic_air_freight")
public class AirFreight implements Serializable {
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
     * ���˻�����ת��
     */
    @Column(name = "air_freight")
    private Double airFreight;

    /**
     * ���տ�����
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
     * ��ȡ���˻�����ת��
     *
     * @return air_freight - ���˻�����ת��
     */
    public Double getAirFreight() {
        return airFreight;
    }

    /**
     * ���ÿ��˻�����ת��
     *
     * @param airFreight ���˻�����ת��
     */
    public void setAirFreight(Double airFreight) {
        this.airFreight = airFreight;
    }

    /**
     * ��ȡ���տ�����
     *
     * @return passengers_carried - ���տ�����
     */
    public Double getPassengersCarried() {
        return passengersCarried;
    }

    /**
     * ���ú��տ�����
     *
     * @param passengersCarried ���տ�����
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