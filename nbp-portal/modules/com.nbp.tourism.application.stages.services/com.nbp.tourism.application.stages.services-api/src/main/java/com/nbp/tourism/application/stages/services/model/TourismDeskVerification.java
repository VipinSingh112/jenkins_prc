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
 * The extended model interface for the TourismDeskVerification service. Represents a row in the &quot;nbp_tourism_desk_verifica&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismDeskVerificationModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationImpl"
)
@ProviderType
public interface TourismDeskVerification
	extends PersistedModel, TourismDeskVerificationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.stages.services.model.impl.TourismDeskVerificationImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismDeskVerification, Long>
		TOURISM_DESK_VERI_ID_ACCESSOR =
			new Accessor<TourismDeskVerification, Long>() {

				@Override
				public Long get(
					TourismDeskVerification tourismDeskVerification) {

					return tourismDeskVerification.getTourismDeskVeriId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismDeskVerification> getTypeClass() {
					return TourismDeskVerification.class;
				}

			};

}