package okkpp.biz.model.energy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_energy_electricity_generation")
public class ElectricityGeneration implements Serializable {
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
     * �������ܼ�
     */
    private Integer total;

    /**
     * �ȵ�
     */
    private Integer thermal;

    /**
     * ˮ��
     */
    private Integer hydro;

    /**
     * �˵�
     */
    private Integer nuclear;

    /**
     * ���
     */
    private Integer wind;

    /**
     * ̫���ܵ�
     */
    private Integer solar;

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
     * ��ȡ�������ܼ�
     *
     * @return total - �������ܼ�
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * ���÷������ܼ�
     *
     * @param total �������ܼ�
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * ��ȡ�ȵ�
     *
     * @return thermal - �ȵ�
     */
    public Integer getThermal() {
        return thermal;
    }

    /**
     * �����ȵ�
     *
     * @param thermal �ȵ�
     */
    public void setThermal(Integer thermal) {
        this.thermal = thermal;
    }

    /**
     * ��ȡˮ��
     *
     * @return hydro - ˮ��
     */
    public Integer getHydro() {
        return hydro;
    }

    /**
     * ����ˮ��
     *
     * @param hydro ˮ��
     */
    public void setHydro(Integer hydro) {
        this.hydro = hydro;
    }

    /**
     * ��ȡ�˵�
     *
     * @return nuclear - �˵�
     */
    public Integer getNuclear() {
        return nuclear;
    }

    /**
     * ���ú˵�
     *
     * @param nuclear �˵�
     */
    public void setNuclear(Integer nuclear) {
        this.nuclear = nuclear;
    }

    /**
     * ��ȡ���
     *
     * @return wind - ���
     */
    public Integer getWind() {
        return wind;
    }

    /**
     * ���÷��
     *
     * @param wind ���
     */
    public void setWind(Integer wind) {
        this.wind = wind;
    }

    /**
     * ��ȡ̫���ܵ�
     *
     * @return solar - ̫���ܵ�
     */
    public Integer getSolar() {
        return solar;
    }

    /**
     * ����̫���ܵ�
     *
     * @param solar ̫���ܵ�
     */
    public void setSolar(Integer solar) {
        this.solar = solar;
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