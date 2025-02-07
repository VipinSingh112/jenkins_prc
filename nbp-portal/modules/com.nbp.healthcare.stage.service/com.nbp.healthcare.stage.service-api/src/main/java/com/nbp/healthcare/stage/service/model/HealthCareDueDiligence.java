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
 * The extended model interface for the HealthCareDueDiligence service. Represents a row in the &quot;nbp_healthcare_duediligence&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDueDiligenceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceImpl"
)
@ProviderType
public interface HealthCareDueDiligence
	extends HealthCareDueDiligenceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HealthCareDueDiligence, Long>
		HEALTH_DD_ID_ACCESSOR = new Accessor<HealthCareDueDiligence, Long>() {

			@Override
			public Long get(HealthCareDueDiligence healthCareDueDiligence) {
				return healthCareDueDiligence.getHealthDDId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<HealthCareDueDiligence> getTypeClass() {
				return HealthCareDueDiligence.class;
			}

		};

}