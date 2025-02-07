/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AcquireApplicationDetails service. Represents a row in the &quot;nbp_acquire_details&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationDetailsModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.acquire.application.form.service.model.impl.AcquireApplicationDetailsImpl"
)
@ProviderType
public interface AcquireApplicationDetails
	extends AcquireApplicationDetailsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.acquire.application.form.service.model.impl.AcquireApplicationDetailsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcquireApplicationDetails, Long>
		ACQUIRE_APPLICATION_DETAILS_ID_ACCESSOR =
			new Accessor<AcquireApplicationDetails, Long>() {

				@Override
				public Long get(
					AcquireApplicationDetails acquireApplicationDetails) {

					return acquireApplicationDetails.
						getAcquireApplicationDetailsId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AcquireApplicationDetails> getTypeClass() {
					return AcquireApplicationDetails.class;
				}

			};

}