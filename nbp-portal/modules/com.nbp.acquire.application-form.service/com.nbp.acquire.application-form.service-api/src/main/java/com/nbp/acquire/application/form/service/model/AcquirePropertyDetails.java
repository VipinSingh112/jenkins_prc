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
 * The extended model interface for the AcquirePropertyDetails service. Represents a row in the &quot;nbp_acquire_prop_details&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetailsModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsImpl"
)
@ProviderType
public interface AcquirePropertyDetails
	extends AcquirePropertyDetailsModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcquirePropertyDetails, Long>
		ACQUIRE_PROPERTY_DETAILS_ID_ACCESSOR =
			new Accessor<AcquirePropertyDetails, Long>() {

				@Override
				public Long get(AcquirePropertyDetails acquirePropertyDetails) {
					return acquirePropertyDetails.getAcquirePropertyDetailsId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AcquirePropertyDetails> getTypeClass() {
					return AcquirePropertyDetails.class;
				}

			};

}