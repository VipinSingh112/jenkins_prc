/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HealthCareBussinessInfo service. Represents a row in the &quot;nbp_healthcare_bussiness&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBussinessInfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoImpl"
)
@ProviderType
public interface HealthCareBussinessInfo
	extends HealthCareBussinessInfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.application.form.service.model.impl.HealthCareBussinessInfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthCareBussinessInfo, Long>
		HEALTH_CARE_BUSSINESS_INFO_ID_ACCESSOR =
			new Accessor<HealthCareBussinessInfo, Long>() {

				@Override
				public Long get(
					HealthCareBussinessInfo healthCareBussinessInfo) {

					return healthCareBussinessInfo.
						getHealthCareBussinessInfoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<HealthCareBussinessInfo> getTypeClass() {
					return HealthCareBussinessInfo.class;
				}

			};

}