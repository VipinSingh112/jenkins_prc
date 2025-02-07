/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.npm.cannabis.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CannabisConditionalLicensePreCondtions service. Represents a row in the &quot;nbp_cannabis_pre_conditions&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicensePreCondtionsModel
 * @generated
 */
@ImplementationClassName(
	"com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsImpl"
)
@ProviderType
public interface CannabisConditionalLicensePreCondtions
	extends CannabisConditionalLicensePreCondtionsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CannabisConditionalLicensePreCondtions, Long>
		CANNABIS_PRECONDITIONS_ID_ACCESSOR =
			new Accessor<CannabisConditionalLicensePreCondtions, Long>() {

				@Override
				public Long get(
					CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions) {

					return cannabisConditionalLicensePreCondtions.
						getCannabisPreconditionsId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CannabisConditionalLicensePreCondtions>
					getTypeClass() {

					return CannabisConditionalLicensePreCondtions.class;
				}

			};

}