/*-
 * #%L
 * Eureka! Clinical User Services
 * %%
 * Copyright (C) 2016 Emory University
 * %%
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
 * #L%
 */
package org.eurekaclinical.user.service.dao;

import com.google.inject.Inject;
import com.google.inject.Provider;

import javax.persistence.EntityManager;

import org.eurekaclinical.standardapis.dao.GenericDao;

import org.eurekaclinical.user.service.entity.OAuthProviderEntity;
import org.eurekaclinical.user.service.entity.OAuthProviderEntity_;
/**
 *
 * @author miaoai
 */
public class JpaOAuthProviderDao extends GenericDao<OAuthProviderEntity, Long> implements OAuthProviderDao{

	@Inject
	protected JpaOAuthProviderDao(Provider<EntityManager> inManagerProvider) {
		super(OAuthProviderEntity.class, inManagerProvider);
	}

	@Override
	public OAuthProviderEntity getByName(String inName) {
		return this.getUniqueByAttribute(OAuthProviderEntity_.name, inName);
	}
	
}
