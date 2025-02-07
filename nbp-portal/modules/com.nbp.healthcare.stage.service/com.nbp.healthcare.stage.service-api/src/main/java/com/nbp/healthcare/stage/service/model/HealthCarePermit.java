/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the HealthCarePermit service. Represents a row in the &quot;nbp_healthcare_permit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCarePermitModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.stage.service.model.impl.HealthCarePermitImpl"
)
@ProviderType
public interface HealthCarePermit
	extends HealthCarePermitModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.stage.service.model.impl.HealthCarePermitImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthCarePermit, Long>
		HEALTH_PERMIT_ID_ACCESSOR = new Accessor<HealthCarePermit, Long>() {

			@Override
			public Long get(HealthCarePermit healthCarePermit) {
				return healthCarePermit.getHealthPermitId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<HealthCarePermit> getTypeClass() {
				return HealthCarePermit.class;
			}

		};

}