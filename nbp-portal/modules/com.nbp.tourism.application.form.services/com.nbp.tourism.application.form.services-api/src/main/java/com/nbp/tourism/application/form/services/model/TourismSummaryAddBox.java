/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the TourismSummaryAddBox service. Represents a row in the &quot;nbp_tourism_summary_box&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TourismSummaryAddBoxModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxImpl"
)
@ProviderType
public interface TourismSummaryAddBox
	extends PersistedModel, TourismSummaryAddBoxModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.tourism.application.form.services.model.impl.TourismSummaryAddBoxImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TourismSummaryAddBox, Long>
		TOURISM_SUMMARY_BOX_ID_ACCESSOR =
			new Accessor<TourismSummaryAddBox, Long>() {

				@Override
				public Long get(TourismSummaryAddBox tourismSummaryAddBox) {
					return tourismSummaryAddBox.getTourismSummaryBoxId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<TourismSummaryAddBox> getTypeClass() {
					return TourismSummaryAddBox.class;
				}

			};

}