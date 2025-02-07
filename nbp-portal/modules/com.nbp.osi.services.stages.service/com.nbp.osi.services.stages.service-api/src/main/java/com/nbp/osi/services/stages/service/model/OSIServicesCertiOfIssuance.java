/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OSIServicesCertiOfIssuance service. Represents a row in the &quot;nbp_osi_services_certi_of_issu&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesCertiOfIssuanceModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.stages.service.model.impl.OSIServicesCertiOfIssuanceImpl"
)
@ProviderType
public interface OSIServicesCertiOfIssuance
	extends OSIServicesCertiOfIssuanceModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesCertiOfIssuanceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OSIServicesCertiOfIssuance, Long>
		O_SI_SERVICES_CERTI_OF_ISSUANCE_ID_ACCESSOR =
			new Accessor<OSIServicesCertiOfIssuance, Long>() {

				@Override
				public Long get(
					OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

					return osiServicesCertiOfIssuance.
						getOSIServicesCertiOfIssuanceId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OSIServicesCertiOfIssuance> getTypeClass() {
					return OSIServicesCertiOfIssuance.class;
				}

			};

}