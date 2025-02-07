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
 * The extended model interface for the AcquireFinalExecutedAgreement service. Represents a row in the &quot;nbp_acquire_executed_agree&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireFinalExecutedAgreementModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementImpl"
)
@ProviderType
public interface AcquireFinalExecutedAgreement
	extends AcquireFinalExecutedAgreementModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.acquire.stages.service.model.impl.AcquireFinalExecutedAgreementImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcquireFinalExecutedAgreement, Long>
		ACQUIREFINAL_ID_ACCESSOR =
			new Accessor<AcquireFinalExecutedAgreement, Long>() {

				@Override
				public Long get(
					AcquireFinalExecutedAgreement
						acquireFinalExecutedAgreement) {

					return acquireFinalExecutedAgreement.getAcquirefinalId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AcquireFinalExecutedAgreement> getTypeClass() {
					return AcquireFinalExecutedAgreement.class;
				}

			};

}