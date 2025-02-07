/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ExplosiveIssuanceOfLicence service. Represents a row in the &quot;nbp_explosive_issu_lic&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveIssuanceOfLicenceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceImpl"
)
@ProviderType
public interface ExplosiveIssuanceOfLicence
	extends ExplosiveIssuanceOfLicenceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveIssuanceOfLicenceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ExplosiveIssuanceOfLicence, Long>
		ISSUANCE_ID_ACCESSOR =
			new Accessor<ExplosiveIssuanceOfLicence, Long>() {

				@Override
				public Long get(
					ExplosiveIssuanceOfLicence explosiveIssuanceOfLicence) {

					return explosiveIssuanceOfLicence.getIssuanceId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ExplosiveIssuanceOfLicence> getTypeClass() {
					return ExplosiveIssuanceOfLicence.class;
				}

			};

}