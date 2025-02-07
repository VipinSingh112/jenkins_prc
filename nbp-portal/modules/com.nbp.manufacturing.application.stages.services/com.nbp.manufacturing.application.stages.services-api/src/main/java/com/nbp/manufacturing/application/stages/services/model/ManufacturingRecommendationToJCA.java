/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ManufacturingRecommendationToJCA service. Represents a row in the &quot;nbp_manufacturing_rec_jca&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingRecommendationToJCAModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAImpl"
)
@ProviderType
public interface ManufacturingRecommendationToJCA
	extends ManufacturingRecommendationToJCAModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingRecommendationToJCAImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ManufacturingRecommendationToJCA, Long>
		MANUFACTURING_JCA_ID_ACCESSOR =
			new Accessor<ManufacturingRecommendationToJCA, Long>() {

				@Override
				public Long get(
					ManufacturingRecommendationToJCA
						manufacturingRecommendationToJCA) {

					return manufacturingRecommendationToJCA.
						getManufacturingJCAId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<ManufacturingRecommendationToJCA> getTypeClass() {
					return ManufacturingRecommendationToJCA.class;
				}

			};

}