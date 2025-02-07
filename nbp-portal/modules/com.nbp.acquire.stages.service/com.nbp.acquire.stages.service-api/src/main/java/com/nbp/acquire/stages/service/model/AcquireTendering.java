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
 * The extended model interface for the AcquireTendering service. Represents a row in the &quot;nbp_acquire_tendering&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireTenderingModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.acquire.stages.service.model.impl.AcquireTenderingImpl"
)
@ProviderType
public interface AcquireTendering
	extends AcquireTenderingModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.acquire.stages.service.model.impl.AcquireTenderingImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcquireTendering, Long>
		ACQUIRE_TENDERING_ID_ACCESSOR = new Accessor<AcquireTendering, Long>() {

			@Override
			public Long get(AcquireTendering acquireTendering) {
				return acquireTendering.getAcquireTenderingId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AcquireTendering> getTypeClass() {
				return AcquireTendering.class;
			}

		};

}