/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.governance.taxonomy.services;

import org.wso2.carbon.governance.taxonomy.beans.QueryBean;
import org.wso2.carbon.governance.taxonomy.beans.TaxonomyBean;
import org.wso2.carbon.registry.core.exceptions.RegistryException;
import org.wso2.carbon.user.api.UserStoreException;
import org.xml.sax.SAXException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;

/**
 * This interface will provide methods for manage taxonomy tenant specific map data.
 */
public interface IStorageProvider {

    TaxonomyBean getTaxonomy(QueryBean taxonomyQueryBean);

    void removeTaxonomy(String taxonomyName);

    void addTaxonomy(TaxonomyBean taxonomyBean);

    void updateTaxonomy(String oldName, TaxonomyBean taxonomyBean);

    Map<String, TaxonomyBean> getTaxonomyBeanMap();

    List<String> getTaxonomiesByRXT(String rxtName);

    void initTaxonomyStorage()
            throws UserStoreException, RegistryException, IOException, SAXException, ParserConfigurationException;
}
