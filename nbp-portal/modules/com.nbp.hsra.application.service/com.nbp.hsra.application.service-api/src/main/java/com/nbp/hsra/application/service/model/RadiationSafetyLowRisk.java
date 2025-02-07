/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the RadiationSafetyLowRisk service. Represents a row in the &quot;nbp_hsra_low_risk_safety&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyLowRiskModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskImpl"
)
@ProviderType
public interface RadiationSafetyLowRisk
	extends PersistedModel, RadiationSafetyLowRiskModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RadiationSafetyLowRisk, Long>
		RADIATION_SAFETY_LOW_RISK_ID_ACCESSOR =
			new Accessor<RadiationSafetyLowRisk, Long>() {

				@Override
				public Long get(RadiationSafetyLowRisk radiationSafetyLowRisk) {
					return radiationSafetyLowRisk.getRadiationSafetyLowRiskId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<RadiationSafetyLowRisk> getTypeClass() {
					return RadiationSafetyLowRisk.class;
				}

			};

}