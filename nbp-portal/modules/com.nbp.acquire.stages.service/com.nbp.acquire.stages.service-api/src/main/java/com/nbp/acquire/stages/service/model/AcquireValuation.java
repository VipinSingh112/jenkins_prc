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
 * The extended model interface for the AcquireValuation service. Represents a row in the &quot;nbp_acquire_valuation&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireValuationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.acquire.stages.service.model.impl.AcquireValuationImpl"
)
@ProviderType
public interface AcquireValuation
	extends AcquireValuationModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.acquire.stages.service.model.impl.AcquireValuationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AcquireValuation, Long>
		ACQUIRE_VALUATION_ID_ACCESSOR = new Accessor<AcquireValuation, Long>() {

			@Override
			public Long get(AcquireValuation acquireValuation) {
				return acquireValuation.getAcquireValuationId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AcquireValuation> getTypeClass() {
				return AcquireValuation.class;
			}

		};

}