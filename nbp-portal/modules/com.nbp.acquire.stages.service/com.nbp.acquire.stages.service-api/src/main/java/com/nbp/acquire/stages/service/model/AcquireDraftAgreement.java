/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AcquireDraftAgreement service. Represents a row in the &quot;nbp_acquire_draft_agree&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireDraftAgreementModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.acquire.stages.service.model.impl.AcquireDraftAgreementImpl"
)
@ProviderType
public interface AcquireDraftAgreement
	extends AcquireDraftAgreementModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.acquire.stages.service.model.impl.AcquireDraftAgreementImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcquireDraftAgreement, Long>
		ACQUIRE_DRAFT_ID_ACCESSOR =
			new Accessor<AcquireDraftAgreement, Long>() {

				@Override
				public Long get(AcquireDraftAgreement acquireDraftAgreement) {
					return acquireDraftAgreement.getAcquireDraftId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AcquireDraftAgreement> getTypeClass() {
					return AcquireDraftAgreement.class;
				}

			};

}