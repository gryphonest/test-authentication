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

package test.authentication.domain.configuration;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("application")
public class ApplicationConfigurationProperties implements ApplicationConfiguration{
    protected final Integer DEFAULT_MAX = 10;
    protected final String DEFAULT_PASSWORD = "password";

    private Integer max = DEFAULT_MAX;
    private String password = DEFAULT_PASSWORD;

    @Override
    public Integer getMax() {
        return max;
    }

    @Override
    public String getDefaultPassword(){ return  password;}

    public void setMax(Integer max) {
        if(max != null) {
            this.max = max;
        }
    }

    public void setPassword(String password) {
        if(password != null) {
            this.password = password;
        }
    }

}