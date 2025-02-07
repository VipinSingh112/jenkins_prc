/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the TourismPermit service. Represents a row in the &quot;nbp_tourism_permit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismPermitModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.stages.services.model.impl.TourismPermitImpl"
)
@ProviderType
public interface TourismPermit extends PersistedModel, TourismPermitModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.stages.services.model.impl.TourismPermitImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismPermit, Long>
		TOURISMG_PERMIT_ID_ACCESSOR = new Accessor<TourismPermit, Long>() {

			@Override
			public Long get(TourismPermit tourismPermit) {
				return tourismPermit.getTourismgPermitId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TourismPermit> getTypeClass() {
				return TourismPermit.class;
			}

		};

}