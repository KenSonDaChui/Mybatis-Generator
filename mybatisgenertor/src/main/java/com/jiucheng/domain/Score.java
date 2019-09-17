package com.jiucheng.domain;

import lombok.Data;

@Data
public class Score {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.c_id
     *
     * @mbg.generated
     */
    private Integer cId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.s_id
     *
     * @mbg.generated
     */
    private Integer sId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.s_core
     *
     * @mbg.generated
     */
    private String sCore;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.c_id
     *
     * @return the value of score.c_id
     *
     * @mbg.generated
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.c_id
     *
     * @param cId the value for score.c_id
     *
     * @mbg.generated
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.s_id
     *
     * @return the value of score.s_id
     *
     * @mbg.generated
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.s_id
     *
     * @param sId the value for score.s_id
     *
     * @mbg.generated
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.s_core
     *
     * @return the value of score.s_core
     *
     * @mbg.generated
     */
    public String getsCore() {
        return sCore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.s_core
     *
     * @param sCore the value for score.s_core
     *
     * @mbg.generated
     */
    public void setsCore(String sCore) {
        this.sCore = sCore == null ? null : sCore.trim();
    }
}