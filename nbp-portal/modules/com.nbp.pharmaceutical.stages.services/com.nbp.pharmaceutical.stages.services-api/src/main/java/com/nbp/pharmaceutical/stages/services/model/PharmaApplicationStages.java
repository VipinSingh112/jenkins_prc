/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the PharmaApplicationStages service. Represents a row in the &quot;nbp_pharma_app_stages&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationStagesModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesImpl"
)
@ProviderType
public interface PharmaApplicationStages
	extends PersistedModel, PharmaApplicationStagesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PharmaApplicationStages, Long>
		PHARMA_APPLICATIONSTAGE_ID_ACCESSOR =
			new Accessor<PharmaApplicationStages, Long>() {

				@Override
				public Long get(
					PharmaApplicationStages pharmaApplicationStages) {

					return pharmaApplicationStages.
						getPharmaApplicationstageId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<PharmaApplicationStages> getTypeClass() {
					return PharmaApplicationStages.class;
				}

			};

}