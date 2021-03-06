/**
 * Copyright (c) 2019. PT. Distributor Indonesia Unggul. All rights reserverd.
 *
 * This source code is an unpublished work and the use of  a copyright  notice
 * does not imply otherwise. This source  code  contains  confidential,  trade
 * secret material of PT. Distributor Indonesia Unggul.
 * Any attempt or participation in deciphering, decoding, reverse  engineering
 * or in any way altering the source code is strictly  prohibited, unless  the
 * prior  written consent of Distributor Indonesia Unggul. is obtained.
 *
 * Unless  required  by  applicable  law  or  agreed  to  in writing, software
 * distributed under the License is distributed on an "AS IS"  BASIS,  WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or  implied.  See  the
 * License for the specific  language  governing  permissions  and limitations
 * under the License.
 *
 * Author : Bobby
 */

package test.authentication.domain.security;

import test.authentication.domain.app.cif.Cif;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="user_details")
public class UserDetails {

    public UserDetails(){}

    public UserDetails(@NotNull String firstName,
                       @NotNull String lastName,
                       @NotNull User user,
                       @NotNull Cif cif,
                       @NotNull String userAlias,
                       @NotNull String email,
                       @NotNull String mobilePhoneNo,
                       @NotNull String status,
                       @NotNull String createdBy,
                       @NotNull Date dateCreated,
                       @NotNull String updatedBy,
                       @NotNull Date lastUpdated,
                       @NotNull String language,
                       String ipAddress,
                       String jwtId,
                       Date loginTime,
                       Date logoutTime){
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
        this.cif = cif;
        this.userAlias = userAlias;
        this.email = email;
        this.mobilePhoneNo = mobilePhoneNo;
        this.status = status;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
        this.updatedBy = updatedBy;
        if(lastUpdated == null){
            this.lastUpdated = new Date();
        }
        this.language = language;
        this.ipAddress = ipAddress;
        this.jwtId = jwtId;
        this.loginTime = loginTime;
        this.logoutTime = logoutTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    /**
     * Column user_id as relation to table user
     * */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "cif_id")
    private Cif cif;

    @NotNull
    @Column(name = "user_alias")
    private String userAlias;

    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "mobile_phone_no")
    private String mobilePhoneNo;

    @Column(name = "status")
    private String status;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "updated_by")
    private String updatedBy = "";

    @Column(name = "last_updated")
    private Date lastUpdated;

    @Column(name = "language")
    private String language;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "jwt_id")
    private String jwtId;

    @Column(name = "login_time")
    private Date loginTime;

    @Column(name = "logout_time")
    private Date logoutTime;

    public Long getId() { return id; }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cif getCif() { return cif; }

    public void setCif(Cif cif) { this.cif = cif; }

    public String getUserAlias() {
        return userAlias;
    }

    public void setUserAlias(String userAlias) {
        this.userAlias = userAlias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNo() {
        return mobilePhoneNo;
    }

    public void setMobilePhoneNo(String mobilePhoneNo) {
        this.mobilePhoneNo = mobilePhoneNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIpAddress() { return ipAddress; }

    public void setIpAddress(String ipAddress) { this.ipAddress = ipAddress; }

    public String getJwtId() { return jwtId; }

    public void setJwtId(String jwtId) { this.jwtId = jwtId; }

    public Date getLoginTime() { return loginTime; }

    public void setLoginTime(Date loginTime) { this.loginTime = loginTime; }

    public Date getLogoutTime() { return logoutTime; }

    public void setLogoutTime(Date logoutTime) { this.logoutTime = logoutTime; }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("UserDetails{");
        sb.append("id=");
        sb.append(id);
        sb.append(", version=");
        sb.append(version);
        sb.append(", firstName='");
        sb.append(firstName);
        sb.append("', lastName='");
        sb.append(lastName);
        sb.append("', User=");
        sb.append(user);
        sb.append(", userAlias='");
        sb.append(userAlias);
        sb.append("', email='");
        sb.append(email);
        sb.append("', mobilePhoneNo='");
        sb.append(mobilePhoneNo);
        sb.append("', status='");
        sb.append(status);
        sb.append("', createdBy='");
        sb.append(createdBy);
        sb.append("', dateCreated='");
        sb.append(dateCreated);
        sb.append("', updatedBy='");
        sb.append(updatedBy);
        sb.append("', lastUpdated='");
        sb.append(lastUpdated);
        sb.append("', language='");
        sb.append(language);
        sb.append("', ipAddress='");
        sb.append(ipAddress);
        sb.append("', loginTime=");
        sb.append(loginTime);
        sb.append(", logoutTime=");
        sb.append(loginTime);
        sb.append("}");

        return sb.toString();
    }
}